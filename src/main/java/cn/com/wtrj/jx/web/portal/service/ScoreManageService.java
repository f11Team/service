package cn.com.wtrj.jx.web.portal.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.naming.NameClassPair;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cn.com.wtrj.jx.web.portal.model.dao.ScoreManageDao;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjBaseCommentMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreSingleMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjScoreDetailExptMapper;
import cn.com.wtrj.jx.web.portal.model.entities.Dict;
import cn.com.wtrj.jx.web.portal.model.entities.Header;
import cn.com.wtrj.jx.web.portal.model.entities.Job;
import cn.com.wtrj.jx.web.portal.model.entities.SearchInput;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherClass;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherCourse;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherPermission;
import cn.com.wtrj.jx.web.portal.model.entities.TeacherRole;
import cn.com.wtrj.jx.web.portal.model.entities.User;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreDetail;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamClass;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSum;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreUpload;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreDetailExpt;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjScoreRuleExt;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjStudent;
import cn.com.wtrj.jx.web.portal.service.dto.ScoreInput;
import cn.com.wtrj.jx.web.portal.service.dto.ScoreMultiInput;
import cn.com.wtrj.jx.web.portal.service.job.ScoreTaskJob;

@Service
public class ScoreManageService {

	private final static ScheduledExecutorService msScheduler = Executors.newSingleThreadScheduledExecutor();

	@Autowired
	private ScoreUploadService scoreUploadService;

	@Autowired
	private ScoreManageDao scoreManageDao;

	@Autowired
	private WtrjRptScoreSingleMapper scoreSingle;

	@Autowired
	private WtrjScoreDetailExptMapper detailExptMapper;

	@Autowired
	private WtrjBaseCommentMapper baseCommentMapper;

	public List<WtrjRptScoreExamClass> findExamClassesPage(SearchInput input) {
		return scoreManageDao.findExamClassesPage(input);
	}

	public int findExamClassesCount(SearchInput input) {
		return scoreManageDao.findExamClassesCount(input);
	}

	public List<WtrjRptScoreExamClass> findRecoveryExamClassesPage(SearchInput input) {
		return scoreManageDao.findRecoveryExamClassesPage(input);
	}

	public int findRecoveryExamClassesCount(SearchInput input) {
		return scoreManageDao.findRecoveryExamClassesCount(input);
	}

	public Map<String, List<TeacherRole>> findTeacherAllRoles(int teacherId) {

		List<TeacherPermission> schools = findTeacherSchools(teacherId);

		Map<String, List<TeacherRole>> allRoles = Maps.newHashMap();

		if (schools != null && schools.size() > 0) {

			for (TeacherPermission school : schools) {

				List<Integer> stages = findTeacherStages(school.getSchoolCode(), teacherId);

				if (stages != null && stages.size() > 0) {

					for (int stage : stages) {
						List<TeacherRole> roles = findTeacherRoles(school.getSchoolCode(), stage, teacherId);
						allRoles.put(school.getSchoolCode() + "-" + stage, roles);
					}

				}

			}

		}

		return allRoles;
	}

	public List<TeacherPermission> findTeacherSchools(int teacherId) {
		return scoreManageDao.findTeacherSchools(teacherId);
	}

	public List<Integer> findTeacherStages(String schoolCode, int teacherId) {
		return scoreManageDao.findTeacherStages(schoolCode, teacherId);
	}

	public List<Integer> findAllGrades(String schoolCode, int stage) {
		return scoreManageDao.findAllGrades(schoolCode, stage);
	}

	public List<TeacherPermission> findAllClasses(String schoolCode, int stage, int grade) {
		return scoreManageDao.findAllClasses(schoolCode, stage, grade);
	}

