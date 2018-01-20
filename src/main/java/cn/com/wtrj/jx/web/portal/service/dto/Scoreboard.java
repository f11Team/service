package cn.com.wtrj.jx.web.portal.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Scoreboard implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String courseCode;

	private String courseName;

	private BigDecimal scoreAFull;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public BigDecimal getScoreAFull() {
		return scoreAFull;
	}

	public void setScoreAFull(BigDecimal scoreAFull) {
		this.scoreAFull = scoreAFull;
	}

	public BigDecimal getScoreBFull() {
		return scoreBFull;
	}

	public void setScoreBFull(BigDecimal scoreBFull) {
		this.scoreBFull = scoreBFull;
	}

	public BigDecimal getScoreAStd() {
		return scoreAStd;
	}

	public void setScoreAStd(BigDecimal scoreAStd) {
		this.scoreAStd = scoreAStd;
	}

	public BigDecimal getScoreBStd() {
		return scoreBStd;
	}

	public void setScoreBStd(BigDecimal scoreBStd) {
		this.scoreBStd = scoreBStd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private BigDecimal scoreBFull;

	private BigDecimal scoreAStd;

	private BigDecimal scoreBStd;
}
