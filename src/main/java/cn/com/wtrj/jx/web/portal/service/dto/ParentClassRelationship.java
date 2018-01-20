package cn.com.wtrj.jx.web.portal.service.dto;

public class ParentClassRelationship {
	// 家长ID
	private Integer parentId;
	
	// 家长姓名
	private String parentName;
	
	// 家长手机
	private String phone;
	
	// 班级ID
	private Integer classId;

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
