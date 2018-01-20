package cn.com.wtrj.jx.web.portal.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Strings;

import cn.com.wtrj.jx.web.portal.model.dao.ScoreUploadMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreSingleMapper;
import cn.com.wtrj.jx.web.portal.model.entities.DictItem;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreExamIns;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSingle;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreSum;
import cn.com.wtrj.jx.web.portal.model.mt.entities.MtSchoolInfo;
import cn.com.wtrj.jx.web.portal.service.ScoreNoticeService;
import cn.com.wtrj.jx.web.portal.service.ScoreUploadService;
import cn.com.wtrj.jx.web.portal.service.dto.Grade;
import cn.com.wtrj.jx.web.portal.service.dto.School;
import cn.com.wtrj.jx.web.portal.service.dto.SchoolClass;
import cn.com.wtrj.jx.web.portal.service.dto.Score;
import cn.com.wtrj.jx.web.portal.service.dto.Student;
import cn.com.wtrj.jx.web.portal.service.job.ScoreSumJob;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@Service
public class ScoreUploadServiceImpl implements ScoreUploadService {

	private final static ScheduledExecutorService msScheduler = Executors.newSingleThreadScheduledExecutor();
	
	@Autowired
	private ScoreUploadMapper scoreMapper;
	
	@Autowired
	private ScoreNoticeService scoreNoticeService;
	
	@Autowired
	private WtrjRptScoreSingleMapper singleMapper;
	
	@Override
	public List<School> findAllSchool() {
		return scoreMapper.findAllSchool();
	}

	@Override
	public List<Grade> findGradesBySchoolCode(String schoolCode) {
		return scoreMapper.findGradesBySchoolCode(schoolCode);
	}

	@Override
	public List<SchoolClass> findClassesByGrade(String grade, String schoolCode) {
		return scoreMapper.findClassesByGrade(grade, schoolCode);
	}

	@Override
	public List<Student> findStudents(String classId, String grade, String schoolCode) {
		return scoreMapper.findStudents(classId, grade, schoolCode);
	}

	@Override
	@Transactional
	public void saveScoreUploadInfo(Score upload, List<Score> scores) {
		
		//覆盖相同的历史数据
		if(upload.getOver() != null && upload.getOver()) {
			deleteStudentScore(upload);
			deleteScoreUploadFile(upload);
		}
		
		upload.setId(UUID.randomUUID().toString());
		upload.setUploadTime(new Date());
		
		//Map<String, String> msg = addStudentScore(upload);
		
		/*if(msg != null && msg.containsKey("01")) {
			return msg;
		}*/
		
		if(upload != null && scores != null && scores.size()>0) {
			saveStudentsScore(scores);
			scoreMapper.saveScoreUploadInfo(upload);
			msScheduler.schedule(new ScoreSumJob(this, upload.getExamInsId(), upload.getClassId()),
						30, TimeUnit.SECONDS);
		}
		
		
		
		/*if(msg != null && !msg.containsKey("01")) {
			
			scoreMapper.saveScoreUploadInfo(upload);
			
			msScheduler.schedule(new ScoreSumJob(this, upload.getExamInsId(), upload.getClassId()),
						30, TimeUnit.SECONDS);
		}*/
		
		
	}
	
	
	