	public List<TeacherRole> findTeacherRoles(String schoolCode, int stage, int teacherId) {

		List<TeacherRole> roles = Lists.newArrayList();

		TeacherRole role = null;

		// 学部领导
		List<TeacherPermission> xblds = scoreManageDao.findTeacherRoles(schoolCode, stage, teacherId, "101");

		if (xblds != null && xblds.size() > 0) {

			role = new TeacherRole(schoolCode, stage, "101", "学部领导", true, true, true);

			roles.add(role);

			return roles;
		}

		// 教研组长
		List<TeacherPermission> jyzzs = scoreManageDao.findTeacherRoles(schoolCode, stage, teacherId, "6");

		if (jyzzs != null && jyzzs.size() > 0) {

			role = new TeacherRole(schoolCode, stage, "6", "教研组长", true, true, false);

			Map<String, List<TeacherCourse>> courses = Maps.newHashMap();
			List<TeacherCourse> crses = null;

			for (TeacherPermission tp : jyzzs) {

				if (courses.get(schoolCode) != null) {
					courses.get(schoolCode).add(new TeacherCourse(tp.getCourseCode(), tp.getCourseName()));
				} else {
					crses = Lists.newArrayList();
					crses.add(new TeacherCourse(tp.getCourseCode(), tp.getCourseName()));
					courses.put(schoolCode, crses);
				}

			}
			role.setCourses(courses);
			roles.add(role);

		}

		// 年级组长
		List<TeacherPermission> njzzs = scoreManageDao.findTeacherRoles(schoolCode, stage, teacherId, "5");

		if (njzzs != null && njzzs.size() > 0) {

			role = new TeacherRole(schoolCode, stage, "5", "年级组长", false, true, true);

			List<Integer> grades = Lists.newArrayList();

			for (TeacherPermission tp : njzzs) {
				grades.add(tp.getGrade());
			}

			role.setGrades(grades);
			roles.add(role);

		}

		// 备课组长
		List<TeacherPermission> bkzzs = scoreManageDao.findTeacherRoles(schoolCode, stage, teacherId, "4");

		if (bkzzs != null && bkzzs.size() > 0) {

			role = new TeacherRole(schoolCode, stage, "4", "备课组长", false, true, false);

			Map<String, List<TeacherCourse>> courses = Maps.newHashMap();
			List<TeacherCourse> crses = null;
			List<Integer> grades = Lists.newArrayList();

			for (TeacherPermission tp : bkzzs) {

				if (courses.get(String.valueOf(tp.getGrade())) != null) {
					courses.get(String.valueOf(tp.getGrade()))
							.add(new TeacherCourse(tp.getCourseCode(), tp.getCourseName()));
				} else {
					crses = Lists.newArrayList();
					crses.add(new TeacherCourse(tp.getCourseCode(), tp.getCourseName()));
					courses.put(String.valueOf(tp.getGrade()), crses);
				}

				grades.add(tp.getGrade());
			}

			role.setGrades(grades);
			role.setCourses(courses);

			roles.add(role);
		}

		// 班主任
		List<TeacherPermission> bzrs = scoreManageDao.findTeacherRoles(schoolCode, stage, teacherId, "1");

		if (bzrs != null && bzrs.size() > 0) {

			role = new TeacherRole(schoolCode, stage, "1", "班主任", false, false, true);

			Map<Integer, List<TeacherClass>> classes = Maps.newHashMap();
			List<Integer> grades = Lists.newArrayList();
			List<TeacherClass> clses = null;

			for (TeacherPermission tp : bzrs) {

				if (classes.get(tp.getGrade()) != null) {
					classes.get(tp.getGrade()).add(new TeacherClass(tp.getClassId(), tp.getClassName()));
				} else {
					clses = Lists.newArrayList();
					clses.add(new TeacherClass(tp.getClassId(), tp.getClassName(), true));
					classes.put(tp.getGrade(), clses);
				}

				grades.add(tp.getGrade());

			}

			role.setGrades(grades);
			role.setClasses(classes);
			roles.add(role);
		}

		// 任课教师
		List<TeacherPermission> rks = scoreManageDao.findTeacherRoles(schoolCode, stage, teacherId, "2");

		if (rks != null && rks.size() > 0) {

			role = new TeacherRole(schoolCode, stage, "2", "任课教师", false, false, false);

			Map<Integer, List<TeacherClass>> classes = Maps.newHashMap();
			Map<String, List<TeacherCourse>> courses = Maps.newHashMap();
			List<TeacherCourse> crses = null;
			List<Integer> grades = Lists.newArrayList();

			List<TeacherClass> clses = null;

			for (TeacherPermission tp : rks) {

				if (classes.get(tp.getGrade()) != null) {
					classes.get(tp.getGrade()).add(new TeacherClass(tp.getClassId(), tp.getClassName()));

				} else {
					clses = Lists.newArrayList();
					clses.add(new TeacherClass(tp.getClassId(), tp.getClassName()));
					classes.put(tp.getGrade(), clses);
				}

				if (courses.get(String.valueOf(schoolCode + "-" + tp.getGrade() + "-" + tp.getClassId())) != null) {
					courses.get(String.valueOf(schoolCode + "-" + tp.getGrade() + "-" + tp.getClassId()))
							.add(new TeacherCourse(tp.getCourseCode(), tp.getCourseName()));
				} else {
					crses = Lists.newArrayList();
					crses.add(new TeacherCourse(tp.getCourseCode(), tp.getCourseName()));
					courses.put(String.valueOf(schoolCode + "-" + tp.getGrade() + "-" + tp.getClassId()), crses);
				}

				grades.add(tp.getGrade());

			}

			role.setGrades(grades);
			role.setClasses(classes);
			role.setCourses(courses);

			roles.add(role);
		}

		return roles;
	}

