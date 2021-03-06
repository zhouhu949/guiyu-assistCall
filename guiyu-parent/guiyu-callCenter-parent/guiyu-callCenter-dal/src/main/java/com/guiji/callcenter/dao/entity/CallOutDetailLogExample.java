package com.guiji.callcenter.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallOutDetailLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CallOutDetailLogExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdIsNull() {
            addCriterion("call_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdIsNotNull() {
            addCriterion("call_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdEqualTo(Long value) {
            addCriterion("call_detail_id =", value, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdNotEqualTo(Long value) {
            addCriterion("call_detail_id <>", value, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdGreaterThan(Long value) {
            addCriterion("call_detail_id >", value, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("call_detail_id >=", value, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdLessThan(Long value) {
            addCriterion("call_detail_id <", value, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("call_detail_id <=", value, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdIn(List<Long> values) {
            addCriterion("call_detail_id in", values, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdNotIn(List<Long> values) {
            addCriterion("call_detail_id not in", values, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdBetween(Long value1, Long value2) {
            addCriterion("call_detail_id between", value1, value2, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCallDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("call_detail_id not between", value1, value2, "callDetailId");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewIsNull() {
            addCriterion("customer_say_text_new is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewIsNotNull() {
            addCriterion("customer_say_text_new is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewEqualTo(String value) {
            addCriterion("customer_say_text_new =", value, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewNotEqualTo(String value) {
            addCriterion("customer_say_text_new <>", value, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewGreaterThan(String value) {
            addCriterion("customer_say_text_new >", value, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewGreaterThanOrEqualTo(String value) {
            addCriterion("customer_say_text_new >=", value, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewLessThan(String value) {
            addCriterion("customer_say_text_new <", value, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewLessThanOrEqualTo(String value) {
            addCriterion("customer_say_text_new <=", value, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewLike(String value) {
            addCriterion("customer_say_text_new like", value, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewNotLike(String value) {
            addCriterion("customer_say_text_new not like", value, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewIn(List<String> values) {
            addCriterion("customer_say_text_new in", values, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewNotIn(List<String> values) {
            addCriterion("customer_say_text_new not in", values, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewBetween(String value1, String value2) {
            addCriterion("customer_say_text_new between", value1, value2, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNewNotBetween(String value1, String value2) {
            addCriterion("customer_say_text_new not between", value1, value2, "customerSayTextNew");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextIsNull() {
            addCriterion("customer_say_text is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextIsNotNull() {
            addCriterion("customer_say_text is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextEqualTo(String value) {
            addCriterion("customer_say_text =", value, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNotEqualTo(String value) {
            addCriterion("customer_say_text <>", value, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextGreaterThan(String value) {
            addCriterion("customer_say_text >", value, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextGreaterThanOrEqualTo(String value) {
            addCriterion("customer_say_text >=", value, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextLessThan(String value) {
            addCriterion("customer_say_text <", value, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextLessThanOrEqualTo(String value) {
            addCriterion("customer_say_text <=", value, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextLike(String value) {
            addCriterion("customer_say_text like", value, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNotLike(String value) {
            addCriterion("customer_say_text not like", value, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextIn(List<String> values) {
            addCriterion("customer_say_text in", values, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNotIn(List<String> values) {
            addCriterion("customer_say_text not in", values, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextBetween(String value1, String value2) {
            addCriterion("customer_say_text between", value1, value2, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andCustomerSayTextNotBetween(String value1, String value2) {
            addCriterion("customer_say_text not between", value1, value2, "customerSayText");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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