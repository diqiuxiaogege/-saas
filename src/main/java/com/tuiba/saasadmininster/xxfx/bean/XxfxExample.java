package com.tuiba.saasadmininster.xxfx.bean;

import java.util.ArrayList;
import java.util.List;

public class XxfxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XxfxExample() {
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

        public Criteria andXxfxTitleIsNull() {
            addCriterion("xxfx_title is null");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleIsNotNull() {
            addCriterion("xxfx_title is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleEqualTo(String value) {
            addCriterion("xxfx_title =", value, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleNotEqualTo(String value) {
            addCriterion("xxfx_title <>", value, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleGreaterThan(String value) {
            addCriterion("xxfx_title >", value, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleGreaterThanOrEqualTo(String value) {
            addCriterion("xxfx_title >=", value, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleLessThan(String value) {
            addCriterion("xxfx_title <", value, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleLessThanOrEqualTo(String value) {
            addCriterion("xxfx_title <=", value, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleLike(String value) {
            addCriterion("xxfx_title like", value, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleNotLike(String value) {
            addCriterion("xxfx_title not like", value, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleIn(List<String> values) {
            addCriterion("xxfx_title in", values, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleNotIn(List<String> values) {
            addCriterion("xxfx_title not in", values, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleBetween(String value1, String value2) {
            addCriterion("xxfx_title between", value1, value2, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxTitleNotBetween(String value1, String value2) {
            addCriterion("xxfx_title not between", value1, value2, "xxfxTitle");
            return (Criteria) this;
        }

        public Criteria andXxfxContentIsNull() {
            addCriterion("xxfx_content is null");
            return (Criteria) this;
        }

        public Criteria andXxfxContentIsNotNull() {
            addCriterion("xxfx_content is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxContentEqualTo(String value) {
            addCriterion("xxfx_content =", value, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentNotEqualTo(String value) {
            addCriterion("xxfx_content <>", value, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentGreaterThan(String value) {
            addCriterion("xxfx_content >", value, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentGreaterThanOrEqualTo(String value) {
            addCriterion("xxfx_content >=", value, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentLessThan(String value) {
            addCriterion("xxfx_content <", value, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentLessThanOrEqualTo(String value) {
            addCriterion("xxfx_content <=", value, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentLike(String value) {
            addCriterion("xxfx_content like", value, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentNotLike(String value) {
            addCriterion("xxfx_content not like", value, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentIn(List<String> values) {
            addCriterion("xxfx_content in", values, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentNotIn(List<String> values) {
            addCriterion("xxfx_content not in", values, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentBetween(String value1, String value2) {
            addCriterion("xxfx_content between", value1, value2, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxContentNotBetween(String value1, String value2) {
            addCriterion("xxfx_content not between", value1, value2, "xxfxContent");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeIsNull() {
            addCriterion("xxfx_product_type is null");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeIsNotNull() {
            addCriterion("xxfx_product_type is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeEqualTo(String value) {
            addCriterion("xxfx_product_type =", value, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeNotEqualTo(String value) {
            addCriterion("xxfx_product_type <>", value, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeGreaterThan(String value) {
            addCriterion("xxfx_product_type >", value, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("xxfx_product_type >=", value, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeLessThan(String value) {
            addCriterion("xxfx_product_type <", value, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeLessThanOrEqualTo(String value) {
            addCriterion("xxfx_product_type <=", value, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeLike(String value) {
            addCriterion("xxfx_product_type like", value, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeNotLike(String value) {
            addCriterion("xxfx_product_type not like", value, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeIn(List<String> values) {
            addCriterion("xxfx_product_type in", values, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeNotIn(List<String> values) {
            addCriterion("xxfx_product_type not in", values, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeBetween(String value1, String value2) {
            addCriterion("xxfx_product_type between", value1, value2, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxProductTypeNotBetween(String value1, String value2) {
            addCriterion("xxfx_product_type not between", value1, value2, "xxfxProductType");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanIsNull() {
            addCriterion("xxfx_dianzan is null");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanIsNotNull() {
            addCriterion("xxfx_dianzan is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanEqualTo(Integer value) {
            addCriterion("xxfx_dianzan =", value, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanNotEqualTo(Integer value) {
            addCriterion("xxfx_dianzan <>", value, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanGreaterThan(Integer value) {
            addCriterion("xxfx_dianzan >", value, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxfx_dianzan >=", value, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanLessThan(Integer value) {
            addCriterion("xxfx_dianzan <", value, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanLessThanOrEqualTo(Integer value) {
            addCriterion("xxfx_dianzan <=", value, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanIn(List<Integer> values) {
            addCriterion("xxfx_dianzan in", values, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanNotIn(List<Integer> values) {
            addCriterion("xxfx_dianzan not in", values, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_dianzan between", value1, value2, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxDianzanNotBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_dianzan not between", value1, value2, "xxfxDianzan");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeIsNull() {
            addCriterion("xxfx_time is null");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeIsNotNull() {
            addCriterion("xxfx_time is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeEqualTo(Long value) {
            addCriterion("xxfx_time =", value, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeNotEqualTo(Long value) {
            addCriterion("xxfx_time <>", value, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeGreaterThan(Long value) {
            addCriterion("xxfx_time >", value, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("xxfx_time >=", value, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeLessThan(Long value) {
            addCriterion("xxfx_time <", value, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeLessThanOrEqualTo(Long value) {
            addCriterion("xxfx_time <=", value, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeIn(List<Long> values) {
            addCriterion("xxfx_time in", values, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeNotIn(List<Long> values) {
            addCriterion("xxfx_time not in", values, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeBetween(Long value1, Long value2) {
            addCriterion("xxfx_time between", value1, value2, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTimeNotBetween(Long value1, Long value2) {
            addCriterion("xxfx_time not between", value1, value2, "xxfxTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeIsNull() {
            addCriterion("xxfx_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeIsNotNull() {
            addCriterion("xxfx_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeEqualTo(Long value) {
            addCriterion("xxfx_modify_time =", value, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeNotEqualTo(Long value) {
            addCriterion("xxfx_modify_time <>", value, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeGreaterThan(Long value) {
            addCriterion("xxfx_modify_time >", value, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("xxfx_modify_time >=", value, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeLessThan(Long value) {
            addCriterion("xxfx_modify_time <", value, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeLessThanOrEqualTo(Long value) {
            addCriterion("xxfx_modify_time <=", value, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeIn(List<Long> values) {
            addCriterion("xxfx_modify_time in", values, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeNotIn(List<Long> values) {
            addCriterion("xxfx_modify_time not in", values, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeBetween(Long value1, Long value2) {
            addCriterion("xxfx_modify_time between", value1, value2, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxModifyTimeNotBetween(Long value1, Long value2) {
            addCriterion("xxfx_modify_time not between", value1, value2, "xxfxModifyTime");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusIsNull() {
            addCriterion("xxfx_status is null");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusIsNotNull() {
            addCriterion("xxfx_status is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusEqualTo(Integer value) {
            addCriterion("xxfx_status =", value, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusNotEqualTo(Integer value) {
            addCriterion("xxfx_status <>", value, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusGreaterThan(Integer value) {
            addCriterion("xxfx_status >", value, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxfx_status >=", value, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusLessThan(Integer value) {
            addCriterion("xxfx_status <", value, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusLessThanOrEqualTo(Integer value) {
            addCriterion("xxfx_status <=", value, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusIn(List<Integer> values) {
            addCriterion("xxfx_status in", values, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusNotIn(List<Integer> values) {
            addCriterion("xxfx_status not in", values, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_status between", value1, value2, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("xxfx_status not between", value1, value2, "xxfxStatus");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeIsNull() {
            addCriterion("xxfx_top_time is null");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeIsNotNull() {
            addCriterion("xxfx_top_time is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeEqualTo(Long value) {
            addCriterion("xxfx_top_time =", value, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeNotEqualTo(Long value) {
            addCriterion("xxfx_top_time <>", value, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeGreaterThan(Long value) {
            addCriterion("xxfx_top_time >", value, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("xxfx_top_time >=", value, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeLessThan(Long value) {
            addCriterion("xxfx_top_time <", value, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeLessThanOrEqualTo(Long value) {
            addCriterion("xxfx_top_time <=", value, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeIn(List<Long> values) {
            addCriterion("xxfx_top_time in", values, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeNotIn(List<Long> values) {
            addCriterion("xxfx_top_time not in", values, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeBetween(Long value1, Long value2) {
            addCriterion("xxfx_top_time between", value1, value2, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxTopTimeNotBetween(Long value1, Long value2) {
            addCriterion("xxfx_top_time not between", value1, value2, "xxfxTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeIsNull() {
            addCriterion("xxfx_cance_top_time is null");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeIsNotNull() {
            addCriterion("xxfx_cance_top_time is not null");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeEqualTo(Long value) {
            addCriterion("xxfx_cance_top_time =", value, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeNotEqualTo(Long value) {
            addCriterion("xxfx_cance_top_time <>", value, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeGreaterThan(Long value) {
            addCriterion("xxfx_cance_top_time >", value, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("xxfx_cance_top_time >=", value, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeLessThan(Long value) {
            addCriterion("xxfx_cance_top_time <", value, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeLessThanOrEqualTo(Long value) {
            addCriterion("xxfx_cance_top_time <=", value, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeIn(List<Long> values) {
            addCriterion("xxfx_cance_top_time in", values, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeNotIn(List<Long> values) {
            addCriterion("xxfx_cance_top_time not in", values, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeBetween(Long value1, Long value2) {
            addCriterion("xxfx_cance_top_time between", value1, value2, "xxfxCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andXxfxCanceTopTimeNotBetween(Long value1, Long value2) {
            addCriterion("xxfx_cance_top_time not between", value1, value2, "xxfxCanceTopTime");
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