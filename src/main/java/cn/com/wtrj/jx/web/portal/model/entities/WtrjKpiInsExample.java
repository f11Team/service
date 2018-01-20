package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjKpiInsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjKpiInsExample() {
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

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolIsNull() {
            addCriterion("KPI_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolIsNotNull() {
            addCriterion("KPI_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolEqualTo(String value) {
            addCriterion("KPI_SCHOOL =", value, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolNotEqualTo(String value) {
            addCriterion("KPI_SCHOOL <>", value, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolGreaterThan(String value) {
            addCriterion("KPI_SCHOOL >", value, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("KPI_SCHOOL >=", value, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolLessThan(String value) {
            addCriterion("KPI_SCHOOL <", value, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolLessThanOrEqualTo(String value) {
            addCriterion("KPI_SCHOOL <=", value, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolLike(String value) {
            addCriterion("KPI_SCHOOL like", value, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolNotLike(String value) {
            addCriterion("KPI_SCHOOL not like", value, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolIn(List<String> values) {
            addCriterion("KPI_SCHOOL in", values, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolNotIn(List<String> values) {
            addCriterion("KPI_SCHOOL not in", values, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolBetween(String value1, String value2) {
            addCriterion("KPI_SCHOOL between", value1, value2, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andKpiSchoolNotBetween(String value1, String value2) {
            addCriterion("KPI_SCHOOL not between", value1, value2, "kpiSchool");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeIsNull() {
            addCriterion("ZIPING_TMPL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeIsNotNull() {
            addCriterion("ZIPING_TMPL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeEqualTo(String value) {
            addCriterion("ZIPING_TMPL_CODE =", value, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeNotEqualTo(String value) {
            addCriterion("ZIPING_TMPL_CODE <>", value, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeGreaterThan(String value) {
            addCriterion("ZIPING_TMPL_CODE >", value, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIPING_TMPL_CODE >=", value, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeLessThan(String value) {
            addCriterion("ZIPING_TMPL_CODE <", value, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIPING_TMPL_CODE <=", value, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeLike(String value) {
            addCriterion("ZIPING_TMPL_CODE like", value, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeNotLike(String value) {
            addCriterion("ZIPING_TMPL_CODE not like", value, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeIn(List<String> values) {
            addCriterion("ZIPING_TMPL_CODE in", values, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeNotIn(List<String> values) {
            addCriterion("ZIPING_TMPL_CODE not in", values, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeBetween(String value1, String value2) {
            addCriterion("ZIPING_TMPL_CODE between", value1, value2, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingTmplCodeNotBetween(String value1, String value2) {
            addCriterion("ZIPING_TMPL_CODE not between", value1, value2, "zipingTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeIsNull() {
            addCriterion("JIAOYANZU_TMPL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeIsNotNull() {
            addCriterion("JIAOYANZU_TMPL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeEqualTo(String value) {
            addCriterion("JIAOYANZU_TMPL_CODE =", value, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeNotEqualTo(String value) {
            addCriterion("JIAOYANZU_TMPL_CODE <>", value, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeGreaterThan(String value) {
            addCriterion("JIAOYANZU_TMPL_CODE >", value, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("JIAOYANZU_TMPL_CODE >=", value, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeLessThan(String value) {
            addCriterion("JIAOYANZU_TMPL_CODE <", value, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeLessThanOrEqualTo(String value) {
            addCriterion("JIAOYANZU_TMPL_CODE <=", value, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeLike(String value) {
            addCriterion("JIAOYANZU_TMPL_CODE like", value, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeNotLike(String value) {
            addCriterion("JIAOYANZU_TMPL_CODE not like", value, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeIn(List<String> values) {
            addCriterion("JIAOYANZU_TMPL_CODE in", values, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeNotIn(List<String> values) {
            addCriterion("JIAOYANZU_TMPL_CODE not in", values, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeBetween(String value1, String value2) {
            addCriterion("JIAOYANZU_TMPL_CODE between", value1, value2, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuTmplCodeNotBetween(String value1, String value2) {
            addCriterion("JIAOYANZU_TMPL_CODE not between", value1, value2, "jiaoyanzuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeIsNull() {
            addCriterion("NIANJIZU_TMPL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeIsNotNull() {
            addCriterion("NIANJIZU_TMPL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeEqualTo(String value) {
            addCriterion("NIANJIZU_TMPL_CODE =", value, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeNotEqualTo(String value) {
            addCriterion("NIANJIZU_TMPL_CODE <>", value, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeGreaterThan(String value) {
            addCriterion("NIANJIZU_TMPL_CODE >", value, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NIANJIZU_TMPL_CODE >=", value, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeLessThan(String value) {
            addCriterion("NIANJIZU_TMPL_CODE <", value, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeLessThanOrEqualTo(String value) {
            addCriterion("NIANJIZU_TMPL_CODE <=", value, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeLike(String value) {
            addCriterion("NIANJIZU_TMPL_CODE like", value, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeNotLike(String value) {
            addCriterion("NIANJIZU_TMPL_CODE not like", value, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeIn(List<String> values) {
            addCriterion("NIANJIZU_TMPL_CODE in", values, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeNotIn(List<String> values) {
            addCriterion("NIANJIZU_TMPL_CODE not in", values, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeBetween(String value1, String value2) {
            addCriterion("NIANJIZU_TMPL_CODE between", value1, value2, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andNianjizuTmplCodeNotBetween(String value1, String value2) {
            addCriterion("NIANJIZU_TMPL_CODE not between", value1, value2, "nianjizuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeIsNull() {
            addCriterion("JIAOWU_TMPL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeIsNotNull() {
            addCriterion("JIAOWU_TMPL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeEqualTo(String value) {
            addCriterion("JIAOWU_TMPL_CODE =", value, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeNotEqualTo(String value) {
            addCriterion("JIAOWU_TMPL_CODE <>", value, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeGreaterThan(String value) {
            addCriterion("JIAOWU_TMPL_CODE >", value, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeGreaterThanOrEqualTo(String value) {
            addCriterion("JIAOWU_TMPL_CODE >=", value, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeLessThan(String value) {
            addCriterion("JIAOWU_TMPL_CODE <", value, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeLessThanOrEqualTo(String value) {
            addCriterion("JIAOWU_TMPL_CODE <=", value, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeLike(String value) {
            addCriterion("JIAOWU_TMPL_CODE like", value, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeNotLike(String value) {
            addCriterion("JIAOWU_TMPL_CODE not like", value, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeIn(List<String> values) {
            addCriterion("JIAOWU_TMPL_CODE in", values, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeNotIn(List<String> values) {
            addCriterion("JIAOWU_TMPL_CODE not in", values, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeBetween(String value1, String value2) {
            addCriterion("JIAOWU_TMPL_CODE between", value1, value2, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andJiaowuTmplCodeNotBetween(String value1, String value2) {
            addCriterion("JIAOWU_TMPL_CODE not between", value1, value2, "jiaowuTmplCode");
            return (Criteria) this;
        }

        public Criteria andZipingEndIsNull() {
            addCriterion("ZIPING_END is null");
            return (Criteria) this;
        }

        public Criteria andZipingEndIsNotNull() {
            addCriterion("ZIPING_END is not null");
            return (Criteria) this;
        }

        public Criteria andZipingEndEqualTo(Short value) {
            addCriterion("ZIPING_END =", value, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndNotEqualTo(Short value) {
            addCriterion("ZIPING_END <>", value, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndGreaterThan(Short value) {
            addCriterion("ZIPING_END >", value, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndGreaterThanOrEqualTo(Short value) {
            addCriterion("ZIPING_END >=", value, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndLessThan(Short value) {
            addCriterion("ZIPING_END <", value, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndLessThanOrEqualTo(Short value) {
            addCriterion("ZIPING_END <=", value, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndIn(List<Short> values) {
            addCriterion("ZIPING_END in", values, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndNotIn(List<Short> values) {
            addCriterion("ZIPING_END not in", values, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndBetween(Short value1, Short value2) {
            addCriterion("ZIPING_END between", value1, value2, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andZipingEndNotBetween(Short value1, Short value2) {
            addCriterion("ZIPING_END not between", value1, value2, "zipingEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndIsNull() {
            addCriterion("JIAOYANZU_PINGJIA_END is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndIsNotNull() {
            addCriterion("JIAOYANZU_PINGJIA_END is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndEqualTo(Short value) {
            addCriterion("JIAOYANZU_PINGJIA_END =", value, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndNotEqualTo(Short value) {
            addCriterion("JIAOYANZU_PINGJIA_END <>", value, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndGreaterThan(Short value) {
            addCriterion("JIAOYANZU_PINGJIA_END >", value, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndGreaterThanOrEqualTo(Short value) {
            addCriterion("JIAOYANZU_PINGJIA_END >=", value, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndLessThan(Short value) {
            addCriterion("JIAOYANZU_PINGJIA_END <", value, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndLessThanOrEqualTo(Short value) {
            addCriterion("JIAOYANZU_PINGJIA_END <=", value, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndIn(List<Short> values) {
            addCriterion("JIAOYANZU_PINGJIA_END in", values, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndNotIn(List<Short> values) {
            addCriterion("JIAOYANZU_PINGJIA_END not in", values, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndBetween(Short value1, Short value2) {
            addCriterion("JIAOYANZU_PINGJIA_END between", value1, value2, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaoyanzuPingjiaEndNotBetween(Short value1, Short value2) {
            addCriterion("JIAOYANZU_PINGJIA_END not between", value1, value2, "jiaoyanzuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndIsNull() {
            addCriterion("NIANJIAZU_PINGJIA_END is null");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndIsNotNull() {
            addCriterion("NIANJIAZU_PINGJIA_END is not null");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndEqualTo(Short value) {
            addCriterion("NIANJIAZU_PINGJIA_END =", value, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndNotEqualTo(Short value) {
            addCriterion("NIANJIAZU_PINGJIA_END <>", value, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndGreaterThan(Short value) {
            addCriterion("NIANJIAZU_PINGJIA_END >", value, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndGreaterThanOrEqualTo(Short value) {
            addCriterion("NIANJIAZU_PINGJIA_END >=", value, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndLessThan(Short value) {
            addCriterion("NIANJIAZU_PINGJIA_END <", value, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndLessThanOrEqualTo(Short value) {
            addCriterion("NIANJIAZU_PINGJIA_END <=", value, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndIn(List<Short> values) {
            addCriterion("NIANJIAZU_PINGJIA_END in", values, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndNotIn(List<Short> values) {
            addCriterion("NIANJIAZU_PINGJIA_END not in", values, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndBetween(Short value1, Short value2) {
            addCriterion("NIANJIAZU_PINGJIA_END between", value1, value2, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andNianjiazuPingjiaEndNotBetween(Short value1, Short value2) {
            addCriterion("NIANJIAZU_PINGJIA_END not between", value1, value2, "nianjiazuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndIsNull() {
            addCriterion("JIAOWU_PINGJIA_END is null");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndIsNotNull() {
            addCriterion("JIAOWU_PINGJIA_END is not null");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndEqualTo(Short value) {
            addCriterion("JIAOWU_PINGJIA_END =", value, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndNotEqualTo(Short value) {
            addCriterion("JIAOWU_PINGJIA_END <>", value, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndGreaterThan(Short value) {
            addCriterion("JIAOWU_PINGJIA_END >", value, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndGreaterThanOrEqualTo(Short value) {
            addCriterion("JIAOWU_PINGJIA_END >=", value, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndLessThan(Short value) {
            addCriterion("JIAOWU_PINGJIA_END <", value, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndLessThanOrEqualTo(Short value) {
            addCriterion("JIAOWU_PINGJIA_END <=", value, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndIn(List<Short> values) {
            addCriterion("JIAOWU_PINGJIA_END in", values, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndNotIn(List<Short> values) {
            addCriterion("JIAOWU_PINGJIA_END not in", values, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndBetween(Short value1, Short value2) {
            addCriterion("JIAOWU_PINGJIA_END between", value1, value2, "jiaowuPingjiaEnd");
            return (Criteria) this;
        }

        public Criteria andJiaowuPingjiaEndNotBetween(Short value1, Short value2) {
            addCriterion("JIAOWU_PINGJIA_END not between", value1, value2, "jiaowuPingjiaEnd");
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