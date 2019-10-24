package com.tuiba.saasadmininster.wdqzComment.bean;

import java.util.ArrayList;
import java.util.List;

public class Wdqz_commentExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wdqz_commentExample() {
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

        public Criteria andWdqzCommentIdIsNull() {
            addCriterion("wdqz_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdIsNotNull() {
            addCriterion("wdqz_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdEqualTo(Integer value) {
            addCriterion("wdqz_comment_id =", value, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdNotEqualTo(Integer value) {
            addCriterion("wdqz_comment_id <>", value, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdGreaterThan(Integer value) {
            addCriterion("wdqz_comment_id >", value, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wdqz_comment_id >=", value, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdLessThan(Integer value) {
            addCriterion("wdqz_comment_id <", value, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("wdqz_comment_id <=", value, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdIn(List<Integer> values) {
            addCriterion("wdqz_comment_id in", values, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdNotIn(List<Integer> values) {
            addCriterion("wdqz_comment_id not in", values, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_comment_id between", value1, value2, "wdqzCommentId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_comment_id not between", value1, value2, "wdqzCommentId");
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

        public Criteria andWdqzIdIsNull() {
            addCriterion("wdqz_id is null");
            return (Criteria) this;
        }

        public Criteria andWdqzIdIsNotNull() {
            addCriterion("wdqz_id is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzIdEqualTo(Integer value) {
            addCriterion("wdqz_id =", value, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdNotEqualTo(Integer value) {
            addCriterion("wdqz_id <>", value, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdGreaterThan(Integer value) {
            addCriterion("wdqz_id >", value, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wdqz_id >=", value, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdLessThan(Integer value) {
            addCriterion("wdqz_id <", value, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdLessThanOrEqualTo(Integer value) {
            addCriterion("wdqz_id <=", value, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdIn(List<Integer> values) {
            addCriterion("wdqz_id in", values, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdNotIn(List<Integer> values) {
            addCriterion("wdqz_id not in", values, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_id between", value1, value2, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_id not between", value1, value2, "wdqzId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentIsNull() {
            addCriterion("wdqz_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentIsNotNull() {
            addCriterion("wdqz_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentEqualTo(String value) {
            addCriterion("wdqz_comment_content =", value, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentNotEqualTo(String value) {
            addCriterion("wdqz_comment_content <>", value, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentGreaterThan(String value) {
            addCriterion("wdqz_comment_content >", value, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("wdqz_comment_content >=", value, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentLessThan(String value) {
            addCriterion("wdqz_comment_content <", value, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentLessThanOrEqualTo(String value) {
            addCriterion("wdqz_comment_content <=", value, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentLike(String value) {
            addCriterion("wdqz_comment_content like", value, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentNotLike(String value) {
            addCriterion("wdqz_comment_content not like", value, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentIn(List<String> values) {
            addCriterion("wdqz_comment_content in", values, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentNotIn(List<String> values) {
            addCriterion("wdqz_comment_content not in", values, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentBetween(String value1, String value2) {
            addCriterion("wdqz_comment_content between", value1, value2, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentContentNotBetween(String value1, String value2) {
            addCriterion("wdqz_comment_content not between", value1, value2, "wdqzCommentContent");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateIsNull() {
            addCriterion("wqdz_comment_date is null");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateIsNotNull() {
            addCriterion("wqdz_comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateEqualTo(Long value) {
            addCriterion("wqdz_comment_date =", value, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateNotEqualTo(Long value) {
            addCriterion("wqdz_comment_date <>", value, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateGreaterThan(Long value) {
            addCriterion("wqdz_comment_date >", value, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateGreaterThanOrEqualTo(Long value) {
            addCriterion("wqdz_comment_date >=", value, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateLessThan(Long value) {
            addCriterion("wqdz_comment_date <", value, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateLessThanOrEqualTo(Long value) {
            addCriterion("wqdz_comment_date <=", value, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateIn(List<Long> values) {
            addCriterion("wqdz_comment_date in", values, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateNotIn(List<Long> values) {
            addCriterion("wqdz_comment_date not in", values, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateBetween(Long value1, Long value2) {
            addCriterion("wqdz_comment_date between", value1, value2, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentDateNotBetween(Long value1, Long value2) {
            addCriterion("wqdz_comment_date not between", value1, value2, "wqdzCommentDate");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdIsNull() {
            addCriterion("wqdz_comment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdIsNotNull() {
            addCriterion("wqdz_comment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdEqualTo(Integer value) {
            addCriterion("wqdz_comment_type_id =", value, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdNotEqualTo(Integer value) {
            addCriterion("wqdz_comment_type_id <>", value, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdGreaterThan(Integer value) {
            addCriterion("wqdz_comment_type_id >", value, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wqdz_comment_type_id >=", value, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdLessThan(Integer value) {
            addCriterion("wqdz_comment_type_id <", value, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("wqdz_comment_type_id <=", value, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdIn(List<Integer> values) {
            addCriterion("wqdz_comment_type_id in", values, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdNotIn(List<Integer> values) {
            addCriterion("wqdz_comment_type_id not in", values, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("wqdz_comment_type_id between", value1, value2, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWqdzCommentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wqdz_comment_type_id not between", value1, value2, "wqdzCommentTypeId");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusIsNull() {
            addCriterion("wdqz_comment_status is null");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusIsNotNull() {
            addCriterion("wdqz_comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusEqualTo(Integer value) {
            addCriterion("wdqz_comment_status =", value, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusNotEqualTo(Integer value) {
            addCriterion("wdqz_comment_status <>", value, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusGreaterThan(Integer value) {
            addCriterion("wdqz_comment_status >", value, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wdqz_comment_status >=", value, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusLessThan(Integer value) {
            addCriterion("wdqz_comment_status <", value, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("wdqz_comment_status <=", value, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusIn(List<Integer> values) {
            addCriterion("wdqz_comment_status in", values, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusNotIn(List<Integer> values) {
            addCriterion("wdqz_comment_status not in", values, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_comment_status between", value1, value2, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_comment_status not between", value1, value2, "wdqzCommentStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeIsNull() {
            addCriterion("wdqz_comment_status_time is null");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeIsNotNull() {
            addCriterion("wdqz_comment_status_time is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeEqualTo(Long value) {
            addCriterion("wdqz_comment_status_time =", value, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeNotEqualTo(Long value) {
            addCriterion("wdqz_comment_status_time <>", value, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeGreaterThan(Long value) {
            addCriterion("wdqz_comment_status_time >", value, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wdqz_comment_status_time >=", value, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeLessThan(Long value) {
            addCriterion("wdqz_comment_status_time <", value, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeLessThanOrEqualTo(Long value) {
            addCriterion("wdqz_comment_status_time <=", value, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeIn(List<Long> values) {
            addCriterion("wdqz_comment_status_time in", values, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeNotIn(List<Long> values) {
            addCriterion("wdqz_comment_status_time not in", values, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeBetween(Long value1, Long value2) {
            addCriterion("wdqz_comment_status_time between", value1, value2, "wdqzCommentStatusTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCommentStatusTimeNotBetween(Long value1, Long value2) {
            addCriterion("wdqz_comment_status_time not between", value1, value2, "wdqzCommentStatusTime");
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