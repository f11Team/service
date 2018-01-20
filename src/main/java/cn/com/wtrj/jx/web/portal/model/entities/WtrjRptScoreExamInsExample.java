package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjRptScoreExamInsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjRptScoreExamInsExample() {
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

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
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

        public Criteria andStageIsNull() {
            addCriterion("STAGE is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("STAGE =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("STAGE <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("STAGE >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("STAGE <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("STAGE <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("STAGE like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("STAGE not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("STAGE in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("STAGE not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("STAGE between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("STAGE not between", value1, value2, "stage");
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

        public Criteria andExamSeqCodeIsNull() {
            addCriterion("EXAM_SEQ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeIsNotNull() {
            addCriterion("EXAM_SEQ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeEqualTo(String value) {
            addCriterion("EXAM_SEQ_CODE =", value, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeNotEqualTo(String value) {
            addCriterion("EXAM_SEQ_CODE <>", value, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeGreaterThan(String value) {
            addCriterion("EXAM_SEQ_CODE >", value, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_SEQ_CODE >=", value, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeLessThan(String value) {
            addCriterion("EXAM_SEQ_CODE <", value, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeLessThanOrEqualTo(String value) {
            addCriterion("EXAM_SEQ_CODE <=", value, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeLike(String value) {
            addCriterion("EXAM_SEQ_CODE like", value, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeNotLike(String value) {
            addCriterion("EXAM_SEQ_CODE not like", value, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeIn(List<String> values) {
            addCriterion("EXAM_SEQ_CODE in", values, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeNotIn(List<String> values) {
            addCriterion("EXAM_SEQ_CODE not in", values, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeBetween(String value1, String value2) {
            addCriterion("EXAM_SEQ_CODE between", value1, value2, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqCodeNotBetween(String value1, String value2) {
            addCriterion("EXAM_SEQ_CODE not between", value1, value2, "examSeqCode");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameIsNull() {
            addCriterion("EXAM_SEQ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameIsNotNull() {
            addCriterion("EXAM_SEQ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameEqualTo(String value) {
            addCriterion("EXAM_SEQ_NAME =", value, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameNotEqualTo(String value) {
            addCriterion("EXAM_SEQ_NAME <>", value, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameGreaterThan(String value) {
            addCriterion("EXAM_SEQ_NAME >", value, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_SEQ_NAME >=", value, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameLessThan(String value) {
            addCriterion("EXAM_SEQ_NAME <", value, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameLessThanOrEqualTo(String value) {
            addCriterion("EXAM_SEQ_NAME <=", value, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameLike(String value) {
            addCriterion("EXAM_SEQ_NAME like", value, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameNotLike(String value) {
            addCriterion("EXAM_SEQ_NAME not like", value, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameIn(List<String> values) {
            addCriterion("EXAM_SEQ_NAME in", values, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameNotIn(List<String> values) {
            addCriterion("EXAM_SEQ_NAME not in", values, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameBetween(String value1, String value2) {
            addCriterion("EXAM_SEQ_NAME between", value1, value2, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andExamSeqNameNotBetween(String value1, String value2) {
            addCriterion("EXAM_SEQ_NAME not between", value1, value2, "examSeqName");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNull() {
            addCriterion("TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(String value) {
            addCriterion("TYPE_CODE =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(String value) {
            addCriterion("TYPE_CODE <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(String value) {
            addCriterion("TYPE_CODE >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_CODE >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(String value) {
            addCriterion("TYPE_CODE <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("TYPE_CODE <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLike(String value) {
            addCriterion("TYPE_CODE like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotLike(String value) {
            addCriterion("TYPE_CODE not like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<String> values) {
            addCriterion("TYPE_CODE in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<String> values) {
            addCriterion("TYPE_CODE not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(String value1, String value2) {
            addCriterion("TYPE_CODE between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(String value1, String value2) {
            addCriterion("TYPE_CODE not between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("TYPE_NAME =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("TYPE_NAME <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("TYPE_NAME >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("TYPE_NAME <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("TYPE_NAME like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("TYPE_NAME not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("TYPE_NAME in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("TYPE_NAME not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("TYPE_NAME between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("TYPE_NAME not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeIsNull() {
            addCriterion("SCHOOL_YEAR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeIsNotNull() {
            addCriterion("SCHOOL_YEAR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeEqualTo(String value) {
            addCriterion("SCHOOL_YEAR_CODE =", value, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeNotEqualTo(String value) {
            addCriterion("SCHOOL_YEAR_CODE <>", value, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeGreaterThan(String value) {
            addCriterion("SCHOOL_YEAR_CODE >", value, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_YEAR_CODE >=", value, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeLessThan(String value) {
            addCriterion("SCHOOL_YEAR_CODE <", value, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_YEAR_CODE <=", value, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeLike(String value) {
            addCriterion("SCHOOL_YEAR_CODE like", value, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeNotLike(String value) {
            addCriterion("SCHOOL_YEAR_CODE not like", value, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeIn(List<String> values) {
            addCriterion("SCHOOL_YEAR_CODE in", values, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeNotIn(List<String> values) {
            addCriterion("SCHOOL_YEAR_CODE not in", values, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeBetween(String value1, String value2) {
            addCriterion("SCHOOL_YEAR_CODE between", value1, value2, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearCodeNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_YEAR_CODE not between", value1, value2, "schoolYearCode");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameIsNull() {
            addCriterion("SCHOOL_YEAR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameIsNotNull() {
            addCriterion("SCHOOL_YEAR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameEqualTo(String value) {
            addCriterion("SCHOOL_YEAR_NAME =", value, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameNotEqualTo(String value) {
            addCriterion("SCHOOL_YEAR_NAME <>", value, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameGreaterThan(String value) {
            addCriterion("SCHOOL_YEAR_NAME >", value, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_YEAR_NAME >=", value, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameLessThan(String value) {
            addCriterion("SCHOOL_YEAR_NAME <", value, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_YEAR_NAME <=", value, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameLike(String value) {
            addCriterion("SCHOOL_YEAR_NAME like", value, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameNotLike(String value) {
            addCriterion("SCHOOL_YEAR_NAME not like", value, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameIn(List<String> values) {
            addCriterion("SCHOOL_YEAR_NAME in", values, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameNotIn(List<String> values) {
            addCriterion("SCHOOL_YEAR_NAME not in", values, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameBetween(String value1, String value2) {
            addCriterion("SCHOOL_YEAR_NAME between", value1, value2, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNameNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_YEAR_NAME not between", value1, value2, "schoolYearName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeIsNull() {
            addCriterion("SCHOOL_TERM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeIsNotNull() {
            addCriterion("SCHOOL_TERM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeEqualTo(String value) {
            addCriterion("SCHOOL_TERM_CODE =", value, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeNotEqualTo(String value) {
            addCriterion("SCHOOL_TERM_CODE <>", value, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeGreaterThan(String value) {
            addCriterion("SCHOOL_TERM_CODE >", value, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_TERM_CODE >=", value, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeLessThan(String value) {
            addCriterion("SCHOOL_TERM_CODE <", value, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_TERM_CODE <=", value, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeLike(String value) {
            addCriterion("SCHOOL_TERM_CODE like", value, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeNotLike(String value) {
            addCriterion("SCHOOL_TERM_CODE not like", value, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeIn(List<String> values) {
            addCriterion("SCHOOL_TERM_CODE in", values, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeNotIn(List<String> values) {
            addCriterion("SCHOOL_TERM_CODE not in", values, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeBetween(String value1, String value2) {
            addCriterion("SCHOOL_TERM_CODE between", value1, value2, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermCodeNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_TERM_CODE not between", value1, value2, "schoolTermCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameIsNull() {
            addCriterion("SCHOOL_TERM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameIsNotNull() {
            addCriterion("SCHOOL_TERM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameEqualTo(String value) {
            addCriterion("SCHOOL_TERM_NAME =", value, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameNotEqualTo(String value) {
            addCriterion("SCHOOL_TERM_NAME <>", value, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameGreaterThan(String value) {
            addCriterion("SCHOOL_TERM_NAME >", value, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_TERM_NAME >=", value, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameLessThan(String value) {
            addCriterion("SCHOOL_TERM_NAME <", value, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_TERM_NAME <=", value, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameLike(String value) {
            addCriterion("SCHOOL_TERM_NAME like", value, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameNotLike(String value) {
            addCriterion("SCHOOL_TERM_NAME not like", value, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameIn(List<String> values) {
            addCriterion("SCHOOL_TERM_NAME in", values, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameNotIn(List<String> values) {
            addCriterion("SCHOOL_TERM_NAME not in", values, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameBetween(String value1, String value2) {
            addCriterion("SCHOOL_TERM_NAME between", value1, value2, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andSchoolTermNameNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_TERM_NAME not between", value1, value2, "schoolTermName");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNull() {
            addCriterion("EXAM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNotNull() {
            addCriterion("EXAM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeEqualTo(Integer value) {
            addCriterion("EXAM_TIME =", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotEqualTo(Integer value) {
            addCriterion("EXAM_TIME <>", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThan(Integer value) {
            addCriterion("EXAM_TIME >", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXAM_TIME >=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThan(Integer value) {
            addCriterion("EXAM_TIME <", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThanOrEqualTo(Integer value) {
            addCriterion("EXAM_TIME <=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIn(List<Integer> values) {
            addCriterion("EXAM_TIME in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotIn(List<Integer> values) {
            addCriterion("EXAM_TIME not in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeBetween(Integer value1, Integer value2) {
            addCriterion("EXAM_TIME between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("EXAM_TIME not between", value1, value2, "examTime");
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

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
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

        public Criteria andExamTypeIsNull() {
            addCriterion("EXAM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeIsNotNull() {
            addCriterion("EXAM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeEqualTo(String value) {
            addCriterion("EXAM_TYPE =", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotEqualTo(String value) {
            addCriterion("EXAM_TYPE <>", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeGreaterThan(String value) {
            addCriterion("EXAM_TYPE >", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_TYPE >=", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLessThan(String value) {
            addCriterion("EXAM_TYPE <", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLessThanOrEqualTo(String value) {
            addCriterion("EXAM_TYPE <=", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLike(String value) {
            addCriterion("EXAM_TYPE like", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotLike(String value) {
            addCriterion("EXAM_TYPE not like", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeIn(List<String> values) {
            addCriterion("EXAM_TYPE in", values, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotIn(List<String> values) {
            addCriterion("EXAM_TYPE not in", values, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeBetween(String value1, String value2) {
            addCriterion("EXAM_TYPE between", value1, value2, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotBetween(String value1, String value2) {
            addCriterion("EXAM_TYPE not between", value1, value2, "examType");
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

        public Criteria andUploadStateIsNull() {
            addCriterion("UPLOAD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUploadStateIsNotNull() {
            addCriterion("UPLOAD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUploadStateEqualTo(String value) {
            addCriterion("UPLOAD_STATE =", value, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateNotEqualTo(String value) {
            addCriterion("UPLOAD_STATE <>", value, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateGreaterThan(String value) {
            addCriterion("UPLOAD_STATE >", value, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_STATE >=", value, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateLessThan(String value) {
            addCriterion("UPLOAD_STATE <", value, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_STATE <=", value, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateLike(String value) {
            addCriterion("UPLOAD_STATE like", value, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateNotLike(String value) {
            addCriterion("UPLOAD_STATE not like", value, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateIn(List<String> values) {
            addCriterion("UPLOAD_STATE in", values, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateNotIn(List<String> values) {
            addCriterion("UPLOAD_STATE not in", values, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateBetween(String value1, String value2) {
            addCriterion("UPLOAD_STATE between", value1, value2, "uploadState");
            return (Criteria) this;
        }

        public Criteria andUploadStateNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_STATE not between", value1, value2, "uploadState");
            return (Criteria) this;
        }

        public Criteria andSendStateIsNull() {
            addCriterion("SEND_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSendStateIsNotNull() {
            addCriterion("SEND_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSendStateEqualTo(String value) {
            addCriterion("SEND_STATE =", value, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateNotEqualTo(String value) {
            addCriterion("SEND_STATE <>", value, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateGreaterThan(String value) {
            addCriterion("SEND_STATE >", value, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_STATE >=", value, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateLessThan(String value) {
            addCriterion("SEND_STATE <", value, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateLessThanOrEqualTo(String value) {
            addCriterion("SEND_STATE <=", value, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateLike(String value) {
            addCriterion("SEND_STATE like", value, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateNotLike(String value) {
            addCriterion("SEND_STATE not like", value, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateIn(List<String> values) {
            addCriterion("SEND_STATE in", values, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateNotIn(List<String> values) {
            addCriterion("SEND_STATE not in", values, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateBetween(String value1, String value2) {
            addCriterion("SEND_STATE between", value1, value2, "sendState");
            return (Criteria) this;
        }

        public Criteria andSendStateNotBetween(String value1, String value2) {
            addCriterion("SEND_STATE not between", value1, value2, "sendState");
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

        public Criteria andGradeOrderIsNull() {
            addCriterion("GRADE_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andGradeOrderIsNotNull() {
            addCriterion("GRADE_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andGradeOrderEqualTo(String value) {
            addCriterion("GRADE_ORDER =", value, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderNotEqualTo(String value) {
            addCriterion("GRADE_ORDER <>", value, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderGreaterThan(String value) {
            addCriterion("GRADE_ORDER >", value, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_ORDER >=", value, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderLessThan(String value) {
            addCriterion("GRADE_ORDER <", value, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderLessThanOrEqualTo(String value) {
            addCriterion("GRADE_ORDER <=", value, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderLike(String value) {
            addCriterion("GRADE_ORDER like", value, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderNotLike(String value) {
            addCriterion("GRADE_ORDER not like", value, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderIn(List<String> values) {
            addCriterion("GRADE_ORDER in", values, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderNotIn(List<String> values) {
            addCriterion("GRADE_ORDER not in", values, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderBetween(String value1, String value2) {
            addCriterion("GRADE_ORDER between", value1, value2, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andGradeOrderNotBetween(String value1, String value2) {
            addCriterion("GRADE_ORDER not between", value1, value2, "gradeOrder");
            return (Criteria) this;
        }

        public Criteria andMsgCodeIsNull() {
            addCriterion("MSG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMsgCodeIsNotNull() {
            addCriterion("MSG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgCodeEqualTo(String value) {
            addCriterion("MSG_CODE =", value, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeNotEqualTo(String value) {
            addCriterion("MSG_CODE <>", value, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeGreaterThan(String value) {
            addCriterion("MSG_CODE >", value, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_CODE >=", value, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeLessThan(String value) {
            addCriterion("MSG_CODE <", value, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeLessThanOrEqualTo(String value) {
            addCriterion("MSG_CODE <=", value, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeLike(String value) {
            addCriterion("MSG_CODE like", value, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeNotLike(String value) {
            addCriterion("MSG_CODE not like", value, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeIn(List<String> values) {
            addCriterion("MSG_CODE in", values, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeNotIn(List<String> values) {
            addCriterion("MSG_CODE not in", values, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeBetween(String value1, String value2) {
            addCriterion("MSG_CODE between", value1, value2, "msgCode");
            return (Criteria) this;
        }

        public Criteria andMsgCodeNotBetween(String value1, String value2) {
            addCriterion("MSG_CODE not between", value1, value2, "msgCode");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("SCHOOL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("SCHOOL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("SCHOOL_NAME =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("SCHOOL_NAME <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("SCHOOL_NAME >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_NAME >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("SCHOOL_NAME <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_NAME <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("SCHOOL_NAME like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("SCHOOL_NAME not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("SCHOOL_NAME in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("SCHOOL_NAME not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("SCHOOL_NAME between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_NAME not between", value1, value2, "schoolName");
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