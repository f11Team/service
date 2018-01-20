package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjSchoolInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjSchoolInfoExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
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

        public Criteria andNickNameIsNull() {
            addCriterion("NICK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("NICK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("NICK_NAME =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("NICK_NAME <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("NICK_NAME >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("NICK_NAME >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("NICK_NAME <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("NICK_NAME <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("NICK_NAME like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("NICK_NAME not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("NICK_NAME in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("NICK_NAME not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("NICK_NAME between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("NICK_NAME not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andGradeStageIsNull() {
            addCriterion("GRADE_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andGradeStageIsNotNull() {
            addCriterion("GRADE_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeStageEqualTo(String value) {
            addCriterion("GRADE_STAGE =", value, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageNotEqualTo(String value) {
            addCriterion("GRADE_STAGE <>", value, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageGreaterThan(String value) {
            addCriterion("GRADE_STAGE >", value, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_STAGE >=", value, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageLessThan(String value) {
            addCriterion("GRADE_STAGE <", value, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageLessThanOrEqualTo(String value) {
            addCriterion("GRADE_STAGE <=", value, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageLike(String value) {
            addCriterion("GRADE_STAGE like", value, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageNotLike(String value) {
            addCriterion("GRADE_STAGE not like", value, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageIn(List<String> values) {
            addCriterion("GRADE_STAGE in", values, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageNotIn(List<String> values) {
            addCriterion("GRADE_STAGE not in", values, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageBetween(String value1, String value2) {
            addCriterion("GRADE_STAGE between", value1, value2, "gradeStage");
            return (Criteria) this;
        }

        public Criteria andGradeStageNotBetween(String value1, String value2) {
            addCriterion("GRADE_STAGE not between", value1, value2, "gradeStage");
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

        public Criteria andUpdateTiimeIsNull() {
            addCriterion("UPDATE_TIIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeIsNotNull() {
            addCriterion("UPDATE_TIIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeEqualTo(Date value) {
            addCriterion("UPDATE_TIIME =", value, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIIME <>", value, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIIME >", value, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIIME >=", value, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeLessThan(Date value) {
            addCriterion("UPDATE_TIIME <", value, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIIME <=", value, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeIn(List<Date> values) {
            addCriterion("UPDATE_TIIME in", values, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIIME not in", values, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIIME between", value1, value2, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andUpdateTiimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIIME not between", value1, value2, "updateTiime");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdIsNull() {
            addCriterion("ZS_SCHOOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdIsNotNull() {
            addCriterion("ZS_SCHOOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdEqualTo(Integer value) {
            addCriterion("ZS_SCHOOL_ID =", value, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdNotEqualTo(Integer value) {
            addCriterion("ZS_SCHOOL_ID <>", value, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdGreaterThan(Integer value) {
            addCriterion("ZS_SCHOOL_ID >", value, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZS_SCHOOL_ID >=", value, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdLessThan(Integer value) {
            addCriterion("ZS_SCHOOL_ID <", value, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("ZS_SCHOOL_ID <=", value, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdIn(List<Integer> values) {
            addCriterion("ZS_SCHOOL_ID in", values, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdNotIn(List<Integer> values) {
            addCriterion("ZS_SCHOOL_ID not in", values, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("ZS_SCHOOL_ID between", value1, value2, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ZS_SCHOOL_ID not between", value1, value2, "zsSchoolId");
            return (Criteria) this;
        }

        public Criteria andZsGradeIsNull() {
            addCriterion("ZS_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andZsGradeIsNotNull() {
            addCriterion("ZS_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andZsGradeEqualTo(String value) {
            addCriterion("ZS_GRADE =", value, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeNotEqualTo(String value) {
            addCriterion("ZS_GRADE <>", value, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeGreaterThan(String value) {
            addCriterion("ZS_GRADE >", value, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeGreaterThanOrEqualTo(String value) {
            addCriterion("ZS_GRADE >=", value, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeLessThan(String value) {
            addCriterion("ZS_GRADE <", value, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeLessThanOrEqualTo(String value) {
            addCriterion("ZS_GRADE <=", value, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeLike(String value) {
            addCriterion("ZS_GRADE like", value, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeNotLike(String value) {
            addCriterion("ZS_GRADE not like", value, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeIn(List<String> values) {
            addCriterion("ZS_GRADE in", values, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeNotIn(List<String> values) {
            addCriterion("ZS_GRADE not in", values, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeBetween(String value1, String value2) {
            addCriterion("ZS_GRADE between", value1, value2, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andZsGradeNotBetween(String value1, String value2) {
            addCriterion("ZS_GRADE not between", value1, value2, "zsGrade");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeIsNull() {
            addCriterion("NC_ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeIsNotNull() {
            addCriterion("NC_ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeEqualTo(String value) {
            addCriterion("NC_ORG_CODE =", value, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeNotEqualTo(String value) {
            addCriterion("NC_ORG_CODE <>", value, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeGreaterThan(String value) {
            addCriterion("NC_ORG_CODE >", value, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_ORG_CODE >=", value, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeLessThan(String value) {
            addCriterion("NC_ORG_CODE <", value, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("NC_ORG_CODE <=", value, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeLike(String value) {
            addCriterion("NC_ORG_CODE like", value, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeNotLike(String value) {
            addCriterion("NC_ORG_CODE not like", value, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeIn(List<String> values) {
            addCriterion("NC_ORG_CODE in", values, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeNotIn(List<String> values) {
            addCriterion("NC_ORG_CODE not in", values, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeBetween(String value1, String value2) {
            addCriterion("NC_ORG_CODE between", value1, value2, "ncOrgCode");
            return (Criteria) this;
        }

        public Criteria andNcOrgCodeNotBetween(String value1, String value2) {
            addCriterion("NC_ORG_CODE not between", value1, value2, "ncOrgCode");
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