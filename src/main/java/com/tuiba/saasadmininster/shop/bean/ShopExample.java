package com.tuiba.saasadmininster.shop.bean;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNumIsNull() {
            addCriterion("shop_num is null");
            return (Criteria) this;
        }

        public Criteria andShopNumIsNotNull() {
            addCriterion("shop_num is not null");
            return (Criteria) this;
        }

        public Criteria andShopNumEqualTo(Integer value) {
            addCriterion("shop_num =", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumNotEqualTo(Integer value) {
            addCriterion("shop_num <>", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumGreaterThan(Integer value) {
            addCriterion("shop_num >", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_num >=", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumLessThan(Integer value) {
            addCriterion("shop_num <", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("shop_num <=", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumIn(List<Integer> values) {
            addCriterion("shop_num in", values, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumNotIn(List<Integer> values) {
            addCriterion("shop_num not in", values, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumBetween(Integer value1, Integer value2) {
            addCriterion("shop_num between", value1, value2, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_num not between", value1, value2, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopScoreIsNull() {
            addCriterion("shop_score is null");
            return (Criteria) this;
        }

        public Criteria andShopScoreIsNotNull() {
            addCriterion("shop_score is not null");
            return (Criteria) this;
        }

        public Criteria andShopScoreEqualTo(Integer value) {
            addCriterion("shop_score =", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreNotEqualTo(Integer value) {
            addCriterion("shop_score <>", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreGreaterThan(Integer value) {
            addCriterion("shop_score >", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_score >=", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreLessThan(Integer value) {
            addCriterion("shop_score <", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreLessThanOrEqualTo(Integer value) {
            addCriterion("shop_score <=", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreIn(List<Integer> values) {
            addCriterion("shop_score in", values, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreNotIn(List<Integer> values) {
            addCriterion("shop_score not in", values, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreBetween(Integer value1, Integer value2) {
            addCriterion("shop_score between", value1, value2, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_score not between", value1, value2, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopAddDateIsNull() {
            addCriterion("shop_add_date is null");
            return (Criteria) this;
        }

        public Criteria andShopAddDateIsNotNull() {
            addCriterion("shop_add_date is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddDateEqualTo(Long value) {
            addCriterion("shop_add_date =", value, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateNotEqualTo(Long value) {
            addCriterion("shop_add_date <>", value, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateGreaterThan(Long value) {
            addCriterion("shop_add_date >", value, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_add_date >=", value, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateLessThan(Long value) {
            addCriterion("shop_add_date <", value, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateLessThanOrEqualTo(Long value) {
            addCriterion("shop_add_date <=", value, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateIn(List<Long> values) {
            addCriterion("shop_add_date in", values, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateNotIn(List<Long> values) {
            addCriterion("shop_add_date not in", values, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateBetween(Long value1, Long value2) {
            addCriterion("shop_add_date between", value1, value2, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopAddDateNotBetween(Long value1, Long value2) {
            addCriterion("shop_add_date not between", value1, value2, "shopAddDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateIsNull() {
            addCriterion("shop_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateIsNotNull() {
            addCriterion("shop_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateEqualTo(Long value) {
            addCriterion("shop_modify_date =", value, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateNotEqualTo(Long value) {
            addCriterion("shop_modify_date <>", value, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateGreaterThan(Long value) {
            addCriterion("shop_modify_date >", value, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_modify_date >=", value, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateLessThan(Long value) {
            addCriterion("shop_modify_date <", value, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateLessThanOrEqualTo(Long value) {
            addCriterion("shop_modify_date <=", value, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateIn(List<Long> values) {
            addCriterion("shop_modify_date in", values, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateNotIn(List<Long> values) {
            addCriterion("shop_modify_date not in", values, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateBetween(Long value1, Long value2) {
            addCriterion("shop_modify_date between", value1, value2, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopModifyDateNotBetween(Long value1, Long value2) {
            addCriterion("shop_modify_date not between", value1, value2, "shopModifyDate");
            return (Criteria) this;
        }

        public Criteria andShopImgIsNull() {
            addCriterion("shop_img is null");
            return (Criteria) this;
        }

        public Criteria andShopImgIsNotNull() {
            addCriterion("shop_img is not null");
            return (Criteria) this;
        }

        public Criteria andShopImgEqualTo(String value) {
            addCriterion("shop_img =", value, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgNotEqualTo(String value) {
            addCriterion("shop_img <>", value, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgGreaterThan(String value) {
            addCriterion("shop_img >", value, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgGreaterThanOrEqualTo(String value) {
            addCriterion("shop_img >=", value, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgLessThan(String value) {
            addCriterion("shop_img <", value, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgLessThanOrEqualTo(String value) {
            addCriterion("shop_img <=", value, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgLike(String value) {
            addCriterion("shop_img like", value, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgNotLike(String value) {
            addCriterion("shop_img not like", value, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgIn(List<String> values) {
            addCriterion("shop_img in", values, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgNotIn(List<String> values) {
            addCriterion("shop_img not in", values, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgBetween(String value1, String value2) {
            addCriterion("shop_img between", value1, value2, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopImgNotBetween(String value1, String value2) {
            addCriterion("shop_img not between", value1, value2, "shopImg");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuIsNull() {
            addCriterion("shop_miaoshu is null");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuIsNotNull() {
            addCriterion("shop_miaoshu is not null");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuEqualTo(String value) {
            addCriterion("shop_miaoshu =", value, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuNotEqualTo(String value) {
            addCriterion("shop_miaoshu <>", value, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuGreaterThan(String value) {
            addCriterion("shop_miaoshu >", value, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("shop_miaoshu >=", value, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuLessThan(String value) {
            addCriterion("shop_miaoshu <", value, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuLessThanOrEqualTo(String value) {
            addCriterion("shop_miaoshu <=", value, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuLike(String value) {
            addCriterion("shop_miaoshu like", value, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuNotLike(String value) {
            addCriterion("shop_miaoshu not like", value, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuIn(List<String> values) {
            addCriterion("shop_miaoshu in", values, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuNotIn(List<String> values) {
            addCriterion("shop_miaoshu not in", values, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuBetween(String value1, String value2) {
            addCriterion("shop_miaoshu between", value1, value2, "shopMiaoshu");
            return (Criteria) this;
        }

        public Criteria andShopMiaoshuNotBetween(String value1, String value2) {
            addCriterion("shop_miaoshu not between", value1, value2, "shopMiaoshu");
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

        public Criteria andShopDeleteTypeIsNull() {
            addCriterion("shop_delete_type is null");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeIsNotNull() {
            addCriterion("shop_delete_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeEqualTo(Integer value) {
            addCriterion("shop_delete_type =", value, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeNotEqualTo(Integer value) {
            addCriterion("shop_delete_type <>", value, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeGreaterThan(Integer value) {
            addCriterion("shop_delete_type >", value, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_delete_type >=", value, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeLessThan(Integer value) {
            addCriterion("shop_delete_type <", value, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeLessThanOrEqualTo(Integer value) {
            addCriterion("shop_delete_type <=", value, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeIn(List<Integer> values) {
            addCriterion("shop_delete_type in", values, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeNotIn(List<Integer> values) {
            addCriterion("shop_delete_type not in", values, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeBetween(Integer value1, Integer value2) {
            addCriterion("shop_delete_type between", value1, value2, "shopDeleteType");
            return (Criteria) this;
        }

        public Criteria andShopDeleteTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_delete_type not between", value1, value2, "shopDeleteType");
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