package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class WtrjRptScoreKnowledgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjRptScoreKnowledgeExample() {
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

        public Criteria andExamDetailIdIsNull() {
            addCriterion("EXAM_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdIsNotNull() {
            addCriterion("EXAM_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdEqualTo(Integer value) {
            addCriterion("EXAM_DETAIL_ID =", value, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdNotEqualTo(Integer value) {
            addCriterion("EXAM_DETAIL_ID <>", value, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdGreaterThan(Integer value) {
            addCriterion("EXAM_DETAIL_ID >", value, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXAM_DETAIL_ID >=", value, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdLessThan(Integer value) {
            addCriterion("EXAM_DETAIL_ID <", value, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXAM_DETAIL_ID <=", value, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdIn(List<Integer> values) {
            addCriterion("EXAM_DETAIL_ID in", values, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdNotIn(List<Integer> values) {
            addCriterion("EXAM_DETAIL_ID not in", values, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("EXAM_DETAIL_ID between", value1, value2, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXAM_DETAIL_ID not between", value1, value2, "examDetailId");
            return (Criteria) this;
        }

        public Criteria andSegmentIsNull() {
            addCriterion("SEGMENT is null");
            return (Criteria) this;
        }

        public Criteria andSegmentIsNotNull() {
            addCriterion("SEGMENT is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentEqualTo(String value) {
            addCriterion("SEGMENT =", value, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentNotEqualTo(String value) {
            addCriterion("SEGMENT <>", value, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentGreaterThan(String value) {
            addCriterion("SEGMENT >", value, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentGreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT >=", value, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentLessThan(String value) {
            addCriterion("SEGMENT <", value, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentLessThanOrEqualTo(String value) {
            addCriterion("SEGMENT <=", value, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentLike(String value) {
            addCriterion("SEGMENT like", value, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentNotLike(String value) {
            addCriterion("SEGMENT not like", value, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentIn(List<String> values) {
            addCriterion("SEGMENT in", values, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentNotIn(List<String> values) {
            addCriterion("SEGMENT not in", values, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentBetween(String value1, String value2) {
            addCriterion("SEGMENT between", value1, value2, "segment");
            return (Criteria) this;
        }

        public Criteria andSegmentNotBetween(String value1, String value2) {
            addCriterion("SEGMENT not between", value1, value2, "segment");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("POINT is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(String value) {
            addCriterion("POINT =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(String value) {
            addCriterion("POINT <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(String value) {
            addCriterion("POINT >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(String value) {
            addCriterion("POINT >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(String value) {
            addCriterion("POINT <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(String value) {
            addCriterion("POINT <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLike(String value) {
            addCriterion("POINT like", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotLike(String value) {
            addCriterion("POINT not like", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<String> values) {
            addCriterion("POINT in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<String> values) {
            addCriterion("POINT not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(String value1, String value2) {
            addCriterion("POINT between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(String value1, String value2) {
            addCriterion("POINT not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andFullCreditIsNull() {
            addCriterion("FULL_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andFullCreditIsNotNull() {
            addCriterion("FULL_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andFullCreditEqualTo(Integer value) {
            addCriterion("FULL_CREDIT =", value, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditNotEqualTo(Integer value) {
            addCriterion("FULL_CREDIT <>", value, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditGreaterThan(Integer value) {
            addCriterion("FULL_CREDIT >", value, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("FULL_CREDIT >=", value, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditLessThan(Integer value) {
            addCriterion("FULL_CREDIT <", value, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditLessThanOrEqualTo(Integer value) {
            addCriterion("FULL_CREDIT <=", value, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditIn(List<Integer> values) {
            addCriterion("FULL_CREDIT in", values, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditNotIn(List<Integer> values) {
            addCriterion("FULL_CREDIT not in", values, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditBetween(Integer value1, Integer value2) {
            addCriterion("FULL_CREDIT between", value1, value2, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andFullCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("FULL_CREDIT not between", value1, value2, "fullCredit");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE not between", value1, value2, "score");
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