package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjKpiTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjKpiTemplateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIsNull() {
            addCriterion("SCHOOL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIsNotNull() {
            addCriterion("SCHOOL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeEqualTo(String value) {
            addCriterion("SCHOOL_CODE =", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotEqualTo(String value) {
            addCriterion("SCHOOL_CODE <>", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeGreaterThan(String value) {
            addCriterion("SCHOOL_CODE >", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_CODE >=", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLessThan(String value) {
            addCriterion("SCHOOL_CODE <", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_CODE <=", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLike(String value) {
            addCriterion("SCHOOL_CODE like", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotLike(String value) {
            addCriterion("SCHOOL_CODE not like", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIn(List<String> values) {
            addCriterion("SCHOOL_CODE in", values, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotIn(List<String> values) {
            addCriterion("SCHOOL_CODE not in", values, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeBetween(String value1, String value2) {
            addCriterion("SCHOOL_CODE between", value1, value2, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_CODE not between", value1, value2, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeIsNull() {
            addCriterion("TMPL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTmplCodeIsNotNull() {
            addCriterion("TMPL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTmplCodeEqualTo(String value) {
            addCriterion("TMPL_CODE =", value, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeNotEqualTo(String value) {
            addCriterion("TMPL_CODE <>", value, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeGreaterThan(String value) {
            addCriterion("TMPL_CODE >", value, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TMPL_CODE >=", value, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeLessThan(String value) {
            addCriterion("TMPL_CODE <", value, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeLessThanOrEqualTo(String value) {
            addCriterion("TMPL_CODE <=", value, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeLike(String value) {
            addCriterion("TMPL_CODE like", value, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeNotLike(String value) {
            addCriterion("TMPL_CODE not like", value, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeIn(List<String> values) {
            addCriterion("TMPL_CODE in", values, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeNotIn(List<String> values) {
            addCriterion("TMPL_CODE not in", values, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeBetween(String value1, String value2) {
            addCriterion("TMPL_CODE between", value1, value2, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplCodeNotBetween(String value1, String value2) {
            addCriterion("TMPL_CODE not between", value1, value2, "tmplCode");
            return (Criteria) this;
        }

        public Criteria andTmplNameIsNull() {
            addCriterion("TMPL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTmplNameIsNotNull() {
            addCriterion("TMPL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTmplNameEqualTo(String value) {
            addCriterion("TMPL_NAME =", value, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameNotEqualTo(String value) {
            addCriterion("TMPL_NAME <>", value, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameGreaterThan(String value) {
            addCriterion("TMPL_NAME >", value, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameGreaterThanOrEqualTo(String value) {
            addCriterion("TMPL_NAME >=", value, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameLessThan(String value) {
            addCriterion("TMPL_NAME <", value, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameLessThanOrEqualTo(String value) {
            addCriterion("TMPL_NAME <=", value, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameLike(String value) {
            addCriterion("TMPL_NAME like", value, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameNotLike(String value) {
            addCriterion("TMPL_NAME not like", value, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameIn(List<String> values) {
            addCriterion("TMPL_NAME in", values, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameNotIn(List<String> values) {
            addCriterion("TMPL_NAME not in", values, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameBetween(String value1, String value2) {
            addCriterion("TMPL_NAME between", value1, value2, "tmplName");
            return (Criteria) this;
        }

        public Criteria andTmplNameNotBetween(String value1, String value2) {
            addCriterion("TMPL_NAME not between", value1, value2, "tmplName");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("ITEM_CODE =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("ITEM_CODE <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("ITEM_CODE >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("ITEM_CODE <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("ITEM_CODE like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("ITEM_CODE not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("ITEM_CODE in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("ITEM_CODE not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("ITEM_CODE between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("ITEM_CODE not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andBlLeafIsNull() {
            addCriterion("BL_LEAF is null");
            return (Criteria) this;
        }

        public Criteria andBlLeafIsNotNull() {
            addCriterion("BL_LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andBlLeafEqualTo(String value) {
            addCriterion("BL_LEAF =", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafNotEqualTo(String value) {
            addCriterion("BL_LEAF <>", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafGreaterThan(String value) {
            addCriterion("BL_LEAF >", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafGreaterThanOrEqualTo(String value) {
            addCriterion("BL_LEAF >=", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafLessThan(String value) {
            addCriterion("BL_LEAF <", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafLessThanOrEqualTo(String value) {
            addCriterion("BL_LEAF <=", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafLike(String value) {
            addCriterion("BL_LEAF like", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafNotLike(String value) {
            addCriterion("BL_LEAF not like", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafIn(List<String> values) {
            addCriterion("BL_LEAF in", values, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafNotIn(List<String> values) {
            addCriterion("BL_LEAF not in", values, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafBetween(String value1, String value2) {
            addCriterion("BL_LEAF between", value1, value2, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafNotBetween(String value1, String value2) {
            addCriterion("BL_LEAF not between", value1, value2, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxIsNull() {
            addCriterion("ITEM_SCORE_MAX is null");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxIsNotNull() {
            addCriterion("ITEM_SCORE_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxEqualTo(BigDecimal value) {
            addCriterion("ITEM_SCORE_MAX =", value, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_SCORE_MAX <>", value, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxGreaterThan(BigDecimal value) {
            addCriterion("ITEM_SCORE_MAX >", value, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_SCORE_MAX >=", value, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxLessThan(BigDecimal value) {
            addCriterion("ITEM_SCORE_MAX <", value, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_SCORE_MAX <=", value, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxIn(List<BigDecimal> values) {
            addCriterion("ITEM_SCORE_MAX in", values, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_SCORE_MAX not in", values, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_SCORE_MAX between", value1, value2, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_SCORE_MAX not between", value1, value2, "itemScoreMax");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinIsNull() {
            addCriterion("ITEM_SCORE_MIN is null");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinIsNotNull() {
            addCriterion("ITEM_SCORE_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinEqualTo(BigDecimal value) {
            addCriterion("ITEM_SCORE_MIN =", value, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_SCORE_MIN <>", value, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinGreaterThan(BigDecimal value) {
            addCriterion("ITEM_SCORE_MIN >", value, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_SCORE_MIN >=", value, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinLessThan(BigDecimal value) {
            addCriterion("ITEM_SCORE_MIN <", value, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_SCORE_MIN <=", value, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinIn(List<BigDecimal> values) {
            addCriterion("ITEM_SCORE_MIN in", values, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_SCORE_MIN not in", values, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_SCORE_MIN between", value1, value2, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemScoreMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_SCORE_MIN not between", value1, value2, "itemScoreMin");
            return (Criteria) this;
        }

        public Criteria andItemStandardIsNull() {
            addCriterion("ITEM_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andItemStandardIsNotNull() {
            addCriterion("ITEM_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andItemStandardEqualTo(String value) {
            addCriterion("ITEM_STANDARD =", value, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardNotEqualTo(String value) {
            addCriterion("ITEM_STANDARD <>", value, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardGreaterThan(String value) {
            addCriterion("ITEM_STANDARD >", value, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_STANDARD >=", value, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardLessThan(String value) {
            addCriterion("ITEM_STANDARD <", value, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardLessThanOrEqualTo(String value) {
            addCriterion("ITEM_STANDARD <=", value, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardLike(String value) {
            addCriterion("ITEM_STANDARD like", value, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardNotLike(String value) {
            addCriterion("ITEM_STANDARD not like", value, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardIn(List<String> values) {
            addCriterion("ITEM_STANDARD in", values, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardNotIn(List<String> values) {
            addCriterion("ITEM_STANDARD not in", values, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardBetween(String value1, String value2) {
            addCriterion("ITEM_STANDARD between", value1, value2, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andItemStandardNotBetween(String value1, String value2) {
            addCriterion("ITEM_STANDARD not between", value1, value2, "itemStandard");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("ITEM_TYPE =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("ITEM_TYPE <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("ITEM_TYPE >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_TYPE >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("ITEM_TYPE <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_TYPE <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("ITEM_TYPE like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("ITEM_TYPE not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("ITEM_TYPE in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("ITEM_TYPE not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("ITEM_TYPE between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("ITEM_TYPE not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andTmplYearIsNull() {
            addCriterion("TMPL_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andTmplYearIsNotNull() {
            addCriterion("TMPL_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andTmplYearEqualTo(String value) {
            addCriterion("TMPL_YEAR =", value, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearNotEqualTo(String value) {
            addCriterion("TMPL_YEAR <>", value, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearGreaterThan(String value) {
            addCriterion("TMPL_YEAR >", value, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearGreaterThanOrEqualTo(String value) {
            addCriterion("TMPL_YEAR >=", value, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearLessThan(String value) {
            addCriterion("TMPL_YEAR <", value, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearLessThanOrEqualTo(String value) {
            addCriterion("TMPL_YEAR <=", value, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearLike(String value) {
            addCriterion("TMPL_YEAR like", value, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearNotLike(String value) {
            addCriterion("TMPL_YEAR not like", value, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearIn(List<String> values) {
            addCriterion("TMPL_YEAR in", values, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearNotIn(List<String> values) {
            addCriterion("TMPL_YEAR not in", values, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearBetween(String value1, String value2) {
            addCriterion("TMPL_YEAR between", value1, value2, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplYearNotBetween(String value1, String value2) {
            addCriterion("TMPL_YEAR not between", value1, value2, "tmplYear");
            return (Criteria) this;
        }

        public Criteria andTmplSeqIsNull() {
            addCriterion("TMPL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTmplSeqIsNotNull() {
            addCriterion("TMPL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTmplSeqEqualTo(Integer value) {
            addCriterion("TMPL_SEQ =", value, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqNotEqualTo(Integer value) {
            addCriterion("TMPL_SEQ <>", value, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqGreaterThan(Integer value) {
            addCriterion("TMPL_SEQ >", value, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMPL_SEQ >=", value, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqLessThan(Integer value) {
            addCriterion("TMPL_SEQ <", value, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqLessThanOrEqualTo(Integer value) {
            addCriterion("TMPL_SEQ <=", value, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqIn(List<Integer> values) {
            addCriterion("TMPL_SEQ in", values, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqNotIn(List<Integer> values) {
            addCriterion("TMPL_SEQ not in", values, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqBetween(Integer value1, Integer value2) {
            addCriterion("TMPL_SEQ between", value1, value2, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("TMPL_SEQ not between", value1, value2, "tmplSeq");
            return (Criteria) this;
        }

        public Criteria andTmplTypeIsNull() {
            addCriterion("TMPL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTmplTypeIsNotNull() {
            addCriterion("TMPL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTmplTypeEqualTo(String value) {
            addCriterion("TMPL_TYPE =", value, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeNotEqualTo(String value) {
            addCriterion("TMPL_TYPE <>", value, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeGreaterThan(String value) {
            addCriterion("TMPL_TYPE >", value, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TMPL_TYPE >=", value, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeLessThan(String value) {
            addCriterion("TMPL_TYPE <", value, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeLessThanOrEqualTo(String value) {
            addCriterion("TMPL_TYPE <=", value, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeLike(String value) {
            addCriterion("TMPL_TYPE like", value, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeNotLike(String value) {
            addCriterion("TMPL_TYPE not like", value, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeIn(List<String> values) {
            addCriterion("TMPL_TYPE in", values, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeNotIn(List<String> values) {
            addCriterion("TMPL_TYPE not in", values, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeBetween(String value1, String value2) {
            addCriterion("TMPL_TYPE between", value1, value2, "tmplType");
            return (Criteria) this;
        }

        public Criteria andTmplTypeNotBetween(String value1, String value2) {
            addCriterion("TMPL_TYPE not between", value1, value2, "tmplType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}