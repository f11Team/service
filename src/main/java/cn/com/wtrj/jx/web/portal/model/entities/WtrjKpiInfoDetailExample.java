package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WtrjKpiInfoDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjKpiInfoDetailExample() {
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

        public Criteria andKpiInsIsNull() {
            addCriterion("KPI_INS is null");
            return (Criteria) this;
        }

        public Criteria andKpiInsIsNotNull() {
            addCriterion("KPI_INS is not null");
            return (Criteria) this;
        }

        public Criteria andKpiInsEqualTo(Integer value) {
            addCriterion("KPI_INS =", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsNotEqualTo(Integer value) {
            addCriterion("KPI_INS <>", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsGreaterThan(Integer value) {
            addCriterion("KPI_INS >", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsGreaterThanOrEqualTo(Integer value) {
            addCriterion("KPI_INS >=", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsLessThan(Integer value) {
            addCriterion("KPI_INS <", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsLessThanOrEqualTo(Integer value) {
            addCriterion("KPI_INS <=", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsIn(List<Integer> values) {
            addCriterion("KPI_INS in", values, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsNotIn(List<Integer> values) {
            addCriterion("KPI_INS not in", values, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsBetween(Integer value1, Integer value2) {
            addCriterion("KPI_INS between", value1, value2, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsNotBetween(Integer value1, Integer value2) {
            addCriterion("KPI_INS not between", value1, value2, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeIsNull() {
            addCriterion("KPI_ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeIsNotNull() {
            addCriterion("KPI_ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeEqualTo(String value) {
            addCriterion("KPI_ITEM_CODE =", value, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeNotEqualTo(String value) {
            addCriterion("KPI_ITEM_CODE <>", value, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeGreaterThan(String value) {
            addCriterion("KPI_ITEM_CODE >", value, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("KPI_ITEM_CODE >=", value, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeLessThan(String value) {
            addCriterion("KPI_ITEM_CODE <", value, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeLessThanOrEqualTo(String value) {
            addCriterion("KPI_ITEM_CODE <=", value, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeLike(String value) {
            addCriterion("KPI_ITEM_CODE like", value, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeNotLike(String value) {
            addCriterion("KPI_ITEM_CODE not like", value, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeIn(List<String> values) {
            addCriterion("KPI_ITEM_CODE in", values, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeNotIn(List<String> values) {
            addCriterion("KPI_ITEM_CODE not in", values, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeBetween(String value1, String value2) {
            addCriterion("KPI_ITEM_CODE between", value1, value2, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemCodeNotBetween(String value1, String value2) {
            addCriterion("KPI_ITEM_CODE not between", value1, value2, "kpiItemCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeIsNull() {
            addCriterion("KPI_TMPL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeIsNotNull() {
            addCriterion("KPI_TMPL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeEqualTo(String value) {
            addCriterion("KPI_TMPL_CODE =", value, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeNotEqualTo(String value) {
            addCriterion("KPI_TMPL_CODE <>", value, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeGreaterThan(String value) {
            addCriterion("KPI_TMPL_CODE >", value, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("KPI_TMPL_CODE >=", value, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeLessThan(String value) {
            addCriterion("KPI_TMPL_CODE <", value, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeLessThanOrEqualTo(String value) {
            addCriterion("KPI_TMPL_CODE <=", value, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeLike(String value) {
            addCriterion("KPI_TMPL_CODE like", value, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeNotLike(String value) {
            addCriterion("KPI_TMPL_CODE not like", value, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeIn(List<String> values) {
            addCriterion("KPI_TMPL_CODE in", values, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeNotIn(List<String> values) {
            addCriterion("KPI_TMPL_CODE not in", values, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeBetween(String value1, String value2) {
            addCriterion("KPI_TMPL_CODE between", value1, value2, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiTmplCodeNotBetween(String value1, String value2) {
            addCriterion("KPI_TMPL_CODE not between", value1, value2, "kpiTmplCode");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreIsNull() {
            addCriterion("KPI_ITEM_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreIsNotNull() {
            addCriterion("KPI_ITEM_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreEqualTo(BigDecimal value) {
            addCriterion("KPI_ITEM_SCORE =", value, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreNotEqualTo(BigDecimal value) {
            addCriterion("KPI_ITEM_SCORE <>", value, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreGreaterThan(BigDecimal value) {
            addCriterion("KPI_ITEM_SCORE >", value, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_ITEM_SCORE >=", value, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreLessThan(BigDecimal value) {
            addCriterion("KPI_ITEM_SCORE <", value, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_ITEM_SCORE <=", value, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreIn(List<BigDecimal> values) {
            addCriterion("KPI_ITEM_SCORE in", values, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreNotIn(List<BigDecimal> values) {
            addCriterion("KPI_ITEM_SCORE not in", values, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_ITEM_SCORE between", value1, value2, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_ITEM_SCORE not between", value1, value2, "kpiItemScore");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtIsNull() {
            addCriterion("KPI_ITEM_TXT is null");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtIsNotNull() {
            addCriterion("KPI_ITEM_TXT is not null");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtEqualTo(String value) {
            addCriterion("KPI_ITEM_TXT =", value, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtNotEqualTo(String value) {
            addCriterion("KPI_ITEM_TXT <>", value, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtGreaterThan(String value) {
            addCriterion("KPI_ITEM_TXT >", value, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtGreaterThanOrEqualTo(String value) {
            addCriterion("KPI_ITEM_TXT >=", value, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtLessThan(String value) {
            addCriterion("KPI_ITEM_TXT <", value, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtLessThanOrEqualTo(String value) {
            addCriterion("KPI_ITEM_TXT <=", value, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtLike(String value) {
            addCriterion("KPI_ITEM_TXT like", value, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtNotLike(String value) {
            addCriterion("KPI_ITEM_TXT not like", value, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtIn(List<String> values) {
            addCriterion("KPI_ITEM_TXT in", values, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtNotIn(List<String> values) {
            addCriterion("KPI_ITEM_TXT not in", values, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtBetween(String value1, String value2) {
            addCriterion("KPI_ITEM_TXT between", value1, value2, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiItemTxtNotBetween(String value1, String value2) {
            addCriterion("KPI_ITEM_TXT not between", value1, value2, "kpiItemTxt");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreIsNull() {
            addCriterion("KPI_TEMPL_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreIsNotNull() {
            addCriterion("KPI_TEMPL_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreEqualTo(BigDecimal value) {
            addCriterion("KPI_TEMPL_SCORE =", value, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreNotEqualTo(BigDecimal value) {
            addCriterion("KPI_TEMPL_SCORE <>", value, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreGreaterThan(BigDecimal value) {
            addCriterion("KPI_TEMPL_SCORE >", value, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_TEMPL_SCORE >=", value, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreLessThan(BigDecimal value) {
            addCriterion("KPI_TEMPL_SCORE <", value, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_TEMPL_SCORE <=", value, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreIn(List<BigDecimal> values) {
            addCriterion("KPI_TEMPL_SCORE in", values, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreNotIn(List<BigDecimal> values) {
            addCriterion("KPI_TEMPL_SCORE not in", values, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_TEMPL_SCORE between", value1, value2, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiTemplScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_TEMPL_SCORE not between", value1, value2, "kpiTemplScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreIsNull() {
            addCriterion("KPI_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andKpiScoreIsNotNull() {
            addCriterion("KPI_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andKpiScoreEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE =", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreNotEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE <>", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreGreaterThan(BigDecimal value) {
            addCriterion("KPI_SCORE >", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE >=", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreLessThan(BigDecimal value) {
            addCriterion("KPI_SCORE <", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE <=", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreIn(List<BigDecimal> values) {
            addCriterion("KPI_SCORE in", values, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreNotIn(List<BigDecimal> values) {
            addCriterion("KPI_SCORE not in", values, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_SCORE between", value1, value2, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_SCORE not between", value1, value2, "kpiScore");
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