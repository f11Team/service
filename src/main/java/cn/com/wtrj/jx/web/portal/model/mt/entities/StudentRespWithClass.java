package cn.com.wtrj.jx.web.portal.model.mt.entities;

public class StudentRespWithClass {
	//学生ID
	private Integer id;
	//学生姓名
	private String name;
	//所在学校名称
	private String schoolName;
	//学号
	private String studentNo;
	//年级号
	private int gradeNo;
	//班级号
	private int classNo;
	//学生头像
	private String photo;
	//班级
	private String className;
	
	private Integer classId;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public int getGradeNo() {
		return gradeNo;
	}
	public void setGradeNo(int gradeNo) {
		this.gradeNo = gradeNo;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public StudentRespWithClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentRespWithClass(Integer id, String name, String schoolName, int gradeNo, int classNo,
			String photo) {
		super();
		this.id = id;
		this.name = name;
		this.schoolName = schoolName;
		this.gradeNo = gradeNo;
		this.classNo = classNo;
		this.photo = photo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	

	
	
}

