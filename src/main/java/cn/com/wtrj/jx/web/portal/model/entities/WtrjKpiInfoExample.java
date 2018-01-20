package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjKpiInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjKpiInfoExample() {
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

        public Criteria andKpiInsIsNull() {
            addCriterion("KPI_INS is null");
            return (Criteria) this;
        }

        public Criteria andKpiInsIsNotNull() {
            addCriterion("KPI_INS is not null");
            return (Criteria) this;
        }

        public Criteria andKpiInsEqualTo(Integer value) {
            addCriterion("KPI_INS =", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsNotEqualTo(Integer value) {
            addCriterion("KPI_INS <>", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsGreaterThan(Integer value) {
            addCriterion("KPI_INS >", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsGreaterThanOrEqualTo(Integer value) {
            addCriterion("KPI_INS >=", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsLessThan(Integer value) {
            addCriterion("KPI_INS <", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsLessThanOrEqualTo(Integer value) {
            addCriterion("KPI_INS <=", value, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsIn(List<Integer> values) {
            addCriterion("KPI_INS in", values, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsNotIn(List<Integer> values) {
            addCriterion("KPI_INS not in", values, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsBetween(Integer value1, Integer value2) {
            addCriterion("KPI_INS between", value1, value2, "kpiIns");
            return (Criteria) this;
        }

        public Criteria andKpiInsNotBetween(Integer value1, Integer value2) {
            addCriterion("KPI_INS not between", value1, value2, "kpiIns");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanIsNull() {
            addCriterion("JIAOWU_SCORE_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanIsNotNull() {
            addCriterion("JIAOWU_SCORE_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanEqualTo(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_PLAN =", value, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanNotEqualTo(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_PLAN <>", value, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanGreaterThan(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_PLAN >", value, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_PLAN >=", value, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanLessThan(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_PLAN <", value, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_PLAN <=", value, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanIn(List<BigDecimal> values) {
            addCriterion("JIAOWU_SCORE_PLAN in", values, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanNotIn(List<BigDecimal> values) {
            addCriterion("JIAOWU_SCORE_PLAN not in", values, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOWU_SCORE_PLAN between", value1, value2, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScorePlanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOWU_SCORE_PLAN not between", value1, value2, "jiaowuScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanIsNull() {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanIsNotNull() {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanEqualTo(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN =", value, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanNotEqualTo(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN <>", value, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanGreaterThan(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN >", value, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN >=", value, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanLessThan(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN <", value, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN <=", value, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanIn(List<BigDecimal> values) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN in", values, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanNotIn(List<BigDecimal> values) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN not in", values, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN between", value1, value2, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScorePlanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_PLAN not between", value1, value2, "jiaoyanzuPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanIsNull() {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanIsNotNull() {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanEqualTo(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN =", value, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanNotEqualTo(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN <>", value, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanGreaterThan(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN >", value, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN >=", value, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanLessThan(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN <", value, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN <=", value, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanIn(List<BigDecimal> values) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN in", values, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanNotIn(List<BigDecimal> values) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN not in", values, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN between", value1, value2, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScorePlanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANJI_PINGJIA_SCORE_PLAN not between", value1, value2, "nianjiPingjiaScorePlan");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActIsNull() {
            addCriterion("JIAOWU_SCORE_ACT is null");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActIsNotNull() {
            addCriterion("JIAOWU_SCORE_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActEqualTo(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_ACT =", value, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActNotEqualTo(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_ACT <>", value, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActGreaterThan(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_ACT >", value, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_ACT >=", value, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActLessThan(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_ACT <", value, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOWU_SCORE_ACT <=", value, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActIn(List<BigDecimal> values) {
            addCriterion("JIAOWU_SCORE_ACT in", values, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActNotIn(List<BigDecimal> values) {
            addCriterion("JIAOWU_SCORE_ACT not in", values, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOWU_SCORE_ACT between", value1, value2, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaowuScoreActNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOWU_SCORE_ACT not between", value1, value2, "jiaowuScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActIsNull() {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActIsNotNull() {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActEqualTo(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT =", value, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActNotEqualTo(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT <>", value, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActGreaterThan(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT >", value, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT >=", value, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActLessThan(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT <", value, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT <=", value, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActIn(List<BigDecimal> values) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT in", values, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActNotIn(List<BigDecimal> values) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT not in", values, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT between", value1, value2, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaScoreActNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOYANZU_PINGJIA_SCORE_ACT not between", value1, value2, "jiaoyanzuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActIsNull() {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT is null");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActIsNotNull() {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActEqualTo(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT =", value, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActNotEqualTo(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT <>", value, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActGreaterThan(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT >", value, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT >=", value, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActLessThan(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT <", value, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT <=", value, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActIn(List<BigDecimal> values) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT in", values, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActNotIn(List<BigDecimal> values) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT not in", values, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT between", value1, value2, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andNianjiPingjiaScoreActNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NIANJI_PINGJIA_SCORE_ACT not between", value1, value2, "nianjiPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andZipingScoreIsNull() {
            addCriterion("ZIPING_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andZipingScoreIsNotNull() {
            addCriterion("ZIPING_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andZipingScoreEqualTo(BigDecimal value) {
            addCriterion("ZIPING_SCORE =", value, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreNotEqualTo(BigDecimal value) {
            addCriterion("ZIPING_SCORE <>", value, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreGreaterThan(BigDecimal value) {
            addCriterion("ZIPING_SCORE >", value, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZIPING_SCORE >=", value, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreLessThan(BigDecimal value) {
            addCriterion("ZIPING_SCORE <", value, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZIPING_SCORE <=", value, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreIn(List<BigDecimal> values) {
            addCriterion("ZIPING_SCORE in", values, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreNotIn(List<BigDecimal> values) {
            addCriterion("ZIPING_SCORE not in", values, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZIPING_SCORE between", value1, value2, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andZipingScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZIPING_SCORE not between", value1, value2, "zipingScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreIsNull() {
            addCriterion("KPI_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andKpiScoreIsNotNull() {
            addCriterion("KPI_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andKpiScoreEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE =", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreNotEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE <>", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreGreaterThan(BigDecimal value) {
            addCriterion("KPI_SCORE >", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE >=", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreLessThan(BigDecimal value) {
            addCriterion("KPI_SCORE <", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE <=", value, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreIn(List<BigDecimal> values) {
            addCriterion("KPI_SCORE in", values, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreNotIn(List<BigDecimal> values) {
            addCriterion("KPI_SCORE not in", values, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_SCORE between", value1, value2, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_SCORE not between", value1, value2, "kpiScore");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActIsNull() {
            addCriterion("KPI_SCORE_ACT is null");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActIsNotNull() {
            addCriterion("KPI_SCORE_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE_ACT =", value, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActNotEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE_ACT <>", value, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActGreaterThan(BigDecimal value) {
            addCriterion("KPI_SCORE_ACT >", value, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE_ACT >=", value, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActLessThan(BigDecimal value) {
            addCriterion("KPI_SCORE_ACT <", value, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_SCORE_ACT <=", value, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActIn(List<BigDecimal> values) {
            addCriterion("KPI_SCORE_ACT in", values, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActNotIn(List<BigDecimal> values) {
            addCriterion("KPI_SCORE_ACT not in", values, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_SCORE_ACT between", value1, value2, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andKpiScoreActNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_SCORE_ACT not between", value1, value2, "kpiScoreAct");
            return (Criteria) this;
        }

        public Criteria andZipingTimeIsNull() {
            addCriterion("ZIPING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andZipingTimeIsNotNull() {
            addCriterion("ZIPING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andZipingTimeEqualTo(Date value) {
            addCriterion("ZIPING_TIME =", value, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeNotEqualTo(Date value) {
            addCriterion("ZIPING_TIME <>", value, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeGreaterThan(Date value) {
            addCriterion("ZIPING_TIME >", value, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ZIPING_TIME >=", value, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeLessThan(Date value) {
            addCriterion("ZIPING_TIME <", value, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeLessThanOrEqualTo(Date value) {
            addCriterion("ZIPING_TIME <=", value, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeIn(List<Date> values) {
            addCriterion("ZIPING_TIME in", values, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeNotIn(List<Date> values) {
            addCriterion("ZIPING_TIME not in", values, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeBetween(Date value1, Date value2) {
            addCriterion("ZIPING_TIME between", value1, value2, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andZipingTimeNotBetween(Date value1, Date value2) {
            addCriterion("ZIPING_TIME not between", value1, value2, "zipingTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeIsNull() {
            addCriterion("JIAOYANZU_PINGJIA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeIsNotNull() {
            addCriterion("JIAOYANZU_PINGJIA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeEqualTo(Date value) {
            addCriterion("JIAOYANZU_PINGJIA_TIME =", value, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeNotEqualTo(Date value) {
            addCriterion("JIAOYANZU_PINGJIA_TIME <>", value, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeGreaterThan(Date value) {
            addCriterion("JIAOYANZU_PINGJIA_TIME >", value, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JIAOYANZU_PINGJIA_TIME >=", value, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeLessThan(Date value) {
            addCriterion("JIAOYANZU_PINGJIA_TIME <", value, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeLessThanOrEqualTo(Date value) {
            addCriterion("JIAOYANZU_PINGJIA_TIME <=", value, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeIn(List<Date> values) {
            addCriterion("JIAOYANZU_PINGJIA_TIME in", values, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeNotIn(List<Date> values) {
            addCriterion("JIAOYANZU_PINGJIA_TIME not in", values, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeBetween(Date value1, Date value2) {
            addCriterion("JIAOYANZU_PINGJIA_TIME between", value1, value2, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaTimeNotBetween(Date value1, Date value2) {
            addCriterion("JIAOYANZU_PINGJIA_TIME not between", value1, value2, "jiaoyanzuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeIsNull() {
            addCriterion("NIANJIZU_PINGJIA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeIsNotNull() {
            addCriterion("NIANJIZU_PINGJIA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeEqualTo(Date value) {
            addCriterion("NIANJIZU_PINGJIA_TIME =", value, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeNotEqualTo(Date value) {
            addCriterion("NIANJIZU_PINGJIA_TIME <>", value, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeGreaterThan(Date value) {
            addCriterion("NIANJIZU_PINGJIA_TIME >", value, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NIANJIZU_PINGJIA_TIME >=", value, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeLessThan(Date value) {
            addCriterion("NIANJIZU_PINGJIA_TIME <", value, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeLessThanOrEqualTo(Date value) {
            addCriterion("NIANJIZU_PINGJIA_TIME <=", value, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeIn(List<Date> values) {
            addCriterion("NIANJIZU_PINGJIA_TIME in", values, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeNotIn(List<Date> values) {
            addCriterion("NIANJIZU_PINGJIA_TIME not in", values, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeBetween(Date value1, Date value2) {
            addCriterion("NIANJIZU_PINGJIA_TIME between", value1, value2, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andNianjizuPingjiaTimeNotBetween(Date value1, Date value2) {
            addCriterion("NIANJIZU_PINGJIA_TIME not between", value1, value2, "nianjizuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeIsNull() {
            addCriterion("JIAOWU_PINGJIA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeIsNotNull() {
            addCriterion("JIAOWU_PINGJIA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeEqualTo(Date value) {
            addCriterion("JIAOWU_PINGJIA_TIME =", value, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeNotEqualTo(Date value) {
            addCriterion("JIAOWU_PINGJIA_TIME <>", value, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeGreaterThan(Date value) {
            addCriterion("JIAOWU_PINGJIA_TIME >", value, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JIAOWU_PINGJIA_TIME >=", value, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeLessThan(Date value) {
            addCriterion("JIAOWU_PINGJIA_TIME <", value, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeLessThanOrEqualTo(Date value) {
            addCriterion("JIAOWU_PINGJIA_TIME <=", value, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeIn(List<Date> values) {
            addCriterion("JIAOWU_PINGJIA_TIME in", values, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeNotIn(List<Date> values) {
            addCriterion("JIAOWU_PINGJIA_TIME not in", values, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeBetween(Date value1, Date value2) {
            addCriterion("JIAOWU_PINGJIA_TIME between", value1, value2, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaTimeNotBetween(Date value1, Date value2) {
            addCriterion("JIAOWU_PINGJIA_TIME not between", value1, value2, "jiaowuPingjiaTime");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreIsNull() {
            addCriterion("JIAOXUE_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreIsNotNull() {
            addCriterion("JIAOXUE_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreEqualTo(BigDecimal value) {
            addCriterion("JIAOXUE_SCORE =", value, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreNotEqualTo(BigDecimal value) {
            addCriterion("JIAOXUE_SCORE <>", value, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreGreaterThan(BigDecimal value) {
            addCriterion("JIAOXUE_SCORE >", value, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOXUE_SCORE >=", value, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreLessThan(BigDecimal value) {
            addCriterion("JIAOXUE_SCORE <", value, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JIAOXUE_SCORE <=", value, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreIn(List<BigDecimal> values) {
            addCriterion("JIAOXUE_SCORE in", values, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreNotIn(List<BigDecimal> values) {
            addCriterion("JIAOXUE_SCORE not in", values, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOXUE_SCORE between", value1, value2, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andJiaoxueScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JIAOXUE_SCORE not between", value1, value2, "jiaoxueScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreIsNull() {
            addCriterion("STU_PINGJIA_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreIsNotNull() {
            addCriterion("STU_PINGJIA_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreEqualTo(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE =", value, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreNotEqualTo(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE <>", value, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreGreaterThan(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE >", value, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE >=", value, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreLessThan(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE <", value, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE <=", value, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreIn(List<BigDecimal> values) {
            addCriterion("STU_PINGJIA_SCORE in", values, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreNotIn(List<BigDecimal> values) {
            addCriterion("STU_PINGJIA_SCORE not in", values, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_PINGJIA_SCORE between", value1, value2, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_PINGJIA_SCORE not between", value1, value2, "stuPingjiaScore");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActIsNull() {
            addCriterion("STU_PINGJIA_SCORE_ACT is null");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActIsNotNull() {
            addCriterion("STU_PINGJIA_SCORE_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActEqualTo(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE_ACT =", value, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActNotEqualTo(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE_ACT <>", value, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActGreaterThan(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE_ACT >", value, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE_ACT >=", value, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActLessThan(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE_ACT <", value, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_PINGJIA_SCORE_ACT <=", value, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActIn(List<BigDecimal> values) {
            addCriterion("STU_PINGJIA_SCORE_ACT in", values, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActNotIn(List<BigDecimal> values) {
            addCriterion("STU_PINGJIA_SCORE_ACT not in", values, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_PINGJIA_SCORE_ACT between", value1, value2, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andStuPingjiaScoreActNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_PINGJIA_SCORE_ACT not between", value1, value2, "stuPingjiaScoreAct");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("TOTAL_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("TOTAL_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SCORE =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SCORE <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_SCORE >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SCORE >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(BigDecimal value) {
            addCriterion("TOTAL_SCORE <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_SCORE <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SCORE in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_SCORE not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SCORE between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_SCORE not between", value1, value2, "totalScore");
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