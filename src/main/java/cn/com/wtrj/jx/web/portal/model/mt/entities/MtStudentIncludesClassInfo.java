package cn.com.wtrj.jx.web.portal.model.mt.entities;

/**
 * 有关联学生的家长为单个学生支付时，封装进入缴费记录表的学生信息bean
 * @author admin
 *
 */
public class MtStudentIncludesClassInfo {
	private Integer studentId;
	private String studentName;
	private String idCardNo;
	private Integer stage;
	private Integer grade;
	private Integer classId;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public Integer getStage() {
		return stage;
	}
	public void setStage(Integer stage) {
		this.stage = stage;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public MtStudentIncludesClassInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MtStudentIncludesClassInfo [studentId=" + studentId + ", studentName=" + studentName + ", idCardNo="
				+ idCardNo + ", stage=" + stage + ", grade=" + grade + ", classId=" + classId + "]";
	}
	
	
	
}
