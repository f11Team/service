package cn.com.wtrj.jx.web.portal.model.entities.stu;

import java.util.Date;

public class Wcs_quest_answers {
	 private String id;
	 private String student_no;
	 private String student_name;
	 private String school_code;
	 private String school_name;
	//学部
	 private Integer stage;
	 //年级号
	 private Integer grade;
	 private Integer class_no;
	 private Integer class_id;
	 private Date create_time;
	 private Date  last_time;
	 //0为无效，1为有效
	 private char flag;
	 //项目编号
	 private String item_id;
	 public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	//走班班号
	 private String wcs_class_no;
	 private String subject1_code;
	private String subject1_name ;
	private String subject2_code;
	private String subject2_name ;
	private String subject3_code;
	private String subject3_name ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getSchool_code() {
		return school_code;
	}
	public void setSchool_code(String school_code) {
		this.school_code = school_code;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
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
	public Integer getClass_no() {
		return class_no;
	}
	public void setClass_no(Integer class_no) {
		this.class_no = class_no;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void student_no(Integer class_id) {
		this.class_id = class_id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getLast_time() {
		return last_time;
	}
	public void setLast_time(Date last_time) {
		this.last_time = last_time;
	}
	public char getFlag() {
		return flag;
	}
	public void setFlag(char flag) {
		this.flag = flag;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getWcs_class_no() {
		return wcs_class_no;
	}
	public void setWcs_class_no(String wcs_class_no) {
		this.wcs_class_no = wcs_class_no;
	}
	public String getSubject1_code() {
		return subject1_code;
	}
	public void setSubject1_code(String subject1_code) {
		this.subject1_code = subject1_code;
	}
	public String getSubject1_name() {
		return subject1_name;
	}
	public void setSubject1_name(String subject1_name) {
		this.subject1_name = subject1_name;
	}
	public String getSubject2_code() {
		return subject2_code;
	}
	public void setSubject2_code(String subject2_code) {
		this.subject2_code = subject2_code;
	}
	public String getSubject2_name() {
		return subject2_name;
	}
	public void setSubject2_name(String subject2_name) {
		this.subject2_name = subject2_name;
	}
	public String getSubject3_code() {
		return subject3_code;
	}
	public void setSubject3_code(String subject3_code) {
		this.subject3_code = subject3_code;
	}
	public String getSubject3_name() {
		return subject3_name;
	}
	public void setSubject3_name(String subject3_name) {
		this.subject3_name = subject3_name;
	}
	 
	 
	 
}
