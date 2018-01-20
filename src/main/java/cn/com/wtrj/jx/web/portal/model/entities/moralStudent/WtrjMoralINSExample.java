package cn.com.wtrj.jx.web.portal.model.entities.moralStudent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjMoralINSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjMoralINSExample() {
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

        public Criteria andRecTypeIsNull() {
            addCriterion("REC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecTypeIsNotNull() {
            addCriterion("REC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecTypeEqualTo(String value) {
            addCriterion("REC_TYPE =", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotEqualTo(String value) {
            addCriterion("REC_TYPE <>", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeGreaterThan(String value) {
            addCriterion("REC_TYPE >", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REC_TYPE >=", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeLessThan(String value) {
            addCriterion("REC_TYPE <", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeLessThanOrEqualTo(String value) {
            addCriterion("REC_TYPE <=", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeLike(String value) {
            addCriterion("REC_TYPE like", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotLike(String value) {
            addCriterion("REC_TYPE not like", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeIn(List<String> values) {
            addCriterion("REC_TYPE in", values, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotIn(List<String> values) {
            addCriterion("REC_TYPE not in", values, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeBetween(String value1, String value2) {
            addCriterion("REC_TYPE between", value1, value2, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotBetween(String value1, String value2) {
            addCriterion("REC_TYPE not between", value1, value2, "recType");
            return (Criteria) this;
        }

        public Criteria andRecUserIsNull() {
            addCriterion("REC_USER is null");
            return (Criteria) this;
        }

        public Criteria andRecUserIsNotNull() {
            addCriterion("REC_USER is not null");
            return (Criteria) this;
        }

        public Criteria andRecUserEqualTo(Integer value) {
            addCriterion("REC_USER =", value, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserNotEqualTo(Integer value) {
            addCriterion("REC_USER <>", value, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserGreaterThan(Integer value) {
            addCriterion("REC_USER >", value, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("REC_USER >=", value, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserLessThan(Integer value) {
            addCriterion("REC_USER <", value, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserLessThanOrEqualTo(Integer value) {
            addCriterion("REC_USER <=", value, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserIn(List<Integer> values) {
            addCriterion("REC_USER in", values, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserNotIn(List<Integer> values) {
            addCriterion("REC_USER not in", values, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserBetween(Integer value1, Integer value2) {
            addCriterion("REC_USER between", value1, value2, "recUser");
            return (Criteria) this;
        }

        public Criteria andRecUserNotBetween(Integer value1, Integer value2) {
            addCriterion("REC_USER not between", value1, value2, "recUser");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("STUDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("STUDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("STUDENT_ID =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("STUDENT_ID <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("STUDENT_ID >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_ID >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("STUDENT_ID <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_ID <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("STUDENT_ID in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("STUDENT_ID not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_ID between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_ID not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andRecDateIsNull() {
            addCriterion("REC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRecDateIsNotNull() {
            addCriterion("REC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecDateEqualTo(Date value) {
            addCriterion("REC_DATE =", value, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateNotEqualTo(Date value) {
            addCriterion("REC_DATE <>", value, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateGreaterThan(Date value) {
            addCriterion("REC_DATE >", value, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_DATE >=", value, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateLessThan(Date value) {
            addCriterion("REC_DATE <", value, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateLessThanOrEqualTo(Date value) {
            addCriterion("REC_DATE <=", value, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateIn(List<Date> values) {
            addCriterion("REC_DATE in", values, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateNotIn(List<Date> values) {
            addCriterion("REC_DATE not in", values, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateBetween(Date value1, Date value2) {
            addCriterion("REC_DATE between", value1, value2, "recDate");
            return (Criteria) this;
        }

        public Criteria andRecDateNotBetween(Date value1, Date value2) {
            addCriterion("REC_DATE not between", value1, value2, "recDate");
            return (Criteria) this;
        }

        public Criteria andStdCodeIsNull() {
            addCriterion("STD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStdCodeIsNotNull() {
            addCriterion("STD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStdCodeEqualTo(String value) {
            addCriterion("STD_CODE =", value, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeNotEqualTo(String value) {
            addCriterion("STD_CODE <>", value, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeGreaterThan(String value) {
            addCriterion("STD_CODE >", value, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STD_CODE >=", value, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeLessThan(String value) {
            addCriterion("STD_CODE <", value, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeLessThanOrEqualTo(String value) {
            addCriterion("STD_CODE <=", value, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeLike(String value) {
            addCriterion("STD_CODE like", value, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeNotLike(String value) {
            addCriterion("STD_CODE not like", value, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeIn(List<String> values) {
            addCriterion("STD_CODE in", values, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeNotIn(List<String> values) {
            addCriterion("STD_CODE not in", values, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeBetween(String value1, String value2) {
            addCriterion("STD_CODE between", value1, value2, "stdCode");
            return (Criteria) this;
        }

        public Criteria andStdCodeNotBetween(String value1, String value2) {
            addCriterion("STD_CODE not between", value1, value2, "stdCode");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAttachFileIsNull() {
            addCriterion("ATTACH_FILE is null");
            return (Criteria) this;
        }

        public Criteria andAttachFileIsNotNull() {
            addCriterion("ATTACH_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andAttachFileEqualTo(String value) {
            addCriterion("ATTACH_FILE =", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotEqualTo(String value) {
            addCriterion("ATTACH_FILE <>", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileGreaterThan(String value) {
            addCriterion("ATTACH_FILE >", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_FILE >=", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLessThan(String value) {
            addCriterion("ATTACH_FILE <", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_FILE <=", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLike(String value) {
            addCriterion("ATTACH_FILE like", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotLike(String value) {
            addCriterion("ATTACH_FILE not like", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileIn(List<String> values) {
            addCriterion("ATTACH_FILE in", values, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotIn(List<String> values) {
            addCriterion("ATTACH_FILE not in", values, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileBetween(String value1, String value2) {
            addCriterion("ATTACH_FILE between", value1, value2, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotBetween(String value1, String value2) {
            addCriterion("ATTACH_FILE not between", value1, value2, "attachFile");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthIsNull() {
            addCriterion("BL_TEACHER_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthIsNotNull() {
            addCriterion("BL_TEACHER_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthEqualTo(String value) {
            addCriterion("BL_TEACHER_AUTH =", value, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthNotEqualTo(String value) {
            addCriterion("BL_TEACHER_AUTH <>", value, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthGreaterThan(String value) {
            addCriterion("BL_TEACHER_AUTH >", value, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthGreaterThanOrEqualTo(String value) {
            addCriterion("BL_TEACHER_AUTH >=", value, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthLessThan(String value) {
            addCriterion("BL_TEACHER_AUTH <", value, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthLessThanOrEqualTo(String value) {
            addCriterion("BL_TEACHER_AUTH <=", value, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthLike(String value) {
            addCriterion("BL_TEACHER_AUTH like", value, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthNotLike(String value) {
            addCriterion("BL_TEACHER_AUTH not like", value, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthIn(List<String> values) {
            addCriterion("BL_TEACHER_AUTH in", values, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthNotIn(List<String> values) {
            addCriterion("BL_TEACHER_AUTH not in", values, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthBetween(String value1, String value2) {
            addCriterion("BL_TEACHER_AUTH between", value1, value2, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andBlTeacherAuthNotBetween(String value1, String value2) {
            addCriterion("BL_TEACHER_AUTH not between", value1, value2, "blTeacherAuth");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdIsNull() {
            addCriterion("AUTH_TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdIsNotNull() {
            addCriterion("AUTH_TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdEqualTo(Integer value) {
            addCriterion("AUTH_TEACHER_ID =", value, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdNotEqualTo(Integer value) {
            addCriterion("AUTH_TEACHER_ID <>", value, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdGreaterThan(Integer value) {
            addCriterion("AUTH_TEACHER_ID >", value, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTH_TEACHER_ID >=", value, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdLessThan(Integer value) {
            addCriterion("AUTH_TEACHER_ID <", value, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("AUTH_TEACHER_ID <=", value, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdIn(List<Integer> values) {
            addCriterion("AUTH_TEACHER_ID in", values, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdNotIn(List<Integer> values) {
            addCriterion("AUTH_TEACHER_ID not in", values, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_TEACHER_ID between", value1, value2, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_TEACHER_ID not between", value1, value2, "authTeacherId");
            return (Criteria) this;
        }

        public Criteria andAuthResultIsNull() {
            addCriterion("AUTH_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAuthResultIsNotNull() {
            addCriterion("AUTH_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAuthResultEqualTo(String value) {
            addCriterion("AUTH_RESULT =", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotEqualTo(String value) {
            addCriterion("AUTH_RESULT <>", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultGreaterThan(String value) {
            addCriterion("AUTH_RESULT >", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_RESULT >=", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLessThan(String value) {
            addCriterion("AUTH_RESULT <", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLessThanOrEqualTo(String value) {
            addCriterion("AUTH_RESULT <=", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLike(String value) {
            addCriterion("AUTH_RESULT like", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotLike(String value) {
            addCriterion("AUTH_RESULT not like", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultIn(List<String> values) {
            addCriterion("AUTH_RESULT in", values, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotIn(List<String> values) {
            addCriterion("AUTH_RESULT not in", values, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultBetween(String value1, String value2) {
            addCriterion("AUTH_RESULT between", value1, value2, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotBetween(String value1, String value2) {
            addCriterion("AUTH_RESULT not between", value1, value2, "authResult");
            return (Criteria) this;
        }

        public Criteria andActScoreIsNull() {
            addCriterion("ACT_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andActScoreIsNotNull() {
            addCriterion("ACT_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andActScoreEqualTo(Integer value) {
            addCriterion("ACT_SCORE =", value, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreNotEqualTo(Integer value) {
            addCriterion("ACT_SCORE <>", value, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreGreaterThan(Integer value) {
            addCriterion("ACT_SCORE >", value, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACT_SCORE >=", value, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreLessThan(Integer value) {
            addCriterion("ACT_SCORE <", value, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreLessThanOrEqualTo(Integer value) {
            addCriterion("ACT_SCORE <=", value, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreIn(List<Integer> values) {
            addCriterion("ACT_SCORE in", values, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreNotIn(List<Integer> values) {
            addCriterion("ACT_SCORE not in", values, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreBetween(Integer value1, Integer value2) {
            addCriterion("ACT_SCORE between", value1, value2, "actScore");
            return (Criteria) this;
        }

        public Criteria andActScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("ACT_SCORE not between", value1, value2, "actScore");
            return (Criteria) this;
        }

        public Criteria andAuthDateIsNull() {
            addCriterion("AUTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAuthDateIsNotNull() {
            addCriterion("AUTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthDateEqualTo(Date value) {
            addCriterion("AUTH_DATE =", value, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateNotEqualTo(Date value) {
            addCriterion("AUTH_DATE <>", value, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateGreaterThan(Date value) {
            addCriterion("AUTH_DATE >", value, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUTH_DATE >=", value, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateLessThan(Date value) {
            addCriterion("AUTH_DATE <", value, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateLessThanOrEqualTo(Date value) {
            addCriterion("AUTH_DATE <=", value, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateIn(List<Date> values) {
            addCriterion("AUTH_DATE in", values, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateNotIn(List<Date> values) {
            addCriterion("AUTH_DATE not in", values, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateBetween(Date value1, Date value2) {
            addCriterion("AUTH_DATE between", value1, value2, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthDateNotBetween(Date value1, Date value2) {
            addCriterion("AUTH_DATE not between", value1, value2, "authDate");
            return (Criteria) this;
        }

        public Criteria andAuthContentIsNull() {
            addCriterion("AUTH_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andAuthContentIsNotNull() {
            addCriterion("AUTH_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andAuthContentEqualTo(String value) {
            addCriterion("AUTH_CONTENT =", value, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentNotEqualTo(String value) {
            addCriterion("AUTH_CONTENT <>", value, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentGreaterThan(String value) {
            addCriterion("AUTH_CONTENT >", value, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_CONTENT >=", value, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentLessThan(String value) {
            addCriterion("AUTH_CONTENT <", value, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentLessThanOrEqualTo(String value) {
            addCriterion("AUTH_CONTENT <=", value, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentLike(String value) {
            addCriterion("AUTH_CONTENT like", value, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentNotLike(String value) {
            addCriterion("AUTH_CONTENT not like", value, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentIn(List<String> values) {
            addCriterion("AUTH_CONTENT in", values, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentNotIn(List<String> values) {
            addCriterion("AUTH_CONTENT not in", values, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentBetween(String value1, String value2) {
            addCriterion("AUTH_CONTENT between", value1, value2, "authContent");
            return (Criteria) this;
        }

        public Criteria andAuthContentNotBetween(String value1, String value2) {
            addCriterion("AUTH_CONTENT not between", value1, value2, "authContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentIsNull() {
            addCriterion("ALTER_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andAlterContentIsNotNull() {
            addCriterion("ALTER_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andAlterContentEqualTo(String value) {
            addCriterion("ALTER_CONTENT =", value, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentNotEqualTo(String value) {
            addCriterion("ALTER_CONTENT <>", value, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentGreaterThan(String value) {
            addCriterion("ALTER_CONTENT >", value, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentGreaterThanOrEqualTo(String value) {
            addCriterion("ALTER_CONTENT >=", value, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentLessThan(String value) {
            addCriterion("ALTER_CONTENT <", value, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentLessThanOrEqualTo(String value) {
            addCriterion("ALTER_CONTENT <=", value, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentLike(String value) {
            addCriterion("ALTER_CONTENT like", value, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentNotLike(String value) {
            addCriterion("ALTER_CONTENT not like", value, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentIn(List<String> values) {
            addCriterion("ALTER_CONTENT in", values, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentNotIn(List<String> values) {
            addCriterion("ALTER_CONTENT not in", values, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentBetween(String value1, String value2) {
            addCriterion("ALTER_CONTENT between", value1, value2, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAlterContentNotBetween(String value1, String value2) {
            addCriterion("ALTER_CONTENT not between", value1, value2, "alterContent");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileIsNull() {
            addCriterion("AUTH_ATTACH_FILE is null");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileIsNotNull() {
            addCriterion("AUTH_ATTACH_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileEqualTo(String value) {
            addCriterion("AUTH_ATTACH_FILE =", value, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileNotEqualTo(String value) {
            addCriterion("AUTH_ATTACH_FILE <>", value, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileGreaterThan(String value) {
            addCriterion("AUTH_ATTACH_FILE >", value, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_ATTACH_FILE >=", value, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileLessThan(String value) {
            addCriterion("AUTH_ATTACH_FILE <", value, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileLessThanOrEqualTo(String value) {
            addCriterion("AUTH_ATTACH_FILE <=", value, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileLike(String value) {
            addCriterion("AUTH_ATTACH_FILE like", value, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileNotLike(String value) {
            addCriterion("AUTH_ATTACH_FILE not like", value, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileIn(List<String> values) {
            addCriterion("AUTH_ATTACH_FILE in", values, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileNotIn(List<String> values) {
            addCriterion("AUTH_ATTACH_FILE not in", values, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileBetween(String value1, String value2) {
            addCriterion("AUTH_ATTACH_FILE between", value1, value2, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andAuthAttachFileNotBetween(String value1, String value2) {
            addCriterion("AUTH_ATTACH_FILE not between", value1, value2, "authAttachFile");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgIsNull() {
            addCriterion("BLD_DEL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgIsNotNull() {
            addCriterion("BLD_DEL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgEqualTo(String value) {
            addCriterion("BLD_DEL_FLG =", value, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgNotEqualTo(String value) {
            addCriterion("BLD_DEL_FLG <>", value, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgGreaterThan(String value) {
            addCriterion("BLD_DEL_FLG >", value, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("BLD_DEL_FLG >=", value, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgLessThan(String value) {
            addCriterion("BLD_DEL_FLG <", value, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgLessThanOrEqualTo(String value) {
            addCriterion("BLD_DEL_FLG <=", value, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgLike(String value) {
            addCriterion("BLD_DEL_FLG like", value, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgNotLike(String value) {
            addCriterion("BLD_DEL_FLG not like", value, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgIn(List<String> values) {
            addCriterion("BLD_DEL_FLG in", values, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgNotIn(List<String> values) {
            addCriterion("BLD_DEL_FLG not in", values, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgBetween(String value1, String value2) {
            addCriterion("BLD_DEL_FLG between", value1, value2, "bldDelFlg");
            return (Criteria) this;
        }

        public Criteria andBldDelFlgNotBetween(String value1, String value2) {
            addCriterion("BLD_DEL_FLG not between", value1, value2, "bldDelFlg");
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