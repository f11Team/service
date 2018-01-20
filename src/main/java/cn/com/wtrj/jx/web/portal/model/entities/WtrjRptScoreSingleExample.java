package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WtrjRptScoreSingleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjRptScoreSingleExample() {
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

        public Criteria andExamInsIdIsNull() {
            addCriterion("EXAM_INS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExamInsIdIsNotNull() {
            addCriterion("EXAM_INS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExamInsIdEqualTo(String value) {
            addCriterion("EXAM_INS_ID =", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotEqualTo(String value) {
            addCriterion("EXAM_INS_ID <>", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdGreaterThan(String value) {
            addCriterion("EXAM_INS_ID >", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_INS_ID >=", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdLessThan(String value) {
            addCriterion("EXAM_INS_ID <", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdLessThanOrEqualTo(String value) {
            addCriterion("EXAM_INS_ID <=", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdLike(String value) {
            addCriterion("EXAM_INS_ID like", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotLike(String value) {
            addCriterion("EXAM_INS_ID not like", value, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdIn(List<String> values) {
            addCriterion("EXAM_INS_ID in", values, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotIn(List<String> values) {
            addCriterion("EXAM_INS_ID not in", values, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdBetween(String value1, String value2) {
            addCriterion("EXAM_INS_ID between", value1, value2, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsIdNotBetween(String value1, String value2) {
            addCriterion("EXAM_INS_ID not between", value1, value2, "examInsId");
            return (Criteria) this;
        }

        public Criteria andExamInsNameIsNull() {
            addCriterion("EXAM_INS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExamInsNameIsNotNull() {
            addCriterion("EXAM_INS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExamInsNameEqualTo(String value) {
            addCriterion("EXAM_INS_NAME =", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameNotEqualTo(String value) {
            addCriterion("EXAM_INS_NAME <>", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameGreaterThan(String value) {
            addCriterion("EXAM_INS_NAME >", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_INS_NAME >=", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameLessThan(String value) {
            addCriterion("EXAM_INS_NAME <", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameLessThanOrEqualTo(String value) {
            addCriterion("EXAM_INS_NAME <=", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameLike(String value) {
            addCriterion("EXAM_INS_NAME like", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameNotLike(String value) {
            addCriterion("EXAM_INS_NAME not like", value, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameIn(List<String> values) {
            addCriterion("EXAM_INS_NAME in", values, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameNotIn(List<String> values) {
            addCriterion("EXAM_INS_NAME not in", values, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameBetween(String value1, String value2) {
            addCriterion("EXAM_INS_NAME between", value1, value2, "examInsName");
            return (Criteria) this;
        }

        public Criteria andExamInsNameNotBetween(String value1, String value2) {
            addCriterion("EXAM_INS_NAME not between", value1, value2, "examInsName");
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

        public Criteria andSchoolNameIsNull() {
            addCriterion("SCHOOL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("SCHOOL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("SCHOOL_NAME =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("SCHOOL_NAME <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("SCHOOL_NAME >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_NAME >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("SCHOOL_NAME <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_NAME <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("SCHOOL_NAME like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("SCHOOL_NAME not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("SCHOOL_NAME in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("SCHOOL_NAME not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("SCHOOL_NAME between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_NAME not between", value1, value2, "schoolName");
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

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("CLASS_ID like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("CLASS_ID not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("CLASS_NAME =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("CLASS_NAME <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("CLASS_NAME >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("CLASS_NAME <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("CLASS_NAME like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("CLASS_NAME not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("CLASS_NAME in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("CLASS_NAME not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("CLASS_NAME between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("CLASS_NAME not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIsNull() {
            addCriterion("COURSE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIsNotNull() {
            addCriterion("COURSE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCodeEqualTo(String value) {
            addCriterion("COURSE_CODE =", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotEqualTo(String value) {
            addCriterion("COURSE_CODE <>", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeGreaterThan(String value) {
            addCriterion("COURSE_CODE >", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_CODE >=", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLessThan(String value) {
            addCriterion("COURSE_CODE <", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLessThanOrEqualTo(String value) {
            addCriterion("COURSE_CODE <=", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLike(String value) {
            addCriterion("COURSE_CODE like", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotLike(String value) {
            addCriterion("COURSE_CODE not like", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIn(List<String> values) {
            addCriterion("COURSE_CODE in", values, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotIn(List<String> values) {
            addCriterion("COURSE_CODE not in", values, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeBetween(String value1, String value2) {
            addCriterion("COURSE_CODE between", value1, value2, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotBetween(String value1, String value2) {
            addCriterion("COURSE_CODE not between", value1, value2, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("COURSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("COURSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("COURSE_NAME =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("COURSE_NAME <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("COURSE_NAME >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("COURSE_NAME <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("COURSE_NAME like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("COURSE_NAME not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("COURSE_NAME in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("COURSE_NAME not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("COURSE_NAME between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("COURSE_NAME not between", value1, value2, "courseName");
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

        public Criteria andStudentCodeIsNull() {
            addCriterion("STUDENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStudentCodeIsNotNull() {
            addCriterion("STUDENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCodeEqualTo(String value) {
            addCriterion("STUDENT_CODE =", value, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeNotEqualTo(String value) {
            addCriterion("STUDENT_CODE <>", value, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeGreaterThan(String value) {
            addCriterion("STUDENT_CODE >", value, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_CODE >=", value, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeLessThan(String value) {
            addCriterion("STUDENT_CODE <", value, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_CODE <=", value, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeLike(String value) {
            addCriterion("STUDENT_CODE like", value, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeNotLike(String value) {
            addCriterion("STUDENT_CODE not like", value, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeIn(List<String> values) {
            addCriterion("STUDENT_CODE in", values, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeNotIn(List<String> values) {
            addCriterion("STUDENT_CODE not in", values, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeBetween(String value1, String value2) {
            addCriterion("STUDENT_CODE between", value1, value2, "studentCode");
            return (Criteria) this;
        }

        public Criteria andStudentCodeNotBetween(String value1, String value2) {
            addCriterion("STUDENT_CODE not between", value1, value2, "studentCode");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNull() {
            addCriterion("AVERAGE_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNotNull() {
            addCriterion("AVERAGE_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_SCORE =", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_SCORE <>", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThan(BigDecimal value) {
            addCriterion("AVERAGE_SCORE >", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_SCORE >=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThan(BigDecimal value) {
            addCriterion("AVERAGE_SCORE <", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_SCORE <=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIn(List<BigDecimal> values) {
            addCriterion("AVERAGE_SCORE in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotIn(List<BigDecimal> values) {
            addCriterion("AVERAGE_SCORE not in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVERAGE_SCORE between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVERAGE_SCORE not between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreIsNull() {
            addCriterion("CLASS_TOP_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreIsNotNull() {
            addCriterion("CLASS_TOP_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreEqualTo(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE =", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreNotEqualTo(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE <>", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreGreaterThan(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE >", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE >=", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreLessThan(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE <", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_TOP_SCORE <=", value, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreIn(List<BigDecimal> values) {
            addCriterion("CLASS_TOP_SCORE in", values, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreNotIn(List<BigDecimal> values) {
            addCriterion("CLASS_TOP_SCORE not in", values, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_TOP_SCORE between", value1, value2, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassTopScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_TOP_SCORE not between", value1, value2, "classTopScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreIsNull() {
            addCriterion("CLASS_BOTTOM_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreIsNotNull() {
            addCriterion("CLASS_BOTTOM_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreEqualTo(BigDecimal value) {
            addCriterion("CLASS_BOTTOM_SCORE =", value, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreNotEqualTo(BigDecimal value) {
            addCriterion("CLASS_BOTTOM_SCORE <>", value, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreGreaterThan(BigDecimal value) {
            addCriterion("CLASS_BOTTOM_SCORE >", value, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_BOTTOM_SCORE >=", value, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreLessThan(BigDecimal value) {
            addCriterion("CLASS_BOTTOM_SCORE <", value, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_BOTTOM_SCORE <=", value, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreIn(List<BigDecimal> values) {
            addCriterion("CLASS_BOTTOM_SCORE in", values, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreNotIn(List<BigDecimal> values) {
            addCriterion("CLASS_BOTTOM_SCORE not in", values, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_BOTTOM_SCORE between", value1, value2, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andClassBottomScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_BOTTOM_SCORE not between", value1, value2, "classBottomScore");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberIsNull() {
            addCriterion("ORDER_CLASS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberIsNotNull() {
            addCriterion("ORDER_CLASS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberEqualTo(Integer value) {
            addCriterion("ORDER_CLASS_NUMBER =", value, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberNotEqualTo(Integer value) {
            addCriterion("ORDER_CLASS_NUMBER <>", value, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberGreaterThan(Integer value) {
            addCriterion("ORDER_CLASS_NUMBER >", value, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_CLASS_NUMBER >=", value, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberLessThan(Integer value) {
            addCriterion("ORDER_CLASS_NUMBER <", value, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_CLASS_NUMBER <=", value, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberIn(List<Integer> values) {
            addCriterion("ORDER_CLASS_NUMBER in", values, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberNotIn(List<Integer> values) {
            addCriterion("ORDER_CLASS_NUMBER not in", values, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_CLASS_NUMBER between", value1, value2, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andOrderClassNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_CLASS_NUMBER not between", value1, value2, "orderClassNumber");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreIsNull() {
            addCriterion("AVERAGE_GRADE_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreIsNotNull() {
            addCriterion("AVERAGE_GRADE_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_GRADE_SCORE =", value, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreNotEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_GRADE_SCORE <>", value, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreGreaterThan(BigDecimal value) {
            addCriterion("AVERAGE_GRADE_SCORE >", value, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_GRADE_SCORE >=", value, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreLessThan(BigDecimal value) {
            addCriterion("AVERAGE_GRADE_SCORE <", value, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVERAGE_GRADE_SCORE <=", value, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreIn(List<BigDecimal> values) {
            addCriterion("AVERAGE_GRADE_SCORE in", values, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreNotIn(List<BigDecimal> values) {
            addCriterion("AVERAGE_GRADE_SCORE not in", values, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVERAGE_GRADE_SCORE between", value1, value2, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andAverageGradeScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVERAGE_GRADE_SCORE not between", value1, value2, "averageGradeScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreIsNull() {
            addCriterion("GRADE_TOP_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreIsNotNull() {
            addCriterion("GRADE_TOP_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreEqualTo(BigDecimal value) {
            addCriterion("GRADE_TOP_SCORE =", value, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreNotEqualTo(BigDecimal value) {
            addCriterion("GRADE_TOP_SCORE <>", value, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreGreaterThan(BigDecimal value) {
            addCriterion("GRADE_TOP_SCORE >", value, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE_TOP_SCORE >=", value, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreLessThan(BigDecimal value) {
            addCriterion("GRADE_TOP_SCORE <", value, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE_TOP_SCORE <=", value, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreIn(List<BigDecimal> values) {
            addCriterion("GRADE_TOP_SCORE in", values, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreNotIn(List<BigDecimal> values) {
            addCriterion("GRADE_TOP_SCORE not in", values, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE_TOP_SCORE between", value1, value2, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeTopScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE_TOP_SCORE not between", value1, value2, "gradeTopScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreIsNull() {
            addCriterion("GRADE_BOTTOM_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreIsNotNull() {
            addCriterion("GRADE_BOTTOM_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreEqualTo(BigDecimal value) {
            addCriterion("GRADE_BOTTOM_SCORE =", value, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreNotEqualTo(BigDecimal value) {
            addCriterion("GRADE_BOTTOM_SCORE <>", value, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreGreaterThan(BigDecimal value) {
            addCriterion("GRADE_BOTTOM_SCORE >", value, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE_BOTTOM_SCORE >=", value, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreLessThan(BigDecimal value) {
            addCriterion("GRADE_BOTTOM_SCORE <", value, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE_BOTTOM_SCORE <=", value, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreIn(List<BigDecimal> values) {
            addCriterion("GRADE_BOTTOM_SCORE in", values, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreNotIn(List<BigDecimal> values) {
            addCriterion("GRADE_BOTTOM_SCORE not in", values, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE_BOTTOM_SCORE between", value1, value2, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andGradeBottomScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE_BOTTOM_SCORE not between", value1, value2, "gradeBottomScore");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberIsNull() {
            addCriterion("ORDER_GRADE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberIsNotNull() {
            addCriterion("ORDER_GRADE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberEqualTo(Integer value) {
            addCriterion("ORDER_GRADE_NUMBER =", value, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberNotEqualTo(Integer value) {
            addCriterion("ORDER_GRADE_NUMBER <>", value, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberGreaterThan(Integer value) {
            addCriterion("ORDER_GRADE_NUMBER >", value, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_GRADE_NUMBER >=", value, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberLessThan(Integer value) {
            addCriterion("ORDER_GRADE_NUMBER <", value, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_GRADE_NUMBER <=", value, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberIn(List<Integer> values) {
            addCriterion("ORDER_GRADE_NUMBER in", values, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberNotIn(List<Integer> values) {
            addCriterion("ORDER_GRADE_NUMBER not in", values, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_GRADE_NUMBER between", value1, value2, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGradeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_GRADE_NUMBER not between", value1, value2, "orderGradeNumber");
            return (Criteria) this;
        }

        public Criteria andScoreMultiIsNull() {
            addCriterion("SCORE_MULTI is null");
            return (Criteria) this;
        }

        public Criteria andScoreMultiIsNotNull() {
            addCriterion("SCORE_MULTI is not null");
            return (Criteria) this;
        }

        public Criteria andScoreMultiEqualTo(String value) {
            addCriterion("SCORE_MULTI =", value, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiNotEqualTo(String value) {
            addCriterion("SCORE_MULTI <>", value, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiGreaterThan(String value) {
            addCriterion("SCORE_MULTI >", value, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE_MULTI >=", value, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiLessThan(String value) {
            addCriterion("SCORE_MULTI <", value, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiLessThanOrEqualTo(String value) {
            addCriterion("SCORE_MULTI <=", value, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiLike(String value) {
            addCriterion("SCORE_MULTI like", value, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiNotLike(String value) {
            addCriterion("SCORE_MULTI not like", value, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiIn(List<String> values) {
            addCriterion("SCORE_MULTI in", values, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiNotIn(List<String> values) {
            addCriterion("SCORE_MULTI not in", values, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiBetween(String value1, String value2) {
            addCriterion("SCORE_MULTI between", value1, value2, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreMultiNotBetween(String value1, String value2) {
            addCriterion("SCORE_MULTI not between", value1, value2, "scoreMulti");
            return (Criteria) this;
        }

        public Criteria andScoreAIsNull() {
            addCriterion("SCORE_A is null");
            return (Criteria) this;
        }

        public Criteria andScoreAIsNotNull() {
            addCriterion("SCORE_A is not null");
            return (Criteria) this;
        }

        public Criteria andScoreAEqualTo(BigDecimal value) {
            addCriterion("SCORE_A =", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreANotEqualTo(BigDecimal value) {
            addCriterion("SCORE_A <>", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreAGreaterThan(BigDecimal value) {
            addCriterion("SCORE_A >", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A >=", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreALessThan(BigDecimal value) {
            addCriterion("SCORE_A <", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreALessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_A <=", value, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreAIn(List<BigDecimal> values) {
            addCriterion("SCORE_A in", values, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreANotIn(List<BigDecimal> values) {
            addCriterion("SCORE_A not in", values, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A between", value1, value2, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_A not between", value1, value2, "scoreA");
            return (Criteria) this;
        }

        public Criteria andScoreBIsNull() {
            addCriterion("SCORE_B is null");
            return (Criteria) this;
        }

        public Criteria andScoreBIsNotNull() {
            addCriterion("SCORE_B is not null");
            return (Criteria) this;
        }

        public Criteria andScoreBEqualTo(BigDecimal value) {
            addCriterion("SCORE_B =", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBNotEqualTo(BigDecimal value) {
            addCriterion("SCORE_B <>", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBGreaterThan(BigDecimal value) {
            addCriterion("SCORE_B >", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B >=", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBLessThan(BigDecimal value) {
            addCriterion("SCORE_B <", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE_B <=", value, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBIn(List<BigDecimal> values) {
            addCriterion("SCORE_B in", values, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBNotIn(List<BigDecimal> values) {
            addCriterion("SCORE_B not in", values, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B between", value1, value2, "scoreB");
            return (Criteria) this;
        }

        public Criteria andScoreBNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE_B not between", value1, value2, "scoreB");
            return (Criteria) this;
        }

        public Criteria andClassAverageAIsNull() {
            addCriterion("CLASS_AVERAGE_A is null");
            return (Criteria) this;
        }

        public Criteria andClassAverageAIsNotNull() {
            addCriterion("CLASS_AVERAGE_A is not null");
            return (Criteria) this;
        }

        public Criteria andClassAverageAEqualTo(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_A =", value, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageANotEqualTo(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_A <>", value, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageAGreaterThan(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_A >", value, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_A >=", value, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageALessThan(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_A <", value, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageALessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_A <=", value, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageAIn(List<BigDecimal> values) {
            addCriterion("CLASS_AVERAGE_A in", values, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageANotIn(List<BigDecimal> values) {
            addCriterion("CLASS_AVERAGE_A not in", values, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_AVERAGE_A between", value1, value2, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_AVERAGE_A not between", value1, value2, "classAverageA");
            return (Criteria) this;
        }

        public Criteria andClassAverageBIsNull() {
            addCriterion("CLASS_AVERAGE_B is null");
            return (Criteria) this;
        }

        public Criteria andClassAverageBIsNotNull() {
            addCriterion("CLASS_AVERAGE_B is not null");
            return (Criteria) this;
        }

        public Criteria andClassAverageBEqualTo(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_B =", value, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBNotEqualTo(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_B <>", value, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBGreaterThan(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_B >", value, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_B >=", value, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBLessThan(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_B <", value, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASS_AVERAGE_B <=", value, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBIn(List<BigDecimal> values) {
            addCriterion("CLASS_AVERAGE_B in", values, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBNotIn(List<BigDecimal> values) {
            addCriterion("CLASS_AVERAGE_B not in", values, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_AVERAGE_B between", value1, value2, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andClassAverageBNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASS_AVERAGE_B not between", value1, value2, "classAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageAIsNull() {
            addCriterion("GRADE_AVERAGE_A is null");
            return (Criteria) this;
        }

        public Criteria andGradeAverageAIsNotNull() {
            addCriterion("GRADE_AVERAGE_A is not null");
            return (Criteria) this;
        }

        public Criteria andGradeAverageAEqualTo(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_A =", value, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageANotEqualTo(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_A <>", value, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageAGreaterThan(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_A >", value, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_A >=", value, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageALessThan(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_A <", value, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageALessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_A <=", value, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageAIn(List<BigDecimal> values) {
            addCriterion("GRADE_AVERAGE_A in", values, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageANotIn(List<BigDecimal> values) {
            addCriterion("GRADE_AVERAGE_A not in", values, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE_AVERAGE_A between", value1, value2, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE_AVERAGE_A not between", value1, value2, "gradeAverageA");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBIsNull() {
            addCriterion("GRADE_AVERAGE_B is null");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBIsNotNull() {
            addCriterion("GRADE_AVERAGE_B is not null");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBEqualTo(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_B =", value, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBNotEqualTo(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_B <>", value, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBGreaterThan(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_B >", value, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_B >=", value, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBLessThan(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_B <", value, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE_AVERAGE_B <=", value, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBIn(List<BigDecimal> values) {
            addCriterion("GRADE_AVERAGE_B in", values, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBNotIn(List<BigDecimal> values) {
            addCriterion("GRADE_AVERAGE_B not in", values, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE_AVERAGE_B between", value1, value2, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andGradeAverageBNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE_AVERAGE_B not between", value1, value2, "gradeAverageB");
            return (Criteria) this;
        }

        public Criteria andFullScoreIsNull() {
            addCriterion("FULL_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreIsNotNull() {
            addCriterion("FULL_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreEqualTo(BigDecimal value) {
            addCriterion("FULL_SCORE =", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotEqualTo(BigDecimal value) {
            addCriterion("FULL_SCORE <>", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreGreaterThan(BigDecimal value) {
            addCriterion("FULL_SCORE >", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FULL_SCORE >=", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreLessThan(BigDecimal value) {
            addCriterion("FULL_SCORE <", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FULL_SCORE <=", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreIn(List<BigDecimal> values) {
            addCriterion("FULL_SCORE in", values, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotIn(List<BigDecimal> values) {
            addCriterion("FULL_SCORE not in", values, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULL_SCORE between", value1, value2, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FULL_SCORE not between", value1, value2, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
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