	public boolean validateExamIns(WtrjRptScoreExamIns examIns) {

		int count = scoreManageDao.validateExamIns(examIns);

		if (count > 0) {
			return false;
		}

		return true;
	}

	@Transactional
	public void saveExamIns(WtrjRptScoreExamIns examIns) throws Exception {
		// 保存考次信息
		scoreManageDao.saveExamIns(examIns);

		DozerBeanMapper mapper = new DozerBeanMapper();

		// 单科保存 计分规则
		if ("0".equals(examIns.getExamType())) {
			WtrjScoreRuleExt rule = new WtrjScoreRuleExt(examIns.getScoreFull(), examIns.getId(),
					examIns.getCourseCode(), examIns.getCourseName(), examIns.getScoreMulti(), examIns.getClassId(),
					examIns.getClassName());
			// 保存考次计分规则
			rule.setId(UUID.randomUUID().toString());
			scoreManageDao.saveScoreRule(rule);

			// 保存考次班级关联
			WtrjRptScoreExamClass examClass = mapper.map(examIns, WtrjRptScoreExamClass.class);
			examClass.setId(UUID.randomUUID().toString());
			examClass.setExamInsId(examIns.getId());
			examClass.setExamInsName(examIns.getName());
			examClass.setDataState("0");
			examClass.setVisibleState("1");
			scoreManageDao.saveExamClass(examClass);
		} else {

			if ("0".equals(examIns.getVisibleState())) {
				// 保存考次班级关联
				List<TeacherPermission> classes = scoreManageDao.findAllClasses(examIns.getSchoolCode(),
						Integer.valueOf(examIns.getStage()), Integer.valueOf(examIns.getGrade()));

				for (TeacherPermission c : classes) {

					// 保存考次班级关联
					WtrjRptScoreExamClass examClass = mapper.map(examIns, WtrjRptScoreExamClass.class);
					examClass.setId(UUID.randomUUID().toString());
					examClass.setExamInsId(examIns.getId());
					examClass.setExamInsName(examIns.getName());
					examClass.setClassId(c.getClassId());
					examClass.setClassName(c.getClassName());
					examClass.setDataState("0");
					examClass.setVisibleState("0");
					scoreManageDao.saveExamClass(examClass);
				}
			} else {
				// 保存考次班级关联
				WtrjRptScoreExamClass examClass = mapper.map(examIns, WtrjRptScoreExamClass.class);
				examClass.setId(UUID.randomUUID().toString());
				examClass.setExamInsId(examIns.getId());
				examClass.setExamInsName(examIns.getName());
				examClass.setClassId(examIns.getClassId());
				examClass.setClassName(examIns.getClassName());
				examClass.setDataState("0");
				examClass.setVisibleState("1");
				scoreManageDao.saveExamClass(examClass);
			}

		}

	}

	public WtrjRptScoreExamIns findExamInsById(int id) {
		return scoreManageDao.findExamInsById(id);
	}

	public WtrjScoreRuleExt findScoreRule(int examInsId, String courseCode, int classId) {
		return scoreManageDao.findScoreRule(examInsId, courseCode, classId);
	}

	public List<WtrjStudent> findStudentsByClassId(int classId) {
		return scoreManageDao.findStudentsByClassId(classId);
	}

	public WtrjRptScoreExamClass findExamClassByExamIdAndClassId(Integer examInsId, Integer classId) {
		return scoreManageDao.findExamClassByExamIdAndClassId(examInsId, classId);
	}

	public List<WtrjRptScoreDetail> findScoreDetails(int examInsId, int classId, String courseCode) {
		return scoreManageDao.findScoreDetails(examInsId, classId, courseCode);
	}

	public void updateScoreRule(WtrjScoreRuleExt rule) {
		scoreManageDao.updateScoreRule(rule);
	}

