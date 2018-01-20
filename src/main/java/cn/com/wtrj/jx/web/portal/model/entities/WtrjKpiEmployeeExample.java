package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class WtrjKpiEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjKpiEmployeeExample() {
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

        public Criteria andBelongJiaoyanzuCodeIsNull() {
            addCriterion("BELONG_JIAOYANZU_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeIsNotNull() {
            addCriterion("BELONG_JIAOYANZU_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeEqualTo(String value) {
            addCriterion("BELONG_JIAOYANZU_CODE =", value, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeNotEqualTo(String value) {
            addCriterion("BELONG_JIAOYANZU_CODE <>", value, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeGreaterThan(String value) {
            addCriterion("BELONG_JIAOYANZU_CODE >", value, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BELONG_JIAOYANZU_CODE >=", value, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeLessThan(String value) {
            addCriterion("BELONG_JIAOYANZU_CODE <", value, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeLessThanOrEqualTo(String value) {
            addCriterion("BELONG_JIAOYANZU_CODE <=", value, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeLike(String value) {
            addCriterion("BELONG_JIAOYANZU_CODE like", value, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeNotLike(String value) {
            addCriterion("BELONG_JIAOYANZU_CODE not like", value, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeIn(List<String> values) {
            addCriterion("BELONG_JIAOYANZU_CODE in", values, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeNotIn(List<String> values) {
            addCriterion("BELONG_JIAOYANZU_CODE not in", values, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeBetween(String value1, String value2) {
            addCriterion("BELONG_JIAOYANZU_CODE between", value1, value2, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongJiaoyanzuCodeNotBetween(String value1, String value2) {
            addCriterion("BELONG_JIAOYANZU_CODE not between", value1, value2, "belongJiaoyanzuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeIsNull() {
            addCriterion("BELONG_NIANJIZU_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeIsNotNull() {
            addCriterion("BELONG_NIANJIZU_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeEqualTo(String value) {
            addCriterion("BELONG_NIANJIZU_CODE =", value, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeNotEqualTo(String value) {
            addCriterion("BELONG_NIANJIZU_CODE <>", value, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeGreaterThan(String value) {
            addCriterion("BELONG_NIANJIZU_CODE >", value, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BELONG_NIANJIZU_CODE >=", value, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeLessThan(String value) {
            addCriterion("BELONG_NIANJIZU_CODE <", value, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeLessThanOrEqualTo(String value) {
            addCriterion("BELONG_NIANJIZU_CODE <=", value, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeLike(String value) {
            addCriterion("BELONG_NIANJIZU_CODE like", value, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeNotLike(String value) {
            addCriterion("BELONG_NIANJIZU_CODE not like", value, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeIn(List<String> values) {
            addCriterion("BELONG_NIANJIZU_CODE in", values, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeNotIn(List<String> values) {
            addCriterion("BELONG_NIANJIZU_CODE not in", values, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeBetween(String value1, String value2) {
            addCriterion("BELONG_NIANJIZU_CODE between", value1, value2, "belongNianjizuCode");
            return (Criteria) this;
        }

        public Criteria andBelongNianjizuCodeNotBetween(String value1, String value2) {
            addCriterion("BELONG_NIANJIZU_CODE not between", value1, value2, "belongNianjizuCode");
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