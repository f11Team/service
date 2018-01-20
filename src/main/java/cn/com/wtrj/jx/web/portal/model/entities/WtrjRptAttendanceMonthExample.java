package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class WtrjRptAttendanceMonthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjRptAttendanceMonthExample() {
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

        public Criteria andLateNumIsNull() {
            addCriterion("LATE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLateNumIsNotNull() {
            addCriterion("LATE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLateNumEqualTo(Integer value) {
            addCriterion("LATE_NUM =", value, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumNotEqualTo(Integer value) {
            addCriterion("LATE_NUM <>", value, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumGreaterThan(Integer value) {
            addCriterion("LATE_NUM >", value, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LATE_NUM >=", value, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumLessThan(Integer value) {
            addCriterion("LATE_NUM <", value, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumLessThanOrEqualTo(Integer value) {
            addCriterion("LATE_NUM <=", value, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumIn(List<Integer> values) {
            addCriterion("LATE_NUM in", values, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumNotIn(List<Integer> values) {
            addCriterion("LATE_NUM not in", values, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumBetween(Integer value1, Integer value2) {
            addCriterion("LATE_NUM between", value1, value2, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("LATE_NUM not between", value1, value2, "lateNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumIsNull() {
            addCriterion("LEAVE_EARLY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumIsNotNull() {
            addCriterion("LEAVE_EARLY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumEqualTo(Integer value) {
            addCriterion("LEAVE_EARLY_NUM =", value, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumNotEqualTo(Integer value) {
            addCriterion("LEAVE_EARLY_NUM <>", value, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumGreaterThan(Integer value) {
            addCriterion("LEAVE_EARLY_NUM >", value, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEAVE_EARLY_NUM >=", value, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumLessThan(Integer value) {
            addCriterion("LEAVE_EARLY_NUM <", value, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumLessThanOrEqualTo(Integer value) {
            addCriterion("LEAVE_EARLY_NUM <=", value, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumIn(List<Integer> values) {
            addCriterion("LEAVE_EARLY_NUM in", values, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumNotIn(List<Integer> values) {
            addCriterion("LEAVE_EARLY_NUM not in", values, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumBetween(Integer value1, Integer value2) {
            addCriterion("LEAVE_EARLY_NUM between", value1, value2, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("LEAVE_EARLY_NUM not between", value1, value2, "leaveEarlyNum");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourIsNull() {
            addCriterion("AVG_LEAVE_TIME_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourIsNotNull() {
            addCriterion("AVG_LEAVE_TIME_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourEqualTo(Integer value) {
            addCriterion("AVG_LEAVE_TIME_HOUR =", value, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourNotEqualTo(Integer value) {
            addCriterion("AVG_LEAVE_TIME_HOUR <>", value, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourGreaterThan(Integer value) {
            addCriterion("AVG_LEAVE_TIME_HOUR >", value, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("AVG_LEAVE_TIME_HOUR >=", value, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourLessThan(Integer value) {
            addCriterion("AVG_LEAVE_TIME_HOUR <", value, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourLessThanOrEqualTo(Integer value) {
            addCriterion("AVG_LEAVE_TIME_HOUR <=", value, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourIn(List<Integer> values) {
            addCriterion("AVG_LEAVE_TIME_HOUR in", values, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourNotIn(List<Integer> values) {
            addCriterion("AVG_LEAVE_TIME_HOUR not in", values, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourBetween(Integer value1, Integer value2) {
            addCriterion("AVG_LEAVE_TIME_HOUR between", value1, value2, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeHourNotBetween(Integer value1, Integer value2) {
            addCriterion("AVG_LEAVE_TIME_HOUR not between", value1, value2, "avgLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteIsNull() {
            addCriterion("AVG_LEAVE_TIME_MINUTE is null");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteIsNotNull() {
            addCriterion("AVG_LEAVE_TIME_MINUTE is not null");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteEqualTo(Integer value) {
            addCriterion("AVG_LEAVE_TIME_MINUTE =", value, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteNotEqualTo(Integer value) {
            addCriterion("AVG_LEAVE_TIME_MINUTE <>", value, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteGreaterThan(Integer value) {
            addCriterion("AVG_LEAVE_TIME_MINUTE >", value, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("AVG_LEAVE_TIME_MINUTE >=", value, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteLessThan(Integer value) {
            addCriterion("AVG_LEAVE_TIME_MINUTE <", value, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("AVG_LEAVE_TIME_MINUTE <=", value, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteIn(List<Integer> values) {
            addCriterion("AVG_LEAVE_TIME_MINUTE in", values, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteNotIn(List<Integer> values) {
            addCriterion("AVG_LEAVE_TIME_MINUTE not in", values, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteBetween(Integer value1, Integer value2) {
            addCriterion("AVG_LEAVE_TIME_MINUTE between", value1, value2, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andAvgLeaveTimeMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("AVG_LEAVE_TIME_MINUTE not between", value1, value2, "avgLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourIsNull() {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourIsNotNull() {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourEqualTo(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR =", value, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourNotEqualTo(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR <>", value, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourGreaterThan(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR >", value, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR >=", value, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourLessThan(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR <", value, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourLessThanOrEqualTo(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR <=", value, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourIn(List<Integer> values) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR in", values, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourNotIn(List<Integer> values) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR not in", values, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourBetween(Integer value1, Integer value2) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR between", value1, value2, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeHourNotBetween(Integer value1, Integer value2) {
            addCriterion("EARLIEST_LEAVE_TIME_HOUR not between", value1, value2, "earliestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteIsNull() {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE is null");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteIsNotNull() {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE is not null");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteEqualTo(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE =", value, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteNotEqualTo(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE <>", value, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteGreaterThan(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE >", value, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE >=", value, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteLessThan(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE <", value, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE <=", value, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteIn(List<Integer> values) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE in", values, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteNotIn(List<Integer> values) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE not in", values, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteBetween(Integer value1, Integer value2) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE between", value1, value2, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andEarliestLeaveTimeMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("EARLIEST_LEAVE_TIME_MINUTE not between", value1, value2, "earliestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourIsNull() {
            addCriterion("LATEST_LEAVE_TIME_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourIsNotNull() {
            addCriterion("LATEST_LEAVE_TIME_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourEqualTo(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_HOUR =", value, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourNotEqualTo(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_HOUR <>", value, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourGreaterThan(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_HOUR >", value, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_HOUR >=", value, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourLessThan(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_HOUR <", value, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourLessThanOrEqualTo(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_HOUR <=", value, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourIn(List<Integer> values) {
            addCriterion("LATEST_LEAVE_TIME_HOUR in", values, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourNotIn(List<Integer> values) {
            addCriterion("LATEST_LEAVE_TIME_HOUR not in", values, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourBetween(Integer value1, Integer value2) {
            addCriterion("LATEST_LEAVE_TIME_HOUR between", value1, value2, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeHourNotBetween(Integer value1, Integer value2) {
            addCriterion("LATEST_LEAVE_TIME_HOUR not between", value1, value2, "latestLeaveTimeHour");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteIsNull() {
            addCriterion("LATEST_LEAVE_TIME_MINUTE is null");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteIsNotNull() {
            addCriterion("LATEST_LEAVE_TIME_MINUTE is not null");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteEqualTo(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE =", value, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteNotEqualTo(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE <>", value, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteGreaterThan(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE >", value, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE >=", value, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteLessThan(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE <", value, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE <=", value, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteIn(List<Integer> values) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE in", values, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteNotIn(List<Integer> values) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE not in", values, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteBetween(Integer value1, Integer value2) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE between", value1, value2, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLatestLeaveTimeMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("LATEST_LEAVE_TIME_MINUTE not between", value1, value2, "latestLeaveTimeMinute");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIsNull() {
            addCriterion("LEAVE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIsNotNull() {
            addCriterion("LEAVE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumEqualTo(Integer value) {
            addCriterion("LEAVE_NUM =", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotEqualTo(Integer value) {
            addCriterion("LEAVE_NUM <>", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumGreaterThan(Integer value) {
            addCriterion("LEAVE_NUM >", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEAVE_NUM >=", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumLessThan(Integer value) {
            addCriterion("LEAVE_NUM <", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumLessThanOrEqualTo(Integer value) {
            addCriterion("LEAVE_NUM <=", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIn(List<Integer> values) {
            addCriterion("LEAVE_NUM in", values, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotIn(List<Integer> values) {
            addCriterion("LEAVE_NUM not in", values, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumBetween(Integer value1, Integer value2) {
            addCriterion("LEAVE_NUM between", value1, value2, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("LEAVE_NUM not between", value1, value2, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumIsNull() {
            addCriterion("NO_SWIPE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumIsNotNull() {
            addCriterion("NO_SWIPE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumEqualTo(Integer value) {
            addCriterion("NO_SWIPE_NUM =", value, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumNotEqualTo(Integer value) {
            addCriterion("NO_SWIPE_NUM <>", value, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumGreaterThan(Integer value) {
            addCriterion("NO_SWIPE_NUM >", value, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("NO_SWIPE_NUM >=", value, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumLessThan(Integer value) {
            addCriterion("NO_SWIPE_NUM <", value, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumLessThanOrEqualTo(Integer value) {
            addCriterion("NO_SWIPE_NUM <=", value, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumIn(List<Integer> values) {
            addCriterion("NO_SWIPE_NUM in", values, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumNotIn(List<Integer> values) {
            addCriterion("NO_SWIPE_NUM not in", values, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumBetween(Integer value1, Integer value2) {
            addCriterion("NO_SWIPE_NUM between", value1, value2, "noSwipeNum");
            return (Criteria) this;
        }

        public Criteria andNoSwipeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("NO_SWIPE_NUM not between", value1, value2, "noSwipeNum");
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