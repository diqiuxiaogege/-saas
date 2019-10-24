package com.tuiba.saasadmininster.forum.bean;

import java.util.ArrayList;
import java.util.List;

public class ForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumExample() {
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

        public Criteria andForumIdIsNull() {
            addCriterion("forum_id is null");
            return (Criteria) this;
        }

        public Criteria andForumIdIsNotNull() {
            addCriterion("forum_id is not null");
            return (Criteria) this;
        }

        public Criteria andForumIdEqualTo(Integer value) {
            addCriterion("forum_id =", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotEqualTo(Integer value) {
            addCriterion("forum_id <>", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThan(Integer value) {
            addCriterion("forum_id >", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("forum_id >=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThan(Integer value) {
            addCriterion("forum_id <", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThanOrEqualTo(Integer value) {
            addCriterion("forum_id <=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdIn(List<Integer> values) {
            addCriterion("forum_id in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotIn(List<Integer> values) {
            addCriterion("forum_id not in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdBetween(Integer value1, Integer value2) {
            addCriterion("forum_id between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("forum_id not between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumNameIsNull() {
            addCriterion("forum_name is null");
            return (Criteria) this;
        }

        public Criteria andForumNameIsNotNull() {
            addCriterion("forum_name is not null");
            return (Criteria) this;
        }

        public Criteria andForumNameEqualTo(String value) {
            addCriterion("forum_name =", value, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameNotEqualTo(String value) {
            addCriterion("forum_name <>", value, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameGreaterThan(String value) {
            addCriterion("forum_name >", value, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameGreaterThanOrEqualTo(String value) {
            addCriterion("forum_name >=", value, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameLessThan(String value) {
            addCriterion("forum_name <", value, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameLessThanOrEqualTo(String value) {
            addCriterion("forum_name <=", value, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameLike(String value) {
            addCriterion("forum_name like", value, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameNotLike(String value) {
            addCriterion("forum_name not like", value, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameIn(List<String> values) {
            addCriterion("forum_name in", values, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameNotIn(List<String> values) {
            addCriterion("forum_name not in", values, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameBetween(String value1, String value2) {
            addCriterion("forum_name between", value1, value2, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumNameNotBetween(String value1, String value2) {
            addCriterion("forum_name not between", value1, value2, "forumName");
            return (Criteria) this;
        }

        public Criteria andForumDateIsNull() {
            addCriterion("forum_date is null");
            return (Criteria) this;
        }

        public Criteria andForumDateIsNotNull() {
            addCriterion("forum_date is not null");
            return (Criteria) this;
        }

        public Criteria andForumDateEqualTo(Long value) {
            addCriterion("forum_date =", value, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateNotEqualTo(Long value) {
            addCriterion("forum_date <>", value, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateGreaterThan(Long value) {
            addCriterion("forum_date >", value, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateGreaterThanOrEqualTo(Long value) {
            addCriterion("forum_date >=", value, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateLessThan(Long value) {
            addCriterion("forum_date <", value, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateLessThanOrEqualTo(Long value) {
            addCriterion("forum_date <=", value, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateIn(List<Long> values) {
            addCriterion("forum_date in", values, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateNotIn(List<Long> values) {
            addCriterion("forum_date not in", values, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateBetween(Long value1, Long value2) {
            addCriterion("forum_date between", value1, value2, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumDateNotBetween(Long value1, Long value2) {
            addCriterion("forum_date not between", value1, value2, "forumDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateIsNull() {
            addCriterion("forum_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateIsNotNull() {
            addCriterion("forum_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateEqualTo(Long value) {
            addCriterion("forum_modify_date =", value, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateNotEqualTo(Long value) {
            addCriterion("forum_modify_date <>", value, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateGreaterThan(Long value) {
            addCriterion("forum_modify_date >", value, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateGreaterThanOrEqualTo(Long value) {
            addCriterion("forum_modify_date >=", value, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateLessThan(Long value) {
            addCriterion("forum_modify_date <", value, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateLessThanOrEqualTo(Long value) {
            addCriterion("forum_modify_date <=", value, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateIn(List<Long> values) {
            addCriterion("forum_modify_date in", values, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateNotIn(List<Long> values) {
            addCriterion("forum_modify_date not in", values, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateBetween(Long value1, Long value2) {
            addCriterion("forum_modify_date between", value1, value2, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumModifyDateNotBetween(Long value1, Long value2) {
            addCriterion("forum_modify_date not between", value1, value2, "forumModifyDate");
            return (Criteria) this;
        }

        public Criteria andForumTypeIsNull() {
            addCriterion("forum_type is null");
            return (Criteria) this;
        }

        public Criteria andForumTypeIsNotNull() {
            addCriterion("forum_type is not null");
            return (Criteria) this;
        }

        public Criteria andForumTypeEqualTo(Integer value) {
            addCriterion("forum_type =", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeNotEqualTo(Integer value) {
            addCriterion("forum_type <>", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeGreaterThan(Integer value) {
            addCriterion("forum_type >", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("forum_type >=", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeLessThan(Integer value) {
            addCriterion("forum_type <", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeLessThanOrEqualTo(Integer value) {
            addCriterion("forum_type <=", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeIn(List<Integer> values) {
            addCriterion("forum_type in", values, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeNotIn(List<Integer> values) {
            addCriterion("forum_type not in", values, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeBetween(Integer value1, Integer value2) {
            addCriterion("forum_type between", value1, value2, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("forum_type not between", value1, value2, "forumType");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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