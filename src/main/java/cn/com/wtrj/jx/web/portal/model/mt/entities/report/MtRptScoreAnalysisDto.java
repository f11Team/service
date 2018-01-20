package cn.com.wtrj.jx.web.portal.model.mt.entities.report;

public class MtRptScoreAnalysisDto {
	//考试编号
	private Integer examInsId;
	//学校编号
	private String schoolCode;
	//学校名称
	private String schoolName;
	//班级名称
	private String className;
	//班级总人数
	private Double zongRenshu;
	//班级总分
	private Double zongfen;
	//班级有效分人数
	private Integer  youxiaoRc;
	//班级平均分
	private Double pjScroe;
	//班级个人总分最高分
	private Double grZongfen;
	//班级有效分
	private Double grYouxiao;
	// 班级及格率
	private Double jgLv;
	public Integer getExamInsId() {
		return examInsId;
	}
	public void setExamInsId(Integer examInsId) {
		this.examInsId = examInsId;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Double getZongRenshu() {
		return zongRenshu;
	}
	public void setZongRenshu(Double zongRenshu) {
		this.zongRenshu = zongRenshu;
	}
	public Double getZongfen() {
		return zongfen;
	}
	public void setZongfen(Double zongfen) {
		this.zongfen = zongfen;
	}
	public Integer getYouxiaoRc() {
		return youxiaoRc;
	}
	public void setYouxiaoRc(Integer youxiaoRc) {
		this.youxiaoRc = youxiaoRc;
	}
	public Double getPjScroe() {
		return pjScroe;
	}
	public void setPjScroe(Double pjScroe) {
		this.pjScroe = pjScroe;
	}
	public Double getGrZongfen() {
		return grZongfen;
	}
	public void setGrZongfen(Double grZongfen) {
		this.grZongfen = grZongfen;
	}
	public Double getGrYouxiao() {
		return grYouxiao;
	}
	public void setGrYouxiao(Double grYouxiao) {
		this.grYouxiao = grYouxiao;
	}
	public Double getJgLv() {
		return jgLv;
	}
	public void setJgLv(Double jgLv) {
		this.jgLv = jgLv;
	}
	

}