	/*private Map<String, String> addStudentScore(Score upload) {
		Map<String, String> msg = null;
		File file = new File(upload.getDiskPath());
		if(file != null && file.exists()) {
			try {
				
				InputStream is;
				try {
					is = new FileInputStream(file);
					XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
					 XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
					 
					 if (xssfSheet != null) {
						 
						// 获取当前工作薄的每一行
						 if(xssfSheet.getLastRowNum() > 1 && xssfSheet.getLeftCol() >= 2) {
							 
							 List<Score> ss = new ArrayList<Score>();
							 
							 for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
				                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
				                if (xssfRow != null) {
				                    XSSFCell studentNameCell = xssfRow.getCell(0);
				                    //读取第一列数据
				                    XSSFCell scoreCell = xssfRow.getCell(1);
				                    //读取第二列数据
				                   
				                    String studentName = null;
				                    String score = null;
				                    
				                    if(studentNameCell != null && scoreCell != null) {
				                    	studentName = scoreCell.getStringCellValue();
				                    	score = scoreCell.getStringCellValue();
				                    }
				                    
				                    if(StringUtils.isNotBlank(studentName)) {
				                    	Score s = new Score();
				                    	BeanUtils.copyProperties(upload, s);
				            			
				            			if(!isDouble(score)) {
				            				score = "0.00";
				            			}
				            			
				            			//s.setIdCardNumber(idCardNumber);
					            		s.setStudentName(studentName.replaceAll("\\s*", ""));
					            		s.setScore(score);
					            		ss.add(s);
				            		}
				            		

				                }
				            }
							 
							 if(ss != null && ss.size() >0) {
								 saveStudentsScore(ss); 
							 }
							 else {
								 msg = new HashMap<String, String>();
								msg.put("01", "成绩单没有内容上传");
								return msg;
							 }
							 
							 
						 }
				            
						 
			         }
					 else {
						msg = new HashMap<String, String>();
						msg.put("01", "成绩单没有内容");
						 return msg;
					 }
					 
				} catch (Exception e) {
					e.printStackTrace();
					msg = new HashMap<String, String>();
					msg.put("01", "成绩单解析错误");
				}
				
				
				
				Workbook workbook = Workbook.getWorkbook(file);
				if(workbook != null && workbook.getSheets() != null && workbook.getSheets().length >0) {
					
					Sheet sheet = workbook.getSheet(0);
					
					//msg = validateStudentsInfo(upload, sheet);
					
					//if(!msg.containsKey("01")) {
						
						int rows = sheet.getRows();
			            int columns = sheet.getColumns();
						
						if(rows > 1 && columns >=2) {
							
							List<Score> ss = new ArrayList<Score>();
							
			            	for(int i = 1; i < rows; i++) {
			            		Score s = new Score();
			            		//logger.info( sheet.getCell(0, i).getContents() +" - " + sheet.getCell(1, i).getContents() +" - " + sheet.getCell(2, i).getContents());
			            		
			            		String idCardNumber = sheet.getCell(0, i).getContents();
			            		String studentName = sheet.getCell(1, i).getContents();
			            		String score = sheet.getCell(2, i).getContents();
			            		String studentName = sheet.getCell(0, i).getContents();
			            		String score = sheet.getCell(1, i).getContents();
			            		
			            		if(StringUtils.isNotBlank(studentName)) {
			            			BeanUtils.copyProperties(upload, s);
			            			
			            			if(!isDouble(score)) {
			            				score = "0.00";
			            			}
			            			
			            			//s.setIdCardNumber(idCardNumber);
				            		s.setStudentName(studentName.replaceAll("\\s*", ""));
				            		s.setScore(score);
			            			
			            		}
			            		ss.add(s);
			            	}
			            	
			            	saveStudentsScore(ss);
			            	
			            	
			            }
						
						
					}
					else {
						return msg;
					}
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		
		return msg;
		
	}*/
	
	private boolean isDouble(String str) {
	   try
	   {
	      Double.parseDouble(str);
	      return true;
	   }
	   catch(NumberFormatException ex){}
	   
	   return false;
	}
	
	private boolean isInteger(String str) {
	 	if(StringUtils.isBlank(str)) {
	 		return false;
	 	}
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
        return pattern.matcher(str).matches();  
  }
	
	private Map<String, String> validateStudentsInfo(Score upload, Sheet sheet) {
	
		List<String> errorList = new ArrayList<String>();
		Map<String, String> msg = new HashMap<>();
		int rows = sheet.getRows();
        int columns = sheet.getColumns();
		
        if(rows > 1 && columns >=3) {
        	List<Student> sts = findStudents(upload.getClassId(), upload.getGrade(), upload.getSchoolCode());
        	
        	if(sts != null && sts.size() > 0) {
        		if(sts.size() != (rows-1)) {
        			msg.put("01", "上传学生数量与现有班级学生数量不一致，请核对");
        		}
        		
        		for(int i = 1; i < rows; i++) {
        			boolean had = false;
        			String idCardNumber = sheet.getCell(0, i).getContents();
        			String studentName = sheet.getCell(1, i).getContents();
        			
        			
        			if(StringUtils.isBlank(idCardNumber) || StringUtils.isBlank(studentName)) {
        				continue;
        			}
        			
        			for(Student s : sts) {
        				if(s.getIdCardNumber().equals(idCardNumber)) {
        					had = true;
        				}
        			}
        			
        			if(!had) {
        				errorList.add(sheet.getCell(1, i).getContents());
        			}
        		}
        		
        		if(errorList.size() > 0) {
        			//学生信息不存在
        			StringBuilder msgb = new StringBuilder("学生:");
        			
        			for(String s : errorList) {
        				msgb.append(" | ").append(s);
        			}
        			
        			msgb.append(" 的身份信息与上传条件不匹配");
        			msg.put("01", msgb.toString());
        		}
				
			}
        	
        }
		return msg;
	}