	public void recoveryScore(int examInsId, int classId, String courseCode, String dataState) {

		if ("1".equals(dataState)) {

			// 恢复相关
			scoreManageDao.recoveryScoreRule(examInsId, classId, courseCode);
			scoreManageDao.recoveryScoreDetail(examInsId, classId, courseCode);
			scoreManageDao.recoveryScoreUpload(examInsId, classId, courseCode);
			scoreManageDao.recoveryScoreExamClassCourse(examInsId, classId, courseCode);

			// 如果成绩全部恢复，更新考次上传状态
			List<WtrjRptScoreUpload> uploads = findUploadCourses(examInsId, classId);

			if (uploads == null || uploads.size() == 0) {
				scoreManageDao.updateExamClassUploadState(examInsId, classId, "1");
			}

		} else {

			// 获取考次信息
			WtrjRptScoreExamIns examIns = findExamInsById(examInsId);
			// 单科
			if ("0".equals(examIns.getExamType())) {
				// 删除相关
				scoreManageDao.recoveryScoreRule(examInsId, classId, courseCode);
				scoreManageDao.recoveryScoreDetail(examInsId, classId, courseCode);
				scoreManageDao.recoveryScoreUpload(examInsId, classId, courseCode);
			}

			scoreManageDao.recoveryScoreExamIns(examInsId);
			scoreManageDao.recoveryScoreExamClass(examInsId, classId);

		}

	}

	public void deleteInputScore(int examInsId, int classId, String courseCode, String dataState,String scoreFallbackUrl,String scoreGradeFallbackUrl,String scoreTaskUrl) {

		if ("1".equals(dataState)) {

			// 删除相关
			scoreManageDao.deleteScoreRule(examInsId, classId, courseCode);
			scoreManageDao.deleteScoreDetail(examInsId, classId, courseCode);
			scoreManageDao.deleteScoreUpload(examInsId, classId, courseCode);
			scoreManageDao.deleteScoreExamClassCourse(examInsId, classId, courseCode);
			scoreSingle.deleteScoreSingle(examInsId, classId, courseCode);
			// 如果成绩全部删除，更新考次上传状态
			List<WtrjRptScoreUpload> uploads = findUploadCourses(examInsId, classId);

			if (uploads == null || uploads.size() == 0) {
				scoreManageDao.updateExamClassUploadState(examInsId, classId, "0");
			}

		} else {

			// 获取考次信息
			WtrjRptScoreExamIns examIns = findExamInsById(examInsId);
			// 单科
			if ("0".equals(examIns.getExamType())) {
				// 删除相关
				scoreManageDao.deleteScoreRule(examInsId, classId, courseCode);
				scoreManageDao.deleteScoreDetail(examInsId, classId, courseCode);
				scoreManageDao.deleteScoreUpload(examInsId, classId, courseCode);
				scoreSingle.deleteScoreSingle(examInsId, classId, courseCode);
			}

			scoreManageDao.deleteScoreExamIns(examInsId);
			scoreManageDao.deleteScoreExamClass(examInsId, classId);

		}

		// 获取考次信息
		WtrjRptScoreExamIns examIns = findExamInsById(examInsId);
		sumStudentScores(String.valueOf(examInsId), String.valueOf(classId), scoreFallbackUrl, scoreTaskUrl, null);
		if("0".equals(examIns.getVisibleState())) {
			countGradeOrderTask(Integer.valueOf(examIns.getStage()),Integer.valueOf(examIns.getGrade()) , examInsId, scoreGradeFallbackUrl, scoreTaskUrl);
		}
	}

	public void sumStudentScores(String examInsId, String classId, String scoreFallbackUrl, String scoreTaskUrl,
			String classRemark) {
		// 自动汇总成绩
		Job job = new Job();
		job.setName("test");
		job.setNotifyUrl(scoreFallbackUrl);
		job.setParams("{" + "classId:" + classId + ",examInsId:" + examInsId + ",classRemark:'" + classRemark + "'}");
		msScheduler.schedule(new ScoreTaskJob(job, scoreTaskUrl), 2, TimeUnit.SECONDS);
	}

	public void countGradeOrderTask(int stage, int grade, int examInsId, String scoreGradeFallbackUrl,
			String scoreTaskUrl) {
		// 汇总年级成绩
		Job job = new Job();
		job.setName("test");
		job.setNotifyUrl(scoreGradeFallbackUrl);
		job.setParams("{" + "stage:" + stage + ",grade:" + grade + ",examInsId:" + examInsId + "}");
		msScheduler.schedule(new ScoreTaskJob(job, scoreTaskUrl), 2, TimeUnit.SECONDS);
	}

