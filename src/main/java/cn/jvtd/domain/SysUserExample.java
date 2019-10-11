package cn.jvtd.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceIsNull() {
            addCriterion("pwd_init_force is null");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceIsNotNull() {
            addCriterion("pwd_init_force is not null");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceEqualTo(String value) {
            addCriterion("pwd_init_force =", value, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceNotEqualTo(String value) {
            addCriterion("pwd_init_force <>", value, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceGreaterThan(String value) {
            addCriterion("pwd_init_force >", value, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_init_force >=", value, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceLessThan(String value) {
            addCriterion("pwd_init_force <", value, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceLessThanOrEqualTo(String value) {
            addCriterion("pwd_init_force <=", value, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceLike(String value) {
            addCriterion("pwd_init_force like", value, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceNotLike(String value) {
            addCriterion("pwd_init_force not like", value, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceIn(List<String> values) {
            addCriterion("pwd_init_force in", values, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceNotIn(List<String> values) {
            addCriterion("pwd_init_force not in", values, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceBetween(String value1, String value2) {
            addCriterion("pwd_init_force between", value1, value2, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdInitForceNotBetween(String value1, String value2) {
            addCriterion("pwd_init_force not between", value1, value2, "pwdInitForce");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverIsNull() {
            addCriterion("pwd_valid_forever is null");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverIsNotNull() {
            addCriterion("pwd_valid_forever is not null");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverEqualTo(String value) {
            addCriterion("pwd_valid_forever =", value, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverNotEqualTo(String value) {
            addCriterion("pwd_valid_forever <>", value, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverGreaterThan(String value) {
            addCriterion("pwd_valid_forever >", value, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_valid_forever >=", value, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverLessThan(String value) {
            addCriterion("pwd_valid_forever <", value, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverLessThanOrEqualTo(String value) {
            addCriterion("pwd_valid_forever <=", value, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverLike(String value) {
            addCriterion("pwd_valid_forever like", value, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverNotLike(String value) {
            addCriterion("pwd_valid_forever not like", value, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverIn(List<String> values) {
            addCriterion("pwd_valid_forever in", values, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverNotIn(List<String> values) {
            addCriterion("pwd_valid_forever not in", values, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverBetween(String value1, String value2) {
            addCriterion("pwd_valid_forever between", value1, value2, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andPwdValidForeverNotBetween(String value1, String value2) {
            addCriterion("pwd_valid_forever not between", value1, value2, "pwdValidForever");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andLockReasonIsNull() {
            addCriterion("lock_reason is null");
            return (Criteria) this;
        }

        public Criteria andLockReasonIsNotNull() {
            addCriterion("lock_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLockReasonEqualTo(Integer value) {
            addCriterion("lock_reason =", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonNotEqualTo(Integer value) {
            addCriterion("lock_reason <>", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonGreaterThan(Integer value) {
            addCriterion("lock_reason >", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_reason >=", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonLessThan(Integer value) {
            addCriterion("lock_reason <", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonLessThanOrEqualTo(Integer value) {
            addCriterion("lock_reason <=", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonIn(List<Integer> values) {
            addCriterion("lock_reason in", values, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonNotIn(List<Integer> values) {
            addCriterion("lock_reason not in", values, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonBetween(Integer value1, Integer value2) {
            addCriterion("lock_reason between", value1, value2, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_reason not between", value1, value2, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIsNull() {
            addCriterion("login_flag is null");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIsNotNull() {
            addCriterion("login_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFlagEqualTo(String value) {
            addCriterion("login_flag =", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotEqualTo(String value) {
            addCriterion("login_flag <>", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagGreaterThan(String value) {
            addCriterion("login_flag >", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagGreaterThanOrEqualTo(String value) {
            addCriterion("login_flag >=", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLessThan(String value) {
            addCriterion("login_flag <", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLessThanOrEqualTo(String value) {
            addCriterion("login_flag <=", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLike(String value) {
            addCriterion("login_flag like", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotLike(String value) {
            addCriterion("login_flag not like", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIn(List<String> values) {
            addCriterion("login_flag in", values, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotIn(List<String> values) {
            addCriterion("login_flag not in", values, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagBetween(String value1, String value2) {
            addCriterion("login_flag between", value1, value2, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotBetween(String value1, String value2) {
            addCriterion("login_flag not between", value1, value2, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesIsNull() {
            addCriterion("accum_fail_times is null");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesIsNotNull() {
            addCriterion("accum_fail_times is not null");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesEqualTo(Integer value) {
            addCriterion("accum_fail_times =", value, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesNotEqualTo(Integer value) {
            addCriterion("accum_fail_times <>", value, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesGreaterThan(Integer value) {
            addCriterion("accum_fail_times >", value, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("accum_fail_times >=", value, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesLessThan(Integer value) {
            addCriterion("accum_fail_times <", value, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesLessThanOrEqualTo(Integer value) {
            addCriterion("accum_fail_times <=", value, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesIn(List<Integer> values) {
            addCriterion("accum_fail_times in", values, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesNotIn(List<Integer> values) {
            addCriterion("accum_fail_times not in", values, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesBetween(Integer value1, Integer value2) {
            addCriterion("accum_fail_times between", value1, value2, "accumFailTimes");
            return (Criteria) this;
        }

        public Criteria andAccumFailTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("accum_fail_times not between", value1, value2, "accumFailTimes");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAcademicIsNull() {
            addCriterion("academic is null");
            return (Criteria) this;
        }

        public Criteria andAcademicIsNotNull() {
            addCriterion("academic is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicEqualTo(String value) {
            addCriterion("academic =", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotEqualTo(String value) {
            addCriterion("academic <>", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicGreaterThan(String value) {
            addCriterion("academic >", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicGreaterThanOrEqualTo(String value) {
            addCriterion("academic >=", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLessThan(String value) {
            addCriterion("academic <", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLessThanOrEqualTo(String value) {
            addCriterion("academic <=", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicLike(String value) {
            addCriterion("academic like", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotLike(String value) {
            addCriterion("academic not like", value, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicIn(List<String> values) {
            addCriterion("academic in", values, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotIn(List<String> values) {
            addCriterion("academic not in", values, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicBetween(String value1, String value2) {
            addCriterion("academic between", value1, value2, "academic");
            return (Criteria) this;
        }

        public Criteria andAcademicNotBetween(String value1, String value2) {
            addCriterion("academic not between", value1, value2, "academic");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIsNull() {
            addCriterion("credential_type is null");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIsNotNull() {
            addCriterion("credential_type is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeEqualTo(String value) {
            addCriterion("credential_type =", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotEqualTo(String value) {
            addCriterion("credential_type <>", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeGreaterThan(String value) {
            addCriterion("credential_type >", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("credential_type >=", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLessThan(String value) {
            addCriterion("credential_type <", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLessThanOrEqualTo(String value) {
            addCriterion("credential_type <=", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLike(String value) {
            addCriterion("credential_type like", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotLike(String value) {
            addCriterion("credential_type not like", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIn(List<String> values) {
            addCriterion("credential_type in", values, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotIn(List<String> values) {
            addCriterion("credential_type not in", values, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeBetween(String value1, String value2) {
            addCriterion("credential_type between", value1, value2, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotBetween(String value1, String value2) {
            addCriterion("credential_type not between", value1, value2, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberIsNull() {
            addCriterion("credential_number is null");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberIsNotNull() {
            addCriterion("credential_number is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberEqualTo(String value) {
            addCriterion("credential_number =", value, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberNotEqualTo(String value) {
            addCriterion("credential_number <>", value, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberGreaterThan(String value) {
            addCriterion("credential_number >", value, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("credential_number >=", value, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberLessThan(String value) {
            addCriterion("credential_number <", value, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberLessThanOrEqualTo(String value) {
            addCriterion("credential_number <=", value, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberLike(String value) {
            addCriterion("credential_number like", value, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberNotLike(String value) {
            addCriterion("credential_number not like", value, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberIn(List<String> values) {
            addCriterion("credential_number in", values, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberNotIn(List<String> values) {
            addCriterion("credential_number not in", values, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberBetween(String value1, String value2) {
            addCriterion("credential_number between", value1, value2, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumberNotBetween(String value1, String value2) {
            addCriterion("credential_number not between", value1, value2, "credentialNumber");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andHobbiesIsNull() {
            addCriterion("hobbies is null");
            return (Criteria) this;
        }

        public Criteria andHobbiesIsNotNull() {
            addCriterion("hobbies is not null");
            return (Criteria) this;
        }

        public Criteria andHobbiesEqualTo(String value) {
            addCriterion("hobbies =", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesNotEqualTo(String value) {
            addCriterion("hobbies <>", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesGreaterThan(String value) {
            addCriterion("hobbies >", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesGreaterThanOrEqualTo(String value) {
            addCriterion("hobbies >=", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesLessThan(String value) {
            addCriterion("hobbies <", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesLessThanOrEqualTo(String value) {
            addCriterion("hobbies <=", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesLike(String value) {
            addCriterion("hobbies like", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesNotLike(String value) {
            addCriterion("hobbies not like", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesIn(List<String> values) {
            addCriterion("hobbies in", values, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesNotIn(List<String> values) {
            addCriterion("hobbies not in", values, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesBetween(String value1, String value2) {
            addCriterion("hobbies between", value1, value2, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesNotBetween(String value1, String value2) {
            addCriterion("hobbies not between", value1, value2, "hobbies");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNull() {
            addCriterion("reference is null");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNotNull() {
            addCriterion("reference is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceEqualTo(String value) {
            addCriterion("reference =", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotEqualTo(String value) {
            addCriterion("reference <>", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThan(String value) {
            addCriterion("reference >", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("reference >=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThan(String value) {
            addCriterion("reference <", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThanOrEqualTo(String value) {
            addCriterion("reference <=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLike(String value) {
            addCriterion("reference like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotLike(String value) {
            addCriterion("reference not like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceIn(List<String> values) {
            addCriterion("reference in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotIn(List<String> values) {
            addCriterion("reference not in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceBetween(String value1, String value2) {
            addCriterion("reference between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotBetween(String value1, String value2) {
            addCriterion("reference not between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridIsNull() {
            addCriterion("reference_userid is null");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridIsNotNull() {
            addCriterion("reference_userid is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridEqualTo(String value) {
            addCriterion("reference_userid =", value, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridNotEqualTo(String value) {
            addCriterion("reference_userid <>", value, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridGreaterThan(String value) {
            addCriterion("reference_userid >", value, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridGreaterThanOrEqualTo(String value) {
            addCriterion("reference_userid >=", value, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridLessThan(String value) {
            addCriterion("reference_userid <", value, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridLessThanOrEqualTo(String value) {
            addCriterion("reference_userid <=", value, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridLike(String value) {
            addCriterion("reference_userid like", value, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridNotLike(String value) {
            addCriterion("reference_userid not like", value, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridIn(List<String> values) {
            addCriterion("reference_userid in", values, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridNotIn(List<String> values) {
            addCriterion("reference_userid not in", values, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridBetween(String value1, String value2) {
            addCriterion("reference_userid between", value1, value2, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andReferenceUseridNotBetween(String value1, String value2) {
            addCriterion("reference_userid not between", value1, value2, "referenceUserid");
            return (Criteria) this;
        }

        public Criteria andIndustry1IsNull() {
            addCriterion("industry1 is null");
            return (Criteria) this;
        }

        public Criteria andIndustry1IsNotNull() {
            addCriterion("industry1 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry1EqualTo(String value) {
            addCriterion("industry1 =", value, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1NotEqualTo(String value) {
            addCriterion("industry1 <>", value, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1GreaterThan(String value) {
            addCriterion("industry1 >", value, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1GreaterThanOrEqualTo(String value) {
            addCriterion("industry1 >=", value, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1LessThan(String value) {
            addCriterion("industry1 <", value, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1LessThanOrEqualTo(String value) {
            addCriterion("industry1 <=", value, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1Like(String value) {
            addCriterion("industry1 like", value, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1NotLike(String value) {
            addCriterion("industry1 not like", value, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1In(List<String> values) {
            addCriterion("industry1 in", values, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1NotIn(List<String> values) {
            addCriterion("industry1 not in", values, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1Between(String value1, String value2) {
            addCriterion("industry1 between", value1, value2, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1NotBetween(String value1, String value2) {
            addCriterion("industry1 not between", value1, value2, "industry1");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionIsNull() {
            addCriterion("industry1_position is null");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionIsNotNull() {
            addCriterion("industry1_position is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionEqualTo(String value) {
            addCriterion("industry1_position =", value, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionNotEqualTo(String value) {
            addCriterion("industry1_position <>", value, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionGreaterThan(String value) {
            addCriterion("industry1_position >", value, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionGreaterThanOrEqualTo(String value) {
            addCriterion("industry1_position >=", value, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionLessThan(String value) {
            addCriterion("industry1_position <", value, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionLessThanOrEqualTo(String value) {
            addCriterion("industry1_position <=", value, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionLike(String value) {
            addCriterion("industry1_position like", value, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionNotLike(String value) {
            addCriterion("industry1_position not like", value, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionIn(List<String> values) {
            addCriterion("industry1_position in", values, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionNotIn(List<String> values) {
            addCriterion("industry1_position not in", values, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionBetween(String value1, String value2) {
            addCriterion("industry1_position between", value1, value2, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry1PositionNotBetween(String value1, String value2) {
            addCriterion("industry1_position not between", value1, value2, "industry1Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2IsNull() {
            addCriterion("industry2 is null");
            return (Criteria) this;
        }

        public Criteria andIndustry2IsNotNull() {
            addCriterion("industry2 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry2EqualTo(String value) {
            addCriterion("industry2 =", value, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2NotEqualTo(String value) {
            addCriterion("industry2 <>", value, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2GreaterThan(String value) {
            addCriterion("industry2 >", value, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2GreaterThanOrEqualTo(String value) {
            addCriterion("industry2 >=", value, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2LessThan(String value) {
            addCriterion("industry2 <", value, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2LessThanOrEqualTo(String value) {
            addCriterion("industry2 <=", value, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2Like(String value) {
            addCriterion("industry2 like", value, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2NotLike(String value) {
            addCriterion("industry2 not like", value, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2In(List<String> values) {
            addCriterion("industry2 in", values, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2NotIn(List<String> values) {
            addCriterion("industry2 not in", values, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2Between(String value1, String value2) {
            addCriterion("industry2 between", value1, value2, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2NotBetween(String value1, String value2) {
            addCriterion("industry2 not between", value1, value2, "industry2");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionIsNull() {
            addCriterion("industry2_position is null");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionIsNotNull() {
            addCriterion("industry2_position is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionEqualTo(String value) {
            addCriterion("industry2_position =", value, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionNotEqualTo(String value) {
            addCriterion("industry2_position <>", value, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionGreaterThan(String value) {
            addCriterion("industry2_position >", value, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionGreaterThanOrEqualTo(String value) {
            addCriterion("industry2_position >=", value, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionLessThan(String value) {
            addCriterion("industry2_position <", value, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionLessThanOrEqualTo(String value) {
            addCriterion("industry2_position <=", value, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionLike(String value) {
            addCriterion("industry2_position like", value, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionNotLike(String value) {
            addCriterion("industry2_position not like", value, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionIn(List<String> values) {
            addCriterion("industry2_position in", values, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionNotIn(List<String> values) {
            addCriterion("industry2_position not in", values, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionBetween(String value1, String value2) {
            addCriterion("industry2_position between", value1, value2, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry2PositionNotBetween(String value1, String value2) {
            addCriterion("industry2_position not between", value1, value2, "industry2Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3IsNull() {
            addCriterion("industry3 is null");
            return (Criteria) this;
        }

        public Criteria andIndustry3IsNotNull() {
            addCriterion("industry3 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry3EqualTo(String value) {
            addCriterion("industry3 =", value, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3NotEqualTo(String value) {
            addCriterion("industry3 <>", value, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3GreaterThan(String value) {
            addCriterion("industry3 >", value, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3GreaterThanOrEqualTo(String value) {
            addCriterion("industry3 >=", value, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3LessThan(String value) {
            addCriterion("industry3 <", value, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3LessThanOrEqualTo(String value) {
            addCriterion("industry3 <=", value, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3Like(String value) {
            addCriterion("industry3 like", value, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3NotLike(String value) {
            addCriterion("industry3 not like", value, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3In(List<String> values) {
            addCriterion("industry3 in", values, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3NotIn(List<String> values) {
            addCriterion("industry3 not in", values, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3Between(String value1, String value2) {
            addCriterion("industry3 between", value1, value2, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3NotBetween(String value1, String value2) {
            addCriterion("industry3 not between", value1, value2, "industry3");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionIsNull() {
            addCriterion("industry3_position is null");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionIsNotNull() {
            addCriterion("industry3_position is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionEqualTo(String value) {
            addCriterion("industry3_position =", value, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionNotEqualTo(String value) {
            addCriterion("industry3_position <>", value, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionGreaterThan(String value) {
            addCriterion("industry3_position >", value, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionGreaterThanOrEqualTo(String value) {
            addCriterion("industry3_position >=", value, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionLessThan(String value) {
            addCriterion("industry3_position <", value, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionLessThanOrEqualTo(String value) {
            addCriterion("industry3_position <=", value, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionLike(String value) {
            addCriterion("industry3_position like", value, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionNotLike(String value) {
            addCriterion("industry3_position not like", value, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionIn(List<String> values) {
            addCriterion("industry3_position in", values, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionNotIn(List<String> values) {
            addCriterion("industry3_position not in", values, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionBetween(String value1, String value2) {
            addCriterion("industry3_position between", value1, value2, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry3PositionNotBetween(String value1, String value2) {
            addCriterion("industry3_position not between", value1, value2, "industry3Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4IsNull() {
            addCriterion("industry4 is null");
            return (Criteria) this;
        }

        public Criteria andIndustry4IsNotNull() {
            addCriterion("industry4 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry4EqualTo(String value) {
            addCriterion("industry4 =", value, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4NotEqualTo(String value) {
            addCriterion("industry4 <>", value, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4GreaterThan(String value) {
            addCriterion("industry4 >", value, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4GreaterThanOrEqualTo(String value) {
            addCriterion("industry4 >=", value, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4LessThan(String value) {
            addCriterion("industry4 <", value, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4LessThanOrEqualTo(String value) {
            addCriterion("industry4 <=", value, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4Like(String value) {
            addCriterion("industry4 like", value, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4NotLike(String value) {
            addCriterion("industry4 not like", value, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4In(List<String> values) {
            addCriterion("industry4 in", values, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4NotIn(List<String> values) {
            addCriterion("industry4 not in", values, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4Between(String value1, String value2) {
            addCriterion("industry4 between", value1, value2, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4NotBetween(String value1, String value2) {
            addCriterion("industry4 not between", value1, value2, "industry4");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionIsNull() {
            addCriterion("industry4_position is null");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionIsNotNull() {
            addCriterion("industry4_position is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionEqualTo(String value) {
            addCriterion("industry4_position =", value, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionNotEqualTo(String value) {
            addCriterion("industry4_position <>", value, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionGreaterThan(String value) {
            addCriterion("industry4_position >", value, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionGreaterThanOrEqualTo(String value) {
            addCriterion("industry4_position >=", value, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionLessThan(String value) {
            addCriterion("industry4_position <", value, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionLessThanOrEqualTo(String value) {
            addCriterion("industry4_position <=", value, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionLike(String value) {
            addCriterion("industry4_position like", value, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionNotLike(String value) {
            addCriterion("industry4_position not like", value, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionIn(List<String> values) {
            addCriterion("industry4_position in", values, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionNotIn(List<String> values) {
            addCriterion("industry4_position not in", values, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionBetween(String value1, String value2) {
            addCriterion("industry4_position between", value1, value2, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry4PositionNotBetween(String value1, String value2) {
            addCriterion("industry4_position not between", value1, value2, "industry4Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5IsNull() {
            addCriterion("industry5 is null");
            return (Criteria) this;
        }

        public Criteria andIndustry5IsNotNull() {
            addCriterion("industry5 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry5EqualTo(String value) {
            addCriterion("industry5 =", value, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5NotEqualTo(String value) {
            addCriterion("industry5 <>", value, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5GreaterThan(String value) {
            addCriterion("industry5 >", value, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5GreaterThanOrEqualTo(String value) {
            addCriterion("industry5 >=", value, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5LessThan(String value) {
            addCriterion("industry5 <", value, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5LessThanOrEqualTo(String value) {
            addCriterion("industry5 <=", value, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5Like(String value) {
            addCriterion("industry5 like", value, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5NotLike(String value) {
            addCriterion("industry5 not like", value, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5In(List<String> values) {
            addCriterion("industry5 in", values, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5NotIn(List<String> values) {
            addCriterion("industry5 not in", values, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5Between(String value1, String value2) {
            addCriterion("industry5 between", value1, value2, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5NotBetween(String value1, String value2) {
            addCriterion("industry5 not between", value1, value2, "industry5");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionIsNull() {
            addCriterion("industry5_position is null");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionIsNotNull() {
            addCriterion("industry5_position is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionEqualTo(String value) {
            addCriterion("industry5_position =", value, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionNotEqualTo(String value) {
            addCriterion("industry5_position <>", value, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionGreaterThan(String value) {
            addCriterion("industry5_position >", value, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionGreaterThanOrEqualTo(String value) {
            addCriterion("industry5_position >=", value, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionLessThan(String value) {
            addCriterion("industry5_position <", value, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionLessThanOrEqualTo(String value) {
            addCriterion("industry5_position <=", value, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionLike(String value) {
            addCriterion("industry5_position like", value, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionNotLike(String value) {
            addCriterion("industry5_position not like", value, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionIn(List<String> values) {
            addCriterion("industry5_position in", values, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionNotIn(List<String> values) {
            addCriterion("industry5_position not in", values, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionBetween(String value1, String value2) {
            addCriterion("industry5_position between", value1, value2, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andIndustry5PositionNotBetween(String value1, String value2) {
            addCriterion("industry5_position not between", value1, value2, "industry5Position");
            return (Criteria) this;
        }

        public Criteria andAliPayIsNull() {
            addCriterion("ali_pay is null");
            return (Criteria) this;
        }

        public Criteria andAliPayIsNotNull() {
            addCriterion("ali_pay is not null");
            return (Criteria) this;
        }

        public Criteria andAliPayEqualTo(String value) {
            addCriterion("ali_pay =", value, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayNotEqualTo(String value) {
            addCriterion("ali_pay <>", value, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayGreaterThan(String value) {
            addCriterion("ali_pay >", value, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayGreaterThanOrEqualTo(String value) {
            addCriterion("ali_pay >=", value, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayLessThan(String value) {
            addCriterion("ali_pay <", value, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayLessThanOrEqualTo(String value) {
            addCriterion("ali_pay <=", value, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayLike(String value) {
            addCriterion("ali_pay like", value, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayNotLike(String value) {
            addCriterion("ali_pay not like", value, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayIn(List<String> values) {
            addCriterion("ali_pay in", values, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayNotIn(List<String> values) {
            addCriterion("ali_pay not in", values, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayBetween(String value1, String value2) {
            addCriterion("ali_pay between", value1, value2, "aliPay");
            return (Criteria) this;
        }

        public Criteria andAliPayNotBetween(String value1, String value2) {
            addCriterion("ali_pay not between", value1, value2, "aliPay");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgIsNull() {
            addCriterion("livechat_welcome_msg is null");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgIsNotNull() {
            addCriterion("livechat_welcome_msg is not null");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgEqualTo(String value) {
            addCriterion("livechat_welcome_msg =", value, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgNotEqualTo(String value) {
            addCriterion("livechat_welcome_msg <>", value, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgGreaterThan(String value) {
            addCriterion("livechat_welcome_msg >", value, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgGreaterThanOrEqualTo(String value) {
            addCriterion("livechat_welcome_msg >=", value, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgLessThan(String value) {
            addCriterion("livechat_welcome_msg <", value, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgLessThanOrEqualTo(String value) {
            addCriterion("livechat_welcome_msg <=", value, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgLike(String value) {
            addCriterion("livechat_welcome_msg like", value, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgNotLike(String value) {
            addCriterion("livechat_welcome_msg not like", value, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgIn(List<String> values) {
            addCriterion("livechat_welcome_msg in", values, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgNotIn(List<String> values) {
            addCriterion("livechat_welcome_msg not in", values, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgBetween(String value1, String value2) {
            addCriterion("livechat_welcome_msg between", value1, value2, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andLivechatWelcomeMsgNotBetween(String value1, String value2) {
            addCriterion("livechat_welcome_msg not between", value1, value2, "livechatWelcomeMsg");
            return (Criteria) this;
        }

        public Criteria andHashPwdIsNull() {
            addCriterion("hash_pwd is null");
            return (Criteria) this;
        }

        public Criteria andHashPwdIsNotNull() {
            addCriterion("hash_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andHashPwdEqualTo(String value) {
            addCriterion("hash_pwd =", value, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdNotEqualTo(String value) {
            addCriterion("hash_pwd <>", value, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdGreaterThan(String value) {
            addCriterion("hash_pwd >", value, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdGreaterThanOrEqualTo(String value) {
            addCriterion("hash_pwd >=", value, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdLessThan(String value) {
            addCriterion("hash_pwd <", value, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdLessThanOrEqualTo(String value) {
            addCriterion("hash_pwd <=", value, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdLike(String value) {
            addCriterion("hash_pwd like", value, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdNotLike(String value) {
            addCriterion("hash_pwd not like", value, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdIn(List<String> values) {
            addCriterion("hash_pwd in", values, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdNotIn(List<String> values) {
            addCriterion("hash_pwd not in", values, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdBetween(String value1, String value2) {
            addCriterion("hash_pwd between", value1, value2, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHashPwdNotBetween(String value1, String value2) {
            addCriterion("hash_pwd not between", value1, value2, "hashPwd");
            return (Criteria) this;
        }

        public Criteria andHourlyRateIsNull() {
            addCriterion("hourly_rate is null");
            return (Criteria) this;
        }

        public Criteria andHourlyRateIsNotNull() {
            addCriterion("hourly_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHourlyRateEqualTo(Double value) {
            addCriterion("hourly_rate =", value, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateNotEqualTo(Double value) {
            addCriterion("hourly_rate <>", value, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateGreaterThan(Double value) {
            addCriterion("hourly_rate >", value, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("hourly_rate >=", value, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateLessThan(Double value) {
            addCriterion("hourly_rate <", value, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateLessThanOrEqualTo(Double value) {
            addCriterion("hourly_rate <=", value, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateIn(List<Double> values) {
            addCriterion("hourly_rate in", values, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateNotIn(List<Double> values) {
            addCriterion("hourly_rate not in", values, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateBetween(Double value1, Double value2) {
            addCriterion("hourly_rate between", value1, value2, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andHourlyRateNotBetween(Double value1, Double value2) {
            addCriterion("hourly_rate not between", value1, value2, "hourlyRate");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNull() {
            addCriterion("job_number is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("job_number is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(String value) {
            addCriterion("job_number =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(String value) {
            addCriterion("job_number <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(String value) {
            addCriterion("job_number >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("job_number >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(String value) {
            addCriterion("job_number <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(String value) {
            addCriterion("job_number <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLike(String value) {
            addCriterion("job_number like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotLike(String value) {
            addCriterion("job_number not like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<String> values) {
            addCriterion("job_number in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<String> values) {
            addCriterion("job_number not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(String value1, String value2) {
            addCriterion("job_number between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(String value1, String value2) {
            addCriterion("job_number not between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNull() {
            addCriterion("emp_status is null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNotNull() {
            addCriterion("emp_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusEqualTo(String value) {
            addCriterion("emp_status =", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotEqualTo(String value) {
            addCriterion("emp_status <>", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThan(String value) {
            addCriterion("emp_status >", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThanOrEqualTo(String value) {
            addCriterion("emp_status >=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThan(String value) {
            addCriterion("emp_status <", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThanOrEqualTo(String value) {
            addCriterion("emp_status <=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLike(String value) {
            addCriterion("emp_status like", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotLike(String value) {
            addCriterion("emp_status not like", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIn(List<String> values) {
            addCriterion("emp_status in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotIn(List<String> values) {
            addCriterion("emp_status not in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusBetween(String value1, String value2) {
            addCriterion("emp_status between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotBetween(String value1, String value2) {
            addCriterion("emp_status not between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andIsPushIsNull() {
            addCriterion("is_push is null");
            return (Criteria) this;
        }

        public Criteria andIsPushIsNotNull() {
            addCriterion("is_push is not null");
            return (Criteria) this;
        }

        public Criteria andIsPushEqualTo(String value) {
            addCriterion("is_push =", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotEqualTo(String value) {
            addCriterion("is_push <>", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushGreaterThan(String value) {
            addCriterion("is_push >", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushGreaterThanOrEqualTo(String value) {
            addCriterion("is_push >=", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLessThan(String value) {
            addCriterion("is_push <", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLessThanOrEqualTo(String value) {
            addCriterion("is_push <=", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLike(String value) {
            addCriterion("is_push like", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotLike(String value) {
            addCriterion("is_push not like", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushIn(List<String> values) {
            addCriterion("is_push in", values, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotIn(List<String> values) {
            addCriterion("is_push not in", values, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushBetween(String value1, String value2) {
            addCriterion("is_push between", value1, value2, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotBetween(String value1, String value2) {
            addCriterion("is_push not between", value1, value2, "isPush");
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