package cn.jvtd.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFuncExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFuncExample() {
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

        public Criteria andFuncIdIsNull() {
            addCriterion("func_id is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("func_id is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(String value) {
            addCriterion("func_id =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(String value) {
            addCriterion("func_id <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(String value) {
            addCriterion("func_id >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(String value) {
            addCriterion("func_id >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(String value) {
            addCriterion("func_id <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(String value) {
            addCriterion("func_id <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLike(String value) {
            addCriterion("func_id like", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotLike(String value) {
            addCriterion("func_id not like", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<String> values) {
            addCriterion("func_id in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<String> values) {
            addCriterion("func_id not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(String value1, String value2) {
            addCriterion("func_id between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(String value1, String value2) {
            addCriterion("func_id not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNull() {
            addCriterion("func_name is null");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNotNull() {
            addCriterion("func_name is not null");
            return (Criteria) this;
        }

        public Criteria andFuncNameEqualTo(String value) {
            addCriterion("func_name =", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotEqualTo(String value) {
            addCriterion("func_name <>", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThan(String value) {
            addCriterion("func_name >", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThanOrEqualTo(String value) {
            addCriterion("func_name >=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThan(String value) {
            addCriterion("func_name <", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThanOrEqualTo(String value) {
            addCriterion("func_name <=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLike(String value) {
            addCriterion("func_name like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotLike(String value) {
            addCriterion("func_name not like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameIn(List<String> values) {
            addCriterion("func_name in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotIn(List<String> values) {
            addCriterion("func_name not in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameBetween(String value1, String value2) {
            addCriterion("func_name between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotBetween(String value1, String value2) {
            addCriterion("func_name not between", value1, value2, "funcName");
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

        public Criteria andSeqNumIsNull() {
            addCriterion("seq_num is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("seq_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(Integer value) {
            addCriterion("seq_num =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(Integer value) {
            addCriterion("seq_num <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(Integer value) {
            addCriterion("seq_num >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq_num >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(Integer value) {
            addCriterion("seq_num <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(Integer value) {
            addCriterion("seq_num <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<Integer> values) {
            addCriterion("seq_num in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<Integer> values) {
            addCriterion("seq_num not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(Integer value1, Integer value2) {
            addCriterion("seq_num between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(Integer value1, Integer value2) {
            addCriterion("seq_num not between", value1, value2, "seqNum");
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

        public Criteria andFuncCodeIsNull() {
            addCriterion("func_code is null");
            return (Criteria) this;
        }

        public Criteria andFuncCodeIsNotNull() {
            addCriterion("func_code is not null");
            return (Criteria) this;
        }

        public Criteria andFuncCodeEqualTo(String value) {
            addCriterion("func_code =", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotEqualTo(String value) {
            addCriterion("func_code <>", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeGreaterThan(String value) {
            addCriterion("func_code >", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeGreaterThanOrEqualTo(String value) {
            addCriterion("func_code >=", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeLessThan(String value) {
            addCriterion("func_code <", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeLessThanOrEqualTo(String value) {
            addCriterion("func_code <=", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeLike(String value) {
            addCriterion("func_code like", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotLike(String value) {
            addCriterion("func_code not like", value, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeIn(List<String> values) {
            addCriterion("func_code in", values, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotIn(List<String> values) {
            addCriterion("func_code not in", values, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeBetween(String value1, String value2) {
            addCriterion("func_code between", value1, value2, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncCodeNotBetween(String value1, String value2) {
            addCriterion("func_code not between", value1, value2, "funcCode");
            return (Criteria) this;
        }

        public Criteria andFuncUrlIsNull() {
            addCriterion("func_url is null");
            return (Criteria) this;
        }

        public Criteria andFuncUrlIsNotNull() {
            addCriterion("func_url is not null");
            return (Criteria) this;
        }

        public Criteria andFuncUrlEqualTo(String value) {
            addCriterion("func_url =", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlNotEqualTo(String value) {
            addCriterion("func_url <>", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlGreaterThan(String value) {
            addCriterion("func_url >", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlGreaterThanOrEqualTo(String value) {
            addCriterion("func_url >=", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlLessThan(String value) {
            addCriterion("func_url <", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlLessThanOrEqualTo(String value) {
            addCriterion("func_url <=", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlLike(String value) {
            addCriterion("func_url like", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlNotLike(String value) {
            addCriterion("func_url not like", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlIn(List<String> values) {
            addCriterion("func_url in", values, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlNotIn(List<String> values) {
            addCriterion("func_url not in", values, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlBetween(String value1, String value2) {
            addCriterion("func_url between", value1, value2, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlNotBetween(String value1, String value2) {
            addCriterion("func_url not between", value1, value2, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNull() {
            addCriterion("view_type is null");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNotNull() {
            addCriterion("view_type is not null");
            return (Criteria) this;
        }

        public Criteria andViewTypeEqualTo(Integer value) {
            addCriterion("view_type =", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotEqualTo(Integer value) {
            addCriterion("view_type <>", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThan(Integer value) {
            addCriterion("view_type >", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_type >=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThan(Integer value) {
            addCriterion("view_type <", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThanOrEqualTo(Integer value) {
            addCriterion("view_type <=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeIn(List<Integer> values) {
            addCriterion("view_type in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotIn(List<Integer> values) {
            addCriterion("view_type not in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeBetween(Integer value1, Integer value2) {
            addCriterion("view_type between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("view_type not between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andImplTypeIsNull() {
            addCriterion("impl_type is null");
            return (Criteria) this;
        }

        public Criteria andImplTypeIsNotNull() {
            addCriterion("impl_type is not null");
            return (Criteria) this;
        }

        public Criteria andImplTypeEqualTo(Integer value) {
            addCriterion("impl_type =", value, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeNotEqualTo(Integer value) {
            addCriterion("impl_type <>", value, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeGreaterThan(Integer value) {
            addCriterion("impl_type >", value, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("impl_type >=", value, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeLessThan(Integer value) {
            addCriterion("impl_type <", value, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeLessThanOrEqualTo(Integer value) {
            addCriterion("impl_type <=", value, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeIn(List<Integer> values) {
            addCriterion("impl_type in", values, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeNotIn(List<Integer> values) {
            addCriterion("impl_type not in", values, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeBetween(Integer value1, Integer value2) {
            addCriterion("impl_type between", value1, value2, "implType");
            return (Criteria) this;
        }

        public Criteria andImplTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("impl_type not between", value1, value2, "implType");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnIsNull() {
            addCriterion("func_name_cn is null");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnIsNotNull() {
            addCriterion("func_name_cn is not null");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnEqualTo(String value) {
            addCriterion("func_name_cn =", value, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnNotEqualTo(String value) {
            addCriterion("func_name_cn <>", value, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnGreaterThan(String value) {
            addCriterion("func_name_cn >", value, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("func_name_cn >=", value, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnLessThan(String value) {
            addCriterion("func_name_cn <", value, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnLessThanOrEqualTo(String value) {
            addCriterion("func_name_cn <=", value, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnLike(String value) {
            addCriterion("func_name_cn like", value, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnNotLike(String value) {
            addCriterion("func_name_cn not like", value, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnIn(List<String> values) {
            addCriterion("func_name_cn in", values, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnNotIn(List<String> values) {
            addCriterion("func_name_cn not in", values, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnBetween(String value1, String value2) {
            addCriterion("func_name_cn between", value1, value2, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameCnNotBetween(String value1, String value2) {
            addCriterion("func_name_cn not between", value1, value2, "funcNameCn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnIsNull() {
            addCriterion("func_name_en is null");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnIsNotNull() {
            addCriterion("func_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnEqualTo(String value) {
            addCriterion("func_name_en =", value, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnNotEqualTo(String value) {
            addCriterion("func_name_en <>", value, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnGreaterThan(String value) {
            addCriterion("func_name_en >", value, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("func_name_en >=", value, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnLessThan(String value) {
            addCriterion("func_name_en <", value, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnLessThanOrEqualTo(String value) {
            addCriterion("func_name_en <=", value, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnLike(String value) {
            addCriterion("func_name_en like", value, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnNotLike(String value) {
            addCriterion("func_name_en not like", value, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnIn(List<String> values) {
            addCriterion("func_name_en in", values, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnNotIn(List<String> values) {
            addCriterion("func_name_en not in", values, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnBetween(String value1, String value2) {
            addCriterion("func_name_en between", value1, value2, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andFuncNameEnNotBetween(String value1, String value2) {
            addCriterion("func_name_en not between", value1, value2, "funcNameEn");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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