	public void countGradeOrder(int stage, int grade, int examInsId) {

		List<WtrjStudent> gradeStudents = findStudentGradeOrder(stage, grade, examInsId);
		// 年级平均分
		double gradeAvgScore = scoreManageDao.findGradeAvgScore(stage, grade, examInsId);
		// 年级最低分
		double gradeMinScore = scoreManageDao.findGradeMinScore(stage, grade, examInsId);
		// 年级最高分
		double gradeTopScore = scoreManageDao.findGradeTopScore(stage, grade, examInsId);
		if (gradeStudents != null && gradeStudents.size() > 0) {

			int gradeOrder = 1;

			for (int i = 0; i < gradeStudents.size(); i++) {

				if (i == 0) {
					gradeOrder = gradeStudents.get(i).getRn();
				} else {

					double nowScore = gradeStudents.get(i).getScore();
					double preScore = gradeStudents.get(i - 1).getScore();

					if (nowScore < preScore) {
						gradeOrder = gradeStudents.get(i).getRn();
					}
				}

				updateStudentGradeOrder(gradeStudents.get(i).getStudentCode(), gradeOrder);

			}
		}
		// 更新年级性的各项分数和文综理综年级排名
		// 理综
		List<WtrjRptScoreSum> scienceList = scoreManageDao.findScienceScoreNumByGradeIdAndInsId(stage, grade,
				examInsId);
		if (scienceList != null && scienceList.size() > 0) {
			for (int i = 0; i < scienceList.size(); i++) {
				WtrjRptScoreSum sum = scienceList.get(i);
				if (sum.getScienceScore().doubleValue() > 0) {
					if (i == 0) {
						sum.setScienceOrderGradeNum(i + 1);
					} else {
						// 分数相同的时候排名一样
						double nowScore = sum.getScienceScore().doubleValue();
						double preScore = scienceList.get(i - 1).getScienceScore().doubleValue();
						if (nowScore < preScore) {
							sum.setScienceOrderGradeNum(i + 1);
						}
						if (nowScore == preScore) {
							sum.setScienceOrderGradeNum(scienceList.get(i - 1).getScienceOrderGradeNum());
						}
					}
				}
				sum.setAverageGradeScore(BigDecimal.valueOf(gradeAvgScore));
				sum.setGradeTopScore(BigDecimal.valueOf(gradeTopScore));
				sum.setGradeBottomScore(BigDecimal.valueOf(gradeMinScore));
				scoreManageDao.updateGradeScoreSum(sum);
			}
		}
		// 文综
		List<WtrjRptScoreSum> artsList = scoreManageDao.findArtsScoreNumByGradeIdAndInsId(stage, grade, examInsId);
		if (artsList != null && artsList.size() > 0) {
			for (int i = 0; i < artsList.size(); i++) {
				WtrjRptScoreSum sum = artsList.get(i);
				if (sum.getArtsScore().doubleValue() > 0) {
					if (i == 0) {
						sum.setArtsOrderGradeNum(i + 1);
					} else {
						// 分数相同的时候排名一样
						double nowScore = sum.getArtsScore().doubleValue();
						double preScore = artsList.get(i - 1).getArtsScore().doubleValue();
						if (nowScore < preScore) {
							sum.setArtsOrderGradeNum(i + 1);
						}
						if (nowScore == preScore) {
							sum.setArtsOrderGradeNum(artsList.get(i - 1).getArtsOrderGradeNum());
						}
					}
				}
				sum.setAverageGradeScore(BigDecimal.valueOf(gradeAvgScore));
				sum.setGradeTopScore(BigDecimal.valueOf(gradeTopScore));
				sum.setGradeBottomScore(BigDecimal.valueOf(gradeMinScore));
				scoreManageDao.updateGradeScoreSum(sum);
			}
		}
		// 更新年级性单科目各项分数及排名
		List<String> courseCodes = scoreManageDao.findCourseCodeByGradeIdAndInsIdAndStage(grade, examInsId);
		// 循环遍历所考科目
		for (String code : courseCodes) {
			double avgScore = scoreSingle.findSingleGradeAvgScore(examInsId, grade, code);
			double minScore = scoreSingle.findSingleGradeMinScore(examInsId, grade, code);
			List<WtrjRptScoreSingle> singles = scoreSingle.findSingleByGradeIdAndInsIdAndCourseCode(examInsId, grade,
					code);
			if (singles != null && singles.size() > 0) {
				double topScore = 0;
				for (int i = 0; i < singles.size(); i++) {
					WtrjRptScoreSingle single = singles.get(i);
					if (i == 0) {
						topScore = single.getScore().doubleValue();
						single.setOrderGradeNumber(i + 1);
					} else {
						// 分数相同的时候排名一样
						double nowScore = single.getScore().doubleValue();
						double preScore = singles.get(i - 1).getScore().doubleValue();
						if (nowScore < preScore) {
							single.setOrderGradeNumber(i + 1);
						}
						if (nowScore == preScore) {
							single.setOrderGradeNumber(singles.get(i - 1).getOrderGradeNumber());
						}
					}
					single.setGradeTopScore(BigDecimal.valueOf(topScore));
					single.setAverageGradeScore(BigDecimal.valueOf(avgScore));
					single.setGradeBottomScore(BigDecimal.valueOf(minScore));
					// 是否分卷
					if ("1".equals(single.getScoreMulti())) {
						double gradeAvgScoreA = scoreSingle.findSingleGradeAvgScoreA(examInsId, grade, code);
						double gradeAvgScoreB = scoreSingle.findSingleGradeAvgScoreB(examInsId, grade, code);
						single.setGradeAverageA(BigDecimal.valueOf(gradeAvgScoreA));
						single.setGradeAverageB(BigDecimal.valueOf(gradeAvgScoreB));
					}
					scoreSingle.updateByPrimaryKey(single);
				}

			}
		}

	}

