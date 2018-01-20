package cn.com.wtrj.jx.web.portal.service.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.wtrj.jx.web.portal.service.ScoreUploadService;

public class ScoreSumJob implements Runnable {

	private final static Logger logger = LoggerFactory.getLogger(ScoreSumJob.class);
	
	private ScoreUploadService scoreUploadService;
	
	private String examInsId;
	
	private String classId;
	
	private String courseCode;
	
	public ScoreSumJob(ScoreUploadService scoreUploadService, String examInsId, String classId) {
		this.scoreUploadService = scoreUploadService;
		this.examInsId = examInsId;
		this.classId = classId;
	}
	public ScoreSumJob(ScoreUploadService scoreUploadService, String examInsId, String classId,String courseCode) {
		this.scoreUploadService = scoreUploadService;
		this.examInsId = examInsId;
		this.classId = classId;
		this.courseCode = courseCode;
	}

	@Override
	public void run() {
		
		logger.info("****************************** 学生成绩单计算计汇总任务 开始 ******************************");
		
		//scoreUploadService.singleScore(Integer.valueOf(classId), Integer.valueOf(examInsId), courseCode);
		scoreUploadService.sumScore(classId, examInsId,null);
		
		logger.info("****************************** 学生成绩单计算计汇总任务 结束 ******************************");
		
	}

}
