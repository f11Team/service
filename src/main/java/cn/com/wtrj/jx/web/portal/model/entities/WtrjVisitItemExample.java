package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjVisitItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjVisitItemExample() {
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

        public Criteria andVisitorNameIsNull() {
            addCriterion("VISITOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVisitorNameIsNotNull() {
            addCriterion("VISITOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorNameEqualTo(String value) {
            addCriterion("VISITOR_NAME =", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotEqualTo(String value) {
            addCriterion("VISITOR_NAME <>", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameGreaterThan(String value) {
            addCriterion("VISITOR_NAME >", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameGreaterThanOrEqualTo(String value) {
            addCriterion("VISITOR_NAME >=", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLessThan(String value) {
            addCriterion("VISITOR_NAME <", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLessThanOrEqualTo(String value) {
            addCriterion("VISITOR_NAME <=", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLike(String value) {
            addCriterion("VISITOR_NAME like", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotLike(String value) {
            addCriterion("VISITOR_NAME not like", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameIn(List<String> values) {
            addCriterion("VISITOR_NAME in", values, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotIn(List<String> values) {
            addCriterion("VISITOR_NAME not in", values, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameBetween(String value1, String value2) {
            addCriterion("VISITOR_NAME between", value1, value2, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotBetween(String value1, String value2) {
            addCriterion("VISITOR_NAME not between", value1, value2, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIsNull() {
            addCriterion("VISITOR_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIsNotNull() {
            addCriterion("VISITOR_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneEqualTo(String value) {
            addCriterion("VISITOR_PHONE =", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotEqualTo(String value) {
            addCriterion("VISITOR_PHONE <>", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneGreaterThan(String value) {
            addCriterion("VISITOR_PHONE >", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("VISITOR_PHONE >=", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLessThan(String value) {
            addCriterion("VISITOR_PHONE <", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLessThanOrEqualTo(String value) {
            addCriterion("VISITOR_PHONE <=", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLike(String value) {
            addCriterion("VISITOR_PHONE like", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotLike(String value) {
            addCriterion("VISITOR_PHONE not like", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIn(List<String> values) {
            addCriterion("VISITOR_PHONE in", values, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotIn(List<String> values) {
            addCriterion("VISITOR_PHONE not in", values, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneBetween(String value1, String value2) {
            addCriterion("VISITOR_PHONE between", value1, value2, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotBetween(String value1, String value2) {
            addCriterion("VISITOR_PHONE not between", value1, value2, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardIsNull() {
            addCriterion("VISITOR_ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardIsNotNull() {
            addCriterion("VISITOR_ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardEqualTo(String value) {
            addCriterion("VISITOR_ID_CARD =", value, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardNotEqualTo(String value) {
            addCriterion("VISITOR_ID_CARD <>", value, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardGreaterThan(String value) {
            addCriterion("VISITOR_ID_CARD >", value, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("VISITOR_ID_CARD >=", value, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardLessThan(String value) {
            addCriterion("VISITOR_ID_CARD <", value, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardLessThanOrEqualTo(String value) {
            addCriterion("VISITOR_ID_CARD <=", value, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardLike(String value) {
            addCriterion("VISITOR_ID_CARD like", value, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardNotLike(String value) {
            addCriterion("VISITOR_ID_CARD not like", value, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardIn(List<String> values) {
            addCriterion("VISITOR_ID_CARD in", values, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardNotIn(List<String> values) {
            addCriterion("VISITOR_ID_CARD not in", values, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardBetween(String value1, String value2) {
            addCriterion("VISITOR_ID_CARD between", value1, value2, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andVisitorIdCardNotBetween(String value1, String value2) {
            addCriterion("VISITOR_ID_CARD not between", value1, value2, "visitorIdCard");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameIsNull() {
            addCriterion("TO_VISITOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameIsNotNull() {
            addCriterion("TO_VISITOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameEqualTo(String value) {
            addCriterion("TO_VISITOR_NAME =", value, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameNotEqualTo(String value) {
            addCriterion("TO_VISITOR_NAME <>", value, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameGreaterThan(String value) {
            addCriterion("TO_VISITOR_NAME >", value, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameGreaterThanOrEqualTo(String value) {
            addCriterion("TO_VISITOR_NAME >=", value, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameLessThan(String value) {
            addCriterion("TO_VISITOR_NAME <", value, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameLessThanOrEqualTo(String value) {
            addCriterion("TO_VISITOR_NAME <=", value, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameLike(String value) {
            addCriterion("TO_VISITOR_NAME like", value, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameNotLike(String value) {
            addCriterion("TO_VISITOR_NAME not like", value, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameIn(List<String> values) {
            addCriterion("TO_VISITOR_NAME in", values, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameNotIn(List<String> values) {
            addCriterion("TO_VISITOR_NAME not in", values, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameBetween(String value1, String value2) {
            addCriterion("TO_VISITOR_NAME between", value1, value2, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorNameNotBetween(String value1, String value2) {
            addCriterion("TO_VISITOR_NAME not between", value1, value2, "toVisitorName");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneIsNull() {
            addCriterion("TO_VISITOR_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneIsNotNull() {
            addCriterion("TO_VISITOR_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneEqualTo(String value) {
            addCriterion("TO_VISITOR_PHONE =", value, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneNotEqualTo(String value) {
            addCriterion("TO_VISITOR_PHONE <>", value, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneGreaterThan(String value) {
            addCriterion("TO_VISITOR_PHONE >", value, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("TO_VISITOR_PHONE >=", value, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneLessThan(String value) {
            addCriterion("TO_VISITOR_PHONE <", value, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneLessThanOrEqualTo(String value) {
            addCriterion("TO_VISITOR_PHONE <=", value, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneLike(String value) {
            addCriterion("TO_VISITOR_PHONE like", value, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneNotLike(String value) {
            addCriterion("TO_VISITOR_PHONE not like", value, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneIn(List<String> values) {
            addCriterion("TO_VISITOR_PHONE in", values, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneNotIn(List<String> values) {
            addCriterion("TO_VISITOR_PHONE not in", values, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneBetween(String value1, String value2) {
            addCriterion("TO_VISITOR_PHONE between", value1, value2, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andToVisitorPhoneNotBetween(String value1, String value2) {
            addCriterion("TO_VISITOR_PHONE not between", value1, value2, "toVisitorPhone");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("CAR_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("CAR_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("CAR_NUM =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("CAR_NUM <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("CAR_NUM >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_NUM >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("CAR_NUM <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("CAR_NUM <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("CAR_NUM like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("CAR_NUM not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("CAR_NUM in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("CAR_NUM not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("CAR_NUM between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("CAR_NUM not between", value1, value2, "carNum");
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

        public Criteria andVisitTimeIsNull() {
            addCriterion("VISIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("VISIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(Date value) {
            addCriterion("VISIT_TIME =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(Date value) {
            addCriterion("VISIT_TIME <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(Date value) {
            addCriterion("VISIT_TIME >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VISIT_TIME >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(Date value) {
            addCriterion("VISIT_TIME <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("VISIT_TIME <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<Date> values) {
            addCriterion("VISIT_TIME in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<Date> values) {
            addCriterion("VISIT_TIME not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(Date value1, Date value2) {
            addCriterion("VISIT_TIME between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("VISIT_TIME not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("LEAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("LEAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("LEAVE_TIME =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("LEAVE_TIME <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("LEAVE_TIME >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAVE_TIME >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("LEAVE_TIME <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("LEAVE_TIME <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("LEAVE_TIME in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("LEAVE_TIME not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("LEAVE_TIME between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("LEAVE_TIME not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNull() {
            addCriterion("VISIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNotNull() {
            addCriterion("VISIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeEqualTo(Integer value) {
            addCriterion("VISIT_TYPE =", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotEqualTo(Integer value) {
            addCriterion("VISIT_TYPE <>", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThan(Integer value) {
            addCriterion("VISIT_TYPE >", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISIT_TYPE >=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThan(Integer value) {
            addCriterion("VISIT_TYPE <", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("VISIT_TYPE <=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIn(List<Integer> values) {
            addCriterion("VISIT_TYPE in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotIn(List<Integer> values) {
            addCriterion("VISIT_TYPE not in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_TYPE between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_TYPE not between", value1, value2, "visitType");
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