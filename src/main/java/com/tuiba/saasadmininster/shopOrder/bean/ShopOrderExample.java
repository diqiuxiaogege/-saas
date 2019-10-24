package com.tuiba.saasadmininster.shopOrder.bean;

import java.util.ArrayList;
import java.util.List;

public class ShopOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrderExample() {
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

        public Criteria andShopOrderIdIsNull() {
            addCriterion("shop_order_id is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdIsNotNull() {
            addCriterion("shop_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdEqualTo(Integer value) {
            addCriterion("shop_order_id =", value, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdNotEqualTo(Integer value) {
            addCriterion("shop_order_id <>", value, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdGreaterThan(Integer value) {
            addCriterion("shop_order_id >", value, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_order_id >=", value, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdLessThan(Integer value) {
            addCriterion("shop_order_id <", value, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_order_id <=", value, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdIn(List<Integer> values) {
            addCriterion("shop_order_id in", values, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdNotIn(List<Integer> values) {
            addCriterion("shop_order_id not in", values, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_order_id between", value1, value2, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShopOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_order_id not between", value1, value2, "shopOrderId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdIsNull() {
            addCriterion("sho_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShoShopIdIsNotNull() {
            addCriterion("sho_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoShopIdEqualTo(Integer value) {
            addCriterion("sho_shop_id =", value, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdNotEqualTo(Integer value) {
            addCriterion("sho_shop_id <>", value, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdGreaterThan(Integer value) {
            addCriterion("sho_shop_id >", value, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sho_shop_id >=", value, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdLessThan(Integer value) {
            addCriterion("sho_shop_id <", value, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("sho_shop_id <=", value, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdIn(List<Integer> values) {
            addCriterion("sho_shop_id in", values, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdNotIn(List<Integer> values) {
            addCriterion("sho_shop_id not in", values, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdBetween(Integer value1, Integer value2) {
            addCriterion("sho_shop_id between", value1, value2, "shoShopId");
            return (Criteria) this;
        }

        public Criteria andShoShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sho_shop_id not between", value1, value2, "shoShopId");
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

        public Criteria andShopOrderNumIsNull() {
            addCriterion("shop_order_num is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumIsNotNull() {
            addCriterion("shop_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumEqualTo(String value) {
            addCriterion("shop_order_num =", value, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumNotEqualTo(String value) {
            addCriterion("shop_order_num <>", value, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumGreaterThan(String value) {
            addCriterion("shop_order_num >", value, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("shop_order_num >=", value, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumLessThan(String value) {
            addCriterion("shop_order_num <", value, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumLessThanOrEqualTo(String value) {
            addCriterion("shop_order_num <=", value, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumLike(String value) {
            addCriterion("shop_order_num like", value, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumNotLike(String value) {
            addCriterion("shop_order_num not like", value, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumIn(List<String> values) {
            addCriterion("shop_order_num in", values, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumNotIn(List<String> values) {
            addCriterion("shop_order_num not in", values, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumBetween(String value1, String value2) {
            addCriterion("shop_order_num between", value1, value2, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopOrderNumNotBetween(String value1, String value2) {
            addCriterion("shop_order_num not between", value1, value2, "shopOrderNum");
            return (Criteria) this;
        }

        public Criteria andShopCdkIsNull() {
            addCriterion("shop_cdk is null");
            return (Criteria) this;
        }

        public Criteria andShopCdkIsNotNull() {
            addCriterion("shop_cdk is not null");
            return (Criteria) this;
        }

        public Criteria andShopCdkEqualTo(String value) {
            addCriterion("shop_cdk =", value, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkNotEqualTo(String value) {
            addCriterion("shop_cdk <>", value, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkGreaterThan(String value) {
            addCriterion("shop_cdk >", value, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkGreaterThanOrEqualTo(String value) {
            addCriterion("shop_cdk >=", value, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkLessThan(String value) {
            addCriterion("shop_cdk <", value, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkLessThanOrEqualTo(String value) {
            addCriterion("shop_cdk <=", value, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkLike(String value) {
            addCriterion("shop_cdk like", value, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkNotLike(String value) {
            addCriterion("shop_cdk not like", value, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkIn(List<String> values) {
            addCriterion("shop_cdk in", values, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkNotIn(List<String> values) {
            addCriterion("shop_cdk not in", values, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkBetween(String value1, String value2) {
            addCriterion("shop_cdk between", value1, value2, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopCdkNotBetween(String value1, String value2) {
            addCriterion("shop_cdk not between", value1, value2, "shopCdk");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateIsNull() {
            addCriterion("shop_order_date is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateIsNotNull() {
            addCriterion("shop_order_date is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateEqualTo(Long value) {
            addCriterion("shop_order_date =", value, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateNotEqualTo(Long value) {
            addCriterion("shop_order_date <>", value, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateGreaterThan(Long value) {
            addCriterion("shop_order_date >", value, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_order_date >=", value, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateLessThan(Long value) {
            addCriterion("shop_order_date <", value, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateLessThanOrEqualTo(Long value) {
            addCriterion("shop_order_date <=", value, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateIn(List<Long> values) {
            addCriterion("shop_order_date in", values, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateNotIn(List<Long> values) {
            addCriterion("shop_order_date not in", values, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateBetween(Long value1, Long value2) {
            addCriterion("shop_order_date between", value1, value2, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderDateNotBetween(Long value1, Long value2) {
            addCriterion("shop_order_date not between", value1, value2, "shopOrderDate");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreIsNull() {
            addCriterion("shop_order_score is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreIsNotNull() {
            addCriterion("shop_order_score is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreEqualTo(Integer value) {
            addCriterion("shop_order_score =", value, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreNotEqualTo(Integer value) {
            addCriterion("shop_order_score <>", value, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreGreaterThan(Integer value) {
            addCriterion("shop_order_score >", value, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_order_score >=", value, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreLessThan(Integer value) {
            addCriterion("shop_order_score <", value, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreLessThanOrEqualTo(Integer value) {
            addCriterion("shop_order_score <=", value, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreIn(List<Integer> values) {
            addCriterion("shop_order_score in", values, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreNotIn(List<Integer> values) {
            addCriterion("shop_order_score not in", values, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreBetween(Integer value1, Integer value2) {
            addCriterion("shop_order_score between", value1, value2, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopOrderScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_order_score not between", value1, value2, "shopOrderScore");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNull() {
            addCriterion("shop_status is null");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNotNull() {
            addCriterion("shop_status is not null");
            return (Criteria) this;
        }

        public Criteria andShopStatusEqualTo(Integer value) {
            addCriterion("shop_status =", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotEqualTo(Integer value) {
            addCriterion("shop_status <>", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThan(Integer value) {
            addCriterion("shop_status >", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_status >=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThan(Integer value) {
            addCriterion("shop_status <", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shop_status <=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusIn(List<Integer> values) {
            addCriterion("shop_status in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotIn(List<Integer> values) {
            addCriterion("shop_status not in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusBetween(Integer value1, Integer value2) {
            addCriterion("shop_status between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_status not between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeIsNull() {
            addCriterion("shop_shenhe_time is null");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeIsNotNull() {
            addCriterion("shop_shenhe_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeEqualTo(Long value) {
            addCriterion("shop_shenhe_time =", value, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeNotEqualTo(Long value) {
            addCriterion("shop_shenhe_time <>", value, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeGreaterThan(Long value) {
            addCriterion("shop_shenhe_time >", value, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_shenhe_time >=", value, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeLessThan(Long value) {
            addCriterion("shop_shenhe_time <", value, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeLessThanOrEqualTo(Long value) {
            addCriterion("shop_shenhe_time <=", value, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeIn(List<Long> values) {
            addCriterion("shop_shenhe_time in", values, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeNotIn(List<Long> values) {
            addCriterion("shop_shenhe_time not in", values, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeBetween(Long value1, Long value2) {
            addCriterion("shop_shenhe_time between", value1, value2, "shopShenheTime");
            return (Criteria) this;
        }

        public Criteria andShopShenheTimeNotBetween(Long value1, Long value2) {
            addCriterion("shop_shenhe_time not between", value1, value2, "shopShenheTime");
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