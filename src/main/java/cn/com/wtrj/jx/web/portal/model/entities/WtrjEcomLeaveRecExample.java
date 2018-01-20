package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjEcomLeaveRecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjEcomLeaveRecExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("STUDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("STUDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("STUDENT_ID =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("STUDENT_ID <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("STUDENT_ID >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_ID >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("STUDENT_ID <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_ID <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("STUDENT_ID in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("STUDENT_ID not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_ID between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_ID not between", value1, value2, "studentId");
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

        public Criteria andStageEqualTo(Integer value) {
            addCriterion("STAGE =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(Integer value) {
            addCriterion("STAGE <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(Integer value) {
            addCriterion("STAGE >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("STAGE >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(Integer value) {
            addCriterion("STAGE <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(Integer value) {
            addCriterion("STAGE <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<Integer> values) {
            addCriterion("STAGE in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<Integer> values) {
            addCriterion("STAGE not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(Integer value1, Integer value2) {
            addCriterion("STAGE between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(Integer value1, Integer value2) {
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

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
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

        public Criteria andStaterTypeIsNull() {
            addCriterion("STATER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStaterTypeIsNotNull() {
            addCriterion("STATER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStaterTypeEqualTo(String value) {
            addCriterion("STATER_TYPE =", value, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeNotEqualTo(String value) {
            addCriterion("STATER_TYPE <>", value, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeGreaterThan(String value) {
            addCriterion("STATER_TYPE >", value, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STATER_TYPE >=", value, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeLessThan(String value) {
            addCriterion("STATER_TYPE <", value, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeLessThanOrEqualTo(String value) {
            addCriterion("STATER_TYPE <=", value, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeLike(String value) {
            addCriterion("STATER_TYPE like", value, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeNotLike(String value) {
            addCriterion("STATER_TYPE not like", value, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeIn(List<String> values) {
            addCriterion("STATER_TYPE in", values, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeNotIn(List<String> values) {
            addCriterion("STATER_TYPE not in", values, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeBetween(String value1, String value2) {
            addCriterion("STATER_TYPE between", value1, value2, "staterType");
            return (Criteria) this;
        }

        public Criteria andStaterTypeNotBetween(String value1, String value2) {
            addCriterion("STATER_TYPE not between", value1, value2, "staterType");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdIsNull() {
            addCriterion("STARTER_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdIsNotNull() {
            addCriterion("STARTER_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdEqualTo(Integer value) {
            addCriterion("STARTER_PARENT_ID =", value, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdNotEqualTo(Integer value) {
            addCriterion("STARTER_PARENT_ID <>", value, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdGreaterThan(Integer value) {
            addCriterion("STARTER_PARENT_ID >", value, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STARTER_PARENT_ID >=", value, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdLessThan(Integer value) {
            addCriterion("STARTER_PARENT_ID <", value, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("STARTER_PARENT_ID <=", value, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdIn(List<Integer> values) {
            addCriterion("STARTER_PARENT_ID in", values, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdNotIn(List<Integer> values) {
            addCriterion("STARTER_PARENT_ID not in", values, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdBetween(Integer value1, Integer value2) {
            addCriterion("STARTER_PARENT_ID between", value1, value2, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STARTER_PARENT_ID not between", value1, value2, "starterParentId");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileIsNull() {
            addCriterion("STARTER_PARENT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileIsNotNull() {
            addCriterion("STARTER_PARENT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileEqualTo(String value) {
            addCriterion("STARTER_PARENT_MOBILE =", value, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileNotEqualTo(String value) {
            addCriterion("STARTER_PARENT_MOBILE <>", value, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileGreaterThan(String value) {
            addCriterion("STARTER_PARENT_MOBILE >", value, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileGreaterThanOrEqualTo(String value) {
            addCriterion("STARTER_PARENT_MOBILE >=", value, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileLessThan(String value) {
            addCriterion("STARTER_PARENT_MOBILE <", value, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileLessThanOrEqualTo(String value) {
            addCriterion("STARTER_PARENT_MOBILE <=", value, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileLike(String value) {
            addCriterion("STARTER_PARENT_MOBILE like", value, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileNotLike(String value) {
            addCriterion("STARTER_PARENT_MOBILE not like", value, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileIn(List<String> values) {
            addCriterion("STARTER_PARENT_MOBILE in", values, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileNotIn(List<String> values) {
            addCriterion("STARTER_PARENT_MOBILE not in", values, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileBetween(String value1, String value2) {
            addCriterion("STARTER_PARENT_MOBILE between", value1, value2, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentMobileNotBetween(String value1, String value2) {
            addCriterion("STARTER_PARENT_MOBILE not between", value1, value2, "starterParentMobile");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameIsNull() {
            addCriterion("STARTER_PARENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameIsNotNull() {
            addCriterion("STARTER_PARENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameEqualTo(String value) {
            addCriterion("STARTER_PARENT_NAME =", value, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameNotEqualTo(String value) {
            addCriterion("STARTER_PARENT_NAME <>", value, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameGreaterThan(String value) {
            addCriterion("STARTER_PARENT_NAME >", value, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("STARTER_PARENT_NAME >=", value, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameLessThan(String value) {
            addCriterion("STARTER_PARENT_NAME <", value, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameLessThanOrEqualTo(String value) {
            addCriterion("STARTER_PARENT_NAME <=", value, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameLike(String value) {
            addCriterion("STARTER_PARENT_NAME like", value, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameNotLike(String value) {
            addCriterion("STARTER_PARENT_NAME not like", value, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameIn(List<String> values) {
            addCriterion("STARTER_PARENT_NAME in", values, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameNotIn(List<String> values) {
            addCriterion("STARTER_PARENT_NAME not in", values, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameBetween(String value1, String value2) {
            addCriterion("STARTER_PARENT_NAME between", value1, value2, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterParentNameNotBetween(String value1, String value2) {
            addCriterion("STARTER_PARENT_NAME not between", value1, value2, "starterParentName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdIsNull() {
            addCriterion("STARTER_TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdIsNotNull() {
            addCriterion("STARTER_TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdEqualTo(Integer value) {
            addCriterion("STARTER_TEACHER_ID =", value, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdNotEqualTo(Integer value) {
            addCriterion("STARTER_TEACHER_ID <>", value, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdGreaterThan(Integer value) {
            addCriterion("STARTER_TEACHER_ID >", value, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STARTER_TEACHER_ID >=", value, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdLessThan(Integer value) {
            addCriterion("STARTER_TEACHER_ID <", value, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("STARTER_TEACHER_ID <=", value, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdIn(List<Integer> values) {
            addCriterion("STARTER_TEACHER_ID in", values, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdNotIn(List<Integer> values) {
            addCriterion("STARTER_TEACHER_ID not in", values, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("STARTER_TEACHER_ID between", value1, value2, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STARTER_TEACHER_ID not between", value1, value2, "starterTeacherId");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameIsNull() {
            addCriterion("STARTER_TEACHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameIsNotNull() {
            addCriterion("STARTER_TEACHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameEqualTo(String value) {
            addCriterion("STARTER_TEACHER_NAME =", value, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameNotEqualTo(String value) {
            addCriterion("STARTER_TEACHER_NAME <>", value, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameGreaterThan(String value) {
            addCriterion("STARTER_TEACHER_NAME >", value, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("STARTER_TEACHER_NAME >=", value, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameLessThan(String value) {
            addCriterion("STARTER_TEACHER_NAME <", value, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("STARTER_TEACHER_NAME <=", value, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameLike(String value) {
            addCriterion("STARTER_TEACHER_NAME like", value, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameNotLike(String value) {
            addCriterion("STARTER_TEACHER_NAME not like", value, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameIn(List<String> values) {
            addCriterion("STARTER_TEACHER_NAME in", values, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameNotIn(List<String> values) {
            addCriterion("STARTER_TEACHER_NAME not in", values, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameBetween(String value1, String value2) {
            addCriterion("STARTER_TEACHER_NAME between", value1, value2, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherNameNotBetween(String value1, String value2) {
            addCriterion("STARTER_TEACHER_NAME not between", value1, value2, "starterTeacherName");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileIsNull() {
            addCriterion("STARTER_TEACHER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileIsNotNull() {
            addCriterion("STARTER_TEACHER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileEqualTo(String value) {
            addCriterion("STARTER_TEACHER_MOBILE =", value, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileNotEqualTo(String value) {
            addCriterion("STARTER_TEACHER_MOBILE <>", value, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileGreaterThan(String value) {
            addCriterion("STARTER_TEACHER_MOBILE >", value, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileGreaterThanOrEqualTo(String value) {
            addCriterion("STARTER_TEACHER_MOBILE >=", value, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileLessThan(String value) {
            addCriterion("STARTER_TEACHER_MOBILE <", value, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileLessThanOrEqualTo(String value) {
            addCriterion("STARTER_TEACHER_MOBILE <=", value, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileLike(String value) {
            addCriterion("STARTER_TEACHER_MOBILE like", value, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileNotLike(String value) {
            addCriterion("STARTER_TEACHER_MOBILE not like", value, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileIn(List<String> values) {
            addCriterion("STARTER_TEACHER_MOBILE in", values, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileNotIn(List<String> values) {
            addCriterion("STARTER_TEACHER_MOBILE not in", values, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileBetween(String value1, String value2) {
            addCriterion("STARTER_TEACHER_MOBILE between", value1, value2, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherMobileNotBetween(String value1, String value2) {
            addCriterion("STARTER_TEACHER_MOBILE not between", value1, value2, "starterTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoIsNull() {
            addCriterion("STARTER_TEACHER_JOBNO is null");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoIsNotNull() {
            addCriterion("STARTER_TEACHER_JOBNO is not null");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoEqualTo(String value) {
            addCriterion("STARTER_TEACHER_JOBNO =", value, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoNotEqualTo(String value) {
            addCriterion("STARTER_TEACHER_JOBNO <>", value, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoGreaterThan(String value) {
            addCriterion("STARTER_TEACHER_JOBNO >", value, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoGreaterThanOrEqualTo(String value) {
            addCriterion("STARTER_TEACHER_JOBNO >=", value, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoLessThan(String value) {
            addCriterion("STARTER_TEACHER_JOBNO <", value, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoLessThanOrEqualTo(String value) {
            addCriterion("STARTER_TEACHER_JOBNO <=", value, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoLike(String value) {
            addCriterion("STARTER_TEACHER_JOBNO like", value, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoNotLike(String value) {
            addCriterion("STARTER_TEACHER_JOBNO not like", value, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoIn(List<String> values) {
            addCriterion("STARTER_TEACHER_JOBNO in", values, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoNotIn(List<String> values) {
            addCriterion("STARTER_TEACHER_JOBNO not in", values, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoBetween(String value1, String value2) {
            addCriterion("STARTER_TEACHER_JOBNO between", value1, value2, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andStarterTeacherJobnoNotBetween(String value1, String value2) {
            addCriterion("STARTER_TEACHER_JOBNO not between", value1, value2, "starterTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdIsNull() {
            addCriterion("CONFIRM_TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdIsNotNull() {
            addCriterion("CONFIRM_TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdEqualTo(Integer value) {
            addCriterion("CONFIRM_TEACHER_ID =", value, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdNotEqualTo(Integer value) {
            addCriterion("CONFIRM_TEACHER_ID <>", value, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdGreaterThan(Integer value) {
            addCriterion("CONFIRM_TEACHER_ID >", value, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONFIRM_TEACHER_ID >=", value, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdLessThan(Integer value) {
            addCriterion("CONFIRM_TEACHER_ID <", value, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONFIRM_TEACHER_ID <=", value, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdIn(List<Integer> values) {
            addCriterion("CONFIRM_TEACHER_ID in", values, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdNotIn(List<Integer> values) {
            addCriterion("CONFIRM_TEACHER_ID not in", values, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("CONFIRM_TEACHER_ID between", value1, value2, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONFIRM_TEACHER_ID not between", value1, value2, "confirmTeacherId");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameIsNull() {
            addCriterion("CONFIRM_TEACHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameIsNotNull() {
            addCriterion("CONFIRM_TEACHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_NAME =", value, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameNotEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_NAME <>", value, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameGreaterThan(String value) {
            addCriterion("CONFIRM_TEACHER_NAME >", value, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_NAME >=", value, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameLessThan(String value) {
            addCriterion("CONFIRM_TEACHER_NAME <", value, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_NAME <=", value, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameLike(String value) {
            addCriterion("CONFIRM_TEACHER_NAME like", value, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameNotLike(String value) {
            addCriterion("CONFIRM_TEACHER_NAME not like", value, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameIn(List<String> values) {
            addCriterion("CONFIRM_TEACHER_NAME in", values, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameNotIn(List<String> values) {
            addCriterion("CONFIRM_TEACHER_NAME not in", values, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameBetween(String value1, String value2) {
            addCriterion("CONFIRM_TEACHER_NAME between", value1, value2, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherNameNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_TEACHER_NAME not between", value1, value2, "confirmTeacherName");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileIsNull() {
            addCriterion("CONFIRM_TEACHER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileIsNotNull() {
            addCriterion("CONFIRM_TEACHER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_MOBILE =", value, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileNotEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_MOBILE <>", value, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileGreaterThan(String value) {
            addCriterion("CONFIRM_TEACHER_MOBILE >", value, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_MOBILE >=", value, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileLessThan(String value) {
            addCriterion("CONFIRM_TEACHER_MOBILE <", value, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_MOBILE <=", value, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileLike(String value) {
            addCriterion("CONFIRM_TEACHER_MOBILE like", value, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileNotLike(String value) {
            addCriterion("CONFIRM_TEACHER_MOBILE not like", value, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileIn(List<String> values) {
            addCriterion("CONFIRM_TEACHER_MOBILE in", values, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileNotIn(List<String> values) {
            addCriterion("CONFIRM_TEACHER_MOBILE not in", values, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileBetween(String value1, String value2) {
            addCriterion("CONFIRM_TEACHER_MOBILE between", value1, value2, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherMobileNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_TEACHER_MOBILE not between", value1, value2, "confirmTeacherMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoIsNull() {
            addCriterion("CONFIRM_TEACHER_JOBNO is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoIsNotNull() {
            addCriterion("CONFIRM_TEACHER_JOBNO is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_JOBNO =", value, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoNotEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_JOBNO <>", value, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoGreaterThan(String value) {
            addCriterion("CONFIRM_TEACHER_JOBNO >", value, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_JOBNO >=", value, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoLessThan(String value) {
            addCriterion("CONFIRM_TEACHER_JOBNO <", value, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_JOBNO <=", value, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoLike(String value) {
            addCriterion("CONFIRM_TEACHER_JOBNO like", value, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoNotLike(String value) {
            addCriterion("CONFIRM_TEACHER_JOBNO not like", value, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoIn(List<String> values) {
            addCriterion("CONFIRM_TEACHER_JOBNO in", values, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoNotIn(List<String> values) {
            addCriterion("CONFIRM_TEACHER_JOBNO not in", values, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoBetween(String value1, String value2) {
            addCriterion("CONFIRM_TEACHER_JOBNO between", value1, value2, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherJobnoNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_TEACHER_JOBNO not between", value1, value2, "confirmTeacherJobno");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusIsNull() {
            addCriterion("CONFIRM_TEACHER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusIsNotNull() {
            addCriterion("CONFIRM_TEACHER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_STATUS =", value, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusNotEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_STATUS <>", value, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusGreaterThan(String value) {
            addCriterion("CONFIRM_TEACHER_STATUS >", value, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_STATUS >=", value, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusLessThan(String value) {
            addCriterion("CONFIRM_TEACHER_STATUS <", value, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TEACHER_STATUS <=", value, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusLike(String value) {
            addCriterion("CONFIRM_TEACHER_STATUS like", value, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusNotLike(String value) {
            addCriterion("CONFIRM_TEACHER_STATUS not like", value, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusIn(List<String> values) {
            addCriterion("CONFIRM_TEACHER_STATUS in", values, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusNotIn(List<String> values) {
            addCriterion("CONFIRM_TEACHER_STATUS not in", values, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusBetween(String value1, String value2) {
            addCriterion("CONFIRM_TEACHER_STATUS between", value1, value2, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherStatusNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_TEACHER_STATUS not between", value1, value2, "confirmTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeIsNull() {
            addCriterion("CONFIRM_TEACHER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeIsNotNull() {
            addCriterion("CONFIRM_TEACHER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeEqualTo(Date value) {
            addCriterion("CONFIRM_TEACHER_TIME =", value, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeNotEqualTo(Date value) {
            addCriterion("CONFIRM_TEACHER_TIME <>", value, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeGreaterThan(Date value) {
            addCriterion("CONFIRM_TEACHER_TIME >", value, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TEACHER_TIME >=", value, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeLessThan(Date value) {
            addCriterion("CONFIRM_TEACHER_TIME <", value, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TEACHER_TIME <=", value, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeIn(List<Date> values) {
            addCriterion("CONFIRM_TEACHER_TIME in", values, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeNotIn(List<Date> values) {
            addCriterion("CONFIRM_TEACHER_TIME not in", values, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TEACHER_TIME between", value1, value2, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTeacherTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TEACHER_TIME not between", value1, value2, "confirmTeacherTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdIsNull() {
            addCriterion("CONFIRM_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdIsNotNull() {
            addCriterion("CONFIRM_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdEqualTo(Integer value) {
            addCriterion("CONFIRM_PARENT_ID =", value, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdNotEqualTo(Integer value) {
            addCriterion("CONFIRM_PARENT_ID <>", value, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdGreaterThan(Integer value) {
            addCriterion("CONFIRM_PARENT_ID >", value, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONFIRM_PARENT_ID >=", value, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdLessThan(Integer value) {
            addCriterion("CONFIRM_PARENT_ID <", value, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONFIRM_PARENT_ID <=", value, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdIn(List<Integer> values) {
            addCriterion("CONFIRM_PARENT_ID in", values, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdNotIn(List<Integer> values) {
            addCriterion("CONFIRM_PARENT_ID not in", values, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdBetween(Integer value1, Integer value2) {
            addCriterion("CONFIRM_PARENT_ID between", value1, value2, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONFIRM_PARENT_ID not between", value1, value2, "confirmParentId");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameIsNull() {
            addCriterion("CONFIRM_PARENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameIsNotNull() {
            addCriterion("CONFIRM_PARENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_NAME =", value, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameNotEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_NAME <>", value, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameGreaterThan(String value) {
            addCriterion("CONFIRM_PARENT_NAME >", value, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_NAME >=", value, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameLessThan(String value) {
            addCriterion("CONFIRM_PARENT_NAME <", value, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_NAME <=", value, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameLike(String value) {
            addCriterion("CONFIRM_PARENT_NAME like", value, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameNotLike(String value) {
            addCriterion("CONFIRM_PARENT_NAME not like", value, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameIn(List<String> values) {
            addCriterion("CONFIRM_PARENT_NAME in", values, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameNotIn(List<String> values) {
            addCriterion("CONFIRM_PARENT_NAME not in", values, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameBetween(String value1, String value2) {
            addCriterion("CONFIRM_PARENT_NAME between", value1, value2, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentNameNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_PARENT_NAME not between", value1, value2, "confirmParentName");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileIsNull() {
            addCriterion("CONFIRM_PARENT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileIsNotNull() {
            addCriterion("CONFIRM_PARENT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_MOBILE =", value, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileNotEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_MOBILE <>", value, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileGreaterThan(String value) {
            addCriterion("CONFIRM_PARENT_MOBILE >", value, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_MOBILE >=", value, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileLessThan(String value) {
            addCriterion("CONFIRM_PARENT_MOBILE <", value, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_MOBILE <=", value, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileLike(String value) {
            addCriterion("CONFIRM_PARENT_MOBILE like", value, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileNotLike(String value) {
            addCriterion("CONFIRM_PARENT_MOBILE not like", value, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileIn(List<String> values) {
            addCriterion("CONFIRM_PARENT_MOBILE in", values, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileNotIn(List<String> values) {
            addCriterion("CONFIRM_PARENT_MOBILE not in", values, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileBetween(String value1, String value2) {
            addCriterion("CONFIRM_PARENT_MOBILE between", value1, value2, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentMobileNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_PARENT_MOBILE not between", value1, value2, "confirmParentMobile");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusIsNull() {
            addCriterion("CONFIRM_PARENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusIsNotNull() {
            addCriterion("CONFIRM_PARENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_STATUS =", value, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusNotEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_STATUS <>", value, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusGreaterThan(String value) {
            addCriterion("CONFIRM_PARENT_STATUS >", value, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_STATUS >=", value, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusLessThan(String value) {
            addCriterion("CONFIRM_PARENT_STATUS <", value, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_STATUS <=", value, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusLike(String value) {
            addCriterion("CONFIRM_PARENT_STATUS like", value, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusNotLike(String value) {
            addCriterion("CONFIRM_PARENT_STATUS not like", value, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusIn(List<String> values) {
            addCriterion("CONFIRM_PARENT_STATUS in", values, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusNotIn(List<String> values) {
            addCriterion("CONFIRM_PARENT_STATUS not in", values, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusBetween(String value1, String value2) {
            addCriterion("CONFIRM_PARENT_STATUS between", value1, value2, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentStatusNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_PARENT_STATUS not between", value1, value2, "confirmParentStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeIsNull() {
            addCriterion("CONFIRM_PARENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeIsNotNull() {
            addCriterion("CONFIRM_PARENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_TIME =", value, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeNotEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_TIME <>", value, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeGreaterThan(String value) {
            addCriterion("CONFIRM_PARENT_TIME >", value, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_TIME >=", value, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeLessThan(String value) {
            addCriterion("CONFIRM_PARENT_TIME <", value, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_PARENT_TIME <=", value, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeLike(String value) {
            addCriterion("CONFIRM_PARENT_TIME like", value, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeNotLike(String value) {
            addCriterion("CONFIRM_PARENT_TIME not like", value, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeIn(List<String> values) {
            addCriterion("CONFIRM_PARENT_TIME in", values, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeNotIn(List<String> values) {
            addCriterion("CONFIRM_PARENT_TIME not in", values, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeBetween(String value1, String value2) {
            addCriterion("CONFIRM_PARENT_TIME between", value1, value2, "confirmParentTime");
            return (Criteria) this;
        }

        public Criteria andConfirmParentTimeNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_PARENT_TIME not between", value1, value2, "confirmParentTime");
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