package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class WtrjTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjTeacherExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherIsNull() {
            addCriterion("BL_HEAD_TEACHER is null");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherIsNotNull() {
            addCriterion("BL_HEAD_TEACHER is not null");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherEqualTo(String value) {
            addCriterion("BL_HEAD_TEACHER =", value, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherNotEqualTo(String value) {
            addCriterion("BL_HEAD_TEACHER <>", value, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherGreaterThan(String value) {
            addCriterion("BL_HEAD_TEACHER >", value, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("BL_HEAD_TEACHER >=", value, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherLessThan(String value) {
            addCriterion("BL_HEAD_TEACHER <", value, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherLessThanOrEqualTo(String value) {
            addCriterion("BL_HEAD_TEACHER <=", value, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherLike(String value) {
            addCriterion("BL_HEAD_TEACHER like", value, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherNotLike(String value) {
            addCriterion("BL_HEAD_TEACHER not like", value, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherIn(List<String> values) {
            addCriterion("BL_HEAD_TEACHER in", values, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherNotIn(List<String> values) {
            addCriterion("BL_HEAD_TEACHER not in", values, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherBetween(String value1, String value2) {
            addCriterion("BL_HEAD_TEACHER between", value1, value2, "blHeadTeacher");
            return (Criteria) this;
        }

        public Criteria andBlHeadTeacherNotBetween(String value1, String value2) {
            addCriterion("BL_HEAD_TEACHER not between", value1, value2, "blHeadTeacher");
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

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNull() {
            addCriterion("JOB_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("JOB_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(String value) {
            addCriterion("JOB_NUMBER =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(String value) {
            addCriterion("JOB_NUMBER <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(String value) {
            addCriterion("JOB_NUMBER >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NUMBER >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(String value) {
            addCriterion("JOB_NUMBER <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(String value) {
            addCriterion("JOB_NUMBER <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLike(String value) {
            addCriterion("JOB_NUMBER like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotLike(String value) {
            addCriterion("JOB_NUMBER not like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<String> values) {
            addCriterion("JOB_NUMBER in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<String> values) {
            addCriterion("JOB_NUMBER not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(String value1, String value2) {
            addCriterion("JOB_NUMBER between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(String value1, String value2) {
            addCriterion("JOB_NUMBER not between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderIsNull() {
            addCriterion("BL_GRADE_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderIsNotNull() {
            addCriterion("BL_GRADE_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderEqualTo(String value) {
            addCriterion("BL_GRADE_LEADER =", value, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderNotEqualTo(String value) {
            addCriterion("BL_GRADE_LEADER <>", value, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderGreaterThan(String value) {
            addCriterion("BL_GRADE_LEADER >", value, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("BL_GRADE_LEADER >=", value, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderLessThan(String value) {
            addCriterion("BL_GRADE_LEADER <", value, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderLessThanOrEqualTo(String value) {
            addCriterion("BL_GRADE_LEADER <=", value, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderLike(String value) {
            addCriterion("BL_GRADE_LEADER like", value, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderNotLike(String value) {
            addCriterion("BL_GRADE_LEADER not like", value, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderIn(List<String> values) {
            addCriterion("BL_GRADE_LEADER in", values, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderNotIn(List<String> values) {
            addCriterion("BL_GRADE_LEADER not in", values, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderBetween(String value1, String value2) {
            addCriterion("BL_GRADE_LEADER between", value1, value2, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlGradeLeaderNotBetween(String value1, String value2) {
            addCriterion("BL_GRADE_LEADER not between", value1, value2, "blGradeLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderIsNull() {
            addCriterion("BL_RESEARCH_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderIsNotNull() {
            addCriterion("BL_RESEARCH_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderEqualTo(String value) {
            addCriterion("BL_RESEARCH_LEADER =", value, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderNotEqualTo(String value) {
            addCriterion("BL_RESEARCH_LEADER <>", value, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderGreaterThan(String value) {
            addCriterion("BL_RESEARCH_LEADER >", value, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("BL_RESEARCH_LEADER >=", value, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderLessThan(String value) {
            addCriterion("BL_RESEARCH_LEADER <", value, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderLessThanOrEqualTo(String value) {
            addCriterion("BL_RESEARCH_LEADER <=", value, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderLike(String value) {
            addCriterion("BL_RESEARCH_LEADER like", value, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderNotLike(String value) {
            addCriterion("BL_RESEARCH_LEADER not like", value, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderIn(List<String> values) {
            addCriterion("BL_RESEARCH_LEADER in", values, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderNotIn(List<String> values) {
            addCriterion("BL_RESEARCH_LEADER not in", values, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderBetween(String value1, String value2) {
            addCriterion("BL_RESEARCH_LEADER between", value1, value2, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlResearchLeaderNotBetween(String value1, String value2) {
            addCriterion("BL_RESEARCH_LEADER not between", value1, value2, "blResearchLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderIsNull() {
            addCriterion("BL_COURSE_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderIsNotNull() {
            addCriterion("BL_COURSE_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderEqualTo(String value) {
            addCriterion("BL_COURSE_LEADER =", value, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderNotEqualTo(String value) {
            addCriterion("BL_COURSE_LEADER <>", value, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderGreaterThan(String value) {
            addCriterion("BL_COURSE_LEADER >", value, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("BL_COURSE_LEADER >=", value, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderLessThan(String value) {
            addCriterion("BL_COURSE_LEADER <", value, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderLessThanOrEqualTo(String value) {
            addCriterion("BL_COURSE_LEADER <=", value, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderLike(String value) {
            addCriterion("BL_COURSE_LEADER like", value, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderNotLike(String value) {
            addCriterion("BL_COURSE_LEADER not like", value, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderIn(List<String> values) {
            addCriterion("BL_COURSE_LEADER in", values, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderNotIn(List<String> values) {
            addCriterion("BL_COURSE_LEADER not in", values, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderBetween(String value1, String value2) {
            addCriterion("BL_COURSE_LEADER between", value1, value2, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andBlCourseLeaderNotBetween(String value1, String value2) {
            addCriterion("BL_COURSE_LEADER not between", value1, value2, "blCourseLeader");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("PHOTO not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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