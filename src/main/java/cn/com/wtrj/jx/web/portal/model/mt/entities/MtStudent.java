package cn.com.wtrj.jx.web.portal.model.mt.entities;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuEntranceScore;

/**
 * 学生实体类(含成绩信息)
 * 
 * @author admin
 *
 */
public class MtStudent {
	/**
	 * 页面表格展示序号
	 */
	private int index;

	/**
	 * 学生ID
	 */
	private Integer id;

	/**
	 * 学校Code
	 */
	private String schoolCode;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 身份证号
	 */
	private String idCardNumber;

	/**
	 * 学籍号
	 */
	private String studentNo;

	/**
	 * 当前学校名
	 */
	private String cureentSchoolCode;

	/**
	 * 注册年份
	 */
	private String registerYear;

	/**
	 * 年级号
	 */
	private Integer gradeNo;

	/**
	 * 班级号
	 */
	private Integer classNo;

	/**
	 * 报名流水号
	 */
	private String entranceSerialNum;

	/**
	 * 奖学金等级
	 */
	private String entranceScholarshipLevel;

	/**
	 * 报名流水号截图
	 */
	private String entranceSerialImg;

	/**
	 * 入学分班情况
	 */
	private String ruxueFenban;

	/**
	 * 报名卡号
	 */
	private String baomingKahao;
	
	/**
	 * 学号
	 */
	private String studentCode;

	/**
	 * 学生的入学成绩集合
	 */
	private List<WtrjStuEntranceScore> scoreList;
	
	private String gradeStage;//学部
    
    private String cardNo;//一卡通卡号
    
    private String studentStatus;//学籍状态
    
    private String payStatus;//缴费状态
    
    private List<MtParent> parents;//家长信息
    
    private Integer classId;

    private String cardColor;

    private String photo;

    private String flag;
    
    private String schoolName;
    
    private String className;
    
    
    
    
    public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getCardColor() {
		return cardColor;
	}

	public void setCardColor(String cardColor) {
		this.cardColor = cardColor;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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

	public String getGradeStage() {
		return gradeStage;
	}

	public void setGradeStage(String gradeStage) {
		this.gradeStage = gradeStage;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public List<MtParent> getParents() {
		return parents;
	}

	public void setParents(List<MtParent> parents) {
		this.parents = parents;
	}


	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getCureentSchoolCode() {
		return cureentSchoolCode;
	}

	public void setCureentSchoolCode(String cureentSchoolCode) {
		this.cureentSchoolCode = cureentSchoolCode;
	}

	public String getRegisterYear() {
		return registerYear;
	}

	public void setRegisterYear(String registerYear) {
		this.registerYear = registerYear;
	}

	public Integer getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(Integer gradeNo) {
		this.gradeNo = gradeNo;
	}

	public Integer getClassNo() {
		return classNo;
	}

	public void setClassNo(Integer classNo) {
		this.classNo = classNo;
	}

	public String getEntranceSerialNum() {
		return entranceSerialNum;
	}

	public void setEntranceSerialNum(String entranceSerialNum) {
		this.entranceSerialNum = entranceSerialNum;
	}

	public String getEntranceScholarshipLevel() {
		return entranceScholarshipLevel;
	}

	public void setEntranceScholarshipLevel(String entranceScholarshipLevel) {
		this.entranceScholarshipLevel = entranceScholarshipLevel;
	}

	public String getEntranceSerialImg() {
		return entranceSerialImg;
	}

	public void setEntranceSerialImg(String entranceSerialImg) {
		this.entranceSerialImg = entranceSerialImg;
	}

	public String getRuxueFenban() {
		return ruxueFenban;
	}

	public void setRuxueFenban(String ruxueFenban) {
		this.ruxueFenban = ruxueFenban;
	}

	public String getBaomingKahao() {
		return baomingKahao;
	}

	public void setBaomingKahao(String baomingKahao) {
		this.baomingKahao = baomingKahao;
	}

	public List<WtrjStuEntranceScore> getScoreList() {
		return scoreList;
	}

	public void setScoreList(List<WtrjStuEntranceScore> scoreList) {
		this.scoreList = scoreList;
	}

	@Override
	public String toString() {
		return "MtStudent [index=" + index + ", id=" + id + ", schoolCode=" + schoolCode + ", name=" + name + ", sex="
				+ sex + ", idCardNumber=" + idCardNumber + ", studentNo=" + studentNo + ", cureentSchoolCode="
				+ cureentSchoolCode + ", registerYear=" + registerYear + ", gradeNo=" + gradeNo + ", classNo=" + classNo
				+ ", entranceSerialNum=" + entranceSerialNum + ", entranceScholarshipLevel=" + entranceScholarshipLevel
				+ ", entranceSerialImg=" + entranceSerialImg + ", ruxueFenban=" + ruxueFenban + ", baomingKahao="
				+ baomingKahao + ", scoreList=" + scoreList + "]";
	}

}