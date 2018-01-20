package cn.com.wtrj.jx.web.portal.model.entities.moralStudent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjMoralStandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjMoralStandardExample() {
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

        public Criteria andBaseScoreIsNull() {
            addCriterion("BASE_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andBaseScoreIsNotNull() {
            addCriterion("BASE_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseScoreEqualTo(Integer value) {
            addCriterion("BASE_SCORE =", value, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreNotEqualTo(Integer value) {
            addCriterion("BASE_SCORE <>", value, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreGreaterThan(Integer value) {
            addCriterion("BASE_SCORE >", value, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("BASE_SCORE >=", value, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreLessThan(Integer value) {
            addCriterion("BASE_SCORE <", value, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreLessThanOrEqualTo(Integer value) {
            addCriterion("BASE_SCORE <=", value, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreIn(List<Integer> values) {
            addCriterion("BASE_SCORE in", values, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreNotIn(List<Integer> values) {
            addCriterion("BASE_SCORE not in", values, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreBetween(Integer value1, Integer value2) {
            addCriterion("BASE_SCORE between", value1, value2, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBaseScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("BASE_SCORE not between", value1, value2, "baseScore");
            return (Criteria) this;
        }

        public Criteria andBlLeafIsNull() {
            addCriterion("BL_LEAF is null");
            return (Criteria) this;
        }

        public Criteria andBlLeafIsNotNull() {
            addCriterion("BL_LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andBlLeafEqualTo(String value) {
            addCriterion("BL_LEAF =", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafNotEqualTo(String value) {
            addCriterion("BL_LEAF <>", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafGreaterThan(String value) {
            addCriterion("BL_LEAF >", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafGreaterThanOrEqualTo(String value) {
            addCriterion("BL_LEAF >=", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafLessThan(String value) {
            addCriterion("BL_LEAF <", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafLessThanOrEqualTo(String value) {
            addCriterion("BL_LEAF <=", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafLike(String value) {
            addCriterion("BL_LEAF like", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafNotLike(String value) {
            addCriterion("BL_LEAF not like", value, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafIn(List<String> values) {
            addCriterion("BL_LEAF in", values, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafNotIn(List<String> values) {
            addCriterion("BL_LEAF not in", values, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafBetween(String value1, String value2) {
            addCriterion("BL_LEAF between", value1, value2, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andBlLeafNotBetween(String value1, String value2) {
            addCriterion("BL_LEAF not between", value1, value2, "blLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andInsNumIsNull() {
            addCriterion("INS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andInsNumIsNotNull() {
            addCriterion("INS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andInsNumEqualTo(Integer value) {
            addCriterion("INS_NUM =", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumNotEqualTo(Integer value) {
            addCriterion("INS_NUM <>", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumGreaterThan(Integer value) {
            addCriterion("INS_NUM >", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("INS_NUM >=", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumLessThan(Integer value) {
            addCriterion("INS_NUM <", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumLessThanOrEqualTo(Integer value) {
            addCriterion("INS_NUM <=", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumIn(List<Integer> values) {
            addCriterion("INS_NUM in", values, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumNotIn(List<Integer> values) {
            addCriterion("INS_NUM not in", values, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumBetween(Integer value1, Integer value2) {
            addCriterion("INS_NUM between", value1, value2, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("INS_NUM not between", value1, value2, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinIsNull() {
            addCriterion("INS_SCORE_MIN is null");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinIsNotNull() {
            addCriterion("INS_SCORE_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinEqualTo(Integer value) {
            addCriterion("INS_SCORE_MIN =", value, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinNotEqualTo(Integer value) {
            addCriterion("INS_SCORE_MIN <>", value, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinGreaterThan(Integer value) {
            addCriterion("INS_SCORE_MIN >", value, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("INS_SCORE_MIN >=", value, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinLessThan(Integer value) {
            addCriterion("INS_SCORE_MIN <", value, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinLessThanOrEqualTo(Integer value) {
            addCriterion("INS_SCORE_MIN <=", value, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinIn(List<Integer> values) {
            addCriterion("INS_SCORE_MIN in", values, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinNotIn(List<Integer> values) {
            addCriterion("INS_SCORE_MIN not in", values, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinBetween(Integer value1, Integer value2) {
            addCriterion("INS_SCORE_MIN between", value1, value2, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMinNotBetween(Integer value1, Integer value2) {
            addCriterion("INS_SCORE_MIN not between", value1, value2, "insScoreMin");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxIsNull() {
            addCriterion("INS_SCORE_MAX is null");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxIsNotNull() {
            addCriterion("INS_SCORE_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxEqualTo(Integer value) {
            addCriterion("INS_SCORE_MAX =", value, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxNotEqualTo(Integer value) {
            addCriterion("INS_SCORE_MAX <>", value, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxGreaterThan(Integer value) {
            addCriterion("INS_SCORE_MAX >", value, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("INS_SCORE_MAX >=", value, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxLessThan(Integer value) {
            addCriterion("INS_SCORE_MAX <", value, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxLessThanOrEqualTo(Integer value) {
            addCriterion("INS_SCORE_MAX <=", value, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxIn(List<Integer> values) {
            addCriterion("INS_SCORE_MAX in", values, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxNotIn(List<Integer> values) {
            addCriterion("INS_SCORE_MAX not in", values, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxBetween(Integer value1, Integer value2) {
            addCriterion("INS_SCORE_MAX between", value1, value2, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andInsScoreMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("INS_SCORE_MAX not between", value1, value2, "insScoreMax");
            return (Criteria) this;
        }

        public Criteria andAuthRoleIsNull() {
            addCriterion("AUTH_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andAuthRoleIsNotNull() {
            addCriterion("AUTH_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthRoleEqualTo(String value) {
            addCriterion("AUTH_ROLE =", value, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleNotEqualTo(String value) {
            addCriterion("AUTH_ROLE <>", value, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleGreaterThan(String value) {
            addCriterion("AUTH_ROLE >", value, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_ROLE >=", value, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleLessThan(String value) {
            addCriterion("AUTH_ROLE <", value, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleLessThanOrEqualTo(String value) {
            addCriterion("AUTH_ROLE <=", value, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleLike(String value) {
            addCriterion("AUTH_ROLE like", value, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleNotLike(String value) {
            addCriterion("AUTH_ROLE not like", value, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleIn(List<String> values) {
            addCriterion("AUTH_ROLE in", values, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleNotIn(List<String> values) {
            addCriterion("AUTH_ROLE not in", values, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleBetween(String value1, String value2) {
            addCriterion("AUTH_ROLE between", value1, value2, "authRole");
            return (Criteria) this;
        }

        public Criteria andAuthRoleNotBetween(String value1, String value2) {
            addCriterion("AUTH_ROLE not between", value1, value2, "authRole");
            return (Criteria) this;
        }

        public Criteria andReportCycleIsNull() {
            addCriterion("REPORT_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andReportCycleIsNotNull() {
            addCriterion("REPORT_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andReportCycleEqualTo(String value) {
            addCriterion("REPORT_CYCLE =", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleNotEqualTo(String value) {
            addCriterion("REPORT_CYCLE <>", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleGreaterThan(String value) {
            addCriterion("REPORT_CYCLE >", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_CYCLE >=", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleLessThan(String value) {
            addCriterion("REPORT_CYCLE <", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleLessThanOrEqualTo(String value) {
            addCriterion("REPORT_CYCLE <=", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleLike(String value) {
            addCriterion("REPORT_CYCLE like", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleNotLike(String value) {
            addCriterion("REPORT_CYCLE not like", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleIn(List<String> values) {
            addCriterion("REPORT_CYCLE in", values, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleNotIn(List<String> values) {
            addCriterion("REPORT_CYCLE not in", values, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleBetween(String value1, String value2) {
            addCriterion("REPORT_CYCLE between", value1, value2, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleNotBetween(String value1, String value2) {
            addCriterion("REPORT_CYCLE not between", value1, value2, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andActStartIsNull() {
            addCriterion("ACT_START is null");
            return (Criteria) this;
        }

        public Criteria andActStartIsNotNull() {
            addCriterion("ACT_START is not null");
            return (Criteria) this;
        }

        public Criteria andActStartEqualTo(Date value) {
            addCriterion("ACT_START =", value, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartNotEqualTo(Date value) {
            addCriterion("ACT_START <>", value, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartGreaterThan(Date value) {
            addCriterion("ACT_START >", value, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartGreaterThanOrEqualTo(Date value) {
            addCriterion("ACT_START >=", value, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartLessThan(Date value) {
            addCriterion("ACT_START <", value, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartLessThanOrEqualTo(Date value) {
            addCriterion("ACT_START <=", value, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartIn(List<Date> values) {
            addCriterion("ACT_START in", values, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartNotIn(List<Date> values) {
            addCriterion("ACT_START not in", values, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartBetween(Date value1, Date value2) {
            addCriterion("ACT_START between", value1, value2, "actStart");
            return (Criteria) this;
        }

        public Criteria andActStartNotBetween(Date value1, Date value2) {
            addCriterion("ACT_START not between", value1, value2, "actStart");
            return (Criteria) this;
        }

        public Criteria andActEndIsNull() {
            addCriterion("ACT_END is null");
            return (Criteria) this;
        }

        public Criteria andActEndIsNotNull() {
            addCriterion("ACT_END is not null");
            return (Criteria) this;
        }

        public Criteria andActEndEqualTo(Date value) {
            addCriterion("ACT_END =", value, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndNotEqualTo(Date value) {
            addCriterion("ACT_END <>", value, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndGreaterThan(Date value) {
            addCriterion("ACT_END >", value, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndGreaterThanOrEqualTo(Date value) {
            addCriterion("ACT_END >=", value, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndLessThan(Date value) {
            addCriterion("ACT_END <", value, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndLessThanOrEqualTo(Date value) {
            addCriterion("ACT_END <=", value, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndIn(List<Date> values) {
            addCriterion("ACT_END in", values, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndNotIn(List<Date> values) {
            addCriterion("ACT_END not in", values, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndBetween(Date value1, Date value2) {
            addCriterion("ACT_END between", value1, value2, "actEnd");
            return (Criteria) this;
        }

        public Criteria andActEndNotBetween(Date value1, Date value2) {
            addCriterion("ACT_END not between", value1, value2, "actEnd");
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