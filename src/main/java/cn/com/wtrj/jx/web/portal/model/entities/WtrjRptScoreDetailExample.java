package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjRptScoreDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjRptScoreDetailExample() {
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

        public Criteria andExamInsNameIsNull() {
            addCriterion("EXAM_INS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExamInsNameIsNotNull() {
            addCriterion("EXAM_INS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExamInsNameEqualTo(String value) {
            addCriterion("EXAM_INS_NAME =", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameNotEqualTo(String value) {
            addCriterion("EXAM_INS_NAME <>", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameGreaterThan(String value) {
            addCriterion("EXAM_INS_NAME >", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_INS_NAME >=", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameLessThan(String value) {
            addCriterion("EXAM_INS_NAME <", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameLessThanOrEqualTo(String value) {
            addCriterion("EXAM_INS_NAME <=", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameLike(String value) {
            addCriterion("EXAM_INS_NAME like", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameNotLike(String value) {
            addCriterion("EXAM_INS_NAME not like", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameIn(List<String> values) {
            addCriterion("EXAM_INS_NAME in", values, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameNotIn(List<String> values) {
            addCriterion("EXAM_INS_NAME not in", values, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameBetween(String value1, String value2) {
            addCriterion("EXAM_INS_NAME between", value1, value2, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameNotBetween(String value1, String value2) {
            addCriterion("EXAM_INS_NAME not between", value1, value2, "examInsName");
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

        public Criteria andClassNameIsNull() {
            addCriterion("CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("CLASS_NAME =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("CLASS_NAME <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("CLASS_NAME >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("CLASS_NAME <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("CLASS_NAME like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("CLASS_NAME not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("CLASS_NAME in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("CLASS_NAME not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("CLASS_NAME between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("CLASS_NAME not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("STUDENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("STUDENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("STUDENT_NAME =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("STUDENT_NAME <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("STUDENT_NAME >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("STUDENT_NAME <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("STUDENT_NAME like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("STUDENT_NAME not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("STUDENT_NAME in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("STUDENT_NAME not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("SUBJECT =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("SUBJECT <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("SUBJECT >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("SUBJECT <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("SUBJECT like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("SUBJECT not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("SUBJECT in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("SUBJECT not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("SUBJECT between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("SUBJECT not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andFullScoreIsNull() {
            addCriterion("FULL_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreIsNotNull() {
            addCriterion("FULL_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreEqualTo(BigDecimal value) {
            addCriterion("FULL_SCORE =", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotEqualTo(BigDecimal value) {
            addCriterion("FULL_SCORE <>", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreGreaterThan(BigDecimal value) {
            addCriterion("FULL_SCORE >", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FULL_SCORE >=", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreLessThan(BigDecimal value) {
            addCriterion("FULL_SCORE <", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FULL_SCORE <=", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreIn(List<BigDecimal> values) {
            addCriterion("FULL_SCORE in", values, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotIn(List<BigDecimal> values) {
            addCriterion("FULL_SCORE not in", values, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULL_SCORE between", value1, value2, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULL_SCORE not between", value1, value2, "fullScore");
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

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNull() {
            addCriterion("STUDENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNotNull() {
            addCriterion("STUDENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNoEqualTo(String value) {
            addCriterion("STUDENT_NO =", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotEqualTo(String value) {
            addCriterion("STUDENT_NO <>", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThan(String value) {
            addCriterion("STUDENT_NO >", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_NO >=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThan(String value) {
            addCriterion("STUDENT_NO <", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_NO <=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLike(String value) {
            addCriterion("STUDENT_NO like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotLike(String value) {
            addCriterion("STUDENT_NO not like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoIn(List<String> values) {
            addCriterion("STUDENT_NO in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotIn(List<String> values) {
            addCriterion("STUDENT_NO not in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoBetween(String value1, String value2) {
            addCriterion("STUDENT_NO between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotBetween(String value1, String value2) {
            addCriterion("STUDENT_NO not between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreIsNull() {
            addCriterion("SUBJECTIVE_ITEM_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreIsNotNull() {
            addCriterion("SUBJECTIVE_ITEM_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreEqualTo(BigDecimal value) {
            addCriterion("SUBJECTIVE_ITEM_SCORE =", value, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreNotEqualTo(BigDecimal value) {
            addCriterion("SUBJECTIVE_ITEM_SCORE <>", value, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreGreaterThan(BigDecimal value) {
            addCriterion("SUBJECTIVE_ITEM_SCORE >", value, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBJECTIVE_ITEM_SCORE >=", value, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreLessThan(BigDecimal value) {
            addCriterion("SUBJECTIVE_ITEM_SCORE <", value, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBJECTIVE_ITEM_SCORE <=", value, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreIn(List<BigDecimal> values) {
            addCriterion("SUBJECTIVE_ITEM_SCORE in", values, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreNotIn(List<BigDecimal> values) {
            addCriterion("SUBJECTIVE_ITEM_SCORE not in", values, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBJECTIVE_ITEM_SCORE between", value1, value2, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andSubjectiveItemScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBJECTIVE_ITEM_SCORE not between", value1, value2, "subjectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreIsNull() {
            addCriterion("OBJECTIVE_ITEM_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreIsNotNull() {
            addCriterion("OBJECTIVE_ITEM_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreEqualTo(BigDecimal value) {
            addCriterion("OBJECTIVE_ITEM_SCORE =", value, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreNotEqualTo(BigDecimal value) {
            addCriterion("OBJECTIVE_ITEM_SCORE <>", value, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreGreaterThan(BigDecimal value) {
            addCriterion("OBJECTIVE_ITEM_SCORE >", value, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJECTIVE_ITEM_SCORE >=", value, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreLessThan(BigDecimal value) {
            addCriterion("OBJECTIVE_ITEM_SCORE <", value, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJECTIVE_ITEM_SCORE <=", value, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreIn(List<BigDecimal> values) {
            addCriterion("OBJECTIVE_ITEM_SCORE in", values, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreNotIn(List<BigDecimal> values) {
            addCriterion("OBJECTIVE_ITEM_SCORE not in", values, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJECTIVE_ITEM_SCORE between", value1, value2, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andObjectiveItemScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJECTIVE_ITEM_SCORE not between", value1, value2, "objectiveItemScore");
            return (Criteria) this;
        }

        public Criteria andZScoreIsNull() {
            addCriterion("Z_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andZScoreIsNotNull() {
            addCriterion("Z_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andZScoreEqualTo(BigDecimal value) {
            addCriterion("Z_SCORE =", value, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreNotEqualTo(BigDecimal value) {
            addCriterion("Z_SCORE <>", value, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreGreaterThan(BigDecimal value) {
            addCriterion("Z_SCORE >", value, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Z_SCORE >=", value, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreLessThan(BigDecimal value) {
            addCriterion("Z_SCORE <", value, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Z_SCORE <=", value, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreIn(List<BigDecimal> values) {
            addCriterion("Z_SCORE in", values, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreNotIn(List<BigDecimal> values) {
            addCriterion("Z_SCORE not in", values, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Z_SCORE between", value1, value2, "zScore");
            return (Criteria) this;
        }

        public Criteria andZScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Z_SCORE not between", value1, value2, "zScore");
            return (Criteria) this;
        }

        public Criteria andTScoreIsNull() {
            addCriterion("T_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTScoreIsNotNull() {
            addCriterion("T_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTScoreEqualTo(BigDecimal value) {
            addCriterion("T_SCORE =", value, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreNotEqualTo(BigDecimal value) {
            addCriterion("T_SCORE <>", value, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreGreaterThan(BigDecimal value) {
            addCriterion("T_SCORE >", value, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SCORE >=", value, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreLessThan(BigDecimal value) {
            addCriterion("T_SCORE <", value, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SCORE <=", value, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreIn(List<BigDecimal> values) {
            addCriterion("T_SCORE in", values, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreNotIn(List<BigDecimal> values) {
            addCriterion("T_SCORE not in", values, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SCORE between", value1, value2, "tScore");
            return (Criteria) this;
        }

        public Criteria andTScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SCORE not between", value1, value2, "tScore");
            return (Criteria) this;
        }

        public Criteria andClassRankIsNull() {
            addCriterion("CLASS_RANK is null");
            return (Criteria) this;
        }

        public Criteria andClassRankIsNotNull() {
            addCriterion("CLASS_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andClassRankEqualTo(Integer value) {
            addCriterion("CLASS_RANK =", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankNotEqualTo(Integer value) {
            addCriterion("CLASS_RANK <>", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankGreaterThan(Integer value) {
            addCriterion("CLASS_RANK >", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_RANK >=", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankLessThan(Integer value) {
            addCriterion("CLASS_RANK <", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_RANK <=", value, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankIn(List<Integer> values) {
            addCriterion("CLASS_RANK in", values, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankNotIn(List<Integer> values) {
            addCriterion("CLASS_RANK not in", values, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_RANK between", value1, value2, "classRank");
            return (Criteria) this;
        }

        public Criteria andClassRankNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_RANK not between", value1, value2, "classRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankIsNull() {
            addCriterion("GRADE_RANK is null");
            return (Criteria) this;
        }

        public Criteria andGradeRankIsNotNull() {
            addCriterion("GRADE_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andGradeRankEqualTo(Integer value) {
            addCriterion("GRADE_RANK =", value, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankNotEqualTo(Integer value) {
            addCriterion("GRADE_RANK <>", value, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankGreaterThan(Integer value) {
            addCriterion("GRADE_RANK >", value, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE_RANK >=", value, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankLessThan(Integer value) {
            addCriterion("GRADE_RANK <", value, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE_RANK <=", value, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankIn(List<Integer> values) {
            addCriterion("GRADE_RANK in", values, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankNotIn(List<Integer> values) {
            addCriterion("GRADE_RANK not in", values, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_RANK between", value1, value2, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andGradeRankNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_RANK not between", value1, value2, "gradeRank");
            return (Criteria) this;
        }

        public Criteria andExamNoIsNull() {
            addCriterion("EXAM_NO is null");
            return (Criteria) this;
        }

        public Criteria andExamNoIsNotNull() {
            addCriterion("EXAM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExamNoEqualTo(String value) {
            addCriterion("EXAM_NO =", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotEqualTo(String value) {
            addCriterion("EXAM_NO <>", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoGreaterThan(String value) {
            addCriterion("EXAM_NO >", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_NO >=", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoLessThan(String value) {
            addCriterion("EXAM_NO <", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoLessThanOrEqualTo(String value) {
            addCriterion("EXAM_NO <=", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoLike(String value) {
            addCriterion("EXAM_NO like", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotLike(String value) {
            addCriterion("EXAM_NO not like", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoIn(List<String> values) {
            addCriterion("EXAM_NO in", values, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotIn(List<String> values) {
            addCriterion("EXAM_NO not in", values, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoBetween(String value1, String value2) {
            addCriterion("EXAM_NO between", value1, value2, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotBetween(String value1, String value2) {
            addCriterion("EXAM_NO not between", value1, value2, "examNo");
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

        public Criteria andStudentIdCardNoIsNull() {
            addCriterion("STUDENT_ID_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoIsNotNull() {
            addCriterion("STUDENT_ID_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoEqualTo(String value) {
            addCriterion("STUDENT_ID_CARD_NO =", value, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoNotEqualTo(String value) {
            addCriterion("STUDENT_ID_CARD_NO <>", value, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoGreaterThan(String value) {
            addCriterion("STUDENT_ID_CARD_NO >", value, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_ID_CARD_NO >=", value, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoLessThan(String value) {
            addCriterion("STUDENT_ID_CARD_NO <", value, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_ID_CARD_NO <=", value, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoLike(String value) {
            addCriterion("STUDENT_ID_CARD_NO like", value, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoNotLike(String value) {
            addCriterion("STUDENT_ID_CARD_NO not like", value, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoIn(List<String> values) {
            addCriterion("STUDENT_ID_CARD_NO in", values, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoNotIn(List<String> values) {
            addCriterion("STUDENT_ID_CARD_NO not in", values, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoBetween(String value1, String value2) {
            addCriterion("STUDENT_ID_CARD_NO between", value1, value2, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andStudentIdCardNoNotBetween(String value1, String value2) {
            addCriterion("STUDENT_ID_CARD_NO not between", value1, value2, "studentIdCardNo");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("CREATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("CREATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("CREATE_USER_NAME =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("CREATE_USER_NAME >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("CREATE_USER_NAME <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("CREATE_USER_NAME like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("CREATE_USER_NAME not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("CREATE_USER_NAME in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("CREATE_USER_NAME not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME not between", value1, value2, "createUserName");
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

        public Criteria andUploadTypeIsNull() {
            addCriterion("UPLOAD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUploadTypeIsNotNull() {
            addCriterion("UPLOAD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTypeEqualTo(String value) {
            addCriterion("UPLOAD_TYPE =", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotEqualTo(String value) {
            addCriterion("UPLOAD_TYPE <>", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeGreaterThan(String value) {
            addCriterion("UPLOAD_TYPE >", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_TYPE >=", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLessThan(String value) {
            addCriterion("UPLOAD_TYPE <", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_TYPE <=", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLike(String value) {
            addCriterion("UPLOAD_TYPE like", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotLike(String value) {
            addCriterion("UPLOAD_TYPE not like", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeIn(List<String> values) {
            addCriterion("UPLOAD_TYPE in", values, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotIn(List<String> values) {
            addCriterion("UPLOAD_TYPE not in", values, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeBetween(String value1, String value2) {
            addCriterion("UPLOAD_TYPE between", value1, value2, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_TYPE not between", value1, value2, "uploadType");
            return (Criteria) this;
        }

        public Criteria andScoreAIsNull() {
            addCriterion("SCORE_A is null");
            return (Criteria) this;
        }

        public Criteria andScoreAIsNotNull() {
            addCriterion("SCORE_A is not null");
            return (Criteria) this;
        }

        public Criteria andScoreAEqualTo(BigDecimal value) {
            addCriterion("SCORE_A =", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreANotEqualTo(BigDecimal value) {
            addCriterion("SCORE_A <>", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreAGreaterThan(BigDecimal value) {
            addCriterion("SCORE_A >", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A >=", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreALessThan(BigDecimal value) {
            addCriterion("SCORE_A <", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreALessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A <=", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreAIn(List<BigDecimal> values) {
            addCriterion("SCORE_A in", values, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreANotIn(List<BigDecimal> values) {
            addCriterion("SCORE_A not in", values, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A between", value1, value2, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A not between", value1, value2, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreAExtIsNull() {
            addCriterion("SCORE_A_EXT is null");
            return (Criteria) this;
        }

        public Criteria andScoreAExtIsNotNull() {
            addCriterion("SCORE_A_EXT is not null");
            return (Criteria) this;
        }

        public Criteria andScoreAExtEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_EXT =", value, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_EXT <>", value, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtGreaterThan(BigDecimal value) {
            addCriterion("SCORE_A_EXT >", value, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_EXT >=", value, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtLessThan(BigDecimal value) {
            addCriterion("SCORE_A_EXT <", value, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A_EXT <=", value, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtIn(List<BigDecimal> values) {
            addCriterion("SCORE_A_EXT in", values, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_A_EXT not in", values, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A_EXT between", value1, value2, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreAExtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A_EXT not between", value1, value2, "scoreAExt");
            return (Criteria) this;
        }

        public Criteria andScoreBIsNull() {
            addCriterion("SCORE_B is null");
            return (Criteria) this;
        }

        public Criteria andScoreBIsNotNull() {
            addCriterion("SCORE_B is not null");
            return (Criteria) this;
        }

        public Criteria andScoreBEqualTo(BigDecimal value) {
            addCriterion("SCORE_B =", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_B <>", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBGreaterThan(BigDecimal value) {
            addCriterion("SCORE_B >", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B >=", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBLessThan(BigDecimal value) {
            addCriterion("SCORE_B <", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B <=", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBIn(List<BigDecimal> values) {
            addCriterion("SCORE_B in", values, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_B not in", values, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B between", value1, value2, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B not between", value1, value2, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBExtIsNull() {
            addCriterion("SCORE_B_EXT is null");
            return (Criteria) this;
        }

        public Criteria andScoreBExtIsNotNull() {
            addCriterion("SCORE_B_EXT is not null");
            return (Criteria) this;
        }

        public Criteria andScoreBExtEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_EXT =", value, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_EXT <>", value, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtGreaterThan(BigDecimal value) {
            addCriterion("SCORE_B_EXT >", value, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_EXT >=", value, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtLessThan(BigDecimal value) {
            addCriterion("SCORE_B_EXT <", value, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B_EXT <=", value, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtIn(List<BigDecimal> values) {
            addCriterion("SCORE_B_EXT in", values, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_B_EXT not in", values, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B_EXT between", value1, value2, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andScoreBExtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B_EXT not between", value1, value2, "scoreBExt");
            return (Criteria) this;
        }

        public Criteria andSocreMultiIsNull() {
            addCriterion("SOCRE_MULTI is null");
            return (Criteria) this;
        }

        public Criteria andSocreMultiIsNotNull() {
            addCriterion("SOCRE_MULTI is not null");
            return (Criteria) this;
        }

        public Criteria andSocreMultiEqualTo(String value) {
            addCriterion("SOCRE_MULTI =", value, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiNotEqualTo(String value) {
            addCriterion("SOCRE_MULTI <>", value, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiGreaterThan(String value) {
            addCriterion("SOCRE_MULTI >", value, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiGreaterThanOrEqualTo(String value) {
            addCriterion("SOCRE_MULTI >=", value, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiLessThan(String value) {
            addCriterion("SOCRE_MULTI <", value, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiLessThanOrEqualTo(String value) {
            addCriterion("SOCRE_MULTI <=", value, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiLike(String value) {
            addCriterion("SOCRE_MULTI like", value, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiNotLike(String value) {
            addCriterion("SOCRE_MULTI not like", value, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiIn(List<String> values) {
            addCriterion("SOCRE_MULTI in", values, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiNotIn(List<String> values) {
            addCriterion("SOCRE_MULTI not in", values, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiBetween(String value1, String value2) {
            addCriterion("SOCRE_MULTI between", value1, value2, "socreMulti");
            return (Criteria) this;
        }

        public Criteria andSocreMultiNotBetween(String value1, String value2) {
            addCriterion("SOCRE_MULTI not between", value1, value2, "socreMulti");
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