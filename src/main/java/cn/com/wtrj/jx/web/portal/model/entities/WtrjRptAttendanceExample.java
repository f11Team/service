package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjRptAttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjRptAttendanceExample() {
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

        public Criteria andAttendanceTimeIsNull() {
            addCriterion("ATTENDANCE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIsNotNull() {
            addCriterion("ATTENDANCE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeEqualTo(Date value) {
            addCriterion("ATTENDANCE_TIME =", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotEqualTo(Date value) {
            addCriterion("ATTENDANCE_TIME <>", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeGreaterThan(Date value) {
            addCriterion("ATTENDANCE_TIME >", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ATTENDANCE_TIME >=", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeLessThan(Date value) {
            addCriterion("ATTENDANCE_TIME <", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("ATTENDANCE_TIME <=", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIn(List<Date> values) {
            addCriterion("ATTENDANCE_TIME in", values, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotIn(List<Date> values) {
            addCriterion("ATTENDANCE_TIME not in", values, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeBetween(Date value1, Date value2) {
            addCriterion("ATTENDANCE_TIME between", value1, value2, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("ATTENDANCE_TIME not between", value1, value2, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceIsNull() {
            addCriterion("ATTENDANCE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceIsNotNull() {
            addCriterion("ATTENDANCE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceEqualTo(String value) {
            addCriterion("ATTENDANCE_PLACE =", value, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceNotEqualTo(String value) {
            addCriterion("ATTENDANCE_PLACE <>", value, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceGreaterThan(String value) {
            addCriterion("ATTENDANCE_PLACE >", value, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENDANCE_PLACE >=", value, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceLessThan(String value) {
            addCriterion("ATTENDANCE_PLACE <", value, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceLessThanOrEqualTo(String value) {
            addCriterion("ATTENDANCE_PLACE <=", value, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceLike(String value) {
            addCriterion("ATTENDANCE_PLACE like", value, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceNotLike(String value) {
            addCriterion("ATTENDANCE_PLACE not like", value, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceIn(List<String> values) {
            addCriterion("ATTENDANCE_PLACE in", values, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceNotIn(List<String> values) {
            addCriterion("ATTENDANCE_PLACE not in", values, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceBetween(String value1, String value2) {
            addCriterion("ATTENDANCE_PLACE between", value1, value2, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendancePlaceNotBetween(String value1, String value2) {
            addCriterion("ATTENDANCE_PLACE not between", value1, value2, "attendancePlace");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindIsNull() {
            addCriterion("ATTENDANCE_KIND is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindIsNotNull() {
            addCriterion("ATTENDANCE_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindEqualTo(String value) {
            addCriterion("ATTENDANCE_KIND =", value, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindNotEqualTo(String value) {
            addCriterion("ATTENDANCE_KIND <>", value, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindGreaterThan(String value) {
            addCriterion("ATTENDANCE_KIND >", value, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENDANCE_KIND >=", value, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindLessThan(String value) {
            addCriterion("ATTENDANCE_KIND <", value, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindLessThanOrEqualTo(String value) {
            addCriterion("ATTENDANCE_KIND <=", value, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindLike(String value) {
            addCriterion("ATTENDANCE_KIND like", value, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindNotLike(String value) {
            addCriterion("ATTENDANCE_KIND not like", value, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindIn(List<String> values) {
            addCriterion("ATTENDANCE_KIND in", values, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindNotIn(List<String> values) {
            addCriterion("ATTENDANCE_KIND not in", values, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindBetween(String value1, String value2) {
            addCriterion("ATTENDANCE_KIND between", value1, value2, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceKindNotBetween(String value1, String value2) {
            addCriterion("ATTENDANCE_KIND not between", value1, value2, "attendanceKind");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusIsNull() {
            addCriterion("ATTENDANCE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusIsNotNull() {
            addCriterion("ATTENDANCE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusEqualTo(String value) {
            addCriterion("ATTENDANCE_STATUS =", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusNotEqualTo(String value) {
            addCriterion("ATTENDANCE_STATUS <>", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusGreaterThan(String value) {
            addCriterion("ATTENDANCE_STATUS >", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENDANCE_STATUS >=", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusLessThan(String value) {
            addCriterion("ATTENDANCE_STATUS <", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusLessThanOrEqualTo(String value) {
            addCriterion("ATTENDANCE_STATUS <=", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusLike(String value) {
            addCriterion("ATTENDANCE_STATUS like", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusNotLike(String value) {
            addCriterion("ATTENDANCE_STATUS not like", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusIn(List<String> values) {
            addCriterion("ATTENDANCE_STATUS in", values, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusNotIn(List<String> values) {
            addCriterion("ATTENDANCE_STATUS not in", values, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusBetween(String value1, String value2) {
            addCriterion("ATTENDANCE_STATUS between", value1, value2, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusNotBetween(String value1, String value2) {
            addCriterion("ATTENDANCE_STATUS not between", value1, value2, "attendanceStatus");
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