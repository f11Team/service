package cn.com.wtrj.jx.web.portal.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjEcomPermissionRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjEcomPermissionRelationExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdIsNull() {
            addCriterion("BELONG_TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdIsNotNull() {
            addCriterion("BELONG_TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdEqualTo(Integer value) {
            addCriterion("BELONG_TEACHER_ID =", value, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdNotEqualTo(Integer value) {
            addCriterion("BELONG_TEACHER_ID <>", value, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdGreaterThan(Integer value) {
            addCriterion("BELONG_TEACHER_ID >", value, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TEACHER_ID >=", value, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdLessThan(Integer value) {
            addCriterion("BELONG_TEACHER_ID <", value, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TEACHER_ID <=", value, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdIn(List<Integer> values) {
            addCriterion("BELONG_TEACHER_ID in", values, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdNotIn(List<Integer> values) {
            addCriterion("BELONG_TEACHER_ID not in", values, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TEACHER_ID between", value1, value2, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TEACHER_ID not between", value1, value2, "belongTeacherId");
            return (Criteria) this;
        }

        public Criteria andBelongNameIsNull() {
            addCriterion("BELONG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBelongNameIsNotNull() {
            addCriterion("BELONG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBelongNameEqualTo(String value) {
            addCriterion("BELONG_NAME =", value, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameNotEqualTo(String value) {
            addCriterion("BELONG_NAME <>", value, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameGreaterThan(String value) {
            addCriterion("BELONG_NAME >", value, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameGreaterThanOrEqualTo(String value) {
            addCriterion("BELONG_NAME >=", value, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameLessThan(String value) {
            addCriterion("BELONG_NAME <", value, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameLessThanOrEqualTo(String value) {
            addCriterion("BELONG_NAME <=", value, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameLike(String value) {
            addCriterion("BELONG_NAME like", value, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameNotLike(String value) {
            addCriterion("BELONG_NAME not like", value, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameIn(List<String> values) {
            addCriterion("BELONG_NAME in", values, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameNotIn(List<String> values) {
            addCriterion("BELONG_NAME not in", values, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameBetween(String value1, String value2) {
            addCriterion("BELONG_NAME between", value1, value2, "belongName");
            return (Criteria) this;
        }

        public Criteria andBelongNameNotBetween(String value1, String value2) {
            addCriterion("BELONG_NAME not between", value1, value2, "belongName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeIsNull() {
            addCriterion("MEMBER_SCHOOL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeIsNotNull() {
            addCriterion("MEMBER_SCHOOL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeEqualTo(String value) {
            addCriterion("MEMBER_SCHOOL_CODE =", value, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeNotEqualTo(String value) {
            addCriterion("MEMBER_SCHOOL_CODE <>", value, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeGreaterThan(String value) {
            addCriterion("MEMBER_SCHOOL_CODE >", value, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_SCHOOL_CODE >=", value, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeLessThan(String value) {
            addCriterion("MEMBER_SCHOOL_CODE <", value, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_SCHOOL_CODE <=", value, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeLike(String value) {
            addCriterion("MEMBER_SCHOOL_CODE like", value, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeNotLike(String value) {
            addCriterion("MEMBER_SCHOOL_CODE not like", value, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeIn(List<String> values) {
            addCriterion("MEMBER_SCHOOL_CODE in", values, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeNotIn(List<String> values) {
            addCriterion("MEMBER_SCHOOL_CODE not in", values, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeBetween(String value1, String value2) {
            addCriterion("MEMBER_SCHOOL_CODE between", value1, value2, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolCodeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_SCHOOL_CODE not between", value1, value2, "memberSchoolCode");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameIsNull() {
            addCriterion("MEMBER_SCHOOL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameIsNotNull() {
            addCriterion("MEMBER_SCHOOL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameEqualTo(String value) {
            addCriterion("MEMBER_SCHOOL_NAME =", value, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameNotEqualTo(String value) {
            addCriterion("MEMBER_SCHOOL_NAME <>", value, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameGreaterThan(String value) {
            addCriterion("MEMBER_SCHOOL_NAME >", value, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_SCHOOL_NAME >=", value, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameLessThan(String value) {
            addCriterion("MEMBER_SCHOOL_NAME <", value, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_SCHOOL_NAME <=", value, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameLike(String value) {
            addCriterion("MEMBER_SCHOOL_NAME like", value, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameNotLike(String value) {
            addCriterion("MEMBER_SCHOOL_NAME not like", value, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameIn(List<String> values) {
            addCriterion("MEMBER_SCHOOL_NAME in", values, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameNotIn(List<String> values) {
            addCriterion("MEMBER_SCHOOL_NAME not in", values, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameBetween(String value1, String value2) {
            addCriterion("MEMBER_SCHOOL_NAME between", value1, value2, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberSchoolNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_SCHOOL_NAME not between", value1, value2, "memberSchoolName");
            return (Criteria) this;
        }

        public Criteria andMemberStageIsNull() {
            addCriterion("MEMBER_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andMemberStageIsNotNull() {
            addCriterion("MEMBER_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStageEqualTo(String value) {
            addCriterion("MEMBER_STAGE =", value, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageNotEqualTo(String value) {
            addCriterion("MEMBER_STAGE <>", value, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageGreaterThan(String value) {
            addCriterion("MEMBER_STAGE >", value, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_STAGE >=", value, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageLessThan(String value) {
            addCriterion("MEMBER_STAGE <", value, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_STAGE <=", value, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageLike(String value) {
            addCriterion("MEMBER_STAGE like", value, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageNotLike(String value) {
            addCriterion("MEMBER_STAGE not like", value, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageIn(List<String> values) {
            addCriterion("MEMBER_STAGE in", values, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageNotIn(List<String> values) {
            addCriterion("MEMBER_STAGE not in", values, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageBetween(String value1, String value2) {
            addCriterion("MEMBER_STAGE between", value1, value2, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberStageNotBetween(String value1, String value2) {
            addCriterion("MEMBER_STAGE not between", value1, value2, "memberStage");
            return (Criteria) this;
        }

        public Criteria andMemberGradeIsNull() {
            addCriterion("MEMBER_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andMemberGradeIsNotNull() {
            addCriterion("MEMBER_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberGradeEqualTo(Integer value) {
            addCriterion("MEMBER_GRADE =", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeNotEqualTo(Integer value) {
            addCriterion("MEMBER_GRADE <>", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeGreaterThan(Integer value) {
            addCriterion("MEMBER_GRADE >", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_GRADE >=", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeLessThan(Integer value) {
            addCriterion("MEMBER_GRADE <", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeLessThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_GRADE <=", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeIn(List<Integer> values) {
            addCriterion("MEMBER_GRADE in", values, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeNotIn(List<Integer> values) {
            addCriterion("MEMBER_GRADE not in", values, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_GRADE between", value1, value2, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_GRADE not between", value1, value2, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdIsNull() {
            addCriterion("MEMBER_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdIsNotNull() {
            addCriterion("MEMBER_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdEqualTo(Integer value) {
            addCriterion("MEMBER_CLASS_ID =", value, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdNotEqualTo(Integer value) {
            addCriterion("MEMBER_CLASS_ID <>", value, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdGreaterThan(Integer value) {
            addCriterion("MEMBER_CLASS_ID >", value, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_CLASS_ID >=", value, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdLessThan(Integer value) {
            addCriterion("MEMBER_CLASS_ID <", value, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_CLASS_ID <=", value, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdIn(List<Integer> values) {
            addCriterion("MEMBER_CLASS_ID in", values, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdNotIn(List<Integer> values) {
            addCriterion("MEMBER_CLASS_ID not in", values, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_CLASS_ID between", value1, value2, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_CLASS_ID not between", value1, value2, "memberClassId");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameIsNull() {
            addCriterion("MEMBER_CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameIsNotNull() {
            addCriterion("MEMBER_CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameEqualTo(String value) {
            addCriterion("MEMBER_CLASS_NAME =", value, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameNotEqualTo(String value) {
            addCriterion("MEMBER_CLASS_NAME <>", value, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameGreaterThan(String value) {
            addCriterion("MEMBER_CLASS_NAME >", value, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_CLASS_NAME >=", value, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameLessThan(String value) {
            addCriterion("MEMBER_CLASS_NAME <", value, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_CLASS_NAME <=", value, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameLike(String value) {
            addCriterion("MEMBER_CLASS_NAME like", value, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameNotLike(String value) {
            addCriterion("MEMBER_CLASS_NAME not like", value, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameIn(List<String> values) {
            addCriterion("MEMBER_CLASS_NAME in", values, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameNotIn(List<String> values) {
            addCriterion("MEMBER_CLASS_NAME not in", values, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameBetween(String value1, String value2) {
            addCriterion("MEMBER_CLASS_NAME between", value1, value2, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_CLASS_NAME not between", value1, value2, "memberClassName");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoIsNull() {
            addCriterion("MEMBER_CLASS_NO is null");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoIsNotNull() {
            addCriterion("MEMBER_CLASS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoEqualTo(String value) {
            addCriterion("MEMBER_CLASS_NO =", value, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoNotEqualTo(String value) {
            addCriterion("MEMBER_CLASS_NO <>", value, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoGreaterThan(String value) {
            addCriterion("MEMBER_CLASS_NO >", value, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_CLASS_NO >=", value, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoLessThan(String value) {
            addCriterion("MEMBER_CLASS_NO <", value, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_CLASS_NO <=", value, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoLike(String value) {
            addCriterion("MEMBER_CLASS_NO like", value, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoNotLike(String value) {
            addCriterion("MEMBER_CLASS_NO not like", value, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoIn(List<String> values) {
            addCriterion("MEMBER_CLASS_NO in", values, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoNotIn(List<String> values) {
            addCriterion("MEMBER_CLASS_NO not in", values, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoBetween(String value1, String value2) {
            addCriterion("MEMBER_CLASS_NO between", value1, value2, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberClassNoNotBetween(String value1, String value2) {
            addCriterion("MEMBER_CLASS_NO not between", value1, value2, "memberClassNo");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeIsNull() {
            addCriterion("MEMBER_COURSE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeIsNotNull() {
            addCriterion("MEMBER_COURSE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeEqualTo(String value) {
            addCriterion("MEMBER_COURSE_CODE =", value, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeNotEqualTo(String value) {
            addCriterion("MEMBER_COURSE_CODE <>", value, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeGreaterThan(String value) {
            addCriterion("MEMBER_COURSE_CODE >", value, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_COURSE_CODE >=", value, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeLessThan(String value) {
            addCriterion("MEMBER_COURSE_CODE <", value, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_COURSE_CODE <=", value, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeLike(String value) {
            addCriterion("MEMBER_COURSE_CODE like", value, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeNotLike(String value) {
            addCriterion("MEMBER_COURSE_CODE not like", value, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeIn(List<String> values) {
            addCriterion("MEMBER_COURSE_CODE in", values, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeNotIn(List<String> values) {
            addCriterion("MEMBER_COURSE_CODE not in", values, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeBetween(String value1, String value2) {
            addCriterion("MEMBER_COURSE_CODE between", value1, value2, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberCourseCodeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_COURSE_CODE not between", value1, value2, "memberCourseCode");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("MEMBER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("MEMBER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("MEMBER_TYPE =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("MEMBER_TYPE <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("MEMBER_TYPE >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_TYPE >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("MEMBER_TYPE <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_TYPE <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("MEMBER_TYPE like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("MEMBER_TYPE not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("MEMBER_TYPE in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("MEMBER_TYPE not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("MEMBER_TYPE between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_TYPE not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameIsNull() {
            addCriterion("MEMBER_COURSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameIsNotNull() {
            addCriterion("MEMBER_COURSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameEqualTo(String value) {
            addCriterion("MEMBER_COURSE_NAME =", value, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameNotEqualTo(String value) {
            addCriterion("MEMBER_COURSE_NAME <>", value, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameGreaterThan(String value) {
            addCriterion("MEMBER_COURSE_NAME >", value, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_COURSE_NAME >=", value, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameLessThan(String value) {
            addCriterion("MEMBER_COURSE_NAME <", value, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_COURSE_NAME <=", value, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameLike(String value) {
            addCriterion("MEMBER_COURSE_NAME like", value, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameNotLike(String value) {
            addCriterion("MEMBER_COURSE_NAME not like", value, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameIn(List<String> values) {
            addCriterion("MEMBER_COURSE_NAME in", values, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameNotIn(List<String> values) {
            addCriterion("MEMBER_COURSE_NAME not in", values, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameBetween(String value1, String value2) {
            addCriterion("MEMBER_COURSE_NAME between", value1, value2, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberCourseNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_COURSE_NAME not between", value1, value2, "memberCourseName");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdIsNull() {
            addCriterion("MEMBER_DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdIsNotNull() {
            addCriterion("MEMBER_DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdEqualTo(String value) {
            addCriterion("MEMBER_DEPT_ID =", value, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdNotEqualTo(String value) {
            addCriterion("MEMBER_DEPT_ID <>", value, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdGreaterThan(String value) {
            addCriterion("MEMBER_DEPT_ID >", value, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_DEPT_ID >=", value, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdLessThan(String value) {
            addCriterion("MEMBER_DEPT_ID <", value, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_DEPT_ID <=", value, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdLike(String value) {
            addCriterion("MEMBER_DEPT_ID like", value, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdNotLike(String value) {
            addCriterion("MEMBER_DEPT_ID not like", value, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdIn(List<String> values) {
            addCriterion("MEMBER_DEPT_ID in", values, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdNotIn(List<String> values) {
            addCriterion("MEMBER_DEPT_ID not in", values, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdBetween(String value1, String value2) {
            addCriterion("MEMBER_DEPT_ID between", value1, value2, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberDeptIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_DEPT_ID not between", value1, value2, "memberDeptId");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinIsNull() {
            addCriterion("MEMBER_NAME_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinIsNotNull() {
            addCriterion("MEMBER_NAME_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinEqualTo(String value) {
            addCriterion("MEMBER_NAME_PINYIN =", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinNotEqualTo(String value) {
            addCriterion("MEMBER_NAME_PINYIN <>", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinGreaterThan(String value) {
            addCriterion("MEMBER_NAME_PINYIN >", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME_PINYIN >=", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinLessThan(String value) {
            addCriterion("MEMBER_NAME_PINYIN <", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME_PINYIN <=", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinLike(String value) {
            addCriterion("MEMBER_NAME_PINYIN like", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinNotLike(String value) {
            addCriterion("MEMBER_NAME_PINYIN not like", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinIn(List<String> values) {
            addCriterion("MEMBER_NAME_PINYIN in", values, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinNotIn(List<String> values) {
            addCriterion("MEMBER_NAME_PINYIN not in", values, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME_PINYIN between", value1, value2, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME_PINYIN not between", value1, value2, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinIsNull() {
            addCriterion("MEMBER_NAME_JIANPIN is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinIsNotNull() {
            addCriterion("MEMBER_NAME_JIANPIN is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinEqualTo(String value) {
            addCriterion("MEMBER_NAME_JIANPIN =", value, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinNotEqualTo(String value) {
            addCriterion("MEMBER_NAME_JIANPIN <>", value, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinGreaterThan(String value) {
            addCriterion("MEMBER_NAME_JIANPIN >", value, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME_JIANPIN >=", value, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinLessThan(String value) {
            addCriterion("MEMBER_NAME_JIANPIN <", value, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME_JIANPIN <=", value, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinLike(String value) {
            addCriterion("MEMBER_NAME_JIANPIN like", value, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinNotLike(String value) {
            addCriterion("MEMBER_NAME_JIANPIN not like", value, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinIn(List<String> values) {
            addCriterion("MEMBER_NAME_JIANPIN in", values, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinNotIn(List<String> values) {
            addCriterion("MEMBER_NAME_JIANPIN not in", values, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME_JIANPIN between", value1, value2, "memberNameJianpin");
            return (Criteria) this;
        }

        public Criteria andMemberNameJianpinNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME_JIANPIN not between", value1, value2, "memberNameJianpin");
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