	@Override
	public void saveStudentsScore(List<Score> scores) {
		if(scores != null && scores.size() >0) {
			for(Score s : scores) {
				scoreMapper.saveStudentsScore(s);
			}
		}
	}

	@Override
	public List<Score> getScoreUploadByPage(Integer start, Integer end, Integer teacherId) {
		return scoreMapper.getScoreUploadByPage(start, end, teacherId);
	}

	@Override
	public int countScoreUploaByPage(Integer teacherId) {
		return scoreMapper.countScoreUploaByPage(teacherId);
	}

	@Override
	public void deleteScoreUpload(String id) {
		scoreMapper.deleteScoreUpload(id);
	}

	@Override
	public int checkScoreUpload(Score upload) {
		return scoreMapper.checkScoreUpload(upload);
	}

	@Override
	public void deleteStudentScore(Score score) {
		scoreMapper.deleteStudentScore(score);
	}

	@Override
	public void deleteScoreUploadFile(Score upload) {
		scoreMapper.deleteScoreUploadFile(upload);
	}

	@Override
	public List<Score> findScoreUploadInsByClassId(String classId) {
		return scoreMapper.findScoreUploadInsByClassId(classId);
	}
	
	@Override
	public int findScoreUploadCountByClassAndIns(String classId, String examInsId) {
		return scoreMapper.findScoreUploadCountByClassAndIns(classId, examInsId);
	}
	
	@Override
	public List<Score> findScoreUploadInfosByClassAndIns(Integer start, Integer end, String classId, String examInsId) {
		return scoreMapper.findScoreUploadInfosByClassAndIns(start, end, classId, examInsId);
	}
	
	@Override
	public void singleScore(Integer classId, Integer examInsId, String courseCode) {
		double classMin = singleMapper.findSingleClassMinScore(examInsId, classId, courseCode);
		double classAvg = singleMapper.findSingleClassAvgScore(examInsId, classId, courseCode);
		WtrjRptScoreSingle scoreMulti = singleMapper.findSingleClassAvgByScoreMulti(examInsId, classId, courseCode);
		List<WtrjRptScoreSingle> singles = singleMapper.selectByInsIdAndClassIdAndCourseCode(examInsId, classId, courseCode);
		if(singles != null && singles.size()>0) {
			double topScore = 0;
			for (int i = 0; i < singles.size(); i++) {
				WtrjRptScoreSingle single = singles.get(i);
				
				single.setAverageScore(BigDecimal.valueOf(classAvg));
				single.setClassBottomScore(BigDecimal.valueOf(classMin));
				if(i==0) {
					single.setOrderClassNumber(i+1);
					topScore = single.getScore().doubleValue();
				}else {
					//分数相同的时候排名一样
					double nowScore = single.getScore().doubleValue();
					double preScore = singles.get(i-1).getScore().doubleValue();
					if(nowScore < preScore) {
						single.setOrderClassNumber(i+1);
					}
					if(nowScore == preScore) {
						single.setOrderClassNumber(singles.get(i-1).getOrderClassNumber());
					}
				}
				single.setClassTopScore(BigDecimal.valueOf(topScore));
				//判断是否分卷
				if("1".equals(single.getScoreMulti())) {
					single.setClassAverageA(scoreMulti.getClassAverageA());
					single.setClassAverageB(scoreMulti.getClassAverageB());
				}
				singleMapper.updateByPrimaryKeySelective(single);
				
			}
		}
		
	}
	
	@Override
	public void sumScore(String classId, String examInsId,String classRemark) {
		
		String oldClassRemark = scoreMapper.findClassRemarkByClassIdAndInsId(examInsId, classId);
		if(oldClassRemark != null && oldClassRemark.length() >0) {
			if(classRemark == null || classRemark.length() == 0 || "".equals(classRemark)) {
				classRemark = oldClassRemark;
			}
		}
		
		//删除统计表
		scoreMapper.deleteScoreSumInfosByInsIdAndClassId(classId, examInsId);
		
		//查询当前考次的所考的所有科目
		List<DictItem> dictItems = findCourseCodeByClassIdAndInsId(classId, examInsId);
		int arts = 0;
		int science = 0;
		for (DictItem dictItem : dictItems) {
			//理综科目
			if("edu-subject-wl".equals(dictItem.getCode())) {
				science++;
			}
			if("edu-subject-hx".equals(dictItem.getCode())) {
				science++;
			}
			if("edu-subject-sw".equals(dictItem.getCode())) {
				science++;
			}
			//文综科目
			if("edu-subject-zz".equals(dictItem.getCode())) {
				arts++;
			}
			if("edu-subject-ls".equals(dictItem.getCode())) {
				arts++;
			}
			if("edu-subject-dl".equals(dictItem.getCode())) {
				arts++;
			}
		}
		
		List<Score> ss = scoreMapper.findScoreDetailByInsIdAndClassId(classId, examInsId);
		
		Map<String, Score> ssMap = new HashMap<String, Score>(); 
		
		if(ss != null && ss.size()>0) {
					
//			scoreMapper.deleteScoreSumInfosByInsIdAndClassId(classId, examInsId);
			
					for(Score s : ss) {
						
						Score ts = ssMap.get(s.getStudentName());
						
						
						if(ts != null) {
							ts.setSumNumber(Double.valueOf(s.getScore()) + ts.getSumNumber());
							
							double old = 0;
							
							if(!Strings.isNullOrEmpty(ts.getFullScore())) {
								old = Double.parseDouble(ts.getFullScore());
							}
							
							double newScore = 0;
							
							if(!Strings.isNullOrEmpty(s.getFullScore())) {
								newScore = Double.parseDouble(s.getFullScore());
							}
							ts.setClassName(s.getClassName());
							ts.setFullScore(old + newScore +"");
							ssMap.put(s.getStudentName(), ts);
						}
						else {
							
							if(Strings.isNullOrEmpty(s.getFullScore())) {
								s.setFullScore("0");
							}
							
							s.setSumNumber(Double.valueOf(s.getScore()));
							ssMap.put(s.getStudentName(), s);
							
						}
						
					}
			for(String key : ssMap.keySet()) {
				Score scoreSum = ssMap.get(key);
				//理综总分
				if(science == 3) {
					Double scienceScore = scoreMapper.findScienceSumScoreByClassAndInsId(classId, examInsId, scoreSum.getStudentName());
					if(scienceScore != null) {
						scoreSum.setScienceScore(scienceScore);
					}
					
				}
				//文综总分
				if(arts == 3) {
					Double artsScore = scoreMapper.findArtsSumScoreByClassAndInsId(classId, examInsId, scoreSum.getStudentName());
					if(artsScore != null) {
						scoreSum.setArtsScore(artsScore);
					}
					
				}
				scoreSum.setId(UUID.randomUUID().toString());
				scoreSum.setFlag("1");
				if(classRemark != null ) {
					scoreSum.setClassRemark(classRemark);
				}
				if(StringUtils.isBlank(scoreSum.getStudentCode())) {
					scoreSum.setStudentCode("");
				}
				scoreMapper.saveScoreSum(scoreSum);
			}
			
			double avg = scoreMapper.findScoreSumAvgByClassIdAndInsId(classId, examInsId);
			double min = scoreMapper.findScoreSumBottomByClassIdAndInsId(classId, examInsId);
			List<Score> tsList = scoreMapper.findScoreSumByClassIdAndInsId(classId, examInsId);
			if(tsList != null && tsList.size() >0) {
				
				double topScore = 0;
				
				for(int i = 0; i < tsList.size(); i++) {
					
					Score sc = tsList.get(i);
					sc.setOrderNumber(i+1);
					sc.setAverageNumber(avg);
					sc.setClassBottomScore(min);
					if(i == 0) {
						topScore = sc.getSumNumber();
					}
					/*else{
						validateOrderNumber(sc, tsList.get(i-1));
					}*/
					
					sc.setClassTopScore(topScore);
					
					if(StringUtils.isBlank(sc.getStudentCode())) {
						sc.setStudentCode("");
					}
					
					scoreMapper.updateScoreSumInfos(sc);
					
				}
			}
			//对理综得分进行排名
			List<Score> scienceList = scoreMapper.findScienceScoreByClassIdAndInsId(classId, examInsId);
			if(scienceList.get(0).getScienceScore() > 0) {
				if(scienceList != null && scienceList.size() >0) {
					for (int i = 0; i < scienceList.size(); i++) {
						Score sc = scienceList.get(i);
						if(i==0) {
							sc.setScienceOrdClassNum(i+1);
						}else {
							double nowScore = sc.getScienceScore();
							double preScore = scienceList.get(i-1).getScienceScore();
							if(nowScore < preScore) {
								sc.setScienceOrdClassNum(i+1);
							}
							if(nowScore == preScore) {
								sc.setScienceOrdClassNum(scienceList.get(i-1).getScienceOrdClassNum());
							}
						}
						scoreMapper.updateScienceClassNumber(sc);
					}
				}
			}
			
			//对文综得分进行排名
			List<Score> artsList = scoreMapper.findArtsScoreByClassIdAndInsId(classId, examInsId);
			if(artsList.get(0).getArtsScore() > 0) {
				if(artsList != null && artsList.size()>0) {
					for (int i = 0; i < artsList.size(); i++) {
						Score sc = artsList.get(i);
						if(i==0) {
							sc.setArtsOrdClassNum(i+1);
						}else {
							double nowScore = sc.getArtsScore();
							double preScore = artsList.get(i-1).getArtsScore();
							if(nowScore < preScore) {
								sc.setArtsOrdClassNum(i+1);
							}
							if(nowScore == preScore) {
								sc.setArtsOrdClassNum(artsList.get(i-1).getArtsOrdClassNum());
							}
						}
						scoreMapper.updateArtsClassNumber(sc);
					}
				}
			}
			
					
		}
		
		List<WtrjRptScoreSum> dtoss = scoreNoticeService.findScoreSum(classId, examInsId);
		
		if(dtoss != null){
			for(int i = 0; i < dtoss.size(); i++) {
				
				if(i != 0) {
					WtrjRptScoreSum tmp = validateOrderNumber(dtoss.get(i), dtoss.get(i-1));
					if(tmp != null){
						scoreNoticeService.updateScoreSum(tmp);
					}
				}
				
			}
			
		}
		
		
		
	}

	private WtrjRptScoreSum validateOrderNumber(WtrjRptScoreSum nowsc, WtrjRptScoreSum presc){
		
		if(nowsc != null && presc != null){
			if(nowsc.getSumNumber().compareTo(presc.getSumNumber()) == 0){
				nowsc.setOrderNumber(presc.getOrderNumber());
				return nowsc;
			}
		}
		
		return null;
	}
	
	/*@Override
	public List<MtSchoolInfo> searchSchoolByUserId(Integer userId) {
		return scoreMapper.selectSchoolByUserId(userId);
	}*/

	@Override
	public List<Score> findScoreUploadInsByClassIdList(List<String> classIds) {
		return scoreMapper.findScoreUploadInsByClassIdArray(classIds);
	}

	@Override
	public List<MtSchoolInfo> searchSchoolByTeacherId(Integer teacherId) {
		return scoreMapper.selectSchoolByTeacherId(teacherId);
	}
	@Override
	public List<Score> findScoreUploadInfosByClass(String classId,String teacherId) {
		return scoreMapper.findScoreUploadInfosByClass(classId,teacherId);
	}

	@Override
	public List<Score> findSingleCourse(Score score) {
		return scoreMapper.findSingleCourse(score);
	}

	@Override
	public Integer findClassAvgScore(Score score) {
		return scoreMapper.findClassAvgScore(score);
	}

	@Override
	public Integer findClassTopScore(Score score) {
		return scoreMapper.findClassTopScore(score);
	}

	@Override
	public List<Score> findScoreMultiInsByClassId(String classId) {
		return scoreMapper.findScoreMultiInsByClassId(classId);
	}

	@Override
	public Score findById(String id) {
		return scoreMapper.findById(id);
	}

	@Override
	public List<DictItem> findCourseCodeByClassIdAndInsId(String classId, String examInsId) {
		return scoreMapper.findCourseCodeByClassIdAndInsId(classId, examInsId);
	}

	@Override
	public String findClassRemarkByClassIdAndInsId(String examInsId, String classId) {
		return scoreMapper.findClassRemarkByClassIdAndInsId(examInsId, classId);
	}
}
