package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WtrjKpiPlanNianjizuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjKpiPlanNianjizuExample() {
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

        public Criteria andKpiPlanYouIsNull() {
            addCriterion("KPI_PLAN_YOU is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouIsNotNull() {
            addCriterion("KPI_PLAN_YOU is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouEqualTo(Integer value) {
            addCriterion("KPI_PLAN_YOU =", value, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouNotEqualTo(Integer value) {
            addCriterion("KPI_PLAN_YOU <>", value, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouGreaterThan(Integer value) {
            addCriterion("KPI_PLAN_YOU >", value, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouGreaterThanOrEqualTo(Integer value) {
            addCriterion("KPI_PLAN_YOU >=", value, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLessThan(Integer value) {
            addCriterion("KPI_PLAN_YOU <", value, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLessThanOrEqualTo(Integer value) {
            addCriterion("KPI_PLAN_YOU <=", value, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouIn(List<Integer> values) {
            addCriterion("KPI_PLAN_YOU in", values, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouNotIn(List<Integer> values) {
            addCriterion("KPI_PLAN_YOU not in", values, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouBetween(Integer value1, Integer value2) {
            addCriterion("KPI_PLAN_YOU between", value1, value2, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouNotBetween(Integer value1, Integer value2) {
            addCriterion("KPI_PLAN_YOU not between", value1, value2, "kpiPlanYou");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbIsNull() {
            addCriterion("KPI_PLAN_YOU_UB is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbIsNotNull() {
            addCriterion("KPI_PLAN_YOU_UB is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_UB =", value, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbNotEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_UB <>", value, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbGreaterThan(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_UB >", value, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_UB >=", value, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbLessThan(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_UB <", value, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_UB <=", value, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_YOU_UB in", values, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbNotIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_YOU_UB not in", values, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_YOU_UB between", value1, value2, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouUbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_YOU_UB not between", value1, value2, "kpiPlanYouUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbIsNull() {
            addCriterion("KPI_PLAN_YOU_LB is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbIsNotNull() {
            addCriterion("KPI_PLAN_YOU_LB is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_LB =", value, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbNotEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_LB <>", value, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbGreaterThan(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_LB >", value, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_LB >=", value, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbLessThan(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_LB <", value, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_YOU_LB <=", value, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_YOU_LB in", values, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbNotIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_YOU_LB not in", values, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_YOU_LB between", value1, value2, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanYouLbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_YOU_LB not between", value1, value2, "kpiPlanYouLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangIsNull() {
            addCriterion("KPI_PLAN_LIANG is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangIsNotNull() {
            addCriterion("KPI_PLAN_LIANG is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangEqualTo(Integer value) {
            addCriterion("KPI_PLAN_LIANG =", value, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangNotEqualTo(Integer value) {
            addCriterion("KPI_PLAN_LIANG <>", value, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangGreaterThan(Integer value) {
            addCriterion("KPI_PLAN_LIANG >", value, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangGreaterThanOrEqualTo(Integer value) {
            addCriterion("KPI_PLAN_LIANG >=", value, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLessThan(Integer value) {
            addCriterion("KPI_PLAN_LIANG <", value, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLessThanOrEqualTo(Integer value) {
            addCriterion("KPI_PLAN_LIANG <=", value, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangIn(List<Integer> values) {
            addCriterion("KPI_PLAN_LIANG in", values, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangNotIn(List<Integer> values) {
            addCriterion("KPI_PLAN_LIANG not in", values, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangBetween(Integer value1, Integer value2) {
            addCriterion("KPI_PLAN_LIANG between", value1, value2, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangNotBetween(Integer value1, Integer value2) {
            addCriterion("KPI_PLAN_LIANG not between", value1, value2, "kpiPlanLiang");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbIsNull() {
            addCriterion("KPI_PLAN_LIANG_UB is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbIsNotNull() {
            addCriterion("KPI_PLAN_LIANG_UB is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_UB =", value, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbNotEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_UB <>", value, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbGreaterThan(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_UB >", value, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_UB >=", value, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbLessThan(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_UB <", value, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_UB <=", value, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_LIANG_UB in", values, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbNotIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_LIANG_UB not in", values, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_LIANG_UB between", value1, value2, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangUbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_LIANG_UB not between", value1, value2, "kpiPlanLiangUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbIsNull() {
            addCriterion("KPI_PLAN_LIANG_LB is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbIsNotNull() {
            addCriterion("KPI_PLAN_LIANG_LB is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_LB =", value, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbNotEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_LB <>", value, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbGreaterThan(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_LB >", value, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_LB >=", value, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbLessThan(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_LB <", value, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_LIANG_LB <=", value, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_LIANG_LB in", values, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbNotIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_LIANG_LB not in", values, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_LIANG_LB between", value1, value2, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanLiangLbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_LIANG_LB not between", value1, value2, "kpiPlanLiangLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongIsNull() {
            addCriterion("KPI_PLAN_ZHONG is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongIsNotNull() {
            addCriterion("KPI_PLAN_ZHONG is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongEqualTo(Integer value) {
            addCriterion("KPI_PLAN_ZHONG =", value, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongNotEqualTo(Integer value) {
            addCriterion("KPI_PLAN_ZHONG <>", value, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongGreaterThan(Integer value) {
            addCriterion("KPI_PLAN_ZHONG >", value, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongGreaterThanOrEqualTo(Integer value) {
            addCriterion("KPI_PLAN_ZHONG >=", value, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLessThan(Integer value) {
            addCriterion("KPI_PLAN_ZHONG <", value, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLessThanOrEqualTo(Integer value) {
            addCriterion("KPI_PLAN_ZHONG <=", value, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongIn(List<Integer> values) {
            addCriterion("KPI_PLAN_ZHONG in", values, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongNotIn(List<Integer> values) {
            addCriterion("KPI_PLAN_ZHONG not in", values, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongBetween(Integer value1, Integer value2) {
            addCriterion("KPI_PLAN_ZHONG between", value1, value2, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongNotBetween(Integer value1, Integer value2) {
            addCriterion("KPI_PLAN_ZHONG not between", value1, value2, "kpiPlanZhong");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbIsNull() {
            addCriterion("KPI_PLAN_ZHONG_UB is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbIsNotNull() {
            addCriterion("KPI_PLAN_ZHONG_UB is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_UB =", value, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbNotEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_UB <>", value, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbGreaterThan(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_UB >", value, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_UB >=", value, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbLessThan(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_UB <", value, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_UB <=", value, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_ZHONG_UB in", values, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbNotIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_ZHONG_UB not in", values, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_ZHONG_UB between", value1, value2, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongUbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_ZHONG_UB not between", value1, value2, "kpiPlanZhongUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbIsNull() {
            addCriterion("KPI_PLAN_ZHONG_LB is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbIsNotNull() {
            addCriterion("KPI_PLAN_ZHONG_LB is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_LB =", value, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbNotEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_LB <>", value, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbGreaterThan(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_LB >", value, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_LB >=", value, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbLessThan(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_LB <", value, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_ZHONG_LB <=", value, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_ZHONG_LB in", values, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbNotIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_ZHONG_LB not in", values, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_ZHONG_LB between", value1, value2, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanZhongLbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_ZHONG_LB not between", value1, value2, "kpiPlanZhongLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaIsNull() {
            addCriterion("KPI_PLAN_CHA is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaIsNotNull() {
            addCriterion("KPI_PLAN_CHA is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaEqualTo(Integer value) {
            addCriterion("KPI_PLAN_CHA =", value, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaNotEqualTo(Integer value) {
            addCriterion("KPI_PLAN_CHA <>", value, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaGreaterThan(Integer value) {
            addCriterion("KPI_PLAN_CHA >", value, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaGreaterThanOrEqualTo(Integer value) {
            addCriterion("KPI_PLAN_CHA >=", value, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLessThan(Integer value) {
            addCriterion("KPI_PLAN_CHA <", value, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLessThanOrEqualTo(Integer value) {
            addCriterion("KPI_PLAN_CHA <=", value, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaIn(List<Integer> values) {
            addCriterion("KPI_PLAN_CHA in", values, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaNotIn(List<Integer> values) {
            addCriterion("KPI_PLAN_CHA not in", values, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaBetween(Integer value1, Integer value2) {
            addCriterion("KPI_PLAN_CHA between", value1, value2, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaNotBetween(Integer value1, Integer value2) {
            addCriterion("KPI_PLAN_CHA not between", value1, value2, "kpiPlanCha");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbIsNull() {
            addCriterion("KPI_PLAN_CHA_UB is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbIsNotNull() {
            addCriterion("KPI_PLAN_CHA_UB is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_UB =", value, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbNotEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_UB <>", value, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbGreaterThan(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_UB >", value, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_UB >=", value, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbLessThan(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_UB <", value, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_UB <=", value, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_CHA_UB in", values, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbNotIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_CHA_UB not in", values, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_CHA_UB between", value1, value2, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaUbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_CHA_UB not between", value1, value2, "kpiPlanChaUb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbIsNull() {
            addCriterion("KPI_PLAN_CHA_LB is null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbIsNotNull() {
            addCriterion("KPI_PLAN_CHA_LB is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_LB =", value, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbNotEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_LB <>", value, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbGreaterThan(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_LB >", value, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_LB >=", value, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbLessThan(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_LB <", value, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_PLAN_CHA_LB <=", value, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_CHA_LB in", values, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbNotIn(List<BigDecimal> values) {
            addCriterion("KPI_PLAN_CHA_LB not in", values, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_CHA_LB between", value1, value2, "kpiPlanChaLb");
            return (Criteria) this;
        }

        public Criteria andKpiPlanChaLbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_PLAN_CHA_LB not between", value1, value2, "kpiPlanChaLb");
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