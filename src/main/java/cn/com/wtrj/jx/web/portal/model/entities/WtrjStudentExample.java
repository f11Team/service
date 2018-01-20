package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class WtrjStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjStudentExample() {
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

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIsNull() {
            addCriterion("ID_CARD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIsNotNull() {
            addCriterion("ID_CARD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberEqualTo(String value) {
            addCriterion("ID_CARD_NUMBER =", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotEqualTo(String value) {
            addCriterion("ID_CARD_NUMBER <>", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberGreaterThan(String value) {
            addCriterion("ID_CARD_NUMBER >", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD_NUMBER >=", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLessThan(String value) {
            addCriterion("ID_CARD_NUMBER <", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD_NUMBER <=", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLike(String value) {
            addCriterion("ID_CARD_NUMBER like", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotLike(String value) {
            addCriterion("ID_CARD_NUMBER not like", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIn(List<String> values) {
            addCriterion("ID_CARD_NUMBER in", values, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotIn(List<String> values) {
            addCriterion("ID_CARD_NUMBER not in", values, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberBetween(String value1, String value2) {
            addCriterion("ID_CARD_NUMBER between", value1, value2, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotBetween(String value1, String value2) {
            addCriterion("ID_CARD_NUMBER not between", value1, value2, "idCardNumber");
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

        public Criteria andCureentSchoolCodeIsNull() {
            addCriterion("CUREENT_SCHOOL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeIsNotNull() {
            addCriterion("CUREENT_SCHOOL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeEqualTo(String value) {
            addCriterion("CUREENT_SCHOOL_CODE =", value, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeNotEqualTo(String value) {
            addCriterion("CUREENT_SCHOOL_CODE <>", value, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeGreaterThan(String value) {
            addCriterion("CUREENT_SCHOOL_CODE >", value, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUREENT_SCHOOL_CODE >=", value, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeLessThan(String value) {
            addCriterion("CUREENT_SCHOOL_CODE <", value, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeLessThanOrEqualTo(String value) {
            addCriterion("CUREENT_SCHOOL_CODE <=", value, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeLike(String value) {
            addCriterion("CUREENT_SCHOOL_CODE like", value, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeNotLike(String value) {
            addCriterion("CUREENT_SCHOOL_CODE not like", value, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeIn(List<String> values) {
            addCriterion("CUREENT_SCHOOL_CODE in", values, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeNotIn(List<String> values) {
            addCriterion("CUREENT_SCHOOL_CODE not in", values, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeBetween(String value1, String value2) {
            addCriterion("CUREENT_SCHOOL_CODE between", value1, value2, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andCureentSchoolCodeNotBetween(String value1, String value2) {
            addCriterion("CUREENT_SCHOOL_CODE not between", value1, value2, "cureentSchoolCode");
            return (Criteria) this;
        }

        public Criteria andRegisterYearIsNull() {
            addCriterion("REGISTER_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andRegisterYearIsNotNull() {
            addCriterion("REGISTER_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterYearEqualTo(String value) {
            addCriterion("REGISTER_YEAR =", value, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearNotEqualTo(String value) {
            addCriterion("REGISTER_YEAR <>", value, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearGreaterThan(String value) {
            addCriterion("REGISTER_YEAR >", value, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_YEAR >=", value, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearLessThan(String value) {
            addCriterion("REGISTER_YEAR <", value, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_YEAR <=", value, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearLike(String value) {
            addCriterion("REGISTER_YEAR like", value, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearNotLike(String value) {
            addCriterion("REGISTER_YEAR not like", value, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearIn(List<String> values) {
            addCriterion("REGISTER_YEAR in", values, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearNotIn(List<String> values) {
            addCriterion("REGISTER_YEAR not in", values, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearBetween(String value1, String value2) {
            addCriterion("REGISTER_YEAR between", value1, value2, "registerYear");
            return (Criteria) this;
        }

        public Criteria andRegisterYearNotBetween(String value1, String value2) {
            addCriterion("REGISTER_YEAR not between", value1, value2, "registerYear");
            return (Criteria) this;
        }

        public Criteria andGradeNoIsNull() {
            addCriterion("GRADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andGradeNoIsNotNull() {
            addCriterion("GRADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNoEqualTo(Integer value) {
            addCriterion("GRADE_NO =", value, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoNotEqualTo(Integer value) {
            addCriterion("GRADE_NO <>", value, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoGreaterThan(Integer value) {
            addCriterion("GRADE_NO >", value, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE_NO >=", value, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoLessThan(Integer value) {
            addCriterion("GRADE_NO <", value, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE_NO <=", value, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoIn(List<Integer> values) {
            addCriterion("GRADE_NO in", values, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoNotIn(List<Integer> values) {
            addCriterion("GRADE_NO not in", values, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_NO between", value1, value2, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andGradeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_NO not between", value1, value2, "gradeNo");
            return (Criteria) this;
        }

        public Criteria andClassNoIsNull() {
            addCriterion("CLASS_NO is null");
            return (Criteria) this;
        }

        public Criteria andClassNoIsNotNull() {
            addCriterion("CLASS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andClassNoEqualTo(Integer value) {
            addCriterion("CLASS_NO =", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotEqualTo(Integer value) {
            addCriterion("CLASS_NO <>", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThan(Integer value) {
            addCriterion("CLASS_NO >", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_NO >=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThan(Integer value) {
            addCriterion("CLASS_NO <", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_NO <=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoIn(List<Integer> values) {
            addCriterion("CLASS_NO in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotIn(List<Integer> values) {
            addCriterion("CLASS_NO not in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_NO between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_NO not between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumIsNull() {
            addCriterion("ENTRANCE_SERIAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumIsNotNull() {
            addCriterion("ENTRANCE_SERIAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumEqualTo(String value) {
            addCriterion("ENTRANCE_SERIAL_NUM =", value, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumNotEqualTo(String value) {
            addCriterion("ENTRANCE_SERIAL_NUM <>", value, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumGreaterThan(String value) {
            addCriterion("ENTRANCE_SERIAL_NUM >", value, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_SERIAL_NUM >=", value, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumLessThan(String value) {
            addCriterion("ENTRANCE_SERIAL_NUM <", value, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumLessThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_SERIAL_NUM <=", value, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumLike(String value) {
            addCriterion("ENTRANCE_SERIAL_NUM like", value, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumNotLike(String value) {
            addCriterion("ENTRANCE_SERIAL_NUM not like", value, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumIn(List<String> values) {
            addCriterion("ENTRANCE_SERIAL_NUM in", values, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumNotIn(List<String> values) {
            addCriterion("ENTRANCE_SERIAL_NUM not in", values, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumBetween(String value1, String value2) {
            addCriterion("ENTRANCE_SERIAL_NUM between", value1, value2, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialNumNotBetween(String value1, String value2) {
            addCriterion("ENTRANCE_SERIAL_NUM not between", value1, value2, "entranceSerialNum");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelIsNull() {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelIsNotNull() {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelEqualTo(String value) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL =", value, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelNotEqualTo(String value) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL <>", value, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelGreaterThan(String value) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL >", value, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL >=", value, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelLessThan(String value) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL <", value, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelLessThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL <=", value, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelLike(String value) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL like", value, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelNotLike(String value) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL not like", value, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelIn(List<String> values) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL in", values, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelNotIn(List<String> values) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL not in", values, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelBetween(String value1, String value2) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL between", value1, value2, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScholarshipLevelNotBetween(String value1, String value2) {
            addCriterion("ENTRANCE_SCHOLARSHIP_LEVEL not between", value1, value2, "entranceScholarshipLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgIsNull() {
            addCriterion("ENTRANCE_SERIAL_IMG is null");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgIsNotNull() {
            addCriterion("ENTRANCE_SERIAL_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgEqualTo(String value) {
            addCriterion("ENTRANCE_SERIAL_IMG =", value, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgNotEqualTo(String value) {
            addCriterion("ENTRANCE_SERIAL_IMG <>", value, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgGreaterThan(String value) {
            addCriterion("ENTRANCE_SERIAL_IMG >", value, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_SERIAL_IMG >=", value, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgLessThan(String value) {
            addCriterion("ENTRANCE_SERIAL_IMG <", value, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgLessThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_SERIAL_IMG <=", value, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgLike(String value) {
            addCriterion("ENTRANCE_SERIAL_IMG like", value, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgNotLike(String value) {
            addCriterion("ENTRANCE_SERIAL_IMG not like", value, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgIn(List<String> values) {
            addCriterion("ENTRANCE_SERIAL_IMG in", values, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgNotIn(List<String> values) {
            addCriterion("ENTRANCE_SERIAL_IMG not in", values, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgBetween(String value1, String value2) {
            addCriterion("ENTRANCE_SERIAL_IMG between", value1, value2, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andEntranceSerialImgNotBetween(String value1, String value2) {
            addCriterion("ENTRANCE_SERIAL_IMG not between", value1, value2, "entranceSerialImg");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanIsNull() {
            addCriterion("RUXUE_FENBAN is null");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanIsNotNull() {
            addCriterion("RUXUE_FENBAN is not null");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanEqualTo(String value) {
            addCriterion("RUXUE_FENBAN =", value, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanNotEqualTo(String value) {
            addCriterion("RUXUE_FENBAN <>", value, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanGreaterThan(String value) {
            addCriterion("RUXUE_FENBAN >", value, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanGreaterThanOrEqualTo(String value) {
            addCriterion("RUXUE_FENBAN >=", value, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanLessThan(String value) {
            addCriterion("RUXUE_FENBAN <", value, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanLessThanOrEqualTo(String value) {
            addCriterion("RUXUE_FENBAN <=", value, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanLike(String value) {
            addCriterion("RUXUE_FENBAN like", value, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanNotLike(String value) {
            addCriterion("RUXUE_FENBAN not like", value, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanIn(List<String> values) {
            addCriterion("RUXUE_FENBAN in", values, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanNotIn(List<String> values) {
            addCriterion("RUXUE_FENBAN not in", values, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanBetween(String value1, String value2) {
            addCriterion("RUXUE_FENBAN between", value1, value2, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andRuxueFenbanNotBetween(String value1, String value2) {
            addCriterion("RUXUE_FENBAN not between", value1, value2, "ruxueFenban");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoIsNull() {
            addCriterion("BAOMING_KAHAO is null");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoIsNotNull() {
            addCriterion("BAOMING_KAHAO is not null");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoEqualTo(String value) {
            addCriterion("BAOMING_KAHAO =", value, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoNotEqualTo(String value) {
            addCriterion("BAOMING_KAHAO <>", value, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoGreaterThan(String value) {
            addCriterion("BAOMING_KAHAO >", value, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoGreaterThanOrEqualTo(String value) {
            addCriterion("BAOMING_KAHAO >=", value, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoLessThan(String value) {
            addCriterion("BAOMING_KAHAO <", value, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoLessThanOrEqualTo(String value) {
            addCriterion("BAOMING_KAHAO <=", value, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoLike(String value) {
            addCriterion("BAOMING_KAHAO like", value, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoNotLike(String value) {
            addCriterion("BAOMING_KAHAO not like", value, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoIn(List<String> values) {
            addCriterion("BAOMING_KAHAO in", values, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoNotIn(List<String> values) {
            addCriterion("BAOMING_KAHAO not in", values, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoBetween(String value1, String value2) {
            addCriterion("BAOMING_KAHAO between", value1, value2, "baomingKahao");
            return (Criteria) this;
        }

        public Criteria andBaomingKahaoNotBetween(String value1, String value2) {
            addCriterion("BAOMING_KAHAO not between", value1, value2, "baomingKahao");
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

        public Criteria andCardColorIsNull() {
            addCriterion("CARD_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andCardColorIsNotNull() {
            addCriterion("CARD_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andCardColorEqualTo(String value) {
            addCriterion("CARD_COLOR =", value, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorNotEqualTo(String value) {
            addCriterion("CARD_COLOR <>", value, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorGreaterThan(String value) {
            addCriterion("CARD_COLOR >", value, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_COLOR >=", value, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorLessThan(String value) {
            addCriterion("CARD_COLOR <", value, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorLessThanOrEqualTo(String value) {
            addCriterion("CARD_COLOR <=", value, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorLike(String value) {
            addCriterion("CARD_COLOR like", value, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorNotLike(String value) {
            addCriterion("CARD_COLOR not like", value, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorIn(List<String> values) {
            addCriterion("CARD_COLOR in", values, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorNotIn(List<String> values) {
            addCriterion("CARD_COLOR not in", values, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorBetween(String value1, String value2) {
            addCriterion("CARD_COLOR between", value1, value2, "cardColor");
            return (Criteria) this;
        }

        public Criteria andCardColorNotBetween(String value1, String value2) {
            addCriterion("CARD_COLOR not between", value1, value2, "cardColor");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("PHOTO not between", value1, value2, "photo");
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