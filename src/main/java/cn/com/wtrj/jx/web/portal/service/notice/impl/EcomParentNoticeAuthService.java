//package cn.com.wtrj.jx.web.portal.service.notice.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomNoticeParentAuthMapper;
//import cn.com.wtrj.jx.web.portal.model.dao.WtrjSchoolGradeClassMapper;
//import cn.com.wtrj.jx.web.portal.model.dao.WtrjSchoolGradeMapper;
//import cn.com.wtrj.jx.web.portal.model.dao.WtrjTeacherCourseMapper;
//import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeParentAuth;
//import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeParentAuthExample;
//import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeClassExample;
//import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeClassKey;
//import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeExample;
//import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeKey;
//import cn.com.wtrj.jx.web.portal.model.mt.dao.MtNoticeMapper;
//import cn.com.wtrj.jx.web.portal.model.mt.entities.MtClassParentDto;
//import cn.com.wtrj.jx.web.portal.model.mt.entities.MtCourseClassDto;
//import cn.com.wtrj.jx.web.portal.service.dto.NoticeClassDto;
//import cn.com.wtrj.jx.web.portal.service.dto.NoticeGradeDto;
//import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeClassKey;
//import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeGradeKey;
//import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeParentKey;
//import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeParentPermisson;
//import cn.com.wtrj.jx.web.portal.service.notice.IEcomParentNoticeAuthService;
//
//@Service
//public class EcomParentNoticeAuthService implements IEcomParentNoticeAuthService {
//	@Autowired
//	private WtrjEcomNoticeParentAuthMapper parentAuthMapper;
//	
//	@Autowired
//	private WtrjSchoolGradeMapper schoolGradeMapper;
//	
//	@Autowired
//	private WtrjSchoolGradeClassMapper classMapper;
//	
//	@Autowired
//	private MtNoticeMapper noticeMapper;
//	
//	@Autowired
//	private WtrjTeacherCourseMapper tcMapper;
//	
//	
//	/**
//	 * 获取年级权限相关信息
//	 */
//	@Override
//	public List<NoticeGradeDto> searchNoticeAuthGradeInfo(Integer teacherId) {
//		List<NoticeGradeDto> gradeAuthInfos = new ArrayList<NoticeGradeDto>();
//		
//		WtrjEcomNoticeParentAuthExample example = new WtrjEcomNoticeParentAuthExample();
//		example.createCriteria().andTeacherIdEqualTo(teacherId);
//		example.setDistinct(true);
//		
//		List<WtrjEcomNoticeParentAuth> records = parentAuthMapper.selectByExample(example);
//		for (WtrjEcomNoticeParentAuth record : records) {
//			String schoolCode = record.getSchoolCode();
//			Integer stage = record.getStage();
//			Integer grade = record.getGrade();
//			Integer classNo = record.getClassNo();
//			String course = record.getCourse();
//			if (StringUtils.isNotEmpty(schoolCode) ) {
//				
//				if (stage == null || stage == 0) {
//					// 单独指定学校的情况,获取学校的所有年级
//					List<WtrjSchoolGradeKey> gs = this.searchGrade(schoolCode);
//					this.mergeGradeInfo(gradeAuthInfos, gs);
//					
//				} else if(grade == null || grade == 0){
//					// 指定到学部
//					List<WtrjSchoolGradeKey> gs = this.searchGrade(schoolCode, stage);
//					this.mergeGradeInfo(gradeAuthInfos, gs);
//				
//				} else {
//				    // 指定到年级
//					NoticeGradeDto dto = new NoticeGradeDto();
//					dto.setGrade(grade);
//					dto.setSchoolCode(schoolCode);
//					dto.setStage(stage);
//					
//					gradeAuthInfos.add(dto);
//				}
//			}
//		}
//		
//		return gradeAuthInfos;
//	}
//	
//	@Override
//	public List<NoticeClassDto> searchParentClassInfo(Integer teacherId) {
//		List<NoticeClassDto> gradeAuthInfos = new ArrayList<NoticeClassDto>();
//		
//		WtrjEcomNoticeParentAuthExample example = new WtrjEcomNoticeParentAuthExample();
//		example.createCriteria().andTeacherIdEqualTo(teacherId);
//		
//		List<WtrjEcomNoticeParentAuth> records = parentAuthMapper.selectByExample(example);
//		for (WtrjEcomNoticeParentAuth record : records) {
//			String schoolCode = record.getSchoolCode();
//			Integer stage = record.getStage();
//			Integer grade = record.getGrade();
//			Integer classNo = record.getClassNo();
//			String course = record.getCourse();
//			if (StringUtils.isNotEmpty(schoolCode) ) {
//				
//				if (stage == null || stage == 0) {
//					// 单独指定学校的情况,获取学校的所有年级
//					List<WtrjSchoolGradeClassKey> gs = this.searchClass(schoolCode);
//					this.mergeClassInfo(gradeAuthInfos, gs);
//					
//				} else if(grade == null || grade == 0){
//					// 指定到学部
//					List<WtrjSchoolGradeClassKey> gs = this.searchClass(schoolCode, stage);
//					this.mergeClassInfo(gradeAuthInfos, gs);
//				
//				} else if(classNo == null || classNo == 0){
//				    // 指定到年级
//					List<WtrjSchoolGradeClassKey> gs = this.searchClass(schoolCode, stage, grade);
//					
//					this.mergeClassInfo(gradeAuthInfos, gs);
//				} else {
//					NoticeClassDto dto = new NoticeClassDto();
//					dto.setGrade(grade);
//					dto.setSchoolCode(schoolCode);
//					dto.setStage(stage);
//					dto.setClassNo(classNo);
//					
//					gradeAuthInfos.add(dto);
//				}
//			}
//		}
//		return gradeAuthInfos;
//	}
//
//	private List<WtrjSchoolGradeClassKey> searchClass(String schoolCode) {
//		WtrjSchoolGradeClassExample example = new WtrjSchoolGradeClassExample();
//		example.createCriteria().andSchoolCodeEqualTo(schoolCode);
//		return classMapper.selectByExample(example);
//	}
//	
//	private List<WtrjSchoolGradeClassKey> searchClass(String schoolCode, Integer stage) {
//		WtrjSchoolGradeClassExample example = new WtrjSchoolGradeClassExample();
//		example.createCriteria().andSchoolCodeEqualTo(schoolCode).andStageEqualTo(stage);
//		return classMapper.selectByExample(example);
//	}
//	
//	private List<WtrjSchoolGradeClassKey> searchClass(String schoolCode, Integer stage, Integer grade) {
//		WtrjSchoolGradeClassExample example = new WtrjSchoolGradeClassExample();
//		example.createCriteria().andSchoolCodeEqualTo(schoolCode).andStageEqualTo(stage).andGradeEqualTo(grade);
//		return classMapper.selectByExample(example);
//	}
//	
//
//	private void mergeGradeInfo(List<NoticeGradeDto> gradeAuthInfos, List<WtrjSchoolGradeKey> gs) {
//		for (WtrjSchoolGradeKey g : gs) {
//			NoticeGradeDto dto = new NoticeGradeDto();
//			dto.setGrade(g.getGrade());
//			dto.setSchoolCode(g.getSchoolCode());
//			dto.setStage(g.getStage());
//			
//			gradeAuthInfos.add(dto);
//		}
//	}
//	
//	private void mergeClassInfo(List<NoticeClassDto> gradeAuthInfos, List<WtrjSchoolGradeClassKey> gs) {
//		for (WtrjSchoolGradeClassKey g : gs) {
//			NoticeClassDto dto = new NoticeClassDto();
//			dto.setGrade(g.getGrade());
//			dto.setSchoolCode(g.getSchoolCode());
//			dto.setStage(g.getStage());
//			dto.setClassNo(g.getClassNo());
//			
//			gradeAuthInfos.add(dto);
//		}
//	}
//	
//	
//	/**
//	 * 获取学校所属年级
//	 * 
//	 * @param schoolCode
//	 * @return
//	 */
//	private List<WtrjSchoolGradeKey> searchGrade(String schoolCode){
//		WtrjSchoolGradeExample example = new WtrjSchoolGradeExample();
//		example.createCriteria().andSchoolCodeEqualTo(schoolCode);
//		return schoolGradeMapper.selectByExample(example);
//	}
//	
//	/**
//	 * 获取学校所属年级--指定学部
//	 * 
//	 * @param schoolCode
//	 * @return
//	 */
//	private List<WtrjSchoolGradeKey> searchGrade(String schoolCode, Integer stage){
//		WtrjSchoolGradeExample example = new WtrjSchoolGradeExample();
//		example.createCriteria().andSchoolCodeEqualTo(schoolCode).andStageEqualTo(stage);
//		return schoolGradeMapper.selectByExample(example);
//	}
//
//	@Override
//	public List<MtClassParentDto> searchParentInfo(String schoolCode, Integer stage, Integer grade, Integer classNo) {
//		return noticeMapper.selectClassParents(schoolCode, stage, grade, classNo);
//	}
//
//	@Override
//	public NoticeParentPermisson searchParentPermisson(Integer teacherId) {
//		NoticeParentPermisson permission = new NoticeParentPermisson();
//		
//		WtrjEcomNoticeParentAuthExample example = new WtrjEcomNoticeParentAuthExample();
//		example.createCriteria().andTeacherIdEqualTo(teacherId);
//		
//		List<WtrjEcomNoticeParentAuth> records = parentAuthMapper.selectByExample(example);
//		
//		for (WtrjEcomNoticeParentAuth record : records) {
//			String schoolCode = record.getSchoolCode();
//			Integer stage = record.getStage();
//			Integer grade = record.getGrade();
//			Integer classNo = record.getClassNo();
//			String course = record.getCourse();
//			if (StringUtils.isNotEmpty(schoolCode) ) {
//				// ---------------- 单独指定学校 -------------------------------------
//				if (stage == null || stage == 0) {
//					// 合并学校
//					this.mergeSchoolToPermisson(schoolCode, permission);
//					
//					// 合并年级--单独指定学校的情况,获取学校的所有年级
//					List<WtrjSchoolGradeKey> gs = this.searchGrade(schoolCode);
//					this.mergeGradeToPermisson(gs, permission);
//					
//					// 合并所有班级
//					List<WtrjSchoolGradeClassKey> cs = this.searchClass(schoolCode);
//					this.mergeClassToPermisson(cs, permission);
//					
//				} else if(grade == null || grade == 0){
//					// 合并学校
//					this.mergeSchoolToPermisson(schoolCode, permission);
//					
//					// 单独指定学校的情况,获取学校的所有年级
//					List<WtrjSchoolGradeKey> gs = this.searchGrade(schoolCode, stage);
//					this.mergeGradeToPermisson(gs, permission);
//					
//					// 合并所有班级
//					List<WtrjSchoolGradeClassKey> cs = this.searchClass(schoolCode, stage);
//					this.mergeClassToPermisson(cs, permission);
//				
//				} else if((classNo == null || classNo == 0) && StringUtils.isEmpty(course)){
//					// 合并学校
//					this.mergeSchoolToPermisson(schoolCode, permission);
//
//					// -------------------合并年级---------------------------
//					List<WtrjSchoolGradeKey> gs = new ArrayList<WtrjSchoolGradeKey>();
//					WtrjSchoolGradeKey key = new WtrjSchoolGradeKey();
//					key.setSchoolCode(schoolCode);
//					key.setStage(stage);
//					key.setGrade(grade);
//					gs.add(key);
//					this.mergeGradeToPermisson(gs, permission);
//				    
//					// 合并班级
//					List<WtrjSchoolGradeClassKey> cs = this.searchClass(schoolCode, stage, grade);
//					this.mergeClassToPermisson(cs, permission);
//
//				} else if(classNo != null && classNo > 0 && StringUtils.isEmpty(course)) {
//					// 合并学校
//					this.mergeSchoolToPermisson(schoolCode, permission);
//
//					// -------------------合并年级---------------------------
//					List<WtrjSchoolGradeKey> gs = new ArrayList<WtrjSchoolGradeKey>();
//					WtrjSchoolGradeKey key = new WtrjSchoolGradeKey();
//					key.setSchoolCode(schoolCode);
//					key.setStage(stage);
//					key.setGrade(grade);
//					gs.add(key);
//					this.mergeGradeToPermisson(gs, permission);
//					
//					// --------------------合并年级--------------------------------
//					List<WtrjSchoolGradeClassKey> cs = new ArrayList<WtrjSchoolGradeClassKey>();
//					WtrjSchoolGradeClassKey dto = new WtrjSchoolGradeClassKey();
//					dto.setGrade(grade);
//					dto.setSchoolCode(schoolCode);
//					dto.setStage(stage);
//					dto.setClassNo(classNo);
//					cs.add(dto);
//					
//					this.mergeClassToPermisson(cs, permission);
//				} else if((classNo == null || classNo == 0) && !StringUtils.isEmpty(course)){
//					// 教研组长/备课组长  指定到年级
//					List<MtCourseClassDto> dtos = noticeMapper.selectCourseClasses(schoolCode, stage, grade, course);
//					// 合并学校
//					this.mergeSchoolToPermisson(schoolCode, permission);
//
//					// -------------------合并年级---------------------------
//					List<WtrjSchoolGradeKey> gs = new ArrayList<WtrjSchoolGradeKey>();
//					WtrjSchoolGradeKey key = new WtrjSchoolGradeKey();
//					key.setSchoolCode(schoolCode);
//					key.setStage(stage);
//					key.setGrade(grade);
//					gs.add(key);
//					this.mergeGradeToPermisson(gs, permission);
//					
//					for (MtCourseClassDto dto : dtos) {
//						List<WtrjSchoolGradeClassKey> cs = new ArrayList<WtrjSchoolGradeClassKey>();
//						WtrjSchoolGradeClassKey classKey = new WtrjSchoolGradeClassKey();
//						classKey.setGrade(dto.getGrade());
//						classKey.setSchoolCode(dto.getSchoolCode());
//						classKey.setStage(dto.getStage());
//						classKey.setClassNo(dto.getClassNo());
//						cs.add(classKey);
//						
//						this.mergeClassToPermisson(cs, permission);
//					}
//					
//				} else {
//					// TODO
//				}
//			}
//		}
//		return permission;
//	}
//
//	/**
//	 * 追加学校到权限表
//	 * 
//	 * @param schoolCode
//	 * @param permission
//	 */
//	private void mergeSchoolToPermisson(String schoolCode, NoticeParentPermisson permission) {
//		List<String> schools = permission.getOwnedSchools();
//		if (schools == null) {
//			schools = new ArrayList<String>();
//		}
//		
//		if (!schools.contains(schoolCode)) {
//			schools.add(schoolCode);
//		}
//		
//		permission.setOwnedSchools(schools);
//	}
//	
//	/**
//	 * 追加年级到权限表
//	 * 
//	 * @param schoolCode
//	 * @param permission
//	 */
//	private void mergeGradeToPermisson(List<WtrjSchoolGradeKey> gs, NoticeParentPermisson permission) {
//		List<NoticeGradeKey> grades = permission.getOwnedGrades();
//		if (grades == null) {
//			grades = new ArrayList<NoticeGradeKey>();
//		}
//		
//		// 既存判断用Key
//		List<String> checkList = new ArrayList<String>();
//		for (NoticeGradeKey noticeGradeKey : grades) {
//			checkList.add(noticeGradeKey.getGradeKeyNo());
//		}
//		
//		for (WtrjSchoolGradeKey gradeInfo : gs) {
//			String newKey = gradeInfo.getSchoolCode() + "_" + gradeInfo.getStage() + "_" + gradeInfo.getGrade();
//			if (!checkList.contains(newKey)) {
//				checkList.add(newKey);
//				NoticeGradeKey gk = new NoticeGradeKey();
//				gk.setGrade(gradeInfo.getGrade());
//				gk.setSchoolCode(gradeInfo.getSchoolCode());
//				gk.setStage(gradeInfo.getStage());
//				
//				grades.add(gk);
//			}
//		}
//		
//		permission.setOwnedGrades(grades);
//		
//	}
//	
//	/**
//	 * 追加班级到权限表
//	 * 
//	 * @param schoolCode
//	 * @param permission
//	 */
//	private void mergeClassToPermisson(List<WtrjSchoolGradeClassKey> gs, NoticeParentPermisson permission) {
//		List<NoticeClassKey> classes = permission.getOwnedClasses();
//		if (classes == null) {
//			classes = new ArrayList<NoticeClassKey>();
//		}
//		// 既存班级判断用Key
//		List<String> checkList = new ArrayList<String>();
//		for (NoticeClassKey key : classes) {
//			checkList.add(key.getClassKeyNo());
//		}
//				
//		
//		// 关联家长
//		List<NoticeParentKey> parents = permission.getOwnedParents();
//		if (parents == null) {
//			parents = new ArrayList<NoticeParentKey>();
//		}
//		List<String> checkParentList = new ArrayList<String>();
//		for (NoticeParentKey key : parents) {
//			checkParentList.add(key.getParentKeyNo());
//		}
//		
//		for (WtrjSchoolGradeClassKey classInfo : gs) {
//			String newKey = classInfo.getSchoolCode() + "_" + classInfo.getStage() + "_" + classInfo.getGrade() + "_" + classInfo.getClassNo();
//			if (!checkList.contains(newKey)) {
//				checkList.add(newKey);
//				NoticeClassKey gk = new NoticeClassKey();
//				gk.setGrade(classInfo.getGrade());
//				gk.setSchoolCode(classInfo.getSchoolCode());
//				gk.setStage(classInfo.getStage());
//				gk.setClassNo(classInfo.getClassNo());
//				
//				classes.add(gk);
//			}
//			
//			// 获取家长数据
//			List<MtClassParentDto> ps = noticeMapper.selectClassParents(classInfo.getSchoolCode(), classInfo.getStage(), classInfo.getGrade(), classInfo.getClassNo());
//		    for (MtClassParentDto p : ps) {
//		    	String newPk = p.getSchoolCode() + "_" + p.getStage() + "_" + p.getGrade() + "_" + p.getClassNo() + "_" + p.getParentPhone();
//		    	
//		    	if (!checkParentList.contains(newPk)) {
//		    		checkParentList.add(newPk);
//		    		NoticeParentKey gk = new NoticeParentKey();
//					gk.setGrade(p.getGrade());
//					gk.setSchoolCode(p.getSchoolCode());
//					gk.setStage(p.getStage());
//					gk.setClassNo(p.getClassNo());
//					gk.setParentPhone(p.getParentPhone());
//					gk.setParentName(p.getParentName());
//					
//					parents.add(gk);
//				}
//			}
//		}
//		
//		permission.setOwnedClasses(classes);
//		permission.setOwnedParents(parents);
//	}
//
//}
