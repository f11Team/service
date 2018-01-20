package cn.com.wtrj.jx.web.portal.model.mt.entities;
/**
 * 登录家长学生信息Bean
 * @author jitao
 *
 */
public class LoginParentStudentInfoBean {
	/**
	 * 家长姓名
	 */
	private String parentName;
	/**
	 * 家长称谓
	 */
	private String appellation;
	/**
	 * 家长手机号
	 */
	private String parentPhone;
	/**
	 * 学生姓名
	 */
	private String stuName;
	/**
	 * 学生性别
	 */
	private String stuSex;
	/**
	 * 学生身份证
	 */
	private String stuIdCard;
	/**
	 * 学生年级
	 */
	private Integer stuGrade;
	/**
	 * 学生ID
	 */
	private Integer stuId;
	
	/**
	 * 学生姓名
	 */
	private String stuName1;
	
	/**
	 * 学生性别
	 */
	private String stuSex1;

	/**
	 * 学生年级
	 */
	private Integer stuGrade1;
	
	private String stuIdCard1;
	
	/**
	 * 学生ID
	 */
	private Integer stuId1;
	
	/**
	 * 家长Id
	 */
	private Integer parentId;
	
	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public LoginParentStudentInfoBean() {
		super();
	}

	public LoginParentStudentInfoBean(String parentName, String appellation, String parentPhone, String stuName,
			String stuSex, String stuIdCard, Integer stuGrade) {
		super();
		this.parentName = parentName;
		this.appellation = appellation;
		this.parentPhone = parentPhone;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuIdCard = stuIdCard;
		this.stuGrade = stuGrade;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getParentPhone() {
		return parentPhone;
	}

	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuIdCard() {
		return stuIdCard;
	}

	public void setStuIdCard(String stuIdCard) {
		this.stuIdCard = stuIdCard;
	}

	public Integer getStuGrade() {
		return stuGrade;
	}

	public void setStuGrade(Integer stuGrade) {
		this.stuGrade = stuGrade;
	}

	@Override
	public String toString() {
		return "LoginParentStudentInfoBean [parentName=" + parentName + ", appellation=" + appellation
				+ ", parentPhone=" + parentPhone + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuIdCard="
				+ stuIdCard + ", stuGrade=" + stuGrade + "]";
	}

	public String getStuName1() {
		return stuName1;
	}

	public void setStuName1(String stuName1) {
		this.stuName1 = stuName1;
	}

	public String getStuSex1() {
		return stuSex1;
	}

	public void setStuSex1(String stuSex1) {
		this.stuSex1 = stuSex1;
	}

	public Integer getStuGrade1() {
		return stuGrade1;
	}

	public void setStuGrade1(Integer stuGrade1) {
		this.stuGrade1 = stuGrade1;
	}

	public Integer getStuId1() {
		return stuId1;
	}

	public void setStuId1(Integer stuId1) {
		this.stuId1 = stuId1;
	}

	public String getStuIdCard1() {
		return stuIdCard1;
	}

	public void setStuIdCard1(String stuIdCard1) {
		this.stuIdCard1 = stuIdCard1;
	}
	
	
	
	
}
