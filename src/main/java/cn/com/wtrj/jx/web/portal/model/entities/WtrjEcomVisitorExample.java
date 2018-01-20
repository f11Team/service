package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjEcomVisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjEcomVisitorExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("TEACHER_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("TEACHER_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("TEACHER_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("TEACHER_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("TEACHER_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("TEACHER_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_ID not between", value1, value2, "teacherId");
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

        public Criteria andVisitTypeEqualTo(String value) {
            addCriterion("VISIT_TYPE =", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotEqualTo(String value) {
            addCriterion("VISIT_TYPE <>", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThan(String value) {
            addCriterion("VISIT_TYPE >", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_TYPE >=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThan(String value) {
            addCriterion("VISIT_TYPE <", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThanOrEqualTo(String value) {
            addCriterion("VISIT_TYPE <=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLike(String value) {
            addCriterion("VISIT_TYPE like", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotLike(String value) {
            addCriterion("VISIT_TYPE not like", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIn(List<String> values) {
            addCriterion("VISIT_TYPE in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotIn(List<String> values) {
            addCriterion("VISIT_TYPE not in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeBetween(String value1, String value2) {
            addCriterion("VISIT_TYPE between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotBetween(String value1, String value2) {
            addCriterion("VISIT_TYPE not between", value1, value2, "visitType");
            return (Criteria) this;
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

        public Criteria andVisitTimeEqualTo(String value) {
            addCriterion("VISIT_TIME =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(String value) {
            addCriterion("VISIT_TIME <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(String value) {
            addCriterion("VISIT_TIME >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_TIME >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(String value) {
            addCriterion("VISIT_TIME <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(String value) {
            addCriterion("VISIT_TIME <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLike(String value) {
            addCriterion("VISIT_TIME like", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotLike(String value) {
            addCriterion("VISIT_TIME not like", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<String> values) {
            addCriterion("VISIT_TIME in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<String> values) {
            addCriterion("VISIT_TIME not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(String value1, String value2) {
            addCriterion("VISIT_TIME between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(String value1, String value2) {
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

        public Criteria andLeaveTimeEqualTo(String value) {
            addCriterion("LEAVE_TIME =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(String value) {
            addCriterion("LEAVE_TIME <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(String value) {
            addCriterion("LEAVE_TIME >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(String value) {
            addCriterion("LEAVE_TIME <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLike(String value) {
            addCriterion("LEAVE_TIME like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotLike(String value) {
            addCriterion("LEAVE_TIME not like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<String> values) {
            addCriterion("LEAVE_TIME in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<String> values) {
            addCriterion("LEAVE_TIME not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNull() {
            addCriterion("DEL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNotNull() {
            addCriterion("DEL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlgEqualTo(String value) {
            addCriterion("DEL_FLG =", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotEqualTo(String value) {
            addCriterion("DEL_FLG <>", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThan(String value) {
            addCriterion("DEL_FLG >", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("DEL_FLG >=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThan(String value) {
            addCriterion("DEL_FLG <", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThanOrEqualTo(String value) {
            addCriterion("DEL_FLG <=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLike(String value) {
            addCriterion("DEL_FLG like", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotLike(String value) {
            addCriterion("DEL_FLG not like", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgIn(List<String> values) {
            addCriterion("DEL_FLG in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotIn(List<String> values) {
            addCriterion("DEL_FLG not in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgBetween(String value1, String value2) {
            addCriterion("DEL_FLG between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotBetween(String value1, String value2) {
            addCriterion("DEL_FLG not between", value1, value2, "delFlg");
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

        public Criteria andQrPicUrlIsNull() {
            addCriterion("QR_PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlIsNotNull() {
            addCriterion("QR_PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlEqualTo(String value) {
            addCriterion("QR_PIC_URL =", value, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlNotEqualTo(String value) {
            addCriterion("QR_PIC_URL <>", value, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlGreaterThan(String value) {
            addCriterion("QR_PIC_URL >", value, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("QR_PIC_URL >=", value, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlLessThan(String value) {
            addCriterion("QR_PIC_URL <", value, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlLessThanOrEqualTo(String value) {
            addCriterion("QR_PIC_URL <=", value, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlLike(String value) {
            addCriterion("QR_PIC_URL like", value, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlNotLike(String value) {
            addCriterion("QR_PIC_URL not like", value, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlIn(List<String> values) {
            addCriterion("QR_PIC_URL in", values, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlNotIn(List<String> values) {
            addCriterion("QR_PIC_URL not in", values, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlBetween(String value1, String value2) {
            addCriterion("QR_PIC_URL between", value1, value2, "qrPicUrl");
            return (Criteria) this;
        }

        public Criteria andQrPicUrlNotBetween(String value1, String value2) {
            addCriterion("QR_PIC_URL not between", value1, value2, "qrPicUrl");
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