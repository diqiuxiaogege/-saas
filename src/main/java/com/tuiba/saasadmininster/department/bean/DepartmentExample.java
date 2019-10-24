package com.tuiba.saasadmininster.department.bean;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalIsNull() {
            addCriterion("department_principal is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalIsNotNull() {
            addCriterion("department_principal is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalEqualTo(String value) {
            addCriterion("department_principal =", value, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalNotEqualTo(String value) {
            addCriterion("department_principal <>", value, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalGreaterThan(String value) {
            addCriterion("department_principal >", value, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("department_principal >=", value, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalLessThan(String value) {
            addCriterion("department_principal <", value, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalLessThanOrEqualTo(String value) {
            addCriterion("department_principal <=", value, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalLike(String value) {
            addCriterion("department_principal like", value, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalNotLike(String value) {
            addCriterion("department_principal not like", value, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalIn(List<String> values) {
            addCriterion("department_principal in", values, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalNotIn(List<String> values) {
            addCriterion("department_principal not in", values, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalBetween(String value1, String value2) {
            addCriterion("department_principal between", value1, value2, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentPrincipalNotBetween(String value1, String value2) {
            addCriterion("department_principal not between", value1, value2, "departmentPrincipal");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindIsNull() {
            addCriterion("department_bind is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindIsNotNull() {
            addCriterion("department_bind is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindEqualTo(Integer value) {
            addCriterion("department_bind =", value, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindNotEqualTo(Integer value) {
            addCriterion("department_bind <>", value, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindGreaterThan(Integer value) {
            addCriterion("department_bind >", value, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_bind >=", value, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindLessThan(Integer value) {
            addCriterion("department_bind <", value, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindLessThanOrEqualTo(Integer value) {
            addCriterion("department_bind <=", value, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindIn(List<Integer> values) {
            addCriterion("department_bind in", values, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindNotIn(List<Integer> values) {
            addCriterion("department_bind not in", values, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindBetween(Integer value1, Integer value2) {
            addCriterion("department_bind between", value1, value2, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentBindNotBetween(Integer value1, Integer value2) {
            addCriterion("department_bind not between", value1, value2, "departmentBind");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeIsNull() {
            addCriterion("department_add_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeIsNotNull() {
            addCriterion("department_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeEqualTo(Long value) {
            addCriterion("department_add_time =", value, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeNotEqualTo(Long value) {
            addCriterion("department_add_time <>", value, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeGreaterThan(Long value) {
            addCriterion("department_add_time >", value, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("department_add_time >=", value, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeLessThan(Long value) {
            addCriterion("department_add_time <", value, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeLessThanOrEqualTo(Long value) {
            addCriterion("department_add_time <=", value, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeIn(List<Long> values) {
            addCriterion("department_add_time in", values, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeNotIn(List<Long> values) {
            addCriterion("department_add_time not in", values, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeBetween(Long value1, Long value2) {
            addCriterion("department_add_time between", value1, value2, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddTimeNotBetween(Long value1, Long value2) {
            addCriterion("department_add_time not between", value1, value2, "departmentAddTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeIsNull() {
            addCriterion("department_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeIsNotNull() {
            addCriterion("department_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeEqualTo(Long value) {
            addCriterion("department_modify_time =", value, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeNotEqualTo(Long value) {
            addCriterion("department_modify_time <>", value, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeGreaterThan(Long value) {
            addCriterion("department_modify_time >", value, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("department_modify_time >=", value, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeLessThan(Long value) {
            addCriterion("department_modify_time <", value, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeLessThanOrEqualTo(Long value) {
            addCriterion("department_modify_time <=", value, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeIn(List<Long> values) {
            addCriterion("department_modify_time in", values, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeNotIn(List<Long> values) {
            addCriterion("department_modify_time not in", values, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeBetween(Long value1, Long value2) {
            addCriterion("department_modify_time between", value1, value2, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifyTimeNotBetween(Long value1, Long value2) {
            addCriterion("department_modify_time not between", value1, value2, "departmentModifyTime");
            return (Criteria) this;
        }

        public Criteria andBak1IsNull() {
            addCriterion("bak1 is null");
            return (Criteria) this;
        }

        public Criteria andBak1IsNotNull() {
            addCriterion("bak1 is not null");
            return (Criteria) this;
        }

        public Criteria andBak1EqualTo(Long value) {
            addCriterion("bak1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(Long value) {
            addCriterion("bak1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(Long value) {
            addCriterion("bak1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(Long value) {
            addCriterion("bak1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(Long value) {
            addCriterion("bak1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(Long value) {
            addCriterion("bak1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<Long> values) {
            addCriterion("bak1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<Long> values) {
            addCriterion("bak1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(Long value1, Long value2) {
            addCriterion("bak1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(Long value1, Long value2) {
            addCriterion("bak1 not between", value1, value2, "bak1");
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