package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WtrjRptScoreSumExample {
    protected String orderByClause;

    protected boolean distinct;
    

    protected List<Criteria> oredCriteria;

    public WtrjRptScoreSumExample() {
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

        public Criteria andExamInsIdIsNull() {
            addCriterion("EXAM_INS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExamInsIdIsNotNull() {
            addCriterion("EXAM_INS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExamInsIdEqualTo(String value) {
            addCriterion("EXAM_INS_ID =", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotEqualTo(String value) {
            addCriterion("EXAM_INS_ID <>", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdGreaterThan(String value) {
            addCriterion("EXAM_INS_ID >", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_INS_ID >=", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdLessThan(String value) {
            addCriterion("EXAM_INS_ID <", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdLessThanOrEqualTo(String value) {
            addCriterion("EXAM_INS_ID <=", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdLike(String value) {
            addCriterion("EXAM_INS_ID like", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotLike(String value) {
            addCriterion("EXAM_INS_ID not like", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdIn(List<String> values) {
            addCriterion("EXAM_INS_ID in", values, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotIn(List<String> values) {
            addCriterion("EXAM_INS_ID not in", values, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdBetween(String value1, String value2) {
            addCriterion("EXAM_INS_ID between", value1, value2, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotBetween(String value1, String value2) {
            addCriterion("EXAM_INS_ID not between", value1, value2, "examInsId");
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

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
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

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("CLASS_ID like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("CLASS_ID not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
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

        public Criteria andSumNumberIsNull() {
            addCriterion("SUM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSumNumberIsNotNull() {
            addCriterion("SUM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumberEqualTo(BigDecimal value) {
            addCriterion("SUM_NUMBER =", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberNotEqualTo(BigDecimal value) {
            addCriterion("SUM_NUMBER <>", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberGreaterThan(BigDecimal value) {
            addCriterion("SUM_NUMBER >", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_NUMBER >=", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberLessThan(BigDecimal value) {
            addCriterion("SUM_NUMBER <", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_NUMBER <=", value, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberIn(List<BigDecimal> values) {
            addCriterion("SUM_NUMBER in", values, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberNotIn(List<BigDecimal> values) {
            addCriterion("SUM_NUMBER not in", values, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_NUMBER between", value1, value2, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andSumNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_NUMBER not between", value1, value2, "sumNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberIsNull() {
            addCriterion("AVERAGE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAverageNumberIsNotNull() {
            addCriterion("AVERAGE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAverageNumberEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_NUMBER =", value, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberNotEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_NUMBER <>", value, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberGreaterThan(BigDecimal value) {
            addCriterion("AVERAGE_NUMBER >", value, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_NUMBER >=", value, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberLessThan(BigDecimal value) {
            addCriterion("AVERAGE_NUMBER <", value, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_NUMBER <=", value, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberIn(List<BigDecimal> values) {
            addCriterion("AVERAGE_NUMBER in", values, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberNotIn(List<BigDecimal> values) {
            addCriterion("AVERAGE_NUMBER not in", values, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVERAGE_NUMBER between", value1, value2, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andAverageNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVERAGE_NUMBER not between", value1, value2, "averageNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("ORDER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("ORDER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("ORDER_NUMBER =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("ORDER_NUMBER <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("ORDER_NUMBER >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUMBER >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("ORDER_NUMBER <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUMBER <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("ORDER_NUMBER in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("ORDER_NUMBER not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUMBER between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUMBER not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreIsNull() {
            addCriterion("CLASS_TOP_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreIsNotNull() {
            addCriterion("CLASS_TOP_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreEqualTo(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE =", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreNotEqualTo(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE <>", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreGreaterThan(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE >", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE >=", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreLessThan(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE <", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE <=", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreIn(List<BigDecimal> values) {
            addCriterion("CLASS_TOP_SCORE in", values, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreNotIn(List<BigDecimal> values) {
            addCriterion("CLASS_TOP_SCORE not in", values, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_TOP_SCORE between", value1, value2, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_TOP_SCORE not between", value1, value2, "classTopScore");
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