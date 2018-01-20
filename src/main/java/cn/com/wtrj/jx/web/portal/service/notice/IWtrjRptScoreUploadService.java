package cn.com.wtrj.jx.web.portal.service.notice;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreUpload;

public interface IWtrjRptScoreUploadService {


	int countWtrjRptScoreUpload(Integer id, String schoolCode, String grade, String class_id);

	List<WtrjRptScoreUpload> searchWtrjRptScoreUpload(Integer id, String schoolCode, String grade, String class_id,
			int start, int end);
	
}
