package cn.com.wtrj.jx.web.portal.model.entities;

import java.io.Serializable;

public class DictItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
		
	private Integer parentId;
	
	private Integer dictId;

	private String code;
	
	private String name;
	
	private String flag;
	
	private int seq;
	
	private boolean selected;

	public DictItem() {
	}
	
	public DictItem(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public Integer getDictId() {
		return dictId;
	}

	public void setDictId(Integer dictId) {
		this.dictId = dictId;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		return "DictItem [id=" + id + ", parentId=" + parentId + ", dictId=" + dictId + ", code=" + code + ", name="
				+ name + ", flag=" + flag + "]";
	}
	
}
