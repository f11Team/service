package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WcsQuestAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WcsQuestAnswerExample() {
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

        public Criteria andLastTimeIsNull() {
            addCriterion("LAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("LAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("LAST_TIME =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("LAST_TIME <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("LAST_TIME >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_TIME >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("LAST_TIME <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_TIME <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("LAST_TIME in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("LAST_TIME not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_TIME between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_TIME not between", value1, value2, "lastTime");
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

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("ITEM_ID like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("ITEM_ID not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoIsNull() {
            addCriterion("WCS_CLASS_NO is null");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoIsNotNull() {
            addCriterion("WCS_CLASS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoEqualTo(String value) {
            addCriterion("WCS_CLASS_NO =", value, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoNotEqualTo(String value) {
            addCriterion("WCS_CLASS_NO <>", value, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoGreaterThan(String value) {
            addCriterion("WCS_CLASS_NO >", value, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoGreaterThanOrEqualTo(String value) {
            addCriterion("WCS_CLASS_NO >=", value, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoLessThan(String value) {
            addCriterion("WCS_CLASS_NO <", value, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoLessThanOrEqualTo(String value) {
            addCriterion("WCS_CLASS_NO <=", value, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoLike(String value) {
            addCriterion("WCS_CLASS_NO like", value, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoNotLike(String value) {
            addCriterion("WCS_CLASS_NO not like", value, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoIn(List<String> values) {
            addCriterion("WCS_CLASS_NO in", values, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoNotIn(List<String> values) {
            addCriterion("WCS_CLASS_NO not in", values, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoBetween(String value1, String value2) {
            addCriterion("WCS_CLASS_NO between", value1, value2, "wcsClassNo");
            return (Criteria) this;
        }

        public Criteria andWcsClassNoNotBetween(String value1, String value2) {
            addCriterion("WCS_CLASS_NO not between", value1, value2, "wcsClassNo");
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