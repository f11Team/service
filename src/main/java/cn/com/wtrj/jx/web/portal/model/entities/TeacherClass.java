package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;
import java.util.Map;

public class TeacherClass implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	private boolean selected;
	
	private boolean bzr;
	
	public TeacherClass() {
	}
	
	public TeacherClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public TeacherClass(int id, String name, boolean bzr) {
		this.id = id;
		this.name = name;
		this.bzr = bzr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isBzr() {
		return bzr;
	}

	public void setBzr(boolean bzr) {
		this.bzr = bzr;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override  
    public boolean equals(Object obj) {  
        if (this == obj) {  
            return true;  
        } else if (obj instanceof TeacherClass) {  
        	TeacherClass cls = (TeacherClass) obj;  
              
            return id == cls.id;  
        } else {  
              
            return false;  
        }  
    }

	@Override
	public String toString() {
		return "TeacherClass [id=" + id + ", name=" + name + "]";
	}  
	
}
