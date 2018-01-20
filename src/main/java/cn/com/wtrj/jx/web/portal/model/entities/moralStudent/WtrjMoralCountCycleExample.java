package cn.com.wtrj.jx.web.portal.model.entities.moralStudent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjMoralCountCycleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjMoralCountCycleExample() {
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

        public Criteria andCountNameIsNull() {
            addCriterion("COUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCountNameIsNotNull() {
            addCriterion("COUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCountNameEqualTo(String value) {
            addCriterion("COUNT_NAME =", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameNotEqualTo(String value) {
            addCriterion("COUNT_NAME <>", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameGreaterThan(String value) {
            addCriterion("COUNT_NAME >", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUNT_NAME >=", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameLessThan(String value) {
            addCriterion("COUNT_NAME <", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameLessThanOrEqualTo(String value) {
            addCriterion("COUNT_NAME <=", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameLike(String value) {
            addCriterion("COUNT_NAME like", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameNotLike(String value) {
            addCriterion("COUNT_NAME not like", value, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameIn(List<String> values) {
            addCriterion("COUNT_NAME in", values, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameNotIn(List<String> values) {
            addCriterion("COUNT_NAME not in", values, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameBetween(String value1, String value2) {
            addCriterion("COUNT_NAME between", value1, value2, "countName");
            return (Criteria) this;
        }

        public Criteria andCountNameNotBetween(String value1, String value2) {
            addCriterion("COUNT_NAME not between", value1, value2, "countName");
            return (Criteria) this;
        }

        public Criteria andCycleStartIsNull() {
            addCriterion("CYCLE_START is null");
            return (Criteria) this;
        }

        public Criteria andCycleStartIsNotNull() {
            addCriterion("CYCLE_START is not null");
            return (Criteria) this;
        }

        public Criteria andCycleStartEqualTo(Date value) {
            addCriterion("CYCLE_START =", value, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartNotEqualTo(Date value) {
            addCriterion("CYCLE_START <>", value, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartGreaterThan(Date value) {
            addCriterion("CYCLE_START >", value, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartGreaterThanOrEqualTo(Date value) {
            addCriterion("CYCLE_START >=", value, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartLessThan(Date value) {
            addCriterion("CYCLE_START <", value, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartLessThanOrEqualTo(Date value) {
            addCriterion("CYCLE_START <=", value, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartIn(List<Date> values) {
            addCriterion("CYCLE_START in", values, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartNotIn(List<Date> values) {
            addCriterion("CYCLE_START not in", values, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartBetween(Date value1, Date value2) {
            addCriterion("CYCLE_START between", value1, value2, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleStartNotBetween(Date value1, Date value2) {
            addCriterion("CYCLE_START not between", value1, value2, "cycleStart");
            return (Criteria) this;
        }

        public Criteria andCycleEndIsNull() {
            addCriterion("CYCLE_END is null");
            return (Criteria) this;
        }

        public Criteria andCycleEndIsNotNull() {
            addCriterion("CYCLE_END is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEndEqualTo(Date value) {
            addCriterion("CYCLE_END =", value, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndNotEqualTo(Date value) {
            addCriterion("CYCLE_END <>", value, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndGreaterThan(Date value) {
            addCriterion("CYCLE_END >", value, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndGreaterThanOrEqualTo(Date value) {
            addCriterion("CYCLE_END >=", value, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndLessThan(Date value) {
            addCriterion("CYCLE_END <", value, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndLessThanOrEqualTo(Date value) {
            addCriterion("CYCLE_END <=", value, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndIn(List<Date> values) {
            addCriterion("CYCLE_END in", values, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndNotIn(List<Date> values) {
            addCriterion("CYCLE_END not in", values, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndBetween(Date value1, Date value2) {
            addCriterion("CYCLE_END between", value1, value2, "cycleEnd");
            return (Criteria) this;
        }

        public Criteria andCycleEndNotBetween(Date value1, Date value2) {
            addCriterion("CYCLE_END not between", value1, value2, "cycleEnd");
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

        public Criteria andBlDelFlgIsNull() {
            addCriterion("BL_DEL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgIsNotNull() {
            addCriterion("BL_DEL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgEqualTo(String value) {
            addCriterion("BL_DEL_FLG =", value, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgNotEqualTo(String value) {
            addCriterion("BL_DEL_FLG <>", value, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgGreaterThan(String value) {
            addCriterion("BL_DEL_FLG >", value, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("BL_DEL_FLG >=", value, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgLessThan(String value) {
            addCriterion("BL_DEL_FLG <", value, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgLessThanOrEqualTo(String value) {
            addCriterion("BL_DEL_FLG <=", value, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgLike(String value) {
            addCriterion("BL_DEL_FLG like", value, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgNotLike(String value) {
            addCriterion("BL_DEL_FLG not like", value, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgIn(List<String> values) {
            addCriterion("BL_DEL_FLG in", values, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgNotIn(List<String> values) {
            addCriterion("BL_DEL_FLG not in", values, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgBetween(String value1, String value2) {
            addCriterion("BL_DEL_FLG between", value1, value2, "blDelFlg");
            return (Criteria) this;
        }

        public Criteria andBlDelFlgNotBetween(String value1, String value2) {
            addCriterion("BL_DEL_FLG not between", value1, value2, "blDelFlg");
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