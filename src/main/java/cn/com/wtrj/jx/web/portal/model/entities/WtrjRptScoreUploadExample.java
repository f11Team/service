package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjRptScoreUploadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjRptScoreUploadExample() {
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

        public Criteria andYearCodeIsNull() {
            addCriterion("YEAR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andYearCodeIsNotNull() {
            addCriterion("YEAR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andYearCodeEqualTo(String value) {
            addCriterion("YEAR_CODE =", value, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeNotEqualTo(String value) {
            addCriterion("YEAR_CODE <>", value, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeGreaterThan(String value) {
            addCriterion("YEAR_CODE >", value, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR_CODE >=", value, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeLessThan(String value) {
            addCriterion("YEAR_CODE <", value, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeLessThanOrEqualTo(String value) {
            addCriterion("YEAR_CODE <=", value, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeLike(String value) {
            addCriterion("YEAR_CODE like", value, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeNotLike(String value) {
            addCriterion("YEAR_CODE not like", value, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeIn(List<String> values) {
            addCriterion("YEAR_CODE in", values, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeNotIn(List<String> values) {
            addCriterion("YEAR_CODE not in", values, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeBetween(String value1, String value2) {
            addCriterion("YEAR_CODE between", value1, value2, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearCodeNotBetween(String value1, String value2) {
            addCriterion("YEAR_CODE not between", value1, value2, "yearCode");
            return (Criteria) this;
        }

        public Criteria andYearNameIsNull() {
            addCriterion("YEAR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andYearNameIsNotNull() {
            addCriterion("YEAR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andYearNameEqualTo(String value) {
            addCriterion("YEAR_NAME =", value, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameNotEqualTo(String value) {
            addCriterion("YEAR_NAME <>", value, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameGreaterThan(String value) {
            addCriterion("YEAR_NAME >", value, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR_NAME >=", value, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameLessThan(String value) {
            addCriterion("YEAR_NAME <", value, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameLessThanOrEqualTo(String value) {
            addCriterion("YEAR_NAME <=", value, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameLike(String value) {
            addCriterion("YEAR_NAME like", value, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameNotLike(String value) {
            addCriterion("YEAR_NAME not like", value, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameIn(List<String> values) {
            addCriterion("YEAR_NAME in", values, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameNotIn(List<String> values) {
            addCriterion("YEAR_NAME not in", values, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameBetween(String value1, String value2) {
            addCriterion("YEAR_NAME between", value1, value2, "yearName");
            return (Criteria) this;
        }

        public Criteria andYearNameNotBetween(String value1, String value2) {
            addCriterion("YEAR_NAME not between", value1, value2, "yearName");
            return (Criteria) this;
        }

        public Criteria andTermCodeIsNull() {
            addCriterion("TERM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTermCodeIsNotNull() {
            addCriterion("TERM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTermCodeEqualTo(String value) {
            addCriterion("TERM_CODE =", value, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeNotEqualTo(String value) {
            addCriterion("TERM_CODE <>", value, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeGreaterThan(String value) {
            addCriterion("TERM_CODE >", value, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TERM_CODE >=", value, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeLessThan(String value) {
            addCriterion("TERM_CODE <", value, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeLessThanOrEqualTo(String value) {
            addCriterion("TERM_CODE <=", value, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeLike(String value) {
            addCriterion("TERM_CODE like", value, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeNotLike(String value) {
            addCriterion("TERM_CODE not like", value, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeIn(List<String> values) {
            addCriterion("TERM_CODE in", values, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeNotIn(List<String> values) {
            addCriterion("TERM_CODE not in", values, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeBetween(String value1, String value2) {
            addCriterion("TERM_CODE between", value1, value2, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermCodeNotBetween(String value1, String value2) {
            addCriterion("TERM_CODE not between", value1, value2, "termCode");
            return (Criteria) this;
        }

        public Criteria andTermNameIsNull() {
            addCriterion("TERM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTermNameIsNotNull() {
            addCriterion("TERM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTermNameEqualTo(String value) {
            addCriterion("TERM_NAME =", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameNotEqualTo(String value) {
            addCriterion("TERM_NAME <>", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameGreaterThan(String value) {
            addCriterion("TERM_NAME >", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameGreaterThanOrEqualTo(String value) {
            addCriterion("TERM_NAME >=", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameLessThan(String value) {
            addCriterion("TERM_NAME <", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameLessThanOrEqualTo(String value) {
            addCriterion("TERM_NAME <=", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameLike(String value) {
            addCriterion("TERM_NAME like", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameNotLike(String value) {
            addCriterion("TERM_NAME not like", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameIn(List<String> values) {
            addCriterion("TERM_NAME in", values, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameNotIn(List<String> values) {
            addCriterion("TERM_NAME not in", values, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameBetween(String value1, String value2) {
            addCriterion("TERM_NAME between", value1, value2, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameNotBetween(String value1, String value2) {
            addCriterion("TERM_NAME not between", value1, value2, "termName");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("UPLOAD_TIME =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("UPLOAD_TIME <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("UPLOAD_TIME >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPLOAD_TIME >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("UPLOAD_TIME <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPLOAD_TIME <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("UPLOAD_TIME in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("UPLOAD_TIME not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("UPLOAD_TIME between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPLOAD_TIME not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNull() {
            addCriterion("UPLOAD_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNotNull() {
            addCriterion("UPLOAD_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdEqualTo(Integer value) {
            addCriterion("UPLOAD_USER_ID =", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotEqualTo(Integer value) {
            addCriterion("UPLOAD_USER_ID <>", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThan(Integer value) {
            addCriterion("UPLOAD_USER_ID >", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPLOAD_USER_ID >=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThan(Integer value) {
            addCriterion("UPLOAD_USER_ID <", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPLOAD_USER_ID <=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIn(List<Integer> values) {
            addCriterion("UPLOAD_USER_ID in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotIn(List<Integer> values) {
            addCriterion("UPLOAD_USER_ID not in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdBetween(Integer value1, Integer value2) {
            addCriterion("UPLOAD_USER_ID between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPLOAD_USER_ID not between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameIsNull() {
            addCriterion("UPLOAD_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameIsNotNull() {
            addCriterion("UPLOAD_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameEqualTo(String value) {
            addCriterion("UPLOAD_USER_NAME =", value, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameNotEqualTo(String value) {
            addCriterion("UPLOAD_USER_NAME <>", value, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameGreaterThan(String value) {
            addCriterion("UPLOAD_USER_NAME >", value, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_USER_NAME >=", value, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameLessThan(String value) {
            addCriterion("UPLOAD_USER_NAME <", value, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_USER_NAME <=", value, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameLike(String value) {
            addCriterion("UPLOAD_USER_NAME like", value, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameNotLike(String value) {
            addCriterion("UPLOAD_USER_NAME not like", value, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameIn(List<String> values) {
            addCriterion("UPLOAD_USER_NAME in", values, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameNotIn(List<String> values) {
            addCriterion("UPLOAD_USER_NAME not in", values, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameBetween(String value1, String value2) {
            addCriterion("UPLOAD_USER_NAME between", value1, value2, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadUserNameNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_USER_NAME not between", value1, value2, "uploadUserName");
            return (Criteria) this;
        }

        public Criteria andUploadFileIsNull() {
            addCriterion("UPLOAD_FILE is null");
            return (Criteria) this;
        }

        public Criteria andUploadFileIsNotNull() {
            addCriterion("UPLOAD_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andUploadFileEqualTo(String value) {
            addCriterion("UPLOAD_FILE =", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileNotEqualTo(String value) {
            addCriterion("UPLOAD_FILE <>", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileGreaterThan(String value) {
            addCriterion("UPLOAD_FILE >", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_FILE >=", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileLessThan(String value) {
            addCriterion("UPLOAD_FILE <", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_FILE <=", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileLike(String value) {
            addCriterion("UPLOAD_FILE like", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileNotLike(String value) {
            addCriterion("UPLOAD_FILE not like", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileIn(List<String> values) {
            addCriterion("UPLOAD_FILE in", values, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileNotIn(List<String> values) {
            addCriterion("UPLOAD_FILE not in", values, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileBetween(String value1, String value2) {
            addCriterion("UPLOAD_FILE between", value1, value2, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_FILE not between", value1, value2, "uploadFile");
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

        public Criteria andSendStageIsNull() {
            addCriterion("SEND_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andSendStageIsNotNull() {
            addCriterion("SEND_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSendStageEqualTo(String value) {
            addCriterion("SEND_STAGE =", value, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageNotEqualTo(String value) {
            addCriterion("SEND_STAGE <>", value, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageGreaterThan(String value) {
            addCriterion("SEND_STAGE >", value, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_STAGE >=", value, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageLessThan(String value) {
            addCriterion("SEND_STAGE <", value, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageLessThanOrEqualTo(String value) {
            addCriterion("SEND_STAGE <=", value, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageLike(String value) {
            addCriterion("SEND_STAGE like", value, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageNotLike(String value) {
            addCriterion("SEND_STAGE not like", value, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageIn(List<String> values) {
            addCriterion("SEND_STAGE in", values, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageNotIn(List<String> values) {
            addCriterion("SEND_STAGE not in", values, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageBetween(String value1, String value2) {
            addCriterion("SEND_STAGE between", value1, value2, "sendStage");
            return (Criteria) this;
        }

        public Criteria andSendStageNotBetween(String value1, String value2) {
            addCriterion("SEND_STAGE not between", value1, value2, "sendStage");
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