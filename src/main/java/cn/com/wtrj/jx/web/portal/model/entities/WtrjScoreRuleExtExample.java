package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WtrjScoreRuleExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjScoreRuleExtExample() {
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

        public Criteria andScoreAFullIsNull() {
            addCriterion("SCORE_A_FULL is null");
            return (Criteria) this;
        }

        public Criteria andScoreAFullIsNotNull() {
            addCriterion("SCORE_A_FULL is not null");
            return (Criteria) this;
        }

        public Criteria andScoreAFullEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_FULL =", value, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_FULL <>", value, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullGreaterThan(BigDecimal value) {
            addCriterion("SCORE_A_FULL >", value, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_FULL >=", value, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullLessThan(BigDecimal value) {
            addCriterion("SCORE_A_FULL <", value, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_FULL <=", value, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullIn(List<BigDecimal> values) {
            addCriterion("SCORE_A_FULL in", values, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_A_FULL not in", values, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A_FULL between", value1, value2, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreAFullNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A_FULL not between", value1, value2, "scoreAFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullIsNull() {
            addCriterion("SCORE_B_FULL is null");
            return (Criteria) this;
        }

        public Criteria andScoreBFullIsNotNull() {
            addCriterion("SCORE_B_FULL is not null");
            return (Criteria) this;
        }

        public Criteria andScoreBFullEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_FULL =", value, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_FULL <>", value, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullGreaterThan(BigDecimal value) {
            addCriterion("SCORE_B_FULL >", value, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_FULL >=", value, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullLessThan(BigDecimal value) {
            addCriterion("SCORE_B_FULL <", value, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_FULL <=", value, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullIn(List<BigDecimal> values) {
            addCriterion("SCORE_B_FULL in", values, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_B_FULL not in", values, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B_FULL between", value1, value2, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreBFullNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B_FULL not between", value1, value2, "scoreBFull");
            return (Criteria) this;
        }

        public Criteria andScoreAStdIsNull() {
            addCriterion("SCORE_A_STD is null");
            return (Criteria) this;
        }

        public Criteria andScoreAStdIsNotNull() {
            addCriterion("SCORE_A_STD is not null");
            return (Criteria) this;
        }

        public Criteria andScoreAStdEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_STD =", value, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_STD <>", value, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdGreaterThan(BigDecimal value) {
            addCriterion("SCORE_A_STD >", value, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_STD >=", value, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdLessThan(BigDecimal value) {
            addCriterion("SCORE_A_STD <", value, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_STD <=", value, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdIn(List<BigDecimal> values) {
            addCriterion("SCORE_A_STD in", values, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_A_STD not in", values, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A_STD between", value1, value2, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreAStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A_STD not between", value1, value2, "scoreAStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdIsNull() {
            addCriterion("SCORE_B_STD is null");
            return (Criteria) this;
        }

        public Criteria andScoreBStdIsNotNull() {
            addCriterion("SCORE_B_STD is not null");
            return (Criteria) this;
        }

        public Criteria andScoreBStdEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_STD =", value, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_STD <>", value, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdGreaterThan(BigDecimal value) {
            addCriterion("SCORE_B_STD >", value, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_STD >=", value, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdLessThan(BigDecimal value) {
            addCriterion("SCORE_B_STD <", value, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_STD <=", value, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdIn(List<BigDecimal> values) {
            addCriterion("SCORE_B_STD in", values, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_B_STD not in", values, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B_STD between", value1, value2, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreBStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B_STD not between", value1, value2, "scoreBStd");
            return (Criteria) this;
        }

        public Criteria andScoreFullIsNull() {
            addCriterion("SCORE_FULL is null");
            return (Criteria) this;
        }

        public Criteria andScoreFullIsNotNull() {
            addCriterion("SCORE_FULL is not null");
            return (Criteria) this;
        }

        public Criteria andScoreFullEqualTo(BigDecimal value) {
            addCriterion("SCORE_FULL =", value, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_FULL <>", value, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullGreaterThan(BigDecimal value) {
            addCriterion("SCORE_FULL >", value, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_FULL >=", value, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullLessThan(BigDecimal value) {
            addCriterion("SCORE_FULL <", value, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_FULL <=", value, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullIn(List<BigDecimal> values) {
            addCriterion("SCORE_FULL in", values, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_FULL not in", values, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_FULL between", value1, value2, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andScoreFullNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_FULL not between", value1, value2, "scoreFull");
            return (Criteria) this;
        }

        public Criteria andExamInsIdIsNull() {
            addCriterion("EXAM_INS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExamInsIdIsNotNull() {
            addCriterion("EXAM_INS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExamInsIdEqualTo(Integer value) {
            addCriterion("EXAM_INS_ID =", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotEqualTo(Integer value) {
            addCriterion("EXAM_INS_ID <>", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdGreaterThan(Integer value) {
            addCriterion("EXAM_INS_ID >", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXAM_INS_ID >=", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdLessThan(Integer value) {
            addCriterion("EXAM_INS_ID <", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXAM_INS_ID <=", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdIn(List<Integer> values) {
            addCriterion("EXAM_INS_ID in", values, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotIn(List<Integer> values) {
            addCriterion("EXAM_INS_ID not in", values, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdBetween(Integer value1, Integer value2) {
            addCriterion("EXAM_INS_ID between", value1, value2, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXAM_INS_ID not between", value1, value2, "examInsId");
            return (Criteria) this;
        }

        public Criteria andUploadIdIsNull() {
            addCriterion("UPLOAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andUploadIdIsNotNull() {
            addCriterion("UPLOAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUploadIdEqualTo(Integer value) {
            addCriterion("UPLOAD_ID =", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotEqualTo(Integer value) {
            addCriterion("UPLOAD_ID <>", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdGreaterThan(Integer value) {
            addCriterion("UPLOAD_ID >", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPLOAD_ID >=", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdLessThan(Integer value) {
            addCriterion("UPLOAD_ID <", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPLOAD_ID <=", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdIn(List<Integer> values) {
            addCriterion("UPLOAD_ID in", values, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotIn(List<Integer> values) {
            addCriterion("UPLOAD_ID not in", values, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdBetween(Integer value1, Integer value2) {
            addCriterion("UPLOAD_ID between", value1, value2, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPLOAD_ID not between", value1, value2, "uploadId");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIsNull() {
            addCriterion("COURSE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIsNotNull() {
            addCriterion("COURSE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCodeEqualTo(String value) {
            addCriterion("COURSE_CODE =", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotEqualTo(String value) {
            addCriterion("COURSE_CODE <>", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeGreaterThan(String value) {
            addCriterion("COURSE_CODE >", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_CODE >=", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLessThan(String value) {
            addCriterion("COURSE_CODE <", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLessThanOrEqualTo(String value) {
            addCriterion("COURSE_CODE <=", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLike(String value) {
            addCriterion("COURSE_CODE like", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotLike(String value) {
            addCriterion("COURSE_CODE not like", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIn(List<String> values) {
            addCriterion("COURSE_CODE in", values, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotIn(List<String> values) {
            addCriterion("COURSE_CODE not in", values, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeBetween(String value1, String value2) {
            addCriterion("COURSE_CODE between", value1, value2, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotBetween(String value1, String value2) {
            addCriterion("COURSE_CODE not between", value1, value2, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("COURSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("COURSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("COURSE_NAME =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("COURSE_NAME <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("COURSE_NAME >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("COURSE_NAME <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("COURSE_NAME like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("COURSE_NAME not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("COURSE_NAME in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("COURSE_NAME not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("COURSE_NAME between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("COURSE_NAME not between", value1, value2, "courseName");
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