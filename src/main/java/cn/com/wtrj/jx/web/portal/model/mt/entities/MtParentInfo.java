package cn.com.wtrj.jx.web.portal.model.mt.entities;

public class MtParentInfo {
    private Integer id;

    private String name;

    private String sex;

    private String phone;

    private String wxOpenId;
    
    private String blAttendanceSms;
    
    private String schoolCode;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

	public String getBlAttendanceSms() {
		return blAttendanceSms;
	}

	public void setBlAttendanceSms(String blAttendanceSms) {
		this.blAttendanceSms = blAttendanceSms;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
}
