package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;

public class TeacherCourse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String code;
	
	private String name;
	
	private boolean selected;
	
	public TeacherCourse() {
	}
	
	public TeacherCourse(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	@Override
	public int hashCode() {
		return this.code.hashCode();
	}
	
	@Override  
    public boolean equals(Object obj) {  
        if (this == obj) {  
            return true;  
        } else if (obj instanceof TeacherCourse) {  
        	TeacherCourse cls = (TeacherCourse) obj;  
              
            return code.equals(cls.code);  
        } else {  
              
            return false;  
        }  
    }

	@Override
	public String toString() {
		return "TeacherCourse [code=" + code + ", name=" + name + ", selected=" + selected + "]";
	}
	
}
