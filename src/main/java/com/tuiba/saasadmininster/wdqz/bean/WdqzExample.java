package com.tuiba.saasadmininster.wdqz.bean;

import java.util.ArrayList;
import java.util.List;

public class WdqzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WdqzExample() {
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

        public Criteria andWdqzTitleIsNull() {
            addCriterion("wdqz_title is null");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleIsNotNull() {
            addCriterion("wdqz_title is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleEqualTo(String value) {
            addCriterion("wdqz_title =", value, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleNotEqualTo(String value) {
            addCriterion("wdqz_title <>", value, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleGreaterThan(String value) {
            addCriterion("wdqz_title >", value, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleGreaterThanOrEqualTo(String value) {
            addCriterion("wdqz_title >=", value, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleLessThan(String value) {
            addCriterion("wdqz_title <", value, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleLessThanOrEqualTo(String value) {
            addCriterion("wdqz_title <=", value, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleLike(String value) {
            addCriterion("wdqz_title like", value, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleNotLike(String value) {
            addCriterion("wdqz_title not like", value, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleIn(List<String> values) {
            addCriterion("wdqz_title in", values, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleNotIn(List<String> values) {
            addCriterion("wdqz_title not in", values, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleBetween(String value1, String value2) {
            addCriterion("wdqz_title between", value1, value2, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzTitleNotBetween(String value1, String value2) {
            addCriterion("wdqz_title not between", value1, value2, "wdqzTitle");
            return (Criteria) this;
        }

        public Criteria andWdqzContentIsNull() {
            addCriterion("wdqz_content is null");
            return (Criteria) this;
        }

        public Criteria andWdqzContentIsNotNull() {
            addCriterion("wdqz_content is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzContentEqualTo(String value) {
            addCriterion("wdqz_content =", value, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentNotEqualTo(String value) {
            addCriterion("wdqz_content <>", value, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentGreaterThan(String value) {
            addCriterion("wdqz_content >", value, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentGreaterThanOrEqualTo(String value) {
            addCriterion("wdqz_content >=", value, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentLessThan(String value) {
            addCriterion("wdqz_content <", value, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentLessThanOrEqualTo(String value) {
            addCriterion("wdqz_content <=", value, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentLike(String value) {
            addCriterion("wdqz_content like", value, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentNotLike(String value) {
            addCriterion("wdqz_content not like", value, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentIn(List<String> values) {
            addCriterion("wdqz_content in", values, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentNotIn(List<String> values) {
            addCriterion("wdqz_content not in", values, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentBetween(String value1, String value2) {
            addCriterion("wdqz_content between", value1, value2, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzContentNotBetween(String value1, String value2) {
            addCriterion("wdqz_content not between", value1, value2, "wdqzContent");
            return (Criteria) this;
        }

        public Criteria andWdqzImgIsNull() {
            addCriterion("wdqz_img is null");
            return (Criteria) this;
        }

        public Criteria andWdqzImgIsNotNull() {
            addCriterion("wdqz_img is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzImgEqualTo(String value) {
            addCriterion("wdqz_img =", value, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgNotEqualTo(String value) {
            addCriterion("wdqz_img <>", value, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgGreaterThan(String value) {
            addCriterion("wdqz_img >", value, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgGreaterThanOrEqualTo(String value) {
            addCriterion("wdqz_img >=", value, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgLessThan(String value) {
            addCriterion("wdqz_img <", value, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgLessThanOrEqualTo(String value) {
            addCriterion("wdqz_img <=", value, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgLike(String value) {
            addCriterion("wdqz_img like", value, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgNotLike(String value) {
            addCriterion("wdqz_img not like", value, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgIn(List<String> values) {
            addCriterion("wdqz_img in", values, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgNotIn(List<String> values) {
            addCriterion("wdqz_img not in", values, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgBetween(String value1, String value2) {
            addCriterion("wdqz_img between", value1, value2, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzImgNotBetween(String value1, String value2) {
            addCriterion("wdqz_img not between", value1, value2, "wdqzImg");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceIsNull() {
            addCriterion("wdqz_voice is null");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceIsNotNull() {
            addCriterion("wdqz_voice is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceEqualTo(String value) {
            addCriterion("wdqz_voice =", value, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceNotEqualTo(String value) {
            addCriterion("wdqz_voice <>", value, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceGreaterThan(String value) {
            addCriterion("wdqz_voice >", value, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceGreaterThanOrEqualTo(String value) {
            addCriterion("wdqz_voice >=", value, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceLessThan(String value) {
            addCriterion("wdqz_voice <", value, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceLessThanOrEqualTo(String value) {
            addCriterion("wdqz_voice <=", value, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceLike(String value) {
            addCriterion("wdqz_voice like", value, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceNotLike(String value) {
            addCriterion("wdqz_voice not like", value, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceIn(List<String> values) {
            addCriterion("wdqz_voice in", values, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceNotIn(List<String> values) {
            addCriterion("wdqz_voice not in", values, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceBetween(String value1, String value2) {
            addCriterion("wdqz_voice between", value1, value2, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzVoiceNotBetween(String value1, String value2) {
            addCriterion("wdqz_voice not between", value1, value2, "wdqzVoice");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreIsNull() {
            addCriterion("wdqz_score is null");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreIsNotNull() {
            addCriterion("wdqz_score is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreEqualTo(String value) {
            addCriterion("wdqz_score =", value, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreNotEqualTo(String value) {
            addCriterion("wdqz_score <>", value, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreGreaterThan(String value) {
            addCriterion("wdqz_score >", value, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreGreaterThanOrEqualTo(String value) {
            addCriterion("wdqz_score >=", value, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreLessThan(String value) {
            addCriterion("wdqz_score <", value, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreLessThanOrEqualTo(String value) {
            addCriterion("wdqz_score <=", value, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreLike(String value) {
            addCriterion("wdqz_score like", value, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreNotLike(String value) {
            addCriterion("wdqz_score not like", value, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreIn(List<String> values) {
            addCriterion("wdqz_score in", values, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreNotIn(List<String> values) {
            addCriterion("wdqz_score not in", values, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreBetween(String value1, String value2) {
            addCriterion("wdqz_score between", value1, value2, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzScoreNotBetween(String value1, String value2) {
            addCriterion("wdqz_score not between", value1, value2, "wdqzScore");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanIsNull() {
            addCriterion("wdqz_dianzan is null");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanIsNotNull() {
            addCriterion("wdqz_dianzan is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanEqualTo(Integer value) {
            addCriterion("wdqz_dianzan =", value, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanNotEqualTo(Integer value) {
            addCriterion("wdqz_dianzan <>", value, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanGreaterThan(Integer value) {
            addCriterion("wdqz_dianzan >", value, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanGreaterThanOrEqualTo(Integer value) {
            addCriterion("wdqz_dianzan >=", value, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanLessThan(Integer value) {
            addCriterion("wdqz_dianzan <", value, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanLessThanOrEqualTo(Integer value) {
            addCriterion("wdqz_dianzan <=", value, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanIn(List<Integer> values) {
            addCriterion("wdqz_dianzan in", values, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanNotIn(List<Integer> values) {
            addCriterion("wdqz_dianzan not in", values, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_dianzan between", value1, value2, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzDianzanNotBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_dianzan not between", value1, value2, "wdqzDianzan");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeIsNull() {
            addCriterion("wdqz_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeIsNotNull() {
            addCriterion("wdqz_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeEqualTo(Long value) {
            addCriterion("wdqz_publish_time =", value, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeNotEqualTo(Long value) {
            addCriterion("wdqz_publish_time <>", value, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeGreaterThan(Long value) {
            addCriterion("wdqz_publish_time >", value, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wdqz_publish_time >=", value, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeLessThan(Long value) {
            addCriterion("wdqz_publish_time <", value, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeLessThanOrEqualTo(Long value) {
            addCriterion("wdqz_publish_time <=", value, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeIn(List<Long> values) {
            addCriterion("wdqz_publish_time in", values, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeNotIn(List<Long> values) {
            addCriterion("wdqz_publish_time not in", values, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeBetween(Long value1, Long value2) {
            addCriterion("wdqz_publish_time between", value1, value2, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzPublishTimeNotBetween(Long value1, Long value2) {
            addCriterion("wdqz_publish_time not between", value1, value2, "wdqzPublishTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeIsNull() {
            addCriterion("wdqz_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeIsNotNull() {
            addCriterion("wdqz_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeEqualTo(Long value) {
            addCriterion("wdqz_modify_time =", value, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeNotEqualTo(Long value) {
            addCriterion("wdqz_modify_time <>", value, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeGreaterThan(Long value) {
            addCriterion("wdqz_modify_time >", value, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wdqz_modify_time >=", value, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeLessThan(Long value) {
            addCriterion("wdqz_modify_time <", value, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeLessThanOrEqualTo(Long value) {
            addCriterion("wdqz_modify_time <=", value, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeIn(List<Long> values) {
            addCriterion("wdqz_modify_time in", values, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeNotIn(List<Long> values) {
            addCriterion("wdqz_modify_time not in", values, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeBetween(Long value1, Long value2) {
            addCriterion("wdqz_modify_time between", value1, value2, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzModifyTimeNotBetween(Long value1, Long value2) {
            addCriterion("wdqz_modify_time not between", value1, value2, "wdqzModifyTime");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionIsNull() {
            addCriterion("wdqz_adoption is null");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionIsNotNull() {
            addCriterion("wdqz_adoption is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionEqualTo(Integer value) {
            addCriterion("wdqz_adoption =", value, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionNotEqualTo(Integer value) {
            addCriterion("wdqz_adoption <>", value, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionGreaterThan(Integer value) {
            addCriterion("wdqz_adoption >", value, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("wdqz_adoption >=", value, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionLessThan(Integer value) {
            addCriterion("wdqz_adoption <", value, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionLessThanOrEqualTo(Integer value) {
            addCriterion("wdqz_adoption <=", value, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionIn(List<Integer> values) {
            addCriterion("wdqz_adoption in", values, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionNotIn(List<Integer> values) {
            addCriterion("wdqz_adoption not in", values, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_adoption between", value1, value2, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzAdoptionNotBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_adoption not between", value1, value2, "wdqzAdoption");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusIsNull() {
            addCriterion("wdqz_status is null");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusIsNotNull() {
            addCriterion("wdqz_status is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusEqualTo(Integer value) {
            addCriterion("wdqz_status =", value, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusNotEqualTo(Integer value) {
            addCriterion("wdqz_status <>", value, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusGreaterThan(Integer value) {
            addCriterion("wdqz_status >", value, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wdqz_status >=", value, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusLessThan(Integer value) {
            addCriterion("wdqz_status <", value, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusLessThanOrEqualTo(Integer value) {
            addCriterion("wdqz_status <=", value, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusIn(List<Integer> values) {
            addCriterion("wdqz_status in", values, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusNotIn(List<Integer> values) {
            addCriterion("wdqz_status not in", values, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_status between", value1, value2, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wdqz_status not between", value1, value2, "wdqzStatus");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeIsNull() {
            addCriterion("wdqz_top_time is null");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeIsNotNull() {
            addCriterion("wdqz_top_time is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeEqualTo(Long value) {
            addCriterion("wdqz_top_time =", value, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeNotEqualTo(Long value) {
            addCriterion("wdqz_top_time <>", value, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeGreaterThan(Long value) {
            addCriterion("wdqz_top_time >", value, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wdqz_top_time >=", value, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeLessThan(Long value) {
            addCriterion("wdqz_top_time <", value, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeLessThanOrEqualTo(Long value) {
            addCriterion("wdqz_top_time <=", value, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeIn(List<Long> values) {
            addCriterion("wdqz_top_time in", values, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeNotIn(List<Long> values) {
            addCriterion("wdqz_top_time not in", values, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeBetween(Long value1, Long value2) {
            addCriterion("wdqz_top_time between", value1, value2, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzTopTimeNotBetween(Long value1, Long value2) {
            addCriterion("wdqz_top_time not between", value1, value2, "wdqzTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeIsNull() {
            addCriterion("wdqz_cance_top_time is null");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeIsNotNull() {
            addCriterion("wdqz_cance_top_time is not null");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeEqualTo(Long value) {
            addCriterion("wdqz_cance_top_time =", value, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeNotEqualTo(Long value) {
            addCriterion("wdqz_cance_top_time <>", value, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeGreaterThan(Long value) {
            addCriterion("wdqz_cance_top_time >", value, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wdqz_cance_top_time >=", value, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeLessThan(Long value) {
            addCriterion("wdqz_cance_top_time <", value, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeLessThanOrEqualTo(Long value) {
            addCriterion("wdqz_cance_top_time <=", value, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeIn(List<Long> values) {
            addCriterion("wdqz_cance_top_time in", values, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeNotIn(List<Long> values) {
            addCriterion("wdqz_cance_top_time not in", values, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeBetween(Long value1, Long value2) {
            addCriterion("wdqz_cance_top_time between", value1, value2, "wdqzCanceTopTime");
            return (Criteria) this;
        }

        public Criteria andWdqzCanceTopTimeNotBetween(Long value1, Long value2) {
            addCriterion("wdqz_cance_top_time not between", value1, value2, "wdqzCanceTopTime");
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