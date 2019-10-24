package com.tuiba.saasadmininster.xxfxComment.bean;

import java.util.ArrayList;
import java.util.List;

public class Xxfx_commentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Xxfx_commentExample() {
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

        public Criteria andXxfxCommentIdIsNull() {
            addCriterion("xxfx_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdIsNotNull() {
            addCriterion("xxfx_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdEqualTo(Integer value) {
            addCriterion("xxfx_comment_id =", value, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdNotEqualTo(Integer value) {
            addCriterion("xxfx_comment_id <>", value, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdGreaterThan(Integer value) {
            addCriterion("xxfx_comment_id >", value, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxfx_comment_id >=", value, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdLessThan(Integer value) {
            addCriterion("xxfx_comment_id <", value, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("xxfx_comment_id <=", value, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdIn(List<Integer> values) {
            addCriterion("xxfx_comment_id in", values, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdNotIn(List<Integer> values) {
            addCriterion("xxfx_comment_id not in", values, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_comment_id between", value1, value2, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_comment_id not between", value1, value2, "xxfxCommentId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdIsNull() {
            addCriterion("xxfx_id is null");
            return (Criteria) this;
        }

        public Criteria andXxfxIdIsNotNull() {
            addCriterion("xxfx_id is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxIdEqualTo(Integer value) {
            addCriterion("xxfx_id =", value, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdNotEqualTo(Integer value) {
            addCriterion("xxfx_id <>", value, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdGreaterThan(Integer value) {
            addCriterion("xxfx_id >", value, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxfx_id >=", value, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdLessThan(Integer value) {
            addCriterion("xxfx_id <", value, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdLessThanOrEqualTo(Integer value) {
            addCriterion("xxfx_id <=", value, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdIn(List<Integer> values) {
            addCriterion("xxfx_id in", values, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdNotIn(List<Integer> values) {
            addCriterion("xxfx_id not in", values, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_id between", value1, value2, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_id not between", value1, value2, "xxfxId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdIsNull() {
            addCriterion("xxfx_comment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdIsNotNull() {
            addCriterion("xxfx_comment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdEqualTo(Integer value) {
            addCriterion("xxfx_comment_type_id =", value, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdNotEqualTo(Integer value) {
            addCriterion("xxfx_comment_type_id <>", value, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdGreaterThan(Integer value) {
            addCriterion("xxfx_comment_type_id >", value, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxfx_comment_type_id >=", value, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdLessThan(Integer value) {
            addCriterion("xxfx_comment_type_id <", value, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("xxfx_comment_type_id <=", value, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdIn(List<Integer> values) {
            addCriterion("xxfx_comment_type_id in", values, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdNotIn(List<Integer> values) {
            addCriterion("xxfx_comment_type_id not in", values, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_comment_type_id between", value1, value2, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_comment_type_id not between", value1, value2, "xxfxCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateIsNull() {
            addCriterion("xxfx_comment_date is null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateIsNotNull() {
            addCriterion("xxfx_comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateEqualTo(Long value) {
            addCriterion("xxfx_comment_date =", value, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateNotEqualTo(Long value) {
            addCriterion("xxfx_comment_date <>", value, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateGreaterThan(Long value) {
            addCriterion("xxfx_comment_date >", value, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateGreaterThanOrEqualTo(Long value) {
            addCriterion("xxfx_comment_date >=", value, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateLessThan(Long value) {
            addCriterion("xxfx_comment_date <", value, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateLessThanOrEqualTo(Long value) {
            addCriterion("xxfx_comment_date <=", value, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateIn(List<Long> values) {
            addCriterion("xxfx_comment_date in", values, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateNotIn(List<Long> values) {
            addCriterion("xxfx_comment_date not in", values, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateBetween(Long value1, Long value2) {
            addCriterion("xxfx_comment_date between", value1, value2, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentDateNotBetween(Long value1, Long value2) {
            addCriterion("xxfx_comment_date not between", value1, value2, "xxfxCommentDate");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusIsNull() {
            addCriterion("xxfx_comment_status is null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusIsNotNull() {
            addCriterion("xxfx_comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusEqualTo(Integer value) {
            addCriterion("xxfx_comment_status =", value, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusNotEqualTo(Integer value) {
            addCriterion("xxfx_comment_status <>", value, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusGreaterThan(Integer value) {
            addCriterion("xxfx_comment_status >", value, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxfx_comment_status >=", value, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusLessThan(Integer value) {
            addCriterion("xxfx_comment_status <", value, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("xxfx_comment_status <=", value, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusIn(List<Integer> values) {
            addCriterion("xxfx_comment_status in", values, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusNotIn(List<Integer> values) {
            addCriterion("xxfx_comment_status not in", values, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_comment_status between", value1, value2, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_comment_status not between", value1, value2, "xxfxCommentStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeIsNull() {
            addCriterion("xxfx_comment_status_time is null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeIsNotNull() {
            addCriterion("xxfx_comment_status_time is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeEqualTo(Long value) {
            addCriterion("xxfx_comment_status_time =", value, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeNotEqualTo(Long value) {
            addCriterion("xxfx_comment_status_time <>", value, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeGreaterThan(Long value) {
            addCriterion("xxfx_comment_status_time >", value, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("xxfx_comment_status_time >=", value, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeLessThan(Long value) {
            addCriterion("xxfx_comment_status_time <", value, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeLessThanOrEqualTo(Long value) {
            addCriterion("xxfx_comment_status_time <=", value, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeIn(List<Long> values) {
            addCriterion("xxfx_comment_status_time in", values, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeNotIn(List<Long> values) {
            addCriterion("xxfx_comment_status_time not in", values, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeBetween(Long value1, Long value2) {
            addCriterion("xxfx_comment_status_time between", value1, value2, "xxfxCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCommentStatusTimeNotBetween(Long value1, Long value2) {
            addCriterion("xxfx_comment_status_time not between", value1, value2, "xxfxCommentStatusTime");
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

        public Criteria andBak1EqualTo(String value) {
            addCriterion("bak1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(String value) {
            addCriterion("bak1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(String value) {
            addCriterion("bak1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(String value) {
            addCriterion("bak1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(String value) {
            addCriterion("bak1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(String value) {
            addCriterion("bak1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Like(String value) {
            addCriterion("bak1 like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotLike(String value) {
            addCriterion("bak1 not like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<String> values) {
            addCriterion("bak1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<String> values) {
            addCriterion("bak1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(String value1, String value2) {
            addCriterion("bak1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(String value1, String value2) {
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