	public void updateStudentGradeOrder(String id, int orderNumber) {
		scoreManageDao.updateStudentGradeOrder(id, orderNumber);
	}

	public List<WtrjStudent> findStudentGradeOrder(int stage, int grade, int examInsId) {
		return scoreManageDao.findStudentGradeOrder(stage, grade, examInsId);
	}

	public void saveStudentScores(ScoreInput input, User user, String scoreFallbackUrl, String scoreTaskUrl, int flag) {

		// 获取考次信息
		WtrjRptScoreExamIns examIns = findExamInsById(input.getExamInsId());

		// 获取计分规则
		WtrjScoreRuleExt rule = null;

		// 单科目记录
		WtrjRptScoreSingle single = new WtrjRptScoreSingle();

		DozerBeanMapper mapper = new DozerBeanMapper();

		// 多科
		if ("1".equals(input.getExamType()) || "-1".equals(input.getExamType())) {
			// 删除科目相关
			scoreManageDao.deleteScoreRule(input.getExamInsId(), input.getClassId(), input.getCourseCode());

			rule = new WtrjScoreRuleExt(BigDecimal.valueOf(input.getFullScore()), input.getExamInsId(),
					input.getCourseCode(), input.getCourseName(), input.getScoreMulti(), input.getClassId(),
					input.getClassName());
			// 保存考次计分规则
			rule.setId(UUID.randomUUID().toString());
			scoreManageDao.saveScoreRule(rule);

			examIns.setCourseCode(input.getCourseCode());
			examIns.setCourseName(input.getCourseName());
			examIns.setClassId(input.getClassId());
			examIns.setClassName(input.getClassName());
		} else {
			rule = findScoreRule(examIns.getId(), examIns.getCourseCode(), examIns.getClassId());
		}

		// 删除重复数据
		if (flag == 0) {
			scoreManageDao.deleteScoreDetail(examIns.getId(), examIns.getClassId(), examIns.getCourseCode());
			scoreManageDao.deleteScoreUpload(examIns.getId(), examIns.getClassId(), examIns.getCourseCode());
			scoreSingle.deleteScoreSingle(examIns.getId(), examIns.getClassId(), examIns.getCourseCode());
		}
		// 分卷
		if ("1".equals(rule.getScoreMulti())) {
			rule.setScoreAFull(input.getScoreAFull());
			rule.setScoreBFull(input.getScoreBFull());
			rule.setScoreAStd(input.getScoreAStd());
			rule.setScoreBStd(input.getScoreBStd());
			rule.setScoreFull(input.getScoreAStd().add(input.getScoreBStd()));
			// 更新计分规则
			updateScoreRule(rule);
		}

		List<WtrjStudent> students = input.getStudents();

		WtrjRptScoreDetail d = null;

		for (WtrjStudent s : students) {

			double score = 0;
			double scoreA = 0;
			double scoreB = 0;
			double scoreAExt = 0;
			double scoreBExt = 0;
			single.setScoreMulti(rule.getScoreMulti());
			// 是否分卷 分卷
			if ("1".equals(rule.getScoreMulti())) {

				scoreA = s.getScoreA();
				scoreB = s.getScoreB();
				// 计算分卷 得分
				scoreAExt = getScoreExt(rule.getScoreAFull().doubleValue(), rule.getScoreAStd().doubleValue(), scoreA);
				scoreBExt = getScoreExt(rule.getScoreBFull().doubleValue(), rule.getScoreBStd().doubleValue(), scoreB);

				score = scoreAExt + scoreBExt;
				single.setScore(BigDecimal.valueOf(score));
				single.setScoreA(BigDecimal.valueOf(scoreAExt));
				single.setScoreB(BigDecimal.valueOf(scoreBExt));
			}
			// 是否分卷 不分卷
			else if ("0".equals(rule.getScoreMulti())) {
				score = s.getScore();
				single.setScore(BigDecimal.valueOf(score));
			}

			d = new WtrjRptScoreDetail(examIns.getId(), examIns.getName(), examIns.getSchoolCode(),
					examIns.getClassName(), s.getName(), rule.getScoreFull(), BigDecimal.valueOf(score),
					examIns.getCourseCode(), examIns.getCourseName(), examIns.getClassId(), user.getTeacherId(),
					user.getTeacherName(), BigDecimal.valueOf(scoreA), BigDecimal.valueOf(scoreAExt),
					BigDecimal.valueOf(scoreB), BigDecimal.valueOf(scoreBExt), rule.getScoreMulti(), s.getStudentCode(),
					s.getRemark());

			single.setId(UUID.randomUUID().toString());
			single.setExamInsId(String.valueOf(examIns.getId()));
			single.setExamInsName(examIns.getName());
			single.setSchoolCode(examIns.getSchoolCode());
			single.setSchoolName(examIns.getSchoolName());
			single.setGrade(examIns.getGrade());
			single.setClassId(String.valueOf(examIns.getClassId()));
			single.setClassName(examIns.getClassName());
			single.setCourseCode(examIns.getCourseCode());
			single.setCourseName(examIns.getCourseName());
			single.setName(s.getName());
			single.setStudentCode(s.getStudentCode());
			single.setFullScore(rule.getScoreFull());
			single.setFlag("1");

			if ("是".equals(s.getStatus())) {

				WtrjScoreDetailExpt expt = mapper.map(d, WtrjScoreDetailExpt.class);
				expt.setId(UUID.randomUUID().toString());
				detailExptMapper.insertSelective(expt);

				continue;
			}
			scoreSingle.insertSelective(single);
			scoreManageDao.saveScoreDetail(d);
		}

		WtrjRptScoreUpload upload = mapper.map(examIns, WtrjRptScoreUpload.class);

		// 保存上传信息
		upload.setFlag("1");
		upload.setExamInsId(examIns.getId().toString());
		upload.setExamInsName(examIns.getName());
		upload.setYearCode(examIns.getSchoolYearCode());
		upload.setYearName(examIns.getSchoolYearName());
		upload.setTermCode(examIns.getSchoolTermCode());
		upload.setTermName(examIns.getSchoolTermName());
		upload.setUploadUserId(Integer.valueOf(examIns.getCreateUserId()));
		upload.setUploadUserName(examIns.getCreateUserName());
		upload.setId(UUID.randomUUID().toString());

		scoreManageDao.saveScoreUpload(upload);

		// 更新单科目数据
		scoreUploadService.singleScore(examIns.getClassId(), examIns.getId(), examIns.getCourseCode());
		// 更新上传新状态
		scoreManageDao.updateExamClassUploadState(examIns.getId(), examIns.getClassId(), "1");

		// 自动汇总成绩
		/*
		 * msScheduler.schedule(new ScoreSumJob(scoreUploadService,
		 * String.valueOf(examIns.getId()), String.valueOf(examIns.getClassId())), 2,
		 * TimeUnit.SECONDS);
		 */
		// 发送汇总请求到task
		Job job = new Job();
		job.setName("test");
		job.setNotifyUrl(scoreFallbackUrl);
		job.setParams("{" + "classId:" + examIns.getClassId() + ",examInsId:" + examIns.getId() + ",classRemark:''}");
		msScheduler.schedule(new ScoreTaskJob(job, scoreTaskUrl), 2, TimeUnit.SECONDS);
	}

	// 多科成绩上传
	@Transactional
	public void saveStudentMultiScores(ScoreMultiInput inputs, User user, String scoreFallbackUrl,
			String scoreTaskUrl) {
		List<Header> headers = inputs.getHeaders();
		List<Map<String, String>> students = inputs.getStudents();
		List<Map<String, String>> scoreboards = inputs.getScoreboards();
		List<Map<String, String>> scoreSingles = inputs.getScoreSingle();
		//删除以前数据
		scoreManageDao.deleteAllScoreDetail(inputs.getExamInsId(), inputs.getClassId());
		scoreManageDao.deleteAllScoreUpload(inputs.getExamInsId(), inputs.getClassId());
		scoreSingle.deleteAllScoreSingle(inputs.getExamInsId(), inputs.getClassId());
		// 创建需要的input对象;
		ScoreInput input = null;
		// 创建studentList集合
		List<WtrjStudent> studentList = null;
		WtrjStudent student = null;
		for (int i = 2; i < headers.size(); i++) {
			studentList = new ArrayList<>();
			input = new ScoreInput();
			input.setExamType(inputs.getExamType());
			input.setClassId(inputs.getClassId());
			input.setClassName(inputs.getClassName());
			input.setFullScore(inputs.getFullScore());
			input.setExamInsId(inputs.getExamInsId());
			input.setCourseCode(headers.get(i).getCode());// 科目code
			input.setCourseName(headers.get(i).getCourseName());// 科目名称
			input.setScoreMulti(headers.get(i).getIsMulti());// 是否分科
			String code = headers.get(i).getCode();
			for (Map<String, String> map : scoreboards) {
				String k = map.get("code");
				if (k.equals(code)) {
					input.setScoreAFull(new BigDecimal(map.get("inputScoreAFull")));
					input.setScoreBFull(new BigDecimal(map.get("inputScoreBFull")));
					input.setScoreAStd(new BigDecimal(map.get("inputScoreAStd")));
					input.setScoreBStd(new BigDecimal(map.get("inputScoreBStd")));
				}
			}
			for (Map<String, String> map : scoreSingles) {
				String k = map.get("code");
				if (k.equals(code)) {
					input.setFullScore(Double.valueOf(map.get("inputScoreFull")));
				}
			}
			for (Map<String, String> map : students) {
				student = new WtrjStudent();
				student.setStudentNo(map.get("studentCode"));
				student.setStudentCode(map.get("studentCode"));
				student.setName(map.get("name"));
				String code2 = headers.get(i).getCode();
				if ("1".equals(headers.get(i).getIsMulti())) {
					student.setScoreA(Double.valueOf(map.get(code + "-scoreA")));
					student.setScoreB(Double.valueOf(map.get(code + "-scoreB")));
					student.setRemark(map.get(code2 + "-select-textarea"));
				} else {
					student.setScore(Double.valueOf(map.get(code)));
					student.setRemark(map.get(code2 + "-select-textarea"));
				}
				studentList.add(student);
			}
			input.setSingleClassRemark(inputs.getClassRemark());
			input.setStudents(studentList);
			// 调用保存方法
			saveStudentScores(input, user, scoreFallbackUrl, scoreTaskUrl, 1);
		}
	}

