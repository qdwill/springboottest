package com.example.demo.dao.master.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andYuanquIsNull() {
            addCriterion("yuanqu is null");
            return (Criteria) this;
        }

        public Criteria andYuanquIsNotNull() {
            addCriterion("yuanqu is not null");
            return (Criteria) this;
        }

        public Criteria andYuanquEqualTo(String value) {
            addCriterion("yuanqu =", value, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquNotEqualTo(String value) {
            addCriterion("yuanqu <>", value, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquGreaterThan(String value) {
            addCriterion("yuanqu >", value, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquGreaterThanOrEqualTo(String value) {
            addCriterion("yuanqu >=", value, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquLessThan(String value) {
            addCriterion("yuanqu <", value, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquLessThanOrEqualTo(String value) {
            addCriterion("yuanqu <=", value, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquLike(String value) {
            addCriterion("yuanqu like", value, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquNotLike(String value) {
            addCriterion("yuanqu not like", value, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquIn(List<String> values) {
            addCriterion("yuanqu in", values, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquNotIn(List<String> values) {
            addCriterion("yuanqu not in", values, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquBetween(String value1, String value2) {
            addCriterion("yuanqu between", value1, value2, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andYuanquNotBetween(String value1, String value2) {
            addCriterion("yuanqu not between", value1, value2, "yuanqu");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andPubKeyIsNull() {
            addCriterion("pub_key is null");
            return (Criteria) this;
        }

        public Criteria andPubKeyIsNotNull() {
            addCriterion("pub_key is not null");
            return (Criteria) this;
        }

        public Criteria andPubKeyEqualTo(String value) {
            addCriterion("pub_key =", value, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyNotEqualTo(String value) {
            addCriterion("pub_key <>", value, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyGreaterThan(String value) {
            addCriterion("pub_key >", value, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyGreaterThanOrEqualTo(String value) {
            addCriterion("pub_key >=", value, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyLessThan(String value) {
            addCriterion("pub_key <", value, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyLessThanOrEqualTo(String value) {
            addCriterion("pub_key <=", value, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyLike(String value) {
            addCriterion("pub_key like", value, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyNotLike(String value) {
            addCriterion("pub_key not like", value, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyIn(List<String> values) {
            addCriterion("pub_key in", values, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyNotIn(List<String> values) {
            addCriterion("pub_key not in", values, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyBetween(String value1, String value2) {
            addCriterion("pub_key between", value1, value2, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPubKeyNotBetween(String value1, String value2) {
            addCriterion("pub_key not between", value1, value2, "pubKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyIsNull() {
            addCriterion("prt_key is null");
            return (Criteria) this;
        }

        public Criteria andPrtKeyIsNotNull() {
            addCriterion("prt_key is not null");
            return (Criteria) this;
        }

        public Criteria andPrtKeyEqualTo(String value) {
            addCriterion("prt_key =", value, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyNotEqualTo(String value) {
            addCriterion("prt_key <>", value, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyGreaterThan(String value) {
            addCriterion("prt_key >", value, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyGreaterThanOrEqualTo(String value) {
            addCriterion("prt_key >=", value, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyLessThan(String value) {
            addCriterion("prt_key <", value, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyLessThanOrEqualTo(String value) {
            addCriterion("prt_key <=", value, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyLike(String value) {
            addCriterion("prt_key like", value, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyNotLike(String value) {
            addCriterion("prt_key not like", value, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyIn(List<String> values) {
            addCriterion("prt_key in", values, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyNotIn(List<String> values) {
            addCriterion("prt_key not in", values, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyBetween(String value1, String value2) {
            addCriterion("prt_key between", value1, value2, "prtKey");
            return (Criteria) this;
        }

        public Criteria andPrtKeyNotBetween(String value1, String value2) {
            addCriterion("prt_key not between", value1, value2, "prtKey");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyIsNull() {
            addCriterion("base_money is null");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyIsNotNull() {
            addCriterion("base_money is not null");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyEqualTo(BigDecimal value) {
            addCriterion("base_money =", value, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyNotEqualTo(BigDecimal value) {
            addCriterion("base_money <>", value, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyGreaterThan(BigDecimal value) {
            addCriterion("base_money >", value, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_money >=", value, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyLessThan(BigDecimal value) {
            addCriterion("base_money <", value, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_money <=", value, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyIn(List<BigDecimal> values) {
            addCriterion("base_money in", values, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyNotIn(List<BigDecimal> values) {
            addCriterion("base_money not in", values, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_money between", value1, value2, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_money not between", value1, value2, "baseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyIsNull() {
            addCriterion("self_money is null");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyIsNotNull() {
            addCriterion("self_money is not null");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyEqualTo(BigDecimal value) {
            addCriterion("self_money =", value, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyNotEqualTo(BigDecimal value) {
            addCriterion("self_money <>", value, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyGreaterThan(BigDecimal value) {
            addCriterion("self_money >", value, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("self_money >=", value, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyLessThan(BigDecimal value) {
            addCriterion("self_money <", value, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("self_money <=", value, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyIn(List<BigDecimal> values) {
            addCriterion("self_money in", values, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyNotIn(List<BigDecimal> values) {
            addCriterion("self_money not in", values, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("self_money between", value1, value2, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andSelfMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("self_money not between", value1, value2, "selfMoney");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNull() {
            addCriterion("head_pic is null");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNotNull() {
            addCriterion("head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPicEqualTo(String value) {
            addCriterion("head_pic =", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotEqualTo(String value) {
            addCriterion("head_pic <>", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThan(String value) {
            addCriterion("head_pic >", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic >=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThan(String value) {
            addCriterion("head_pic <", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThanOrEqualTo(String value) {
            addCriterion("head_pic <=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLike(String value) {
            addCriterion("head_pic like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotLike(String value) {
            addCriterion("head_pic not like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicIn(List<String> values) {
            addCriterion("head_pic in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotIn(List<String> values) {
            addCriterion("head_pic not in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicBetween(String value1, String value2) {
            addCriterion("head_pic between", value1, value2, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotBetween(String value1, String value2) {
            addCriterion("head_pic not between", value1, value2, "headPic");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameIsNull() {
            addCriterion("depart_org_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameIsNotNull() {
            addCriterion("depart_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameEqualTo(String value) {
            addCriterion("depart_org_name =", value, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameNotEqualTo(String value) {
            addCriterion("depart_org_name <>", value, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameGreaterThan(String value) {
            addCriterion("depart_org_name >", value, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_org_name >=", value, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameLessThan(String value) {
            addCriterion("depart_org_name <", value, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameLessThanOrEqualTo(String value) {
            addCriterion("depart_org_name <=", value, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameLike(String value) {
            addCriterion("depart_org_name like", value, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameNotLike(String value) {
            addCriterion("depart_org_name not like", value, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameIn(List<String> values) {
            addCriterion("depart_org_name in", values, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameNotIn(List<String> values) {
            addCriterion("depart_org_name not in", values, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameBetween(String value1, String value2) {
            addCriterion("depart_org_name between", value1, value2, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andDepartOrgNameNotBetween(String value1, String value2) {
            addCriterion("depart_org_name not between", value1, value2, "departOrgName");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidIsNull() {
            addCriterion("ts_wx_openid is null");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidIsNotNull() {
            addCriterion("ts_wx_openid is not null");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidEqualTo(String value) {
            addCriterion("ts_wx_openid =", value, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidNotEqualTo(String value) {
            addCriterion("ts_wx_openid <>", value, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidGreaterThan(String value) {
            addCriterion("ts_wx_openid >", value, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("ts_wx_openid >=", value, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidLessThan(String value) {
            addCriterion("ts_wx_openid <", value, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidLessThanOrEqualTo(String value) {
            addCriterion("ts_wx_openid <=", value, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidLike(String value) {
            addCriterion("ts_wx_openid like", value, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidNotLike(String value) {
            addCriterion("ts_wx_openid not like", value, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidIn(List<String> values) {
            addCriterion("ts_wx_openid in", values, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidNotIn(List<String> values) {
            addCriterion("ts_wx_openid not in", values, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidBetween(String value1, String value2) {
            addCriterion("ts_wx_openid between", value1, value2, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andTsWxOpenidNotBetween(String value1, String value2) {
            addCriterion("ts_wx_openid not between", value1, value2, "tsWxOpenid");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdIsNull() {
            addCriterion("first_line_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdIsNotNull() {
            addCriterion("first_line_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdEqualTo(String value) {
            addCriterion("first_line_id =", value, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdNotEqualTo(String value) {
            addCriterion("first_line_id <>", value, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdGreaterThan(String value) {
            addCriterion("first_line_id >", value, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_line_id >=", value, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdLessThan(String value) {
            addCriterion("first_line_id <", value, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdLessThanOrEqualTo(String value) {
            addCriterion("first_line_id <=", value, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdLike(String value) {
            addCriterion("first_line_id like", value, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdNotLike(String value) {
            addCriterion("first_line_id not like", value, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdIn(List<String> values) {
            addCriterion("first_line_id in", values, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdNotIn(List<String> values) {
            addCriterion("first_line_id not in", values, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdBetween(String value1, String value2) {
            addCriterion("first_line_id between", value1, value2, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andFirstLineIdNotBetween(String value1, String value2) {
            addCriterion("first_line_id not between", value1, value2, "firstLineId");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andGpIdIsNull() {
            addCriterion("gp_id is null");
            return (Criteria) this;
        }

        public Criteria andGpIdIsNotNull() {
            addCriterion("gp_id is not null");
            return (Criteria) this;
        }

        public Criteria andGpIdEqualTo(String value) {
            addCriterion("gp_id =", value, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdNotEqualTo(String value) {
            addCriterion("gp_id <>", value, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdGreaterThan(String value) {
            addCriterion("gp_id >", value, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdGreaterThanOrEqualTo(String value) {
            addCriterion("gp_id >=", value, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdLessThan(String value) {
            addCriterion("gp_id <", value, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdLessThanOrEqualTo(String value) {
            addCriterion("gp_id <=", value, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdLike(String value) {
            addCriterion("gp_id like", value, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdNotLike(String value) {
            addCriterion("gp_id not like", value, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdIn(List<String> values) {
            addCriterion("gp_id in", values, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdNotIn(List<String> values) {
            addCriterion("gp_id not in", values, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdBetween(String value1, String value2) {
            addCriterion("gp_id between", value1, value2, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpIdNotBetween(String value1, String value2) {
            addCriterion("gp_id not between", value1, value2, "gpId");
            return (Criteria) this;
        }

        public Criteria andGpLshIsNull() {
            addCriterion("gp_lsh is null");
            return (Criteria) this;
        }

        public Criteria andGpLshIsNotNull() {
            addCriterion("gp_lsh is not null");
            return (Criteria) this;
        }

        public Criteria andGpLshEqualTo(String value) {
            addCriterion("gp_lsh =", value, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshNotEqualTo(String value) {
            addCriterion("gp_lsh <>", value, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshGreaterThan(String value) {
            addCriterion("gp_lsh >", value, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshGreaterThanOrEqualTo(String value) {
            addCriterion("gp_lsh >=", value, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshLessThan(String value) {
            addCriterion("gp_lsh <", value, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshLessThanOrEqualTo(String value) {
            addCriterion("gp_lsh <=", value, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshLike(String value) {
            addCriterion("gp_lsh like", value, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshNotLike(String value) {
            addCriterion("gp_lsh not like", value, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshIn(List<String> values) {
            addCriterion("gp_lsh in", values, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshNotIn(List<String> values) {
            addCriterion("gp_lsh not in", values, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshBetween(String value1, String value2) {
            addCriterion("gp_lsh between", value1, value2, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpLshNotBetween(String value1, String value2) {
            addCriterion("gp_lsh not between", value1, value2, "gpLsh");
            return (Criteria) this;
        }

        public Criteria andGpTimeIsNull() {
            addCriterion("gp_time is null");
            return (Criteria) this;
        }

        public Criteria andGpTimeIsNotNull() {
            addCriterion("gp_time is not null");
            return (Criteria) this;
        }

        public Criteria andGpTimeEqualTo(Date value) {
            addCriterion("gp_time =", value, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeNotEqualTo(Date value) {
            addCriterion("gp_time <>", value, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeGreaterThan(Date value) {
            addCriterion("gp_time >", value, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gp_time >=", value, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeLessThan(Date value) {
            addCriterion("gp_time <", value, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeLessThanOrEqualTo(Date value) {
            addCriterion("gp_time <=", value, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeIn(List<Date> values) {
            addCriterion("gp_time in", values, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeNotIn(List<Date> values) {
            addCriterion("gp_time not in", values, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeBetween(Date value1, Date value2) {
            addCriterion("gp_time between", value1, value2, "gpTime");
            return (Criteria) this;
        }

        public Criteria andGpTimeNotBetween(Date value1, Date value2) {
            addCriterion("gp_time not between", value1, value2, "gpTime");
            return (Criteria) this;
        }

        public Criteria andTotalBaseIsNull() {
            addCriterion("total_base is null");
            return (Criteria) this;
        }

        public Criteria andTotalBaseIsNotNull() {
            addCriterion("total_base is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBaseEqualTo(BigDecimal value) {
            addCriterion("total_base =", value, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseNotEqualTo(BigDecimal value) {
            addCriterion("total_base <>", value, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseGreaterThan(BigDecimal value) {
            addCriterion("total_base >", value, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_base >=", value, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseLessThan(BigDecimal value) {
            addCriterion("total_base <", value, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_base <=", value, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseIn(List<BigDecimal> values) {
            addCriterion("total_base in", values, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseNotIn(List<BigDecimal> values) {
            addCriterion("total_base not in", values, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_base between", value1, value2, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalBaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_base not between", value1, value2, "totalBase");
            return (Criteria) this;
        }

        public Criteria andTotalSelfIsNull() {
            addCriterion("total_self is null");
            return (Criteria) this;
        }

        public Criteria andTotalSelfIsNotNull() {
            addCriterion("total_self is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSelfEqualTo(BigDecimal value) {
            addCriterion("total_self =", value, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfNotEqualTo(BigDecimal value) {
            addCriterion("total_self <>", value, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfGreaterThan(BigDecimal value) {
            addCriterion("total_self >", value, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_self >=", value, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfLessThan(BigDecimal value) {
            addCriterion("total_self <", value, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_self <=", value, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfIn(List<BigDecimal> values) {
            addCriterion("total_self in", values, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfNotIn(List<BigDecimal> values) {
            addCriterion("total_self not in", values, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_self between", value1, value2, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andTotalSelfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_self not between", value1, value2, "totalSelf");
            return (Criteria) this;
        }

        public Criteria andBaseTimeIsNull() {
            addCriterion("base_time is null");
            return (Criteria) this;
        }

        public Criteria andBaseTimeIsNotNull() {
            addCriterion("base_time is not null");
            return (Criteria) this;
        }

        public Criteria andBaseTimeEqualTo(Date value) {
            addCriterion("base_time =", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeNotEqualTo(Date value) {
            addCriterion("base_time <>", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeGreaterThan(Date value) {
            addCriterion("base_time >", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("base_time >=", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeLessThan(Date value) {
            addCriterion("base_time <", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("base_time <=", value, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeIn(List<Date> values) {
            addCriterion("base_time in", values, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeNotIn(List<Date> values) {
            addCriterion("base_time not in", values, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeBetween(Date value1, Date value2) {
            addCriterion("base_time between", value1, value2, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("base_time not between", value1, value2, "baseTime");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyIsNull() {
            addCriterion("base_company is null");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyIsNotNull() {
            addCriterion("base_company is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyEqualTo(String value) {
            addCriterion("base_company =", value, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyNotEqualTo(String value) {
            addCriterion("base_company <>", value, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyGreaterThan(String value) {
            addCriterion("base_company >", value, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("base_company >=", value, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyLessThan(String value) {
            addCriterion("base_company <", value, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyLessThanOrEqualTo(String value) {
            addCriterion("base_company <=", value, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyLike(String value) {
            addCriterion("base_company like", value, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyNotLike(String value) {
            addCriterion("base_company not like", value, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyIn(List<String> values) {
            addCriterion("base_company in", values, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyNotIn(List<String> values) {
            addCriterion("base_company not in", values, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyBetween(String value1, String value2) {
            addCriterion("base_company between", value1, value2, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andBaseCompanyNotBetween(String value1, String value2) {
            addCriterion("base_company not between", value1, value2, "baseCompany");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andInnerTypeIsNull() {
            addCriterion("inner_type is null");
            return (Criteria) this;
        }

        public Criteria andInnerTypeIsNotNull() {
            addCriterion("inner_type is not null");
            return (Criteria) this;
        }

        public Criteria andInnerTypeEqualTo(String value) {
            addCriterion("inner_type =", value, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeNotEqualTo(String value) {
            addCriterion("inner_type <>", value, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeGreaterThan(String value) {
            addCriterion("inner_type >", value, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("inner_type >=", value, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeLessThan(String value) {
            addCriterion("inner_type <", value, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeLessThanOrEqualTo(String value) {
            addCriterion("inner_type <=", value, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeLike(String value) {
            addCriterion("inner_type like", value, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeNotLike(String value) {
            addCriterion("inner_type not like", value, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeIn(List<String> values) {
            addCriterion("inner_type in", values, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeNotIn(List<String> values) {
            addCriterion("inner_type not in", values, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeBetween(String value1, String value2) {
            addCriterion("inner_type between", value1, value2, "innerType");
            return (Criteria) this;
        }

        public Criteria andInnerTypeNotBetween(String value1, String value2) {
            addCriterion("inner_type not between", value1, value2, "innerType");
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