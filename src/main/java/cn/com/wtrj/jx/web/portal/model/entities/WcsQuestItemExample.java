package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class WcsQuestItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WcsQuestItemExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeIsNull() {
            addCriterion("SUBJECT1_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeIsNotNull() {
            addCriterion("SUBJECT1_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeEqualTo(String value) {
            addCriterion("SUBJECT1_CODE =", value, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeNotEqualTo(String value) {
            addCriterion("SUBJECT1_CODE <>", value, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeGreaterThan(String value) {
            addCriterion("SUBJECT1_CODE >", value, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT1_CODE >=", value, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeLessThan(String value) {
            addCriterion("SUBJECT1_CODE <", value, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT1_CODE <=", value, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeLike(String value) {
            addCriterion("SUBJECT1_CODE like", value, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeNotLike(String value) {
            addCriterion("SUBJECT1_CODE not like", value, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeIn(List<String> values) {
            addCriterion("SUBJECT1_CODE in", values, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeNotIn(List<String> values) {
            addCriterion("SUBJECT1_CODE not in", values, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeBetween(String value1, String value2) {
            addCriterion("SUBJECT1_CODE between", value1, value2, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1CodeNotBetween(String value1, String value2) {
            addCriterion("SUBJECT1_CODE not between", value1, value2, "subject1Code");
            return (Criteria) this;
        }

        public Criteria andSubject1NameIsNull() {
            addCriterion("SUBJECT1_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubject1NameIsNotNull() {
            addCriterion("SUBJECT1_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubject1NameEqualTo(String value) {
            addCriterion("SUBJECT1_NAME =", value, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameNotEqualTo(String value) {
            addCriterion("SUBJECT1_NAME <>", value, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameGreaterThan(String value) {
            addCriterion("SUBJECT1_NAME >", value, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT1_NAME >=", value, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameLessThan(String value) {
            addCriterion("SUBJECT1_NAME <", value, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT1_NAME <=", value, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameLike(String value) {
            addCriterion("SUBJECT1_NAME like", value, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameNotLike(String value) {
            addCriterion("SUBJECT1_NAME not like", value, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameIn(List<String> values) {
            addCriterion("SUBJECT1_NAME in", values, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameNotIn(List<String> values) {
            addCriterion("SUBJECT1_NAME not in", values, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameBetween(String value1, String value2) {
            addCriterion("SUBJECT1_NAME between", value1, value2, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject1NameNotBetween(String value1, String value2) {
            addCriterion("SUBJECT1_NAME not between", value1, value2, "subject1Name");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeIsNull() {
            addCriterion("SUBJECT2_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeIsNotNull() {
            addCriterion("SUBJECT2_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeEqualTo(String value) {
            addCriterion("SUBJECT2_CODE =", value, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeNotEqualTo(String value) {
            addCriterion("SUBJECT2_CODE <>", value, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeGreaterThan(String value) {
            addCriterion("SUBJECT2_CODE >", value, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT2_CODE >=", value, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeLessThan(String value) {
            addCriterion("SUBJECT2_CODE <", value, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT2_CODE <=", value, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeLike(String value) {
            addCriterion("SUBJECT2_CODE like", value, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeNotLike(String value) {
            addCriterion("SUBJECT2_CODE not like", value, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeIn(List<String> values) {
            addCriterion("SUBJECT2_CODE in", values, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeNotIn(List<String> values) {
            addCriterion("SUBJECT2_CODE not in", values, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeBetween(String value1, String value2) {
            addCriterion("SUBJECT2_CODE between", value1, value2, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2CodeNotBetween(String value1, String value2) {
            addCriterion("SUBJECT2_CODE not between", value1, value2, "subject2Code");
            return (Criteria) this;
        }

        public Criteria andSubject2NameIsNull() {
            addCriterion("SUBJECT2_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubject2NameIsNotNull() {
            addCriterion("SUBJECT2_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubject2NameEqualTo(String value) {
            addCriterion("SUBJECT2_NAME =", value, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameNotEqualTo(String value) {
            addCriterion("SUBJECT2_NAME <>", value, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameGreaterThan(String value) {
            addCriterion("SUBJECT2_NAME >", value, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT2_NAME >=", value, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameLessThan(String value) {
            addCriterion("SUBJECT2_NAME <", value, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT2_NAME <=", value, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameLike(String value) {
            addCriterion("SUBJECT2_NAME like", value, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameNotLike(String value) {
            addCriterion("SUBJECT2_NAME not like", value, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameIn(List<String> values) {
            addCriterion("SUBJECT2_NAME in", values, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameNotIn(List<String> values) {
            addCriterion("SUBJECT2_NAME not in", values, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameBetween(String value1, String value2) {
            addCriterion("SUBJECT2_NAME between", value1, value2, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject2NameNotBetween(String value1, String value2) {
            addCriterion("SUBJECT2_NAME not between", value1, value2, "subject2Name");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeIsNull() {
            addCriterion("SUBJECT3_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeIsNotNull() {
            addCriterion("SUBJECT3_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeEqualTo(String value) {
            addCriterion("SUBJECT3_CODE =", value, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeNotEqualTo(String value) {
            addCriterion("SUBJECT3_CODE <>", value, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeGreaterThan(String value) {
            addCriterion("SUBJECT3_CODE >", value, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT3_CODE >=", value, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeLessThan(String value) {
            addCriterion("SUBJECT3_CODE <", value, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT3_CODE <=", value, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeLike(String value) {
            addCriterion("SUBJECT3_CODE like", value, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeNotLike(String value) {
            addCriterion("SUBJECT3_CODE not like", value, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeIn(List<String> values) {
            addCriterion("SUBJECT3_CODE in", values, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeNotIn(List<String> values) {
            addCriterion("SUBJECT3_CODE not in", values, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeBetween(String value1, String value2) {
            addCriterion("SUBJECT3_CODE between", value1, value2, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3CodeNotBetween(String value1, String value2) {
            addCriterion("SUBJECT3_CODE not between", value1, value2, "subject3Code");
            return (Criteria) this;
        }

        public Criteria andSubject3NameIsNull() {
            addCriterion("SUBJECT3_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubject3NameIsNotNull() {
            addCriterion("SUBJECT3_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubject3NameEqualTo(String value) {
            addCriterion("SUBJECT3_NAME =", value, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameNotEqualTo(String value) {
            addCriterion("SUBJECT3_NAME <>", value, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameGreaterThan(String value) {
            addCriterion("SUBJECT3_NAME >", value, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT3_NAME >=", value, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameLessThan(String value) {
            addCriterion("SUBJECT3_NAME <", value, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT3_NAME <=", value, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameLike(String value) {
            addCriterion("SUBJECT3_NAME like", value, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameNotLike(String value) {
            addCriterion("SUBJECT3_NAME not like", value, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameIn(List<String> values) {
            addCriterion("SUBJECT3_NAME in", values, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameNotIn(List<String> values) {
            addCriterion("SUBJECT3_NAME not in", values, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameBetween(String value1, String value2) {
            addCriterion("SUBJECT3_NAME between", value1, value2, "subject3Name");
            return (Criteria) this;
        }

        public Criteria andSubject3NameNotBetween(String value1, String value2) {
            addCriterion("SUBJECT3_NAME not between", value1, value2, "subject3Name");
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