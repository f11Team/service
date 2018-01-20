package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class WtrjStuParentRelationshipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjStuParentRelationshipExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
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

        public Criteria andAppellationIsNull() {
            addCriterion("APPELLATION is null");
            return (Criteria) this;
        }

        public Criteria andAppellationIsNotNull() {
            addCriterion("APPELLATION is not null");
            return (Criteria) this;
        }

        public Criteria andAppellationEqualTo(String value) {
            addCriterion("APPELLATION =", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotEqualTo(String value) {
            addCriterion("APPELLATION <>", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationGreaterThan(String value) {
            addCriterion("APPELLATION >", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationGreaterThanOrEqualTo(String value) {
            addCriterion("APPELLATION >=", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLessThan(String value) {
            addCriterion("APPELLATION <", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLessThanOrEqualTo(String value) {
            addCriterion("APPELLATION <=", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLike(String value) {
            addCriterion("APPELLATION like", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotLike(String value) {
            addCriterion("APPELLATION not like", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationIn(List<String> values) {
            addCriterion("APPELLATION in", values, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotIn(List<String> values) {
            addCriterion("APPELLATION not in", values, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationBetween(String value1, String value2) {
            addCriterion("APPELLATION between", value1, value2, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotBetween(String value1, String value2) {
            addCriterion("APPELLATION not between", value1, value2, "appellation");
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

        public Criteria andBlAttendanceSmsIsNull() {
            addCriterion("BL_ATTENDANCE_SMS is null");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsIsNotNull() {
            addCriterion("BL_ATTENDANCE_SMS is not null");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsEqualTo(String value) {
            addCriterion("BL_ATTENDANCE_SMS =", value, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsNotEqualTo(String value) {
            addCriterion("BL_ATTENDANCE_SMS <>", value, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsGreaterThan(String value) {
            addCriterion("BL_ATTENDANCE_SMS >", value, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsGreaterThanOrEqualTo(String value) {
            addCriterion("BL_ATTENDANCE_SMS >=", value, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsLessThan(String value) {
            addCriterion("BL_ATTENDANCE_SMS <", value, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsLessThanOrEqualTo(String value) {
            addCriterion("BL_ATTENDANCE_SMS <=", value, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsLike(String value) {
            addCriterion("BL_ATTENDANCE_SMS like", value, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsNotLike(String value) {
            addCriterion("BL_ATTENDANCE_SMS not like", value, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsIn(List<String> values) {
            addCriterion("BL_ATTENDANCE_SMS in", values, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsNotIn(List<String> values) {
            addCriterion("BL_ATTENDANCE_SMS not in", values, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsBetween(String value1, String value2) {
            addCriterion("BL_ATTENDANCE_SMS between", value1, value2, "blAttendanceSms");
            return (Criteria) this;
        }

        public Criteria andBlAttendanceSmsNotBetween(String value1, String value2) {
            addCriterion("BL_ATTENDANCE_SMS not between", value1, value2, "blAttendanceSms");
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