package cn.com.wtrj.jx.web.portal.service.dto;

/**
 * 考次Dto
 * 
 * @author wuxd
 *
 */
public class ScoreExamInsDto {
	/** 考次id */
	private Integer id;
	/** 页面显示考次名称 */
	private String name;
	/** 创建时间 */
	private String createTime;

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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public ScoreExamInsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ScoreExamInsDto [id=" + id + ", name=" + name + ", createTime=" + createTime + "]";
	}

}
