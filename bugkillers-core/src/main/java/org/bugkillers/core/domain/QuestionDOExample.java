package org.bugkillers.core.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionDOExample {
    /**
     * 排序字段,bk_question
     */
    protected String orderByClause;

    /**
     * 是否过滤重复数据,bk_question
     */
    protected boolean distinct;

    /**
     * ,bk_question
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,bk_question
     */
    public QuestionDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,bk_question
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,bk_question
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,bk_question
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,bk_question
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,bk_question
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,bk_question
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,bk_question
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,bk_question
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,bk_question
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,bk_question
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 基本动态SQL对象,bk_question
     */
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

        public Criteria andQuestionTitleIsNull() {
            addCriterion("question_title is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleIsNotNull() {
            addCriterion("question_title is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleEqualTo(String value) {
            addCriterion("question_title =", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleNotEqualTo(String value) {
            addCriterion("question_title <>", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleGreaterThan(String value) {
            addCriterion("question_title >", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("question_title >=", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleLessThan(String value) {
            addCriterion("question_title <", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleLessThanOrEqualTo(String value) {
            addCriterion("question_title <=", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleLike(String value) {
            addCriterion("question_title like", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleNotLike(String value) {
            addCriterion("question_title not like", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleIn(List<String> values) {
            addCriterion("question_title in", values, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleNotIn(List<String> values) {
            addCriterion("question_title not in", values, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleBetween(String value1, String value2) {
            addCriterion("question_title between", value1, value2, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleNotBetween(String value1, String value2) {
            addCriterion("question_title not between", value1, value2, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryIsNull() {
            addCriterion("question_summary is null");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryIsNotNull() {
            addCriterion("question_summary is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryEqualTo(String value) {
            addCriterion("question_summary =", value, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryNotEqualTo(String value) {
            addCriterion("question_summary <>", value, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryGreaterThan(String value) {
            addCriterion("question_summary >", value, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("question_summary >=", value, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryLessThan(String value) {
            addCriterion("question_summary <", value, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryLessThanOrEqualTo(String value) {
            addCriterion("question_summary <=", value, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryLike(String value) {
            addCriterion("question_summary like", value, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryNotLike(String value) {
            addCriterion("question_summary not like", value, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryIn(List<String> values) {
            addCriterion("question_summary in", values, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryNotIn(List<String> values) {
            addCriterion("question_summary not in", values, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryBetween(String value1, String value2) {
            addCriterion("question_summary between", value1, value2, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionSummaryNotBetween(String value1, String value2) {
            addCriterion("question_summary not between", value1, value2, "questionSummary");
            return (Criteria) this;
        }

        public Criteria andQuestionTextIsNull() {
            addCriterion("question_text is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTextIsNotNull() {
            addCriterion("question_text is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTextEqualTo(String value) {
            addCriterion("question_text =", value, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextNotEqualTo(String value) {
            addCriterion("question_text <>", value, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextGreaterThan(String value) {
            addCriterion("question_text >", value, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextGreaterThanOrEqualTo(String value) {
            addCriterion("question_text >=", value, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextLessThan(String value) {
            addCriterion("question_text <", value, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextLessThanOrEqualTo(String value) {
            addCriterion("question_text <=", value, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextLike(String value) {
            addCriterion("question_text like", value, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextNotLike(String value) {
            addCriterion("question_text not like", value, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextIn(List<String> values) {
            addCriterion("question_text in", values, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextNotIn(List<String> values) {
            addCriterion("question_text not in", values, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextBetween(String value1, String value2) {
            addCriterion("question_text between", value1, value2, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionTextNotBetween(String value1, String value2) {
            addCriterion("question_text not between", value1, value2, "questionText");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusIsNull() {
            addCriterion("question_status is null");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusIsNotNull() {
            addCriterion("question_status is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusEqualTo(Integer value) {
            addCriterion("question_status =", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusNotEqualTo(Integer value) {
            addCriterion("question_status <>", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusGreaterThan(Integer value) {
            addCriterion("question_status >", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_status >=", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusLessThan(Integer value) {
            addCriterion("question_status <", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("question_status <=", value, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusIn(List<Integer> values) {
            addCriterion("question_status in", values, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusNotIn(List<Integer> values) {
            addCriterion("question_status not in", values, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusBetween(Integer value1, Integer value2) {
            addCriterion("question_status between", value1, value2, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("question_status not between", value1, value2, "questionStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesIsNull() {
            addCriterion("question_times is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesIsNotNull() {
            addCriterion("question_times is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesEqualTo(Integer value) {
            addCriterion("question_times =", value, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesNotEqualTo(Integer value) {
            addCriterion("question_times <>", value, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesGreaterThan(Integer value) {
            addCriterion("question_times >", value, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_times >=", value, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesLessThan(Integer value) {
            addCriterion("question_times <", value, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesLessThanOrEqualTo(Integer value) {
            addCriterion("question_times <=", value, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesIn(List<Integer> values) {
            addCriterion("question_times in", values, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesNotIn(List<Integer> values) {
            addCriterion("question_times not in", values, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesBetween(Integer value1, Integer value2) {
            addCriterion("question_times between", value1, value2, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andQuestionTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("question_times not between", value1, value2, "questionTimes");
            return (Criteria) this;
        }

        public Criteria andBkCreateIsNull() {
            addCriterion("bk_create is null");
            return (Criteria) this;
        }

        public Criteria andBkCreateIsNotNull() {
            addCriterion("bk_create is not null");
            return (Criteria) this;
        }

        public Criteria andBkCreateEqualTo(Date value) {
            addCriterion("bk_create =", value, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateNotEqualTo(Date value) {
            addCriterion("bk_create <>", value, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateGreaterThan(Date value) {
            addCriterion("bk_create >", value, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("bk_create >=", value, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateLessThan(Date value) {
            addCriterion("bk_create <", value, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateLessThanOrEqualTo(Date value) {
            addCriterion("bk_create <=", value, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateIn(List<Date> values) {
            addCriterion("bk_create in", values, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateNotIn(List<Date> values) {
            addCriterion("bk_create not in", values, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateBetween(Date value1, Date value2) {
            addCriterion("bk_create between", value1, value2, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkCreateNotBetween(Date value1, Date value2) {
            addCriterion("bk_create not between", value1, value2, "bkCreate");
            return (Criteria) this;
        }

        public Criteria andBkModifiedIsNull() {
            addCriterion("bk_modified is null");
            return (Criteria) this;
        }

        public Criteria andBkModifiedIsNotNull() {
            addCriterion("bk_modified is not null");
            return (Criteria) this;
        }

        public Criteria andBkModifiedEqualTo(Date value) {
            addCriterion("bk_modified =", value, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedNotEqualTo(Date value) {
            addCriterion("bk_modified <>", value, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedGreaterThan(Date value) {
            addCriterion("bk_modified >", value, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("bk_modified >=", value, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedLessThan(Date value) {
            addCriterion("bk_modified <", value, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedLessThanOrEqualTo(Date value) {
            addCriterion("bk_modified <=", value, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedIn(List<Date> values) {
            addCriterion("bk_modified in", values, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedNotIn(List<Date> values) {
            addCriterion("bk_modified not in", values, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedBetween(Date value1, Date value2) {
            addCriterion("bk_modified between", value1, value2, "bkModified");
            return (Criteria) this;
        }

        public Criteria andBkModifiedNotBetween(Date value1, Date value2) {
            addCriterion("bk_modified not between", value1, value2, "bkModified");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("dr is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("dr is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Integer value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Integer value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Integer value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Integer value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Integer value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Integer> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Integer> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Integer value1, Integer value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Integer value1, Integer value2) {
            addCriterion("dr not between", value1, value2, "dr");
            return (Criteria) this;
        }
    }

    /**
     * 数据库表 bk_question映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 动态SQL对象,bk_question
     */
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