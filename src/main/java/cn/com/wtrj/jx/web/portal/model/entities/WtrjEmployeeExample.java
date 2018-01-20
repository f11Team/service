package cn.com.wtrj.jx.web.portal.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrjEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrjEmployeeExample() {
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

        public Criteria andEmployeeNumberIsNull() {
            addCriterion("EMPLOYEE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNotNull() {
            addCriterion("EMPLOYEE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER =", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER <>", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThan(String value) {
            addCriterion("EMPLOYEE_NUMBER >", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER >=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThan(String value) {
            addCriterion("EMPLOYEE_NUMBER <", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER <=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLike(String value) {
            addCriterion("EMPLOYEE_NUMBER like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotLike(String value) {
            addCriterion("EMPLOYEE_NUMBER not like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIn(List<String> values) {
            addCriterion("EMPLOYEE_NUMBER in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NUMBER not in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NUMBER between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NUMBER not between", value1, value2, "employeeNumber");
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

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNull() {
            addCriterion("ENGLISH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNotNull() {
            addCriterion("ENGLISH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameEqualTo(String value) {
            addCriterion("ENGLISH_NAME =", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotEqualTo(String value) {
            addCriterion("ENGLISH_NAME <>", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThan(String value) {
            addCriterion("ENGLISH_NAME >", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISH_NAME >=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThan(String value) {
            addCriterion("ENGLISH_NAME <", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("ENGLISH_NAME <=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLike(String value) {
            addCriterion("ENGLISH_NAME like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLike(String value) {
            addCriterion("ENGLISH_NAME not like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIn(List<String> values) {
            addCriterion("ENGLISH_NAME in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotIn(List<String> values) {
            addCriterion("ENGLISH_NAME not in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameBetween(String value1, String value2) {
            addCriterion("ENGLISH_NAME between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotBetween(String value1, String value2) {
            addCriterion("ENGLISH_NAME not between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIsNull() {
            addCriterion("BELONG_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIsNotNull() {
            addCriterion("BELONG_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andBelongUnitEqualTo(String value) {
            addCriterion("BELONG_UNIT =", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotEqualTo(String value) {
            addCriterion("BELONG_UNIT <>", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitGreaterThan(String value) {
            addCriterion("BELONG_UNIT >", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitGreaterThanOrEqualTo(String value) {
            addCriterion("BELONG_UNIT >=", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLessThan(String value) {
            addCriterion("BELONG_UNIT <", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLessThanOrEqualTo(String value) {
            addCriterion("BELONG_UNIT <=", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLike(String value) {
            addCriterion("BELONG_UNIT like", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotLike(String value) {
            addCriterion("BELONG_UNIT not like", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIn(List<String> values) {
            addCriterion("BELONG_UNIT in", values, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotIn(List<String> values) {
            addCriterion("BELONG_UNIT not in", values, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitBetween(String value1, String value2) {
            addCriterion("BELONG_UNIT between", value1, value2, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotBetween(String value1, String value2) {
            addCriterion("BELONG_UNIT not between", value1, value2, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("NATIVE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("NATIVE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("NATIVE_PLACE =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("NATIVE_PLACE <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("NATIVE_PLACE >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVE_PLACE >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("NATIVE_PLACE <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("NATIVE_PLACE <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("NATIVE_PLACE like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("NATIVE_PLACE not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("NATIVE_PLACE in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("NATIVE_PLACE not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("NATIVE_PLACE between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("NATIVE_PLACE not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE not between", value1, value2, "age");
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

        public Criteria andHukouAddressIsNull() {
            addCriterion("HUKOU_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andHukouAddressIsNotNull() {
            addCriterion("HUKOU_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andHukouAddressEqualTo(String value) {
            addCriterion("HUKOU_ADDRESS =", value, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressNotEqualTo(String value) {
            addCriterion("HUKOU_ADDRESS <>", value, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressGreaterThan(String value) {
            addCriterion("HUKOU_ADDRESS >", value, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressGreaterThanOrEqualTo(String value) {
            addCriterion("HUKOU_ADDRESS >=", value, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressLessThan(String value) {
            addCriterion("HUKOU_ADDRESS <", value, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressLessThanOrEqualTo(String value) {
            addCriterion("HUKOU_ADDRESS <=", value, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressLike(String value) {
            addCriterion("HUKOU_ADDRESS like", value, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressNotLike(String value) {
            addCriterion("HUKOU_ADDRESS not like", value, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressIn(List<String> values) {
            addCriterion("HUKOU_ADDRESS in", values, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressNotIn(List<String> values) {
            addCriterion("HUKOU_ADDRESS not in", values, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressBetween(String value1, String value2) {
            addCriterion("HUKOU_ADDRESS between", value1, value2, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouAddressNotBetween(String value1, String value2) {
            addCriterion("HUKOU_ADDRESS not between", value1, value2, "hukouAddress");
            return (Criteria) this;
        }

        public Criteria andHukouTypeIsNull() {
            addCriterion("HUKOU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHukouTypeIsNotNull() {
            addCriterion("HUKOU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHukouTypeEqualTo(String value) {
            addCriterion("HUKOU_TYPE =", value, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeNotEqualTo(String value) {
            addCriterion("HUKOU_TYPE <>", value, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeGreaterThan(String value) {
            addCriterion("HUKOU_TYPE >", value, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HUKOU_TYPE >=", value, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeLessThan(String value) {
            addCriterion("HUKOU_TYPE <", value, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeLessThanOrEqualTo(String value) {
            addCriterion("HUKOU_TYPE <=", value, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeLike(String value) {
            addCriterion("HUKOU_TYPE like", value, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeNotLike(String value) {
            addCriterion("HUKOU_TYPE not like", value, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeIn(List<String> values) {
            addCriterion("HUKOU_TYPE in", values, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeNotIn(List<String> values) {
            addCriterion("HUKOU_TYPE not in", values, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeBetween(String value1, String value2) {
            addCriterion("HUKOU_TYPE between", value1, value2, "hukouType");
            return (Criteria) this;
        }

        public Criteria andHukouTypeNotBetween(String value1, String value2) {
            addCriterion("HUKOU_TYPE not between", value1, value2, "hukouType");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("RESIDENCE is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("RESIDENCE is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("RESIDENCE =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("RESIDENCE <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("RESIDENCE >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("RESIDENCE <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("RESIDENCE like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("RESIDENCE not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("RESIDENCE in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("RESIDENCE not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("RESIDENCE between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE not between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNull() {
            addCriterion("WORKING_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNotNull() {
            addCriterion("WORKING_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsEqualTo(Integer value) {
            addCriterion("WORKING_YEARS =", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotEqualTo(Integer value) {
            addCriterion("WORKING_YEARS <>", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThan(Integer value) {
            addCriterion("WORKING_YEARS >", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKING_YEARS >=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThan(Integer value) {
            addCriterion("WORKING_YEARS <", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThanOrEqualTo(Integer value) {
            addCriterion("WORKING_YEARS <=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIn(List<Integer> values) {
            addCriterion("WORKING_YEARS in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotIn(List<Integer> values) {
            addCriterion("WORKING_YEARS not in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsBetween(Integer value1, Integer value2) {
            addCriterion("WORKING_YEARS between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKING_YEARS not between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("POLITICAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("POLITICAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("POLITICAL_STATUS =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("POLITICAL_STATUS <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("POLITICAL_STATUS >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICAL_STATUS >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("POLITICAL_STATUS <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("POLITICAL_STATUS <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("POLITICAL_STATUS like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("POLITICAL_STATUS not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("POLITICAL_STATUS in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("POLITICAL_STATUS not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("POLITICAL_STATUS between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("POLITICAL_STATUS not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("MARITAL_STATUS =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("MARITAL_STATUS >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("MARITAL_STATUS <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("MARITAL_STATUS like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("MARITAL_STATUS in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNull() {
            addCriterion("GRADUATE_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNotNull() {
            addCriterion("GRADUATE_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL =", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL <>", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThan(String value) {
            addCriterion("GRADUATE_SCHOOL >", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL >=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThan(String value) {
            addCriterion("GRADUATE_SCHOOL <", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL <=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLike(String value) {
            addCriterion("GRADUATE_SCHOOL like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotLike(String value) {
            addCriterion("GRADUATE_SCHOOL not like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIn(List<String> values) {
            addCriterion("GRADUATE_SCHOOL in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotIn(List<String> values) {
            addCriterion("GRADUATE_SCHOOL not in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolBetween(String value1, String value2) {
            addCriterion("GRADUATE_SCHOOL between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATE_SCHOOL not between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeIsNull() {
            addCriterion("GRADUATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeIsNotNull() {
            addCriterion("GRADUATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeEqualTo(Date value) {
            addCriterion("GRADUATE_TIME =", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeNotEqualTo(Date value) {
            addCriterion("GRADUATE_TIME <>", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeGreaterThan(Date value) {
            addCriterion("GRADUATE_TIME >", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GRADUATE_TIME >=", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeLessThan(Date value) {
            addCriterion("GRADUATE_TIME <", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeLessThanOrEqualTo(Date value) {
            addCriterion("GRADUATE_TIME <=", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeIn(List<Date> values) {
            addCriterion("GRADUATE_TIME in", values, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeNotIn(List<Date> values) {
            addCriterion("GRADUATE_TIME not in", values, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeBetween(Date value1, Date value2) {
            addCriterion("GRADUATE_TIME between", value1, value2, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeNotBetween(Date value1, Date value2) {
            addCriterion("GRADUATE_TIME not between", value1, value2, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
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

        public Criteria andJobCodeIsNull() {
            addCriterion("JOB_CODE is null");
            return (Criteria) this;
        }

        public Criteria andJobCodeIsNotNull() {
            addCriterion("JOB_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andJobCodeEqualTo(String value) {
            addCriterion("JOB_CODE =", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotEqualTo(String value) {
            addCriterion("JOB_CODE <>", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeGreaterThan(String value) {
            addCriterion("JOB_CODE >", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_CODE >=", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLessThan(String value) {
            addCriterion("JOB_CODE <", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLessThanOrEqualTo(String value) {
            addCriterion("JOB_CODE <=", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLike(String value) {
            addCriterion("JOB_CODE like", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotLike(String value) {
            addCriterion("JOB_CODE not like", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeIn(List<String> values) {
            addCriterion("JOB_CODE in", values, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotIn(List<String> values) {
            addCriterion("JOB_CODE not in", values, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeBetween(String value1, String value2) {
            addCriterion("JOB_CODE between", value1, value2, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotBetween(String value1, String value2) {
            addCriterion("JOB_CODE not between", value1, value2, "jobCode");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("ID_NUMBER =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("ID_NUMBER <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("ID_NUMBER >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("ID_NUMBER <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("ID_NUMBER like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("ID_NUMBER not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("ID_NUMBER in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("ID_NUMBER not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("ID_NUMBER between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("ID_NUMBER not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEduDegreeIsNull() {
            addCriterion("EDU_DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andEduDegreeIsNotNull() {
            addCriterion("EDU_DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andEduDegreeEqualTo(String value) {
            addCriterion("EDU_DEGREE =", value, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeNotEqualTo(String value) {
            addCriterion("EDU_DEGREE <>", value, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeGreaterThan(String value) {
            addCriterion("EDU_DEGREE >", value, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_DEGREE >=", value, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeLessThan(String value) {
            addCriterion("EDU_DEGREE <", value, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeLessThanOrEqualTo(String value) {
            addCriterion("EDU_DEGREE <=", value, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeLike(String value) {
            addCriterion("EDU_DEGREE like", value, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeNotLike(String value) {
            addCriterion("EDU_DEGREE not like", value, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeIn(List<String> values) {
            addCriterion("EDU_DEGREE in", values, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeNotIn(List<String> values) {
            addCriterion("EDU_DEGREE not in", values, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeBetween(String value1, String value2) {
            addCriterion("EDU_DEGREE between", value1, value2, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andEduDegreeNotBetween(String value1, String value2) {
            addCriterion("EDU_DEGREE not between", value1, value2, "eduDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageIsNull() {
            addCriterion("FOREIGN_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageIsNotNull() {
            addCriterion("FOREIGN_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE =", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageNotEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE <>", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageGreaterThan(String value) {
            addCriterion("FOREIGN_LANGUAGE >", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE >=", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLessThan(String value) {
            addCriterion("FOREIGN_LANGUAGE <", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLessThanOrEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE <=", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLike(String value) {
            addCriterion("FOREIGN_LANGUAGE like", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageNotLike(String value) {
            addCriterion("FOREIGN_LANGUAGE not like", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageIn(List<String> values) {
            addCriterion("FOREIGN_LANGUAGE in", values, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageNotIn(List<String> values) {
            addCriterion("FOREIGN_LANGUAGE not in", values, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageBetween(String value1, String value2) {
            addCriterion("FOREIGN_LANGUAGE between", value1, value2, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageNotBetween(String value1, String value2) {
            addCriterion("FOREIGN_LANGUAGE not between", value1, value2, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelIsNull() {
            addCriterion("FOREIGN_LANGUAGE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelIsNotNull() {
            addCriterion("FOREIGN_LANGUAGE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL =", value, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelNotEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL <>", value, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelGreaterThan(String value) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL >", value, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelGreaterThanOrEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL >=", value, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelLessThan(String value) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL <", value, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelLessThanOrEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL <=", value, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelLike(String value) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL like", value, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelNotLike(String value) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL not like", value, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelIn(List<String> values) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL in", values, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelNotIn(List<String> values) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL not in", values, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelBetween(String value1, String value2) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL between", value1, value2, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLevelNotBetween(String value1, String value2) {
            addCriterion("FOREIGN_LANGUAGE_LEVEL not between", value1, value2, "foreignLanguageLevel");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNull() {
            addCriterion("ENTRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("ENTRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(Date value) {
            addCriterion("ENTRY_DATE =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(Date value) {
            addCriterion("ENTRY_DATE <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(Date value) {
            addCriterion("ENTRY_DATE >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTRY_DATE >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(Date value) {
            addCriterion("ENTRY_DATE <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(Date value) {
            addCriterion("ENTRY_DATE <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<Date> values) {
            addCriterion("ENTRY_DATE in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<Date> values) {
            addCriterion("ENTRY_DATE not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(Date value1, Date value2) {
            addCriterion("ENTRY_DATE between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(Date value1, Date value2) {
            addCriterion("ENTRY_DATE not between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNull() {
            addCriterion("ENTRY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNotNull() {
            addCriterion("ENTRY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNumEqualTo(Integer value) {
            addCriterion("ENTRY_NUM =", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotEqualTo(Integer value) {
            addCriterion("ENTRY_NUM <>", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThan(Integer value) {
            addCriterion("ENTRY_NUM >", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTRY_NUM >=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThan(Integer value) {
            addCriterion("ENTRY_NUM <", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThanOrEqualTo(Integer value) {
            addCriterion("ENTRY_NUM <=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumIn(List<Integer> values) {
            addCriterion("ENTRY_NUM in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotIn(List<Integer> values) {
            addCriterion("ENTRY_NUM not in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumBetween(Integer value1, Integer value2) {
            addCriterion("ENTRY_NUM between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTRY_NUM not between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateIsNull() {
            addCriterion("CONFIRMATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateIsNotNull() {
            addCriterion("CONFIRMATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateEqualTo(Date value) {
            addCriterion("CONFIRMATION_DATE =", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateNotEqualTo(Date value) {
            addCriterion("CONFIRMATION_DATE <>", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateGreaterThan(Date value) {
            addCriterion("CONFIRMATION_DATE >", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRMATION_DATE >=", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateLessThan(Date value) {
            addCriterion("CONFIRMATION_DATE <", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRMATION_DATE <=", value, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateIn(List<Date> values) {
            addCriterion("CONFIRMATION_DATE in", values, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateNotIn(List<Date> values) {
            addCriterion("CONFIRMATION_DATE not in", values, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateBetween(Date value1, Date value2) {
            addCriterion("CONFIRMATION_DATE between", value1, value2, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andConfirmationDateNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRMATION_DATE not between", value1, value2, "confirmationDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateIsNull() {
            addCriterion("WORK_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateIsNotNull() {
            addCriterion("WORK_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateEqualTo(Date value) {
            addCriterion("WORK_START_DATE =", value, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateNotEqualTo(Date value) {
            addCriterion("WORK_START_DATE <>", value, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateGreaterThan(Date value) {
            addCriterion("WORK_START_DATE >", value, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("WORK_START_DATE >=", value, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateLessThan(Date value) {
            addCriterion("WORK_START_DATE <", value, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateLessThanOrEqualTo(Date value) {
            addCriterion("WORK_START_DATE <=", value, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateIn(List<Date> values) {
            addCriterion("WORK_START_DATE in", values, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateNotIn(List<Date> values) {
            addCriterion("WORK_START_DATE not in", values, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateBetween(Date value1, Date value2) {
            addCriterion("WORK_START_DATE between", value1, value2, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andWorkStartDateNotBetween(Date value1, Date value2) {
            addCriterion("WORK_START_DATE not between", value1, value2, "workStartDate");
            return (Criteria) this;
        }

        public Criteria andTeachYearsIsNull() {
            addCriterion("TEACH_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andTeachYearsIsNotNull() {
            addCriterion("TEACH_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andTeachYearsEqualTo(BigDecimal value) {
            addCriterion("TEACH_YEARS =", value, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsNotEqualTo(BigDecimal value) {
            addCriterion("TEACH_YEARS <>", value, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsGreaterThan(BigDecimal value) {
            addCriterion("TEACH_YEARS >", value, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEACH_YEARS >=", value, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsLessThan(BigDecimal value) {
            addCriterion("TEACH_YEARS <", value, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEACH_YEARS <=", value, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsIn(List<BigDecimal> values) {
            addCriterion("TEACH_YEARS in", values, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsNotIn(List<BigDecimal> values) {
            addCriterion("TEACH_YEARS not in", values, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEACH_YEARS between", value1, value2, "teachYears");
            return (Criteria) this;
        }

        public Criteria andTeachYearsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEACH_YEARS not between", value1, value2, "teachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsIsNull() {
            addCriterion("JX_TEACH_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsIsNotNull() {
            addCriterion("JX_TEACH_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsEqualTo(BigDecimal value) {
            addCriterion("JX_TEACH_YEARS =", value, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsNotEqualTo(BigDecimal value) {
            addCriterion("JX_TEACH_YEARS <>", value, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsGreaterThan(BigDecimal value) {
            addCriterion("JX_TEACH_YEARS >", value, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JX_TEACH_YEARS >=", value, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsLessThan(BigDecimal value) {
            addCriterion("JX_TEACH_YEARS <", value, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JX_TEACH_YEARS <=", value, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsIn(List<BigDecimal> values) {
            addCriterion("JX_TEACH_YEARS in", values, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsNotIn(List<BigDecimal> values) {
            addCriterion("JX_TEACH_YEARS not in", values, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JX_TEACH_YEARS between", value1, value2, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andJxTeachYearsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JX_TEACH_YEARS not between", value1, value2, "jxTeachYears");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodIsNull() {
            addCriterion("TEACH_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodIsNotNull() {
            addCriterion("TEACH_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodEqualTo(String value) {
            addCriterion("TEACH_PERIOD =", value, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodNotEqualTo(String value) {
            addCriterion("TEACH_PERIOD <>", value, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodGreaterThan(String value) {
            addCriterion("TEACH_PERIOD >", value, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("TEACH_PERIOD >=", value, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodLessThan(String value) {
            addCriterion("TEACH_PERIOD <", value, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodLessThanOrEqualTo(String value) {
            addCriterion("TEACH_PERIOD <=", value, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodLike(String value) {
            addCriterion("TEACH_PERIOD like", value, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodNotLike(String value) {
            addCriterion("TEACH_PERIOD not like", value, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodIn(List<String> values) {
            addCriterion("TEACH_PERIOD in", values, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodNotIn(List<String> values) {
            addCriterion("TEACH_PERIOD not in", values, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodBetween(String value1, String value2) {
            addCriterion("TEACH_PERIOD between", value1, value2, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachPeriodNotBetween(String value1, String value2) {
            addCriterion("TEACH_PERIOD not between", value1, value2, "teachPeriod");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsIsNull() {
            addCriterion("TEACH_SUBJECTS is null");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsIsNotNull() {
            addCriterion("TEACH_SUBJECTS is not null");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsEqualTo(String value) {
            addCriterion("TEACH_SUBJECTS =", value, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsNotEqualTo(String value) {
            addCriterion("TEACH_SUBJECTS <>", value, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsGreaterThan(String value) {
            addCriterion("TEACH_SUBJECTS >", value, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsGreaterThanOrEqualTo(String value) {
            addCriterion("TEACH_SUBJECTS >=", value, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsLessThan(String value) {
            addCriterion("TEACH_SUBJECTS <", value, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsLessThanOrEqualTo(String value) {
            addCriterion("TEACH_SUBJECTS <=", value, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsLike(String value) {
            addCriterion("TEACH_SUBJECTS like", value, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsNotLike(String value) {
            addCriterion("TEACH_SUBJECTS not like", value, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsIn(List<String> values) {
            addCriterion("TEACH_SUBJECTS in", values, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsNotIn(List<String> values) {
            addCriterion("TEACH_SUBJECTS not in", values, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsBetween(String value1, String value2) {
            addCriterion("TEACH_SUBJECTS between", value1, value2, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andTeachSubjectsNotBetween(String value1, String value2) {
            addCriterion("TEACH_SUBJECTS not between", value1, value2, "teachSubjects");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherIsNull() {
            addCriterion("BL_CLASS_TEACHER is null");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherIsNotNull() {
            addCriterion("BL_CLASS_TEACHER is not null");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherEqualTo(String value) {
            addCriterion("BL_CLASS_TEACHER =", value, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherNotEqualTo(String value) {
            addCriterion("BL_CLASS_TEACHER <>", value, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherGreaterThan(String value) {
            addCriterion("BL_CLASS_TEACHER >", value, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("BL_CLASS_TEACHER >=", value, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherLessThan(String value) {
            addCriterion("BL_CLASS_TEACHER <", value, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherLessThanOrEqualTo(String value) {
            addCriterion("BL_CLASS_TEACHER <=", value, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherLike(String value) {
            addCriterion("BL_CLASS_TEACHER like", value, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherNotLike(String value) {
            addCriterion("BL_CLASS_TEACHER not like", value, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherIn(List<String> values) {
            addCriterion("BL_CLASS_TEACHER in", values, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherNotIn(List<String> values) {
            addCriterion("BL_CLASS_TEACHER not in", values, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherBetween(String value1, String value2) {
            addCriterion("BL_CLASS_TEACHER between", value1, value2, "blClassTeacher");
            return (Criteria) this;
        }

        public Criteria andBlClassTeacherNotBetween(String value1, String value2) {
            addCriterion("BL_CLASS_TEACHER not between", value1, value2, "blClassTeacher");
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

        public Criteria andBlLessonPreparationLeaderIsNull() {
            addCriterion("BL_LESSON_PREPARATION_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderIsNotNull() {
            addCriterion("BL_LESSON_PREPARATION_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderEqualTo(String value) {
            addCriterion("BL_LESSON_PREPARATION_LEADER =", value, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderNotEqualTo(String value) {
            addCriterion("BL_LESSON_PREPARATION_LEADER <>", value, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderGreaterThan(String value) {
            addCriterion("BL_LESSON_PREPARATION_LEADER >", value, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("BL_LESSON_PREPARATION_LEADER >=", value, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderLessThan(String value) {
            addCriterion("BL_LESSON_PREPARATION_LEADER <", value, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderLessThanOrEqualTo(String value) {
            addCriterion("BL_LESSON_PREPARATION_LEADER <=", value, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderLike(String value) {
            addCriterion("BL_LESSON_PREPARATION_LEADER like", value, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderNotLike(String value) {
            addCriterion("BL_LESSON_PREPARATION_LEADER not like", value, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderIn(List<String> values) {
            addCriterion("BL_LESSON_PREPARATION_LEADER in", values, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderNotIn(List<String> values) {
            addCriterion("BL_LESSON_PREPARATION_LEADER not in", values, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderBetween(String value1, String value2) {
            addCriterion("BL_LESSON_PREPARATION_LEADER between", value1, value2, "blLessonPreparationLeader");
            return (Criteria) this;
        }

        public Criteria andBlLessonPreparationLeaderNotBetween(String value1, String value2) {
            addCriterion("BL_LESSON_PREPARATION_LEADER not between", value1, value2, "blLessonPreparationLeader");
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

        public Criteria andQuitDateIsNull() {
            addCriterion("QUIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNotNull() {
            addCriterion("QUIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andQuitDateEqualTo(Date value) {
            addCriterion("QUIT_DATE =", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotEqualTo(Date value) {
            addCriterion("QUIT_DATE <>", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThan(Date value) {
            addCriterion("QUIT_DATE >", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("QUIT_DATE >=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThan(Date value) {
            addCriterion("QUIT_DATE <", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThanOrEqualTo(Date value) {
            addCriterion("QUIT_DATE <=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateIn(List<Date> values) {
            addCriterion("QUIT_DATE in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotIn(List<Date> values) {
            addCriterion("QUIT_DATE not in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateBetween(Date value1, Date value2) {
            addCriterion("QUIT_DATE between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotBetween(Date value1, Date value2) {
            addCriterion("QUIT_DATE not between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIsNull() {
            addCriterion("QUIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIsNotNull() {
            addCriterion("QUIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQuitTypeEqualTo(String value) {
            addCriterion("QUIT_TYPE =", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotEqualTo(String value) {
            addCriterion("QUIT_TYPE <>", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeGreaterThan(String value) {
            addCriterion("QUIT_TYPE >", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_TYPE >=", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeLessThan(String value) {
            addCriterion("QUIT_TYPE <", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeLessThanOrEqualTo(String value) {
            addCriterion("QUIT_TYPE <=", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeLike(String value) {
            addCriterion("QUIT_TYPE like", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotLike(String value) {
            addCriterion("QUIT_TYPE not like", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIn(List<String> values) {
            addCriterion("QUIT_TYPE in", values, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotIn(List<String> values) {
            addCriterion("QUIT_TYPE not in", values, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeBetween(String value1, String value2) {
            addCriterion("QUIT_TYPE between", value1, value2, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotBetween(String value1, String value2) {
            addCriterion("QUIT_TYPE not between", value1, value2, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNull() {
            addCriterion("QUIT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNotNull() {
            addCriterion("QUIT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonEqualTo(String value) {
            addCriterion("QUIT_REASON =", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotEqualTo(String value) {
            addCriterion("QUIT_REASON <>", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThan(String value) {
            addCriterion("QUIT_REASON >", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON >=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThan(String value) {
            addCriterion("QUIT_REASON <", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON <=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLike(String value) {
            addCriterion("QUIT_REASON like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotLike(String value) {
            addCriterion("QUIT_REASON not like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIn(List<String> values) {
            addCriterion("QUIT_REASON in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotIn(List<String> values) {
            addCriterion("QUIT_REASON not in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonBetween(String value1, String value2) {
            addCriterion("QUIT_REASON between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotBetween(String value1, String value2) {
            addCriterion("QUIT_REASON not between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andEhrJobIsNull() {
            addCriterion("EHR_JOB is null");
            return (Criteria) this;
        }

        public Criteria andEhrJobIsNotNull() {
            addCriterion("EHR_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andEhrJobEqualTo(String value) {
            addCriterion("EHR_JOB =", value, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobNotEqualTo(String value) {
            addCriterion("EHR_JOB <>", value, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobGreaterThan(String value) {
            addCriterion("EHR_JOB >", value, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_JOB >=", value, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobLessThan(String value) {
            addCriterion("EHR_JOB <", value, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobLessThanOrEqualTo(String value) {
            addCriterion("EHR_JOB <=", value, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobLike(String value) {
            addCriterion("EHR_JOB like", value, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobNotLike(String value) {
            addCriterion("EHR_JOB not like", value, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobIn(List<String> values) {
            addCriterion("EHR_JOB in", values, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobNotIn(List<String> values) {
            addCriterion("EHR_JOB not in", values, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobBetween(String value1, String value2) {
            addCriterion("EHR_JOB between", value1, value2, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrJobNotBetween(String value1, String value2) {
            addCriterion("EHR_JOB not between", value1, value2, "ehrJob");
            return (Criteria) this;
        }

        public Criteria andEhrTitleIsNull() {
            addCriterion("EHR_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andEhrTitleIsNotNull() {
            addCriterion("EHR_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andEhrTitleEqualTo(String value) {
            addCriterion("EHR_TITLE =", value, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleNotEqualTo(String value) {
            addCriterion("EHR_TITLE <>", value, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleGreaterThan(String value) {
            addCriterion("EHR_TITLE >", value, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_TITLE >=", value, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLessThan(String value) {
            addCriterion("EHR_TITLE <", value, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLessThanOrEqualTo(String value) {
            addCriterion("EHR_TITLE <=", value, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLike(String value) {
            addCriterion("EHR_TITLE like", value, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleNotLike(String value) {
            addCriterion("EHR_TITLE not like", value, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleIn(List<String> values) {
            addCriterion("EHR_TITLE in", values, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleNotIn(List<String> values) {
            addCriterion("EHR_TITLE not in", values, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleBetween(String value1, String value2) {
            addCriterion("EHR_TITLE between", value1, value2, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleNotBetween(String value1, String value2) {
            addCriterion("EHR_TITLE not between", value1, value2, "ehrTitle");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelIsNull() {
            addCriterion("EHR_TITLE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelIsNotNull() {
            addCriterion("EHR_TITLE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelEqualTo(String value) {
            addCriterion("EHR_TITLE_LEVEL =", value, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelNotEqualTo(String value) {
            addCriterion("EHR_TITLE_LEVEL <>", value, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelGreaterThan(String value) {
            addCriterion("EHR_TITLE_LEVEL >", value, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_TITLE_LEVEL >=", value, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelLessThan(String value) {
            addCriterion("EHR_TITLE_LEVEL <", value, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelLessThanOrEqualTo(String value) {
            addCriterion("EHR_TITLE_LEVEL <=", value, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelLike(String value) {
            addCriterion("EHR_TITLE_LEVEL like", value, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelNotLike(String value) {
            addCriterion("EHR_TITLE_LEVEL not like", value, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelIn(List<String> values) {
            addCriterion("EHR_TITLE_LEVEL in", values, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelNotIn(List<String> values) {
            addCriterion("EHR_TITLE_LEVEL not in", values, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelBetween(String value1, String value2) {
            addCriterion("EHR_TITLE_LEVEL between", value1, value2, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleLevelNotBetween(String value1, String value2) {
            addCriterion("EHR_TITLE_LEVEL not between", value1, value2, "ehrTitleLevel");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorIsNull() {
            addCriterion("EHR_TITLE_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorIsNotNull() {
            addCriterion("EHR_TITLE_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorEqualTo(String value) {
            addCriterion("EHR_TITLE_MAJOR =", value, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorNotEqualTo(String value) {
            addCriterion("EHR_TITLE_MAJOR <>", value, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorGreaterThan(String value) {
            addCriterion("EHR_TITLE_MAJOR >", value, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_TITLE_MAJOR >=", value, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorLessThan(String value) {
            addCriterion("EHR_TITLE_MAJOR <", value, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorLessThanOrEqualTo(String value) {
            addCriterion("EHR_TITLE_MAJOR <=", value, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorLike(String value) {
            addCriterion("EHR_TITLE_MAJOR like", value, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorNotLike(String value) {
            addCriterion("EHR_TITLE_MAJOR not like", value, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorIn(List<String> values) {
            addCriterion("EHR_TITLE_MAJOR in", values, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorNotIn(List<String> values) {
            addCriterion("EHR_TITLE_MAJOR not in", values, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorBetween(String value1, String value2) {
            addCriterion("EHR_TITLE_MAJOR between", value1, value2, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrTitleMajorNotBetween(String value1, String value2) {
            addCriterion("EHR_TITLE_MAJOR not between", value1, value2, "ehrTitleMajor");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyIsNull() {
            addCriterion("EHR_ADMINISTRATIVE_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyIsNotNull() {
            addCriterion("EHR_ADMINISTRATIVE_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY =", value, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyNotEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY <>", value, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyGreaterThan(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY >", value, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY >=", value, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLessThan(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY <", value, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLessThanOrEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY <=", value, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLike(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY like", value, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyNotLike(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY not like", value, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyIn(List<String> values) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY in", values, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyNotIn(List<String> values) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY not in", values, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyBetween(String value1, String value2) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY between", value1, value2, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyNotBetween(String value1, String value2) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY not between", value1, value2, "ehrAdministrativeDuty");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelIsNull() {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelIsNotNull() {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL =", value, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelNotEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL <>", value, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelGreaterThan(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL >", value, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL >=", value, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelLessThan(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL <", value, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelLessThanOrEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL <=", value, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelLike(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL like", value, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelNotLike(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL not like", value, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelIn(List<String> values) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL in", values, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelNotIn(List<String> values) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL not in", values, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelBetween(String value1, String value2) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL between", value1, value2, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyLevelNotBetween(String value1, String value2) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_LEVEL not between", value1, value2, "ehrAdministrativeDutyLevel");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankIsNull() {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK is null");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankIsNotNull() {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK =", value, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankNotEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK <>", value, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankGreaterThan(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK >", value, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK >=", value, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankLessThan(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK <", value, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankLessThanOrEqualTo(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK <=", value, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankLike(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK like", value, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankNotLike(String value) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK not like", value, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankIn(List<String> values) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK in", values, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankNotIn(List<String> values) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK not in", values, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankBetween(String value1, String value2) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK between", value1, value2, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrAdministrativeDutyRankNotBetween(String value1, String value2) {
            addCriterion("EHR_ADMINISTRATIVE_DUTY_RANK not between", value1, value2, "ehrAdministrativeDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyIsNull() {
            addCriterion("EHR_TEACHER_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyIsNotNull() {
            addCriterion("EHR_TEACHER_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyEqualTo(String value) {
            addCriterion("EHR_TEACHER_DUTY =", value, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyNotEqualTo(String value) {
            addCriterion("EHR_TEACHER_DUTY <>", value, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyGreaterThan(String value) {
            addCriterion("EHR_TEACHER_DUTY >", value, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_TEACHER_DUTY >=", value, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyLessThan(String value) {
            addCriterion("EHR_TEACHER_DUTY <", value, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyLessThanOrEqualTo(String value) {
            addCriterion("EHR_TEACHER_DUTY <=", value, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyLike(String value) {
            addCriterion("EHR_TEACHER_DUTY like", value, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyNotLike(String value) {
            addCriterion("EHR_TEACHER_DUTY not like", value, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyIn(List<String> values) {
            addCriterion("EHR_TEACHER_DUTY in", values, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyNotIn(List<String> values) {
            addCriterion("EHR_TEACHER_DUTY not in", values, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyBetween(String value1, String value2) {
            addCriterion("EHR_TEACHER_DUTY between", value1, value2, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyNotBetween(String value1, String value2) {
            addCriterion("EHR_TEACHER_DUTY not between", value1, value2, "ehrTeacherDuty");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankIsNull() {
            addCriterion("EHR_TEACHER_DUTY_RANK is null");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankIsNotNull() {
            addCriterion("EHR_TEACHER_DUTY_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankEqualTo(String value) {
            addCriterion("EHR_TEACHER_DUTY_RANK =", value, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankNotEqualTo(String value) {
            addCriterion("EHR_TEACHER_DUTY_RANK <>", value, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankGreaterThan(String value) {
            addCriterion("EHR_TEACHER_DUTY_RANK >", value, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_TEACHER_DUTY_RANK >=", value, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankLessThan(String value) {
            addCriterion("EHR_TEACHER_DUTY_RANK <", value, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankLessThanOrEqualTo(String value) {
            addCriterion("EHR_TEACHER_DUTY_RANK <=", value, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankLike(String value) {
            addCriterion("EHR_TEACHER_DUTY_RANK like", value, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankNotLike(String value) {
            addCriterion("EHR_TEACHER_DUTY_RANK not like", value, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankIn(List<String> values) {
            addCriterion("EHR_TEACHER_DUTY_RANK in", values, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankNotIn(List<String> values) {
            addCriterion("EHR_TEACHER_DUTY_RANK not in", values, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankBetween(String value1, String value2) {
            addCriterion("EHR_TEACHER_DUTY_RANK between", value1, value2, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrTeacherDutyRankNotBetween(String value1, String value2) {
            addCriterion("EHR_TEACHER_DUTY_RANK not between", value1, value2, "ehrTeacherDutyRank");
            return (Criteria) this;
        }

        public Criteria andEhrDeptIsNull() {
            addCriterion("EHR_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andEhrDeptIsNotNull() {
            addCriterion("EHR_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andEhrDeptEqualTo(String value) {
            addCriterion("EHR_DEPT =", value, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptNotEqualTo(String value) {
            addCriterion("EHR_DEPT <>", value, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptGreaterThan(String value) {
            addCriterion("EHR_DEPT >", value, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptGreaterThanOrEqualTo(String value) {
            addCriterion("EHR_DEPT >=", value, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptLessThan(String value) {
            addCriterion("EHR_DEPT <", value, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptLessThanOrEqualTo(String value) {
            addCriterion("EHR_DEPT <=", value, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptLike(String value) {
            addCriterion("EHR_DEPT like", value, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptNotLike(String value) {
            addCriterion("EHR_DEPT not like", value, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptIn(List<String> values) {
            addCriterion("EHR_DEPT in", values, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptNotIn(List<String> values) {
            addCriterion("EHR_DEPT not in", values, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptBetween(String value1, String value2) {
            addCriterion("EHR_DEPT between", value1, value2, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andEhrDeptNotBetween(String value1, String value2) {
            addCriterion("EHR_DEPT not between", value1, value2, "ehrDept");
            return (Criteria) this;
        }

        public Criteria andWageRankIsNull() {
            addCriterion("WAGE_RANK is null");
            return (Criteria) this;
        }

        public Criteria andWageRankIsNotNull() {
            addCriterion("WAGE_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andWageRankEqualTo(String value) {
            addCriterion("WAGE_RANK =", value, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankNotEqualTo(String value) {
            addCriterion("WAGE_RANK <>", value, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankGreaterThan(String value) {
            addCriterion("WAGE_RANK >", value, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankGreaterThanOrEqualTo(String value) {
            addCriterion("WAGE_RANK >=", value, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankLessThan(String value) {
            addCriterion("WAGE_RANK <", value, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankLessThanOrEqualTo(String value) {
            addCriterion("WAGE_RANK <=", value, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankLike(String value) {
            addCriterion("WAGE_RANK like", value, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankNotLike(String value) {
            addCriterion("WAGE_RANK not like", value, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankIn(List<String> values) {
            addCriterion("WAGE_RANK in", values, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankNotIn(List<String> values) {
            addCriterion("WAGE_RANK not in", values, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankBetween(String value1, String value2) {
            addCriterion("WAGE_RANK between", value1, value2, "wageRank");
            return (Criteria) this;
        }

        public Criteria andWageRankNotBetween(String value1, String value2) {
            addCriterion("WAGE_RANK not between", value1, value2, "wageRank");
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