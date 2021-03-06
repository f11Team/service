package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class WtrjScoreRangeRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjScoreRangeRuleExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartIsNull() {
            addCriterion("SCORE_RANGE_START is null");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartIsNotNull() {
            addCriterion("SCORE_RANGE_START is not null");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartEqualTo(Short value) {
            addCriterion("SCORE_RANGE_START =", value, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartNotEqualTo(Short value) {
            addCriterion("SCORE_RANGE_START <>", value, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartGreaterThan(Short value) {
            addCriterion("SCORE_RANGE_START >", value, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartGreaterThanOrEqualTo(Short value) {
            addCriterion("SCORE_RANGE_START >=", value, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartLessThan(Short value) {
            addCriterion("SCORE_RANGE_START <", value, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartLessThanOrEqualTo(Short value) {
            addCriterion("SCORE_RANGE_START <=", value, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartIn(List<Short> values) {
            addCriterion("SCORE_RANGE_START in", values, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartNotIn(List<Short> values) {
            addCriterion("SCORE_RANGE_START not in", values, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartBetween(Short value1, Short value2) {
            addCriterion("SCORE_RANGE_START between", value1, value2, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeStartNotBetween(Short value1, Short value2) {
            addCriterion("SCORE_RANGE_START not between", value1, value2, "scoreRangeStart");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndIsNull() {
            addCriterion("SCORE_RANGE_END is null");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndIsNotNull() {
            addCriterion("SCORE_RANGE_END is not null");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndEqualTo(Short value) {
            addCriterion("SCORE_RANGE_END =", value, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndNotEqualTo(Short value) {
            addCriterion("SCORE_RANGE_END <>", value, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndGreaterThan(Short value) {
            addCriterion("SCORE_RANGE_END >", value, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndGreaterThanOrEqualTo(Short value) {
            addCriterion("SCORE_RANGE_END >=", value, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndLessThan(Short value) {
            addCriterion("SCORE_RANGE_END <", value, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndLessThanOrEqualTo(Short value) {
            addCriterion("SCORE_RANGE_END <=", value, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndIn(List<Short> values) {
            addCriterion("SCORE_RANGE_END in", values, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndNotIn(List<Short> values) {
            addCriterion("SCORE_RANGE_END not in", values, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndBetween(Short value1, Short value2) {
            addCriterion("SCORE_RANGE_END between", value1, value2, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andScoreRangeEndNotBetween(Short value1, Short value2) {
            addCriterion("SCORE_RANGE_END not between", value1, value2, "scoreRangeEnd");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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