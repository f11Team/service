package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjEcomCourseScheduleTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjEcomCourseScheduleTempExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
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

        public Criteria andOdevityEqualTo(Short value) {
            addCriterion("ODEVITY =", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityNotEqualTo(Short value) {
            addCriterion("ODEVITY <>", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityGreaterThan(Short value) {
            addCriterion("ODEVITY >", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityGreaterThanOrEqualTo(Short value) {
            addCriterion("ODEVITY >=", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityLessThan(Short value) {
            addCriterion("ODEVITY <", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityLessThanOrEqualTo(Short value) {
            addCriterion("ODEVITY <=", value, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityIn(List<Short> values) {
            addCriterion("ODEVITY in", values, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityNotIn(List<Short> values) {
            addCriterion("ODEVITY not in", values, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityBetween(Short value1, Short value2) {
            addCriterion("ODEVITY between", value1, value2, "odevity");
            return (Criteria) this;
        }

        public Criteria andOdevityNotBetween(Short value1, Short value2) {
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