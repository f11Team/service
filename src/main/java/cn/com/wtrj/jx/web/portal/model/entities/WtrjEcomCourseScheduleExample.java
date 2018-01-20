package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjEcomCourseScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjEcomCourseScheduleExample() {
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

        public Criteria andCourseScheduleNoIsNull() {
            addCriterion("COURSE_SCHEDULE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoIsNotNull() {
            addCriterion("COURSE_SCHEDULE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoEqualTo(String value) {
            addCriterion("COURSE_SCHEDULE_NO =", value, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoNotEqualTo(String value) {
            addCriterion("COURSE_SCHEDULE_NO <>", value, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoGreaterThan(String value) {
            addCriterion("COURSE_SCHEDULE_NO >", value, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_SCHEDULE_NO >=", value, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoLessThan(String value) {
            addCriterion("COURSE_SCHEDULE_NO <", value, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoLessThanOrEqualTo(String value) {
            addCriterion("COURSE_SCHEDULE_NO <=", value, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoLike(String value) {
            addCriterion("COURSE_SCHEDULE_NO like", value, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoNotLike(String value) {
            addCriterion("COURSE_SCHEDULE_NO not like", value, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoIn(List<String> values) {
            addCriterion("COURSE_SCHEDULE_NO in", values, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoNotIn(List<String> values) {
            addCriterion("COURSE_SCHEDULE_NO not in", values, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoBetween(String value1, String value2) {
            addCriterion("COURSE_SCHEDULE_NO between", value1, value2, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNoNotBetween(String value1, String value2) {
            addCriterion("COURSE_SCHEDULE_NO not between", value1, value2, "courseScheduleNo");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameIsNull() {
            addCriterion("COURSE_SCHEDULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameIsNotNull() {
            addCriterion("COURSE_SCHEDULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameEqualTo(String value) {
            addCriterion("COURSE_SCHEDULE_NAME =", value, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameNotEqualTo(String value) {
            addCriterion("COURSE_SCHEDULE_NAME <>", value, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameGreaterThan(String value) {
            addCriterion("COURSE_SCHEDULE_NAME >", value, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_SCHEDULE_NAME >=", value, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameLessThan(String value) {
            addCriterion("COURSE_SCHEDULE_NAME <", value, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameLessThanOrEqualTo(String value) {
            addCriterion("COURSE_SCHEDULE_NAME <=", value, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameLike(String value) {
            addCriterion("COURSE_SCHEDULE_NAME like", value, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameNotLike(String value) {
            addCriterion("COURSE_SCHEDULE_NAME not like", value, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameIn(List<String> values) {
            addCriterion("COURSE_SCHEDULE_NAME in", values, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameNotIn(List<String> values) {
            addCriterion("COURSE_SCHEDULE_NAME not in", values, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameBetween(String value1, String value2) {
            addCriterion("COURSE_SCHEDULE_NAME between", value1, value2, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andCourseScheduleNameNotBetween(String value1, String value2) {
            addCriterion("COURSE_SCHEDULE_NAME not between", value1, value2, "courseScheduleName");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("MONTH =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("MONTH <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("MONTH >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTH >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("MONTH <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("MONTH <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("MONTH in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("MONTH not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("MONTH between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTH not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Integer value) {
            addCriterion("SEQ =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Integer value) {
            addCriterion("SEQ <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Integer value) {
            addCriterion("SEQ >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQ >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Integer value) {
            addCriterion("SEQ <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Integer value) {
            addCriterion("SEQ <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Integer> values) {
            addCriterion("SEQ in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Integer> values) {
            addCriterion("SEQ not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Integer value1, Integer value2) {
            addCriterion("SEQ between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQ not between", value1, value2, "seq");
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

        public Criteria andKindIsNull() {
            addCriterion("KIND is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("KIND is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("KIND =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("KIND <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("KIND >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("KIND >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("KIND <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("KIND <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("KIND like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("KIND not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("KIND in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("KIND not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("KIND between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("KIND not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andRegistYearIsNull() {
            addCriterion("REGIST_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andRegistYearIsNotNull() {
            addCriterion("REGIST_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andRegistYearEqualTo(Integer value) {
            addCriterion("REGIST_YEAR =", value, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearNotEqualTo(Integer value) {
            addCriterion("REGIST_YEAR <>", value, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearGreaterThan(Integer value) {
            addCriterion("REGIST_YEAR >", value, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGIST_YEAR >=", value, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearLessThan(Integer value) {
            addCriterion("REGIST_YEAR <", value, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearLessThanOrEqualTo(Integer value) {
            addCriterion("REGIST_YEAR <=", value, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearIn(List<Integer> values) {
            addCriterion("REGIST_YEAR in", values, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearNotIn(List<Integer> values) {
            addCriterion("REGIST_YEAR not in", values, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearBetween(Integer value1, Integer value2) {
            addCriterion("REGIST_YEAR between", value1, value2, "registYear");
            return (Criteria) this;
        }

        public Criteria andRegistYearNotBetween(Integer value1, Integer value2) {
            addCriterion("REGIST_YEAR not between", value1, value2, "registYear");
            return (Criteria) this;
        }

        public Criteria andWeekDayIsNull() {
            addCriterion("WEEK_DAY is null");
            return (Criteria) this;
        }

        public Criteria andWeekDayIsNotNull() {
            addCriterion("WEEK_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andWeekDayEqualTo(Integer value) {
            addCriterion("WEEK_DAY =", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotEqualTo(Integer value) {
            addCriterion("WEEK_DAY <>", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayGreaterThan(Integer value) {
            addCriterion("WEEK_DAY >", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("WEEK_DAY >=", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLessThan(Integer value) {
            addCriterion("WEEK_DAY <", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLessThanOrEqualTo(Integer value) {
            addCriterion("WEEK_DAY <=", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayIn(List<Integer> values) {
            addCriterion("WEEK_DAY in", values, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotIn(List<Integer> values) {
            addCriterion("WEEK_DAY not in", values, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayBetween(Integer value1, Integer value2) {
            addCriterion("WEEK_DAY between", value1, value2, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotBetween(Integer value1, Integer value2) {
            addCriterion("WEEK_DAY not between", value1, value2, "weekDay");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("COURSE is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("COURSE is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("COURSE =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("COURSE <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("COURSE >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("COURSE <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("COURSE <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("COURSE like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("COURSE not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("COURSE in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("COURSE not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("COURSE between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("COURSE not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseSeqIsNull() {
            addCriterion("COURSE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCourseSeqIsNotNull() {
            addCriterion("COURSE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCourseSeqEqualTo(Integer value) {
            addCriterion("COURSE_SEQ =", value, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqNotEqualTo(Integer value) {
            addCriterion("COURSE_SEQ <>", value, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqGreaterThan(Integer value) {
            addCriterion("COURSE_SEQ >", value, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("COURSE_SEQ >=", value, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqLessThan(Integer value) {
            addCriterion("COURSE_SEQ <", value, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqLessThanOrEqualTo(Integer value) {
            addCriterion("COURSE_SEQ <=", value, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqIn(List<Integer> values) {
            addCriterion("COURSE_SEQ in", values, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqNotIn(List<Integer> values) {
            addCriterion("COURSE_SEQ not in", values, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqBetween(Integer value1, Integer value2) {
            addCriterion("COURSE_SEQ between", value1, value2, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andCourseSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("COURSE_SEQ not between", value1, value2, "courseSeq");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("TEACHER_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("TEACHER_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("TEACHER_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("TEACHER_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("TEACHER_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("TEACHER_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_ID not between", value1, value2, "teacherId");
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

        public Criteria andScheduleStartDateIsNull() {
            addCriterion("SCHEDULE_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateIsNotNull() {
            addCriterion("SCHEDULE_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateEqualTo(Date value) {
            addCriterion("SCHEDULE_START_DATE =", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateNotEqualTo(Date value) {
            addCriterion("SCHEDULE_START_DATE <>", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateGreaterThan(Date value) {
            addCriterion("SCHEDULE_START_DATE >", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SCHEDULE_START_DATE >=", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateLessThan(Date value) {
            addCriterion("SCHEDULE_START_DATE <", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateLessThanOrEqualTo(Date value) {
            addCriterion("SCHEDULE_START_DATE <=", value, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateIn(List<Date> values) {
            addCriterion("SCHEDULE_START_DATE in", values, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateNotIn(List<Date> values) {
            addCriterion("SCHEDULE_START_DATE not in", values, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateBetween(Date value1, Date value2) {
            addCriterion("SCHEDULE_START_DATE between", value1, value2, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleStartDateNotBetween(Date value1, Date value2) {
            addCriterion("SCHEDULE_START_DATE not between", value1, value2, "scheduleStartDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateIsNull() {
            addCriterion("SCHEDULE_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateIsNotNull() {
            addCriterion("SCHEDULE_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateEqualTo(Date value) {
            addCriterion("SCHEDULE_END_DATE =", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateNotEqualTo(Date value) {
            addCriterion("SCHEDULE_END_DATE <>", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateGreaterThan(Date value) {
            addCriterion("SCHEDULE_END_DATE >", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SCHEDULE_END_DATE >=", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateLessThan(Date value) {
            addCriterion("SCHEDULE_END_DATE <", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateLessThanOrEqualTo(Date value) {
            addCriterion("SCHEDULE_END_DATE <=", value, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateIn(List<Date> values) {
            addCriterion("SCHEDULE_END_DATE in", values, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateNotIn(List<Date> values) {
            addCriterion("SCHEDULE_END_DATE not in", values, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateBetween(Date value1, Date value2) {
            addCriterion("SCHEDULE_END_DATE between", value1, value2, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateNotBetween(Date value1, Date value2) {
            addCriterion("SCHEDULE_END_DATE not between", value1, value2, "scheduleEndDate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION not between", value1, value2, "version");
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

        public Criteria andOdevityIsNull() {
            addCriterion("ODEVITY is null");
            return (Criteria) this;
        }

        public Criteria andOdevityIsNotNull() {
            addCriterion("ODEVITY is not null");
            return (Criteria) this;
        }

        public Criteria andOdevityEqualTo(Integer value) {
            addCriterion("ODEVITY =", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityNotEqualTo(Integer value) {
            addCriterion("ODEVITY <>", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityGreaterThan(Integer value) {
            addCriterion("ODEVITY >", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ODEVITY >=", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityLessThan(Integer value) {
            addCriterion("ODEVITY <", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityLessThanOrEqualTo(Integer value) {
            addCriterion("ODEVITY <=", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityIn(List<Integer> values) {
            addCriterion("ODEVITY in", values, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityNotIn(List<Integer> values) {
            addCriterion("ODEVITY not in", values, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityBetween(Integer value1, Integer value2) {
            addCriterion("ODEVITY between", value1, value2, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityNotBetween(Integer value1, Integer value2) {
            addCriterion("ODEVITY not between", value1, value2, "odevity");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameIsNull() {
            addCriterion("SPECIAL_TEACHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameIsNotNull() {
            addCriterion("SPECIAL_TEACHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameEqualTo(String value) {
            addCriterion("SPECIAL_TEACHER_NAME =", value, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameNotEqualTo(String value) {
            addCriterion("SPECIAL_TEACHER_NAME <>", value, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameGreaterThan(String value) {
            addCriterion("SPECIAL_TEACHER_NAME >", value, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_TEACHER_NAME >=", value, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameLessThan(String value) {
            addCriterion("SPECIAL_TEACHER_NAME <", value, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_TEACHER_NAME <=", value, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameLike(String value) {
            addCriterion("SPECIAL_TEACHER_NAME like", value, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameNotLike(String value) {
            addCriterion("SPECIAL_TEACHER_NAME not like", value, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameIn(List<String> values) {
            addCriterion("SPECIAL_TEACHER_NAME in", values, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameNotIn(List<String> values) {
            addCriterion("SPECIAL_TEACHER_NAME not in", values, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameBetween(String value1, String value2) {
            addCriterion("SPECIAL_TEACHER_NAME between", value1, value2, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andSpecialTeacherNameNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_TEACHER_NAME not between", value1, value2, "specialTeacherName");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("PLACE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("PLACE =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("PLACE <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("PLACE >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("PLACE <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("PLACE <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("PLACE like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("PLACE not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("PLACE in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("PLACE not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("PLACE between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("PLACE not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("MARK like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("MARK not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("MARK not between", value1, value2, "mark");
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