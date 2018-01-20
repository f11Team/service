package cn.com.wtrj.jx.web.portal.model.entities;

public class WtrjScoreRangeRule {
    private String id;

    private Double scoreRangeStart;

    private Double scoreRangeEnd;

    private String type;

    private String name;
    
    private String range;
    
    

    public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getId() {
        return id;
    }

	public Double getScoreRangeStart() {
		return scoreRangeStart;
	}

	public void setScoreRangeStart(Double scoreRangeStart) {
		this.scoreRangeStart = scoreRangeStart;
	}

	public Double getScoreRangeEnd() {
		return scoreRangeEnd;
	}

	public void setScoreRangeEnd(Double scoreRangeEnd) {
		this.scoreRangeEnd = scoreRangeEnd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

    
}