	/**
	 * 计算分卷得分
	 * 
	 * @param ruleFull
	 *            分卷满分
	 * @param ruleExt
	 *            分卷计入分
	 * @param score
	 *            实际得分
	 * @return 实际计入分
	 */
	private double getScoreExt(double ruleFull, double ruleExt, double score) {

		double result = score * ruleExt / ruleFull;

		return result;
	}

	public Double findScienceScore(int classId, int examInsId) {
		return scoreManageDao.findScienceScore(examInsId, classId);
	}

	public Double findArtsScore(int classId, int examInsId) {
		return scoreManageDao.findArtsScore(examInsId, classId);
	}

	public String findClassRemark(int examInsId, int classId) {
		return scoreManageDao.findClassRemark(examInsId, classId);
	}

	public List<WtrjRptScoreUpload> findUploadCourses(int examInsId, int classId) {
		return scoreManageDao.findUploadCourses(examInsId, classId);
	}

	public List<WtrjRptScoreUpload> findRecoveryUploadCourses(int examInsId, int classId) {
		return scoreManageDao.findUploadCourses(examInsId, classId);
	}

	public List<Dict> findScoreRemarkTypeByState(String stateCode) {
		return scoreManageDao.findScoreRemarkTypeByState(stateCode);
	}

	public List<Dict> findScoreRemarkLevelByType(String typeCode) {
		return scoreManageDao.findScoreRemarkLevelByType(typeCode);
	}

	public List<Dict> findScoreRemarkCommentByLevel(String levelCode) {
		return scoreManageDao.findScoreRemarkCommentByLevel(levelCode);
	}

	public WtrjRptScoreUpload findUpload(int examInsId, int classId, String courseCode) {
		return scoreManageDao.findScoreUpload(examInsId, classId, courseCode);
	}

	public void updateExamClassSendState(int examInsId, int classId, String sendState) {
		scoreManageDao.updateExamClassSendState(examInsId, classId, sendState);
	}

	public void updateExamClassMsgCode(int examInsId, int classId, String msgCode, String sendState,
			String sendCondition) {
		scoreManageDao.updateExamClassMsgCode(examInsId, classId, msgCode, sendState, sendCondition);
	}

}
