package com.future.membership.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.future.membership.bean.page.Page;

public class HistoryDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public HistoryDtoExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipment_idIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipment_idEqualTo(Integer value) {
            addCriterion("equipment_id =", value, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idNotEqualTo(Integer value) {
            addCriterion("equipment_id <>", value, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idGreaterThan(Integer value) {
            addCriterion("equipment_id >", value, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_id >=", value, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idLessThan(Integer value) {
            addCriterion("equipment_id <", value, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_id <=", value, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idIn(List<Integer> values) {
            addCriterion("equipment_id in", values, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idNotIn(List<Integer> values) {
            addCriterion("equipment_id not in", values, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id between", value1, value2, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEquipment_idNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id not between", value1, value2, "equipment_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idIsNull() {
            addCriterion("eqt_id is null");
            return (Criteria) this;
        }

        public Criteria andEqt_idIsNotNull() {
            addCriterion("eqt_id is not null");
            return (Criteria) this;
        }

        public Criteria andEqt_idEqualTo(Integer value) {
            addCriterion("eqt_id =", value, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idNotEqualTo(Integer value) {
            addCriterion("eqt_id <>", value, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idGreaterThan(Integer value) {
            addCriterion("eqt_id >", value, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("eqt_id >=", value, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idLessThan(Integer value) {
            addCriterion("eqt_id <", value, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idLessThanOrEqualTo(Integer value) {
            addCriterion("eqt_id <=", value, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idIn(List<Integer> values) {
            addCriterion("eqt_id in", values, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idNotIn(List<Integer> values) {
            addCriterion("eqt_id not in", values, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idBetween(Integer value1, Integer value2) {
            addCriterion("eqt_id between", value1, value2, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andEqt_idNotBetween(Integer value1, Integer value2) {
            addCriterion("eqt_id not between", value1, value2, "eqt_id");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeIsNull() {
            addCriterion("exerciseTime is null");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeIsNotNull() {
            addCriterion("exerciseTime is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeEqualTo(Date value) {
            addCriterion("exerciseTime =", value, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeNotEqualTo(Date value) {
            addCriterion("exerciseTime <>", value, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeGreaterThan(Date value) {
            addCriterion("exerciseTime >", value, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exerciseTime >=", value, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeLessThan(Date value) {
            addCriterion("exerciseTime <", value, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeLessThanOrEqualTo(Date value) {
            addCriterion("exerciseTime <=", value, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeIn(List<Date> values) {
            addCriterion("exerciseTime in", values, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeNotIn(List<Date> values) {
            addCriterion("exerciseTime not in", values, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeBetween(Date value1, Date value2) {
            addCriterion("exerciseTime between", value1, value2, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andExerciseTimeNotBetween(Date value1, Date value2) {
            addCriterion("exerciseTime not between", value1, value2, "exerciseTime");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("valid not between", value1, value2, "valid");
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