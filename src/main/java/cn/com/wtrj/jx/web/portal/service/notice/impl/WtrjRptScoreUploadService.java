package cn.com.wtrj.jx.web.portal.service.notice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.wtrj.jx.web.portal.model.dao.WtrjEcomNoticeMapper;
import cn.com.wtrj.jx.web.portal.model.dao.WtrjRptScoreUploadMapper;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNotice;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomNoticeExample;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreUpload;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreUploadExample;
import cn.com.wtrj.jx.web.portal.model.mt.dao.gradeNotice.GradeNoticeMapper;
import cn.com.wtrj.jx.web.portal.service.notice.IEcomNoticeService;
import cn.com.wtrj.jx.web.portal.service.notice.IWtrjRptScoreUploadService;

@Service
public class WtrjRptScoreUploadService implements IWtrjRptScoreUploadService {

	@Autowired
	private GradeNoticeMapper gradeNoticeMapper;



	@Override
	public int countWtrjRptScoreUpload(Integer id, String schoolCode, String grade, String class_id) {
		return gradeNoticeMapper.countWtrjRptScoreUpload(id,schoolCode,grade,class_id);
	}

	@Override
	public List<WtrjRptScoreUpload> searchWtrjRptScoreUpload(Integer id, String schoolCode, String grade,
			String class_id, int start, int end) {
		return gradeNoticeMapper.searchWtrjRptScoreUpload(id,schoolCode,grade,class_id,start, end);
	}
	
	

}
