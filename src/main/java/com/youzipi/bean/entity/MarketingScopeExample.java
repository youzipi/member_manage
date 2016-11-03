package com.youzipi.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketingScopeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketingScopeExample() {
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

        public Criteria andMarketingScopeIdIsNull() {
            addCriterion("marketing_scope_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdIsNotNull() {
            addCriterion("marketing_scope_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdEqualTo(Long value) {
            addCriterion("marketing_scope_id =", value, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdNotEqualTo(Long value) {
            addCriterion("marketing_scope_id <>", value, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdGreaterThan(Long value) {
            addCriterion("marketing_scope_id >", value, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("marketing_scope_id >=", value, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdLessThan(Long value) {
            addCriterion("marketing_scope_id <", value, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdLessThanOrEqualTo(Long value) {
            addCriterion("marketing_scope_id <=", value, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdIn(List<Long> values) {
            addCriterion("marketing_scope_id in", values, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdNotIn(List<Long> values) {
            addCriterion("marketing_scope_id not in", values, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdBetween(Long value1, Long value2) {
            addCriterion("marketing_scope_id between", value1, value2, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingScopeIdNotBetween(Long value1, Long value2) {
            addCriterion("marketing_scope_id not between", value1, value2, "marketingScopeId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdIsNull() {
            addCriterion("marketing_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketingIdIsNotNull() {
            addCriterion("marketing_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingIdEqualTo(Long value) {
            addCriterion("marketing_id =", value, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdNotEqualTo(Long value) {
            addCriterion("marketing_id <>", value, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdGreaterThan(Long value) {
            addCriterion("marketing_id >", value, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("marketing_id >=", value, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdLessThan(Long value) {
            addCriterion("marketing_id <", value, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdLessThanOrEqualTo(Long value) {
            addCriterion("marketing_id <=", value, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdIn(List<Long> values) {
            addCriterion("marketing_id in", values, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdNotIn(List<Long> values) {
            addCriterion("marketing_id not in", values, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdBetween(Long value1, Long value2) {
            addCriterion("marketing_id between", value1, value2, "marketingId");
            return (Criteria) this;
        }

        public Criteria andMarketingIdNotBetween(Long value1, Long value2) {
            addCriterion("marketing_id not between", value1, value2, "marketingId");
            return (Criteria) this;
        }

        public Criteria andScopeIdIsNull() {
            addCriterion("scope_id is null");
            return (Criteria) this;
        }

        public Criteria andScopeIdIsNotNull() {
            addCriterion("scope_id is not null");
            return (Criteria) this;
        }

        public Criteria andScopeIdEqualTo(Long value) {
            addCriterion("scope_id =", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotEqualTo(Long value) {
            addCriterion("scope_id <>", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdGreaterThan(Long value) {
            addCriterion("scope_id >", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("scope_id >=", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdLessThan(Long value) {
            addCriterion("scope_id <", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdLessThanOrEqualTo(Long value) {
            addCriterion("scope_id <=", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdIn(List<Long> values) {
            addCriterion("scope_id in", values, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotIn(List<Long> values) {
            addCriterion("scope_id not in", values, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdBetween(Long value1, Long value2) {
            addCriterion("scope_id between", value1, value2, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotBetween(Long value1, Long value2) {
            addCriterion("scope_id not between", value1, value2, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeTypeIsNull() {
            addCriterion("scope_type is null");
            return (Criteria) this;
        }

        public Criteria andScopeTypeIsNotNull() {
            addCriterion("scope_type is not null");
            return (Criteria) this;
        }

        public Criteria andScopeTypeEqualTo(String value) {
            addCriterion("scope_type =", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeNotEqualTo(String value) {
            addCriterion("scope_type <>", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeGreaterThan(String value) {
            addCriterion("scope_type >", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scope_type >=", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeLessThan(String value) {
            addCriterion("scope_type <", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeLessThanOrEqualTo(String value) {
            addCriterion("scope_type <=", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeLike(String value) {
            addCriterion("scope_type like", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeNotLike(String value) {
            addCriterion("scope_type not like", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeIn(List<String> values) {
            addCriterion("scope_type in", values, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeNotIn(List<String> values) {
            addCriterion("scope_type not in", values, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeBetween(String value1, String value2) {
            addCriterion("scope_type between", value1, value2, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeNotBetween(String value1, String value2) {
            addCriterion("scope_type not between", value1, value2, "scopeType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
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