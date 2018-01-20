//package cn.com.wtrj.jx.web.portal.service.notice.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import cn.com.wtrj.jx.web.portal.model.entities.WtrjSchoolGradeClassKey;
//import cn.com.wtrj.jx.web.portal.model.mt.entities.MtClassTeacherDto;
//import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeTeacherKey;
//import cn.com.wtrj.jx.web.portal.service.dto.notice.NoticeTeacherPermisson;
//
//@Service
//public class EcomTeacherNoticeAuthService extends AbsEcomPermissionService {
//
//	@Override
//	void setTeacherOrParent(List<WtrjSchoolGradeClassKey> cs, NoticeTeacherPermisson permission) {
//		// 关联教师
//		List<NoticeTeacherKey> teachers = permission.getOwnedTeachers();
//		if (teachers == null) {
//			teachers = new ArrayList<NoticeTeacherKey>();
//		}
//		List<String> checkTeacherList = new ArrayList<String>();
//		for (NoticeTeacherKey key : teachers) {
//			checkTeacherList.add(key.getTeacherKeyNo());
//		}
//		
//		for (WtrjSchoolGradeClassKey classInfo : cs) {
//			
//			// 获取教师数据
//			List<MtClassTeacherDto> ps = noticeMapper.selectClassTeachers(classInfo.getSchoolCode(), classInfo.getStage(), classInfo.getGrade(), classInfo.getClassNo());
//		    for (MtClassTeacherDto p : ps) {
//		    	String newPk = p.getSchoolCode() + "_" + p.getStage() + "_" + p.getGrade() + "_" + p.getClassNo() + "_" + p.getTeacherPhone();
//		    	
//		    	if (!checkTeacherList.contains(newPk)) {
//		    		checkTeacherList.add(newPk);
//		    		NoticeTeacherKey gk = new NoticeTeacherKey();
//					gk.setGrade(p.getGrade());
//					gk.setSchoolCode(p.getSchoolCode());
//					gk.setStage(p.getStage());
//					gk.setClassNo(p.getClassNo());
//					gk.setTeacherPhone(p.getTeacherPhone());
//					gk.setTeacherName(p.getTeacherName());
//					
//					teachers.add(gk);
//				}
//			}
//		}
//		permission.setOwnedTeachers(teachers);}
//
//}
