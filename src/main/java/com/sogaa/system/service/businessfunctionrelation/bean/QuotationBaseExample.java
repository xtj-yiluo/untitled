package com.sogaa.system.service.businessfunctionrelation.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuotationBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int start = -1;

    protected int limit = -1;

    public QuotationBaseExample() {
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

    public void setStart(int start) {
        this.start=start;
    }

    public int getStart() {
        return start;
    }

    public void setLimit(int limit) {
        this.limit=limit;
    }

    public int getLimit() {
        return limit;
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInquirerIsNull() {
            addCriterion("inquirer is null");
            return (Criteria) this;
        }

        public Criteria andInquirerIsNotNull() {
            addCriterion("inquirer is not null");
            return (Criteria) this;
        }

        public Criteria andInquirerEqualTo(String value) {
            addCriterion("inquirer =", value, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerNotEqualTo(String value) {
            addCriterion("inquirer <>", value, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerGreaterThan(String value) {
            addCriterion("inquirer >", value, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerGreaterThanOrEqualTo(String value) {
            addCriterion("inquirer >=", value, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerLessThan(String value) {
            addCriterion("inquirer <", value, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerLessThanOrEqualTo(String value) {
            addCriterion("inquirer <=", value, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerLike(String value) {
            addCriterion("inquirer like", value, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerNotLike(String value) {
            addCriterion("inquirer not like", value, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerIn(List<String> values) {
            addCriterion("inquirer in", values, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerNotIn(List<String> values) {
            addCriterion("inquirer not in", values, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerBetween(String value1, String value2) {
            addCriterion("inquirer between", value1, value2, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerNotBetween(String value1, String value2) {
            addCriterion("inquirer not between", value1, value2, "inquirer");
            return (Criteria) this;
        }

        public Criteria andInquirerNameIsNull() {
            addCriterion("inquirer_name is null");
            return (Criteria) this;
        }

        public Criteria andInquirerNameIsNotNull() {
            addCriterion("inquirer_name is not null");
            return (Criteria) this;
        }

        public Criteria andInquirerNameEqualTo(String value) {
            addCriterion("inquirer_name =", value, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameNotEqualTo(String value) {
            addCriterion("inquirer_name <>", value, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameGreaterThan(String value) {
            addCriterion("inquirer_name >", value, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameGreaterThanOrEqualTo(String value) {
            addCriterion("inquirer_name >=", value, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameLessThan(String value) {
            addCriterion("inquirer_name <", value, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameLessThanOrEqualTo(String value) {
            addCriterion("inquirer_name <=", value, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameLike(String value) {
            addCriterion("inquirer_name like", value, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameNotLike(String value) {
            addCriterion("inquirer_name not like", value, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameIn(List<String> values) {
            addCriterion("inquirer_name in", values, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameNotIn(List<String> values) {
            addCriterion("inquirer_name not in", values, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameBetween(String value1, String value2) {
            addCriterion("inquirer_name between", value1, value2, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerNameNotBetween(String value1, String value2) {
            addCriterion("inquirer_name not between", value1, value2, "inquirerName");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyIsNull() {
            addCriterion("inquirer_company is null");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyIsNotNull() {
            addCriterion("inquirer_company is not null");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyEqualTo(String value) {
            addCriterion("inquirer_company =", value, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyNotEqualTo(String value) {
            addCriterion("inquirer_company <>", value, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyGreaterThan(String value) {
            addCriterion("inquirer_company >", value, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("inquirer_company >=", value, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyLessThan(String value) {
            addCriterion("inquirer_company <", value, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyLessThanOrEqualTo(String value) {
            addCriterion("inquirer_company <=", value, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyLike(String value) {
            addCriterion("inquirer_company like", value, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyNotLike(String value) {
            addCriterion("inquirer_company not like", value, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyIn(List<String> values) {
            addCriterion("inquirer_company in", values, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyNotIn(List<String> values) {
            addCriterion("inquirer_company not in", values, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyBetween(String value1, String value2) {
            addCriterion("inquirer_company between", value1, value2, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerCompanyNotBetween(String value1, String value2) {
            addCriterion("inquirer_company not between", value1, value2, "inquirerCompany");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeIsNull() {
            addCriterion("inquirer_time is null");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeIsNotNull() {
            addCriterion("inquirer_time is not null");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeEqualTo(String value) {
            addCriterion("inquirer_time =", value, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeNotEqualTo(String value) {
            addCriterion("inquirer_time <>", value, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeGreaterThan(String value) {
            addCriterion("inquirer_time >", value, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeGreaterThanOrEqualTo(String value) {
            addCriterion("inquirer_time >=", value, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeLessThan(String value) {
            addCriterion("inquirer_time <", value, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeLessThanOrEqualTo(String value) {
            addCriterion("inquirer_time <=", value, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeLike(String value) {
            addCriterion("inquirer_time like", value, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeNotLike(String value) {
            addCriterion("inquirer_time not like", value, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeIn(List<String> values) {
            addCriterion("inquirer_time in", values, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeNotIn(List<String> values) {
            addCriterion("inquirer_time not in", values, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeBetween(String value1, String value2) {
            addCriterion("inquirer_time between", value1, value2, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeNotBetween(String value1, String value2) {
            addCriterion("inquirer_time not between", value1, value2, "inquirerTime");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeIsNull() {
            addCriterion("machining_type is null");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeIsNotNull() {
            addCriterion("machining_type is not null");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeEqualTo(String value) {
            addCriterion("machining_type =", value, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeNotEqualTo(String value) {
            addCriterion("machining_type <>", value, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeGreaterThan(String value) {
            addCriterion("machining_type >", value, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeGreaterThanOrEqualTo(String value) {
            addCriterion("machining_type >=", value, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeLessThan(String value) {
            addCriterion("machining_type <", value, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeLessThanOrEqualTo(String value) {
            addCriterion("machining_type <=", value, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeLike(String value) {
            addCriterion("machining_type like", value, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeNotLike(String value) {
            addCriterion("machining_type not like", value, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeIn(List<String> values) {
            addCriterion("machining_type in", values, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeNotIn(List<String> values) {
            addCriterion("machining_type not in", values, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeBetween(String value1, String value2) {
            addCriterion("machining_type between", value1, value2, "machiningType");
            return (Criteria) this;
        }

        public Criteria andMachiningTypeNotBetween(String value1, String value2) {
            addCriterion("machining_type not between", value1, value2, "machiningType");
            return (Criteria) this;
        }

        public Criteria andHasMaterialIsNull() {
            addCriterion("has_material is null");
            return (Criteria) this;
        }

        public Criteria andHasMaterialIsNotNull() {
            addCriterion("has_material is not null");
            return (Criteria) this;
        }

        public Criteria andHasMaterialEqualTo(String value) {
            addCriterion("has_material =", value, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialNotEqualTo(String value) {
            addCriterion("has_material <>", value, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialGreaterThan(String value) {
            addCriterion("has_material >", value, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("has_material >=", value, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialLessThan(String value) {
            addCriterion("has_material <", value, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialLessThanOrEqualTo(String value) {
            addCriterion("has_material <=", value, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialLike(String value) {
            addCriterion("has_material like", value, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialNotLike(String value) {
            addCriterion("has_material not like", value, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialIn(List<String> values) {
            addCriterion("has_material in", values, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialNotIn(List<String> values) {
            addCriterion("has_material not in", values, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialBetween(String value1, String value2) {
            addCriterion("has_material between", value1, value2, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andHasMaterialNotBetween(String value1, String value2) {
            addCriterion("has_material not between", value1, value2, "hasMaterial");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationIsNull() {
            addCriterion("user_drawing_location is null");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationIsNotNull() {
            addCriterion("user_drawing_location is not null");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationEqualTo(String value) {
            addCriterion("user_drawing_location =", value, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationNotEqualTo(String value) {
            addCriterion("user_drawing_location <>", value, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationGreaterThan(String value) {
            addCriterion("user_drawing_location >", value, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationGreaterThanOrEqualTo(String value) {
            addCriterion("user_drawing_location >=", value, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationLessThan(String value) {
            addCriterion("user_drawing_location <", value, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationLessThanOrEqualTo(String value) {
            addCriterion("user_drawing_location <=", value, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationLike(String value) {
            addCriterion("user_drawing_location like", value, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationNotLike(String value) {
            addCriterion("user_drawing_location not like", value, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationIn(List<String> values) {
            addCriterion("user_drawing_location in", values, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationNotIn(List<String> values) {
            addCriterion("user_drawing_location not in", values, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationBetween(String value1, String value2) {
            addCriterion("user_drawing_location between", value1, value2, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserDrawingLocationNotBetween(String value1, String value2) {
            addCriterion("user_drawing_location not between", value1, value2, "userDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationIsNull() {
            addCriterion("user_list_location is null");
            return (Criteria) this;
        }

        public Criteria andUserListLocationIsNotNull() {
            addCriterion("user_list_location is not null");
            return (Criteria) this;
        }

        public Criteria andUserListLocationEqualTo(String value) {
            addCriterion("user_list_location =", value, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationNotEqualTo(String value) {
            addCriterion("user_list_location <>", value, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationGreaterThan(String value) {
            addCriterion("user_list_location >", value, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationGreaterThanOrEqualTo(String value) {
            addCriterion("user_list_location >=", value, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationLessThan(String value) {
            addCriterion("user_list_location <", value, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationLessThanOrEqualTo(String value) {
            addCriterion("user_list_location <=", value, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationLike(String value) {
            addCriterion("user_list_location like", value, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationNotLike(String value) {
            addCriterion("user_list_location not like", value, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationIn(List<String> values) {
            addCriterion("user_list_location in", values, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationNotIn(List<String> values) {
            addCriterion("user_list_location not in", values, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationBetween(String value1, String value2) {
            addCriterion("user_list_location between", value1, value2, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andUserListLocationNotBetween(String value1, String value2) {
            addCriterion("user_list_location not between", value1, value2, "userListLocation");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("priority like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("priority not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(String value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(String value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(String value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(String value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(String value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLike(String value) {
            addCriterion("delivery_time like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotLike(String value) {
            addCriterion("delivery_time not like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<String> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<String> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(String value1, String value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(String value1, String value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeIsNull() {
            addCriterion("express_pay_type is null");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeIsNotNull() {
            addCriterion("express_pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeEqualTo(String value) {
            addCriterion("express_pay_type =", value, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeNotEqualTo(String value) {
            addCriterion("express_pay_type <>", value, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeGreaterThan(String value) {
            addCriterion("express_pay_type >", value, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("express_pay_type >=", value, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeLessThan(String value) {
            addCriterion("express_pay_type <", value, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeLessThanOrEqualTo(String value) {
            addCriterion("express_pay_type <=", value, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeLike(String value) {
            addCriterion("express_pay_type like", value, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeNotLike(String value) {
            addCriterion("express_pay_type not like", value, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeIn(List<String> values) {
            addCriterion("express_pay_type in", values, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeNotIn(List<String> values) {
            addCriterion("express_pay_type not in", values, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeBetween(String value1, String value2) {
            addCriterion("express_pay_type between", value1, value2, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressPayTypeNotBetween(String value1, String value2) {
            addCriterion("express_pay_type not between", value1, value2, "expressPayType");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNull() {
            addCriterion("express_fee is null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNotNull() {
            addCriterion("express_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeEqualTo(Double value) {
            addCriterion("express_fee =", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotEqualTo(Double value) {
            addCriterion("express_fee <>", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThan(Double value) {
            addCriterion("express_fee >", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("express_fee >=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThan(Double value) {
            addCriterion("express_fee <", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThanOrEqualTo(Double value) {
            addCriterion("express_fee <=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIn(List<Double> values) {
            addCriterion("express_fee in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotIn(List<Double> values) {
            addCriterion("express_fee not in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeBetween(Double value1, Double value2) {
            addCriterion("express_fee between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotBetween(Double value1, Double value2) {
            addCriterion("express_fee not between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andNeedDesignIsNull() {
            addCriterion("need_design is null");
            return (Criteria) this;
        }

        public Criteria andNeedDesignIsNotNull() {
            addCriterion("need_design is not null");
            return (Criteria) this;
        }

        public Criteria andNeedDesignEqualTo(String value) {
            addCriterion("need_design =", value, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignNotEqualTo(String value) {
            addCriterion("need_design <>", value, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignGreaterThan(String value) {
            addCriterion("need_design >", value, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignGreaterThanOrEqualTo(String value) {
            addCriterion("need_design >=", value, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignLessThan(String value) {
            addCriterion("need_design <", value, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignLessThanOrEqualTo(String value) {
            addCriterion("need_design <=", value, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignLike(String value) {
            addCriterion("need_design like", value, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignNotLike(String value) {
            addCriterion("need_design not like", value, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignIn(List<String> values) {
            addCriterion("need_design in", values, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignNotIn(List<String> values) {
            addCriterion("need_design not in", values, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignBetween(String value1, String value2) {
            addCriterion("need_design between", value1, value2, "needDesign");
            return (Criteria) this;
        }

        public Criteria andNeedDesignNotBetween(String value1, String value2) {
            addCriterion("need_design not between", value1, value2, "needDesign");
            return (Criteria) this;
        }

        public Criteria andDesignFeeIsNull() {
            addCriterion("design_fee is null");
            return (Criteria) this;
        }

        public Criteria andDesignFeeIsNotNull() {
            addCriterion("design_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDesignFeeEqualTo(Double value) {
            addCriterion("design_fee =", value, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeNotEqualTo(Double value) {
            addCriterion("design_fee <>", value, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeGreaterThan(Double value) {
            addCriterion("design_fee >", value, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("design_fee >=", value, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeLessThan(Double value) {
            addCriterion("design_fee <", value, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeLessThanOrEqualTo(Double value) {
            addCriterion("design_fee <=", value, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeIn(List<Double> values) {
            addCriterion("design_fee in", values, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeNotIn(List<Double> values) {
            addCriterion("design_fee not in", values, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeBetween(Double value1, Double value2) {
            addCriterion("design_fee between", value1, value2, "designFee");
            return (Criteria) this;
        }

        public Criteria andDesignFeeNotBetween(Double value1, Double value2) {
            addCriterion("design_fee not between", value1, value2, "designFee");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Double value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Double value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Double value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Double value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Double value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Double> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Double> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Double value1, Double value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Double value1, Double value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(String value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(String value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(String value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(String value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(String value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(String value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLike(String value) {
            addCriterion("tax_rate like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotLike(String value) {
            addCriterion("tax_rate not like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<String> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<String> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(String value1, String value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(String value1, String value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Double value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Double value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Double value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Double value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Double value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Double> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Double> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Double value1, Double value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Double value1, Double value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(Double value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(Double value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(Double value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(Double value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(Double value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<Double> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<Double> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(Double value1, Double value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(Double value1, Double value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIsNull() {
            addCriterion("final_price is null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIsNotNull() {
            addCriterion("final_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceEqualTo(Double value) {
            addCriterion("final_price =", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotEqualTo(Double value) {
            addCriterion("final_price <>", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceGreaterThan(Double value) {
            addCriterion("final_price >", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("final_price >=", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceLessThan(Double value) {
            addCriterion("final_price <", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceLessThanOrEqualTo(Double value) {
            addCriterion("final_price <=", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIn(List<Double> values) {
            addCriterion("final_price in", values, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotIn(List<Double> values) {
            addCriterion("final_price not in", values, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceBetween(Double value1, Double value2) {
            addCriterion("final_price between", value1, value2, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotBetween(Double value1, Double value2) {
            addCriterion("final_price not between", value1, value2, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountIsNull() {
            addCriterion("final_price_discount is null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountIsNotNull() {
            addCriterion("final_price_discount is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountEqualTo(Double value) {
            addCriterion("final_price_discount =", value, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountNotEqualTo(Double value) {
            addCriterion("final_price_discount <>", value, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountGreaterThan(Double value) {
            addCriterion("final_price_discount >", value, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("final_price_discount >=", value, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountLessThan(Double value) {
            addCriterion("final_price_discount <", value, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountLessThanOrEqualTo(Double value) {
            addCriterion("final_price_discount <=", value, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountIn(List<Double> values) {
            addCriterion("final_price_discount in", values, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountNotIn(List<Double> values) {
            addCriterion("final_price_discount not in", values, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountBetween(Double value1, Double value2) {
            addCriterion("final_price_discount between", value1, value2, "finalPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andFinalPriceDiscountNotBetween(Double value1, Double value2) {
            addCriterion("final_price_discount not between", value1, value2, "finalPriceDiscount");
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

        public Criteria andShowTaxIsNull() {
            addCriterion("show_tax is null");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsNotNull() {
            addCriterion("show_tax is not null");
            return (Criteria) this;
        }

        public Criteria andShowTaxEqualTo(String value) {
            addCriterion("show_tax =", value, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxNotEqualTo(String value) {
            addCriterion("show_tax <>", value, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxGreaterThan(String value) {
            addCriterion("show_tax >", value, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxGreaterThanOrEqualTo(String value) {
            addCriterion("show_tax >=", value, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxLessThan(String value) {
            addCriterion("show_tax <", value, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxLessThanOrEqualTo(String value) {
            addCriterion("show_tax <=", value, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxLike(String value) {
            addCriterion("show_tax like", value, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxNotLike(String value) {
            addCriterion("show_tax not like", value, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxIn(List<String> values) {
            addCriterion("show_tax in", values, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxNotIn(List<String> values) {
            addCriterion("show_tax not in", values, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxBetween(String value1, String value2) {
            addCriterion("show_tax between", value1, value2, "showTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxNotBetween(String value1, String value2) {
            addCriterion("show_tax not between", value1, value2, "showTax");
            return (Criteria) this;
        }

        public Criteria andQuoterIsNull() {
            addCriterion("quoter is null");
            return (Criteria) this;
        }

        public Criteria andQuoterIsNotNull() {
            addCriterion("quoter is not null");
            return (Criteria) this;
        }

        public Criteria andQuoterEqualTo(String value) {
            addCriterion("quoter =", value, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterNotEqualTo(String value) {
            addCriterion("quoter <>", value, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterGreaterThan(String value) {
            addCriterion("quoter >", value, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterGreaterThanOrEqualTo(String value) {
            addCriterion("quoter >=", value, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterLessThan(String value) {
            addCriterion("quoter <", value, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterLessThanOrEqualTo(String value) {
            addCriterion("quoter <=", value, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterLike(String value) {
            addCriterion("quoter like", value, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterNotLike(String value) {
            addCriterion("quoter not like", value, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterIn(List<String> values) {
            addCriterion("quoter in", values, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterNotIn(List<String> values) {
            addCriterion("quoter not in", values, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterBetween(String value1, String value2) {
            addCriterion("quoter between", value1, value2, "quoter");
            return (Criteria) this;
        }

        public Criteria andQuoterNotBetween(String value1, String value2) {
            addCriterion("quoter not between", value1, value2, "quoter");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNull() {
            addCriterion("pro_status is null");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNotNull() {
            addCriterion("pro_status is not null");
            return (Criteria) this;
        }

        public Criteria andProStatusEqualTo(String value) {
            addCriterion("pro_status =", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotEqualTo(String value) {
            addCriterion("pro_status <>", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThan(String value) {
            addCriterion("pro_status >", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pro_status >=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThan(String value) {
            addCriterion("pro_status <", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThanOrEqualTo(String value) {
            addCriterion("pro_status <=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLike(String value) {
            addCriterion("pro_status like", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotLike(String value) {
            addCriterion("pro_status not like", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusIn(List<String> values) {
            addCriterion("pro_status in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotIn(List<String> values) {
            addCriterion("pro_status not in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusBetween(String value1, String value2) {
            addCriterion("pro_status between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotBetween(String value1, String value2) {
            addCriterion("pro_status not between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andRequoteIsNull() {
            addCriterion("requote is null");
            return (Criteria) this;
        }

        public Criteria andRequoteIsNotNull() {
            addCriterion("requote is not null");
            return (Criteria) this;
        }

        public Criteria andRequoteEqualTo(Integer value) {
            addCriterion("requote =", value, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteNotEqualTo(Integer value) {
            addCriterion("requote <>", value, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteGreaterThan(Integer value) {
            addCriterion("requote >", value, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("requote >=", value, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteLessThan(Integer value) {
            addCriterion("requote <", value, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteLessThanOrEqualTo(Integer value) {
            addCriterion("requote <=", value, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteIn(List<Integer> values) {
            addCriterion("requote in", values, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteNotIn(List<Integer> values) {
            addCriterion("requote not in", values, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteBetween(Integer value1, Integer value2) {
            addCriterion("requote between", value1, value2, "requote");
            return (Criteria) this;
        }

        public Criteria andRequoteNotBetween(Integer value1, Integer value2) {
            addCriterion("requote not between", value1, value2, "requote");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNull() {
            addCriterion("over_time is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNotNull() {
            addCriterion("over_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEqualTo(String value) {
            addCriterion("over_time =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(String value) {
            addCriterion("over_time <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(String value) {
            addCriterion("over_time >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(String value) {
            addCriterion("over_time >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(String value) {
            addCriterion("over_time <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(String value) {
            addCriterion("over_time <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLike(String value) {
            addCriterion("over_time like", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotLike(String value) {
            addCriterion("over_time not like", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<String> values) {
            addCriterion("over_time in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<String> values) {
            addCriterion("over_time not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(String value1, String value2) {
            addCriterion("over_time between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(String value1, String value2) {
            addCriterion("over_time not between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionIsNull() {
            addCriterion("has_order_intention is null");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionIsNotNull() {
            addCriterion("has_order_intention is not null");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionEqualTo(String value) {
            addCriterion("has_order_intention =", value, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionNotEqualTo(String value) {
            addCriterion("has_order_intention <>", value, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionGreaterThan(String value) {
            addCriterion("has_order_intention >", value, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionGreaterThanOrEqualTo(String value) {
            addCriterion("has_order_intention >=", value, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionLessThan(String value) {
            addCriterion("has_order_intention <", value, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionLessThanOrEqualTo(String value) {
            addCriterion("has_order_intention <=", value, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionLike(String value) {
            addCriterion("has_order_intention like", value, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionNotLike(String value) {
            addCriterion("has_order_intention not like", value, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionIn(List<String> values) {
            addCriterion("has_order_intention in", values, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionNotIn(List<String> values) {
            addCriterion("has_order_intention not in", values, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionBetween(String value1, String value2) {
            addCriterion("has_order_intention between", value1, value2, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIntentionNotBetween(String value1, String value2) {
            addCriterion("has_order_intention not between", value1, value2, "hasOrderIntention");
            return (Criteria) this;
        }

        public Criteria andHasOrderIsNull() {
            addCriterion("has_order is null");
            return (Criteria) this;
        }

        public Criteria andHasOrderIsNotNull() {
            addCriterion("has_order is not null");
            return (Criteria) this;
        }

        public Criteria andHasOrderEqualTo(String value) {
            addCriterion("has_order =", value, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderNotEqualTo(String value) {
            addCriterion("has_order <>", value, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderGreaterThan(String value) {
            addCriterion("has_order >", value, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderGreaterThanOrEqualTo(String value) {
            addCriterion("has_order >=", value, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderLessThan(String value) {
            addCriterion("has_order <", value, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderLessThanOrEqualTo(String value) {
            addCriterion("has_order <=", value, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderLike(String value) {
            addCriterion("has_order like", value, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderNotLike(String value) {
            addCriterion("has_order not like", value, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderIn(List<String> values) {
            addCriterion("has_order in", values, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderNotIn(List<String> values) {
            addCriterion("has_order not in", values, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderBetween(String value1, String value2) {
            addCriterion("has_order between", value1, value2, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andHasOrderNotBetween(String value1, String value2) {
            addCriterion("has_order not between", value1, value2, "hasOrder");
            return (Criteria) this;
        }

        public Criteria andQuotePdfIsNull() {
            addCriterion("quote_pdf is null");
            return (Criteria) this;
        }

        public Criteria andQuotePdfIsNotNull() {
            addCriterion("quote_pdf is not null");
            return (Criteria) this;
        }

        public Criteria andQuotePdfEqualTo(String value) {
            addCriterion("quote_pdf =", value, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfNotEqualTo(String value) {
            addCriterion("quote_pdf <>", value, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfGreaterThan(String value) {
            addCriterion("quote_pdf >", value, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfGreaterThanOrEqualTo(String value) {
            addCriterion("quote_pdf >=", value, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfLessThan(String value) {
            addCriterion("quote_pdf <", value, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfLessThanOrEqualTo(String value) {
            addCriterion("quote_pdf <=", value, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfLike(String value) {
            addCriterion("quote_pdf like", value, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfNotLike(String value) {
            addCriterion("quote_pdf not like", value, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfIn(List<String> values) {
            addCriterion("quote_pdf in", values, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfNotIn(List<String> values) {
            addCriterion("quote_pdf not in", values, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfBetween(String value1, String value2) {
            addCriterion("quote_pdf between", value1, value2, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuotePdfNotBetween(String value1, String value2) {
            addCriterion("quote_pdf not between", value1, value2, "quotePdf");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsIsNull() {
            addCriterion("quote_xls is null");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsIsNotNull() {
            addCriterion("quote_xls is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsEqualTo(String value) {
            addCriterion("quote_xls =", value, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsNotEqualTo(String value) {
            addCriterion("quote_xls <>", value, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsGreaterThan(String value) {
            addCriterion("quote_xls >", value, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsGreaterThanOrEqualTo(String value) {
            addCriterion("quote_xls >=", value, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsLessThan(String value) {
            addCriterion("quote_xls <", value, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsLessThanOrEqualTo(String value) {
            addCriterion("quote_xls <=", value, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsLike(String value) {
            addCriterion("quote_xls like", value, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsNotLike(String value) {
            addCriterion("quote_xls not like", value, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsIn(List<String> values) {
            addCriterion("quote_xls in", values, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsNotIn(List<String> values) {
            addCriterion("quote_xls not in", values, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsBetween(String value1, String value2) {
            addCriterion("quote_xls between", value1, value2, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andQuoteXlsNotBetween(String value1, String value2) {
            addCriterion("quote_xls not between", value1, value2, "quoteXls");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Double value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Double value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Double value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Double value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Double value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Double> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Double> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Double value1, Double value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Double value1, Double value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andGrossProfitIsNull() {
            addCriterion("gross_profit is null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitIsNotNull() {
            addCriterion("gross_profit is not null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitEqualTo(Double value) {
            addCriterion("gross_profit =", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotEqualTo(Double value) {
            addCriterion("gross_profit <>", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitGreaterThan(Double value) {
            addCriterion("gross_profit >", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("gross_profit >=", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitLessThan(Double value) {
            addCriterion("gross_profit <", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitLessThanOrEqualTo(Double value) {
            addCriterion("gross_profit <=", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitIn(List<Double> values) {
            addCriterion("gross_profit in", values, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotIn(List<Double> values) {
            addCriterion("gross_profit not in", values, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitBetween(Double value1, Double value2) {
            addCriterion("gross_profit between", value1, value2, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotBetween(Double value1, Double value2) {
            addCriterion("gross_profit not between", value1, value2, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateIsNull() {
            addCriterion("gross_profit_rate is null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateIsNotNull() {
            addCriterion("gross_profit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateEqualTo(Double value) {
            addCriterion("gross_profit_rate =", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateNotEqualTo(Double value) {
            addCriterion("gross_profit_rate <>", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateGreaterThan(Double value) {
            addCriterion("gross_profit_rate >", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateGreaterThanOrEqualTo(Double value) {
            addCriterion("gross_profit_rate >=", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateLessThan(Double value) {
            addCriterion("gross_profit_rate <", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateLessThanOrEqualTo(Double value) {
            addCriterion("gross_profit_rate <=", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateIn(List<Double> values) {
            addCriterion("gross_profit_rate in", values, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateNotIn(List<Double> values) {
            addCriterion("gross_profit_rate not in", values, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateBetween(Double value1, Double value2) {
            addCriterion("gross_profit_rate between", value1, value2, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateNotBetween(Double value1, Double value2) {
            addCriterion("gross_profit_rate not between", value1, value2, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationIsNull() {
            addCriterion("last_drawing_location is null");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationIsNotNull() {
            addCriterion("last_drawing_location is not null");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationEqualTo(String value) {
            addCriterion("last_drawing_location =", value, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationNotEqualTo(String value) {
            addCriterion("last_drawing_location <>", value, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationGreaterThan(String value) {
            addCriterion("last_drawing_location >", value, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationGreaterThanOrEqualTo(String value) {
            addCriterion("last_drawing_location >=", value, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationLessThan(String value) {
            addCriterion("last_drawing_location <", value, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationLessThanOrEqualTo(String value) {
            addCriterion("last_drawing_location <=", value, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationLike(String value) {
            addCriterion("last_drawing_location like", value, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationNotLike(String value) {
            addCriterion("last_drawing_location not like", value, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationIn(List<String> values) {
            addCriterion("last_drawing_location in", values, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationNotIn(List<String> values) {
            addCriterion("last_drawing_location not in", values, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationBetween(String value1, String value2) {
            addCriterion("last_drawing_location between", value1, value2, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastDrawingLocationNotBetween(String value1, String value2) {
            addCriterion("last_drawing_location not between", value1, value2, "lastDrawingLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationIsNull() {
            addCriterion("last_list_location is null");
            return (Criteria) this;
        }

        public Criteria andLastListLocationIsNotNull() {
            addCriterion("last_list_location is not null");
            return (Criteria) this;
        }

        public Criteria andLastListLocationEqualTo(String value) {
            addCriterion("last_list_location =", value, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationNotEqualTo(String value) {
            addCriterion("last_list_location <>", value, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationGreaterThan(String value) {
            addCriterion("last_list_location >", value, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationGreaterThanOrEqualTo(String value) {
            addCriterion("last_list_location >=", value, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationLessThan(String value) {
            addCriterion("last_list_location <", value, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationLessThanOrEqualTo(String value) {
            addCriterion("last_list_location <=", value, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationLike(String value) {
            addCriterion("last_list_location like", value, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationNotLike(String value) {
            addCriterion("last_list_location not like", value, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationIn(List<String> values) {
            addCriterion("last_list_location in", values, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationNotIn(List<String> values) {
            addCriterion("last_list_location not in", values, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationBetween(String value1, String value2) {
            addCriterion("last_list_location between", value1, value2, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLastListLocationNotBetween(String value1, String value2) {
            addCriterion("last_list_location not between", value1, value2, "lastListLocation");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkIsNull() {
            addCriterion("lose_remark is null");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkIsNotNull() {
            addCriterion("lose_remark is not null");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkEqualTo(String value) {
            addCriterion("lose_remark =", value, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkNotEqualTo(String value) {
            addCriterion("lose_remark <>", value, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkGreaterThan(String value) {
            addCriterion("lose_remark >", value, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("lose_remark >=", value, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkLessThan(String value) {
            addCriterion("lose_remark <", value, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkLessThanOrEqualTo(String value) {
            addCriterion("lose_remark <=", value, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkLike(String value) {
            addCriterion("lose_remark like", value, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkNotLike(String value) {
            addCriterion("lose_remark not like", value, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkIn(List<String> values) {
            addCriterion("lose_remark in", values, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkNotIn(List<String> values) {
            addCriterion("lose_remark not in", values, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkBetween(String value1, String value2) {
            addCriterion("lose_remark between", value1, value2, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseRemarkNotBetween(String value1, String value2) {
            addCriterion("lose_remark not between", value1, value2, "loseRemark");
            return (Criteria) this;
        }

        public Criteria andLoseTimeIsNull() {
            addCriterion("lose_time is null");
            return (Criteria) this;
        }

        public Criteria andLoseTimeIsNotNull() {
            addCriterion("lose_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoseTimeEqualTo(Date value) {
            addCriterion("lose_time =", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeNotEqualTo(Date value) {
            addCriterion("lose_time <>", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeGreaterThan(Date value) {
            addCriterion("lose_time >", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lose_time >=", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeLessThan(Date value) {
            addCriterion("lose_time <", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeLessThanOrEqualTo(Date value) {
            addCriterion("lose_time <=", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeIn(List<Date> values) {
            addCriterion("lose_time in", values, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeNotIn(List<Date> values) {
            addCriterion("lose_time not in", values, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeBetween(Date value1, Date value2) {
            addCriterion("lose_time between", value1, value2, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeNotBetween(Date value1, Date value2) {
            addCriterion("lose_time not between", value1, value2, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseReasonIsNull() {
            addCriterion("lose_reason is null");
            return (Criteria) this;
        }

        public Criteria andLoseReasonIsNotNull() {
            addCriterion("lose_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLoseReasonEqualTo(String value) {
            addCriterion("lose_reason =", value, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonNotEqualTo(String value) {
            addCriterion("lose_reason <>", value, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonGreaterThan(String value) {
            addCriterion("lose_reason >", value, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("lose_reason >=", value, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonLessThan(String value) {
            addCriterion("lose_reason <", value, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonLessThanOrEqualTo(String value) {
            addCriterion("lose_reason <=", value, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonLike(String value) {
            addCriterion("lose_reason like", value, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonNotLike(String value) {
            addCriterion("lose_reason not like", value, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonIn(List<String> values) {
            addCriterion("lose_reason in", values, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonNotIn(List<String> values) {
            addCriterion("lose_reason not in", values, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonBetween(String value1, String value2) {
            addCriterion("lose_reason between", value1, value2, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLoseReasonNotBetween(String value1, String value2) {
            addCriterion("lose_reason not between", value1, value2, "loseReason");
            return (Criteria) this;
        }

        public Criteria andLosePersonIsNull() {
            addCriterion("lose_person is null");
            return (Criteria) this;
        }

        public Criteria andLosePersonIsNotNull() {
            addCriterion("lose_person is not null");
            return (Criteria) this;
        }

        public Criteria andLosePersonEqualTo(String value) {
            addCriterion("lose_person =", value, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonNotEqualTo(String value) {
            addCriterion("lose_person <>", value, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonGreaterThan(String value) {
            addCriterion("lose_person >", value, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonGreaterThanOrEqualTo(String value) {
            addCriterion("lose_person >=", value, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonLessThan(String value) {
            addCriterion("lose_person <", value, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonLessThanOrEqualTo(String value) {
            addCriterion("lose_person <=", value, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonLike(String value) {
            addCriterion("lose_person like", value, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonNotLike(String value) {
            addCriterion("lose_person not like", value, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonIn(List<String> values) {
            addCriterion("lose_person in", values, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonNotIn(List<String> values) {
            addCriterion("lose_person not in", values, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonBetween(String value1, String value2) {
            addCriterion("lose_person between", value1, value2, "losePerson");
            return (Criteria) this;
        }

        public Criteria andLosePersonNotBetween(String value1, String value2) {
            addCriterion("lose_person not between", value1, value2, "losePerson");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNull() {
            addCriterion("is_urgent is null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNotNull() {
            addCriterion("is_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentEqualTo(String value) {
            addCriterion("is_urgent =", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotEqualTo(String value) {
            addCriterion("is_urgent <>", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThan(String value) {
            addCriterion("is_urgent >", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("is_urgent >=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThan(String value) {
            addCriterion("is_urgent <", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThanOrEqualTo(String value) {
            addCriterion("is_urgent <=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLike(String value) {
            addCriterion("is_urgent like", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotLike(String value) {
            addCriterion("is_urgent not like", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIn(List<String> values) {
            addCriterion("is_urgent in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotIn(List<String> values) {
            addCriterion("is_urgent not in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentBetween(String value1, String value2) {
            addCriterion("is_urgent between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotBetween(String value1, String value2) {
            addCriterion("is_urgent not between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeIsNull() {
            addCriterion("urgent_fee is null");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeIsNotNull() {
            addCriterion("urgent_fee is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeEqualTo(String value) {
            addCriterion("urgent_fee =", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeNotEqualTo(String value) {
            addCriterion("urgent_fee <>", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeGreaterThan(String value) {
            addCriterion("urgent_fee >", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_fee >=", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeLessThan(String value) {
            addCriterion("urgent_fee <", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeLessThanOrEqualTo(String value) {
            addCriterion("urgent_fee <=", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeLike(String value) {
            addCriterion("urgent_fee like", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeNotLike(String value) {
            addCriterion("urgent_fee not like", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeIn(List<String> values) {
            addCriterion("urgent_fee in", values, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeNotIn(List<String> values) {
            addCriterion("urgent_fee not in", values, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeBetween(String value1, String value2) {
            addCriterion("urgent_fee between", value1, value2, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeNotBetween(String value1, String value2) {
            addCriterion("urgent_fee not between", value1, value2, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andRoundIsNull() {
            addCriterion("ROUND is null");
            return (Criteria) this;
        }

        public Criteria andRoundIsNotNull() {
            addCriterion("ROUND is not null");
            return (Criteria) this;
        }

        public Criteria andRoundEqualTo(String value) {
            addCriterion("ROUND =", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotEqualTo(String value) {
            addCriterion("ROUND <>", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThan(String value) {
            addCriterion("ROUND >", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThanOrEqualTo(String value) {
            addCriterion("ROUND >=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThan(String value) {
            addCriterion("ROUND <", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThanOrEqualTo(String value) {
            addCriterion("ROUND <=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLike(String value) {
            addCriterion("ROUND like", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotLike(String value) {
            addCriterion("ROUND not like", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundIn(List<String> values) {
            addCriterion("ROUND in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotIn(List<String> values) {
            addCriterion("ROUND not in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundBetween(String value1, String value2) {
            addCriterion("ROUND between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotBetween(String value1, String value2) {
            addCriterion("ROUND not between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusIsNull() {
            addCriterion("inner_quote_status is null");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusIsNotNull() {
            addCriterion("inner_quote_status is not null");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusEqualTo(String value) {
            addCriterion("inner_quote_status =", value, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusNotEqualTo(String value) {
            addCriterion("inner_quote_status <>", value, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusGreaterThan(String value) {
            addCriterion("inner_quote_status >", value, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusGreaterThanOrEqualTo(String value) {
            addCriterion("inner_quote_status >=", value, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusLessThan(String value) {
            addCriterion("inner_quote_status <", value, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusLessThanOrEqualTo(String value) {
            addCriterion("inner_quote_status <=", value, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusLike(String value) {
            addCriterion("inner_quote_status like", value, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusNotLike(String value) {
            addCriterion("inner_quote_status not like", value, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusIn(List<String> values) {
            addCriterion("inner_quote_status in", values, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusNotIn(List<String> values) {
            addCriterion("inner_quote_status not in", values, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusBetween(String value1, String value2) {
            addCriterion("inner_quote_status between", value1, value2, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andInnerQuoteStatusNotBetween(String value1, String value2) {
            addCriterion("inner_quote_status not between", value1, value2, "innerQuoteStatus");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointIsNull() {
            addCriterion("tax_rate_point is null");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointIsNotNull() {
            addCriterion("tax_rate_point is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointEqualTo(BigDecimal value) {
            addCriterion("tax_rate_point =", value, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointNotEqualTo(BigDecimal value) {
            addCriterion("tax_rate_point <>", value, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointGreaterThan(BigDecimal value) {
            addCriterion("tax_rate_point >", value, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate_point >=", value, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointLessThan(BigDecimal value) {
            addCriterion("tax_rate_point <", value, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate_point <=", value, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointIn(List<BigDecimal> values) {
            addCriterion("tax_rate_point in", values, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointNotIn(List<BigDecimal> values) {
            addCriterion("tax_rate_point not in", values, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate_point between", value1, value2, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andTaxRatePointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate_point not between", value1, value2, "taxRatePoint");
            return (Criteria) this;
        }

        public Criteria andIsRemarkIsNull() {
            addCriterion("is_remark is null");
            return (Criteria) this;
        }

        public Criteria andIsRemarkIsNotNull() {
            addCriterion("is_remark is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemarkEqualTo(String value) {
            addCriterion("is_remark =", value, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkNotEqualTo(String value) {
            addCriterion("is_remark <>", value, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkGreaterThan(String value) {
            addCriterion("is_remark >", value, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("is_remark >=", value, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkLessThan(String value) {
            addCriterion("is_remark <", value, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkLessThanOrEqualTo(String value) {
            addCriterion("is_remark <=", value, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkLike(String value) {
            addCriterion("is_remark like", value, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkNotLike(String value) {
            addCriterion("is_remark not like", value, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkIn(List<String> values) {
            addCriterion("is_remark in", values, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkNotIn(List<String> values) {
            addCriterion("is_remark not in", values, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkBetween(String value1, String value2) {
            addCriterion("is_remark between", value1, value2, "isRemark");
            return (Criteria) this;
        }

        public Criteria andIsRemarkNotBetween(String value1, String value2) {
            addCriterion("is_remark not between", value1, value2, "isRemark");
            return (Criteria) this;
        }

        public Criteria andOrderSizeIsNull() {
            addCriterion("order_size is null");
            return (Criteria) this;
        }

        public Criteria andOrderSizeIsNotNull() {
            addCriterion("order_size is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSizeEqualTo(String value) {
            addCriterion("order_size =", value, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeNotEqualTo(String value) {
            addCriterion("order_size <>", value, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeGreaterThan(String value) {
            addCriterion("order_size >", value, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeGreaterThanOrEqualTo(String value) {
            addCriterion("order_size >=", value, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeLessThan(String value) {
            addCriterion("order_size <", value, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeLessThanOrEqualTo(String value) {
            addCriterion("order_size <=", value, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeLike(String value) {
            addCriterion("order_size like", value, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeNotLike(String value) {
            addCriterion("order_size not like", value, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeIn(List<String> values) {
            addCriterion("order_size in", values, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeNotIn(List<String> values) {
            addCriterion("order_size not in", values, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeBetween(String value1, String value2) {
            addCriterion("order_size between", value1, value2, "orderSize");
            return (Criteria) this;
        }

        public Criteria andOrderSizeNotBetween(String value1, String value2) {
            addCriterion("order_size not between", value1, value2, "orderSize");
            return (Criteria) this;
        }

        public Criteria andFollowUpIsNull() {
            addCriterion("follow_up is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpIsNotNull() {
            addCriterion("follow_up is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpEqualTo(String value) {
            addCriterion("follow_up =", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotEqualTo(String value) {
            addCriterion("follow_up <>", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpGreaterThan(String value) {
            addCriterion("follow_up >", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up >=", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpLessThan(String value) {
            addCriterion("follow_up <", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpLessThanOrEqualTo(String value) {
            addCriterion("follow_up <=", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpLike(String value) {
            addCriterion("follow_up like", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotLike(String value) {
            addCriterion("follow_up not like", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpIn(List<String> values) {
            addCriterion("follow_up in", values, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotIn(List<String> values) {
            addCriterion("follow_up not in", values, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpBetween(String value1, String value2) {
            addCriterion("follow_up between", value1, value2, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotBetween(String value1, String value2) {
            addCriterion("follow_up not between", value1, value2, "followUp");
            return (Criteria) this;
        }

        public Criteria andIsRegularIsNull() {
            addCriterion("is_regular is null");
            return (Criteria) this;
        }

        public Criteria andIsRegularIsNotNull() {
            addCriterion("is_regular is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegularEqualTo(String value) {
            addCriterion("is_regular =", value, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularNotEqualTo(String value) {
            addCriterion("is_regular <>", value, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularGreaterThan(String value) {
            addCriterion("is_regular >", value, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularGreaterThanOrEqualTo(String value) {
            addCriterion("is_regular >=", value, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularLessThan(String value) {
            addCriterion("is_regular <", value, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularLessThanOrEqualTo(String value) {
            addCriterion("is_regular <=", value, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularLike(String value) {
            addCriterion("is_regular like", value, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularNotLike(String value) {
            addCriterion("is_regular not like", value, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularIn(List<String> values) {
            addCriterion("is_regular in", values, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularNotIn(List<String> values) {
            addCriterion("is_regular not in", values, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularBetween(String value1, String value2) {
            addCriterion("is_regular between", value1, value2, "isRegular");
            return (Criteria) this;
        }

        public Criteria andIsRegularNotBetween(String value1, String value2) {
            addCriterion("is_regular not between", value1, value2, "isRegular");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysIsNull() {
            addCriterion("expect_delivery_days is null");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysIsNotNull() {
            addCriterion("expect_delivery_days is not null");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysEqualTo(String value) {
            addCriterion("expect_delivery_days =", value, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysNotEqualTo(String value) {
            addCriterion("expect_delivery_days <>", value, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysGreaterThan(String value) {
            addCriterion("expect_delivery_days >", value, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysGreaterThanOrEqualTo(String value) {
            addCriterion("expect_delivery_days >=", value, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysLessThan(String value) {
            addCriterion("expect_delivery_days <", value, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysLessThanOrEqualTo(String value) {
            addCriterion("expect_delivery_days <=", value, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysLike(String value) {
            addCriterion("expect_delivery_days like", value, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysNotLike(String value) {
            addCriterion("expect_delivery_days not like", value, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysIn(List<String> values) {
            addCriterion("expect_delivery_days in", values, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysNotIn(List<String> values) {
            addCriterion("expect_delivery_days not in", values, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysBetween(String value1, String value2) {
            addCriterion("expect_delivery_days between", value1, value2, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDaysNotBetween(String value1, String value2) {
            addCriterion("expect_delivery_days not between", value1, value2, "expectDeliveryDays");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceIsNull() {
            addCriterion("expect_total_price is null");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceIsNotNull() {
            addCriterion("expect_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceEqualTo(Double value) {
            addCriterion("expect_total_price =", value, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceNotEqualTo(Double value) {
            addCriterion("expect_total_price <>", value, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceGreaterThan(Double value) {
            addCriterion("expect_total_price >", value, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("expect_total_price >=", value, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceLessThan(Double value) {
            addCriterion("expect_total_price <", value, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("expect_total_price <=", value, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceIn(List<Double> values) {
            addCriterion("expect_total_price in", values, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceNotIn(List<Double> values) {
            addCriterion("expect_total_price not in", values, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceBetween(Double value1, Double value2) {
            addCriterion("expect_total_price between", value1, value2, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andExpectTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("expect_total_price not between", value1, value2, "expectTotalPrice");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightIsNull() {
            addCriterion("whether_contains_freight is null");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightIsNotNull() {
            addCriterion("whether_contains_freight is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightEqualTo(String value) {
            addCriterion("whether_contains_freight =", value, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightNotEqualTo(String value) {
            addCriterion("whether_contains_freight <>", value, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightGreaterThan(String value) {
            addCriterion("whether_contains_freight >", value, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightGreaterThanOrEqualTo(String value) {
            addCriterion("whether_contains_freight >=", value, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightLessThan(String value) {
            addCriterion("whether_contains_freight <", value, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightLessThanOrEqualTo(String value) {
            addCriterion("whether_contains_freight <=", value, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightLike(String value) {
            addCriterion("whether_contains_freight like", value, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightNotLike(String value) {
            addCriterion("whether_contains_freight not like", value, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightIn(List<String> values) {
            addCriterion("whether_contains_freight in", values, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightNotIn(List<String> values) {
            addCriterion("whether_contains_freight not in", values, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightBetween(String value1, String value2) {
            addCriterion("whether_contains_freight between", value1, value2, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andWhetherContainsFreightNotBetween(String value1, String value2) {
            addCriterion("whether_contains_freight not between", value1, value2, "whetherContainsFreight");
            return (Criteria) this;
        }

        public Criteria andEverMachinedIsNull() {
            addCriterion("ever_machined is null");
            return (Criteria) this;
        }

        public Criteria andEverMachinedIsNotNull() {
            addCriterion("ever_machined is not null");
            return (Criteria) this;
        }

        public Criteria andEverMachinedEqualTo(String value) {
            addCriterion("ever_machined =", value, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedNotEqualTo(String value) {
            addCriterion("ever_machined <>", value, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedGreaterThan(String value) {
            addCriterion("ever_machined >", value, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedGreaterThanOrEqualTo(String value) {
            addCriterion("ever_machined >=", value, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedLessThan(String value) {
            addCriterion("ever_machined <", value, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedLessThanOrEqualTo(String value) {
            addCriterion("ever_machined <=", value, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedLike(String value) {
            addCriterion("ever_machined like", value, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedNotLike(String value) {
            addCriterion("ever_machined not like", value, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedIn(List<String> values) {
            addCriterion("ever_machined in", values, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedNotIn(List<String> values) {
            addCriterion("ever_machined not in", values, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedBetween(String value1, String value2) {
            addCriterion("ever_machined between", value1, value2, "everMachined");
            return (Criteria) this;
        }

        public Criteria andEverMachinedNotBetween(String value1, String value2) {
            addCriterion("ever_machined not between", value1, value2, "everMachined");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierIsNull() {
            addCriterion("quotation_from_supplier is null");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierIsNotNull() {
            addCriterion("quotation_from_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierEqualTo(String value) {
            addCriterion("quotation_from_supplier =", value, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierNotEqualTo(String value) {
            addCriterion("quotation_from_supplier <>", value, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierGreaterThan(String value) {
            addCriterion("quotation_from_supplier >", value, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("quotation_from_supplier >=", value, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierLessThan(String value) {
            addCriterion("quotation_from_supplier <", value, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierLessThanOrEqualTo(String value) {
            addCriterion("quotation_from_supplier <=", value, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierLike(String value) {
            addCriterion("quotation_from_supplier like", value, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierNotLike(String value) {
            addCriterion("quotation_from_supplier not like", value, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierIn(List<String> values) {
            addCriterion("quotation_from_supplier in", values, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierNotIn(List<String> values) {
            addCriterion("quotation_from_supplier not in", values, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierBetween(String value1, String value2) {
            addCriterion("quotation_from_supplier between", value1, value2, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andQuotationFromSupplierNotBetween(String value1, String value2) {
            addCriterion("quotation_from_supplier not between", value1, value2, "quotationFromSupplier");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNull() {
            addCriterion("send_city is null");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNotNull() {
            addCriterion("send_city is not null");
            return (Criteria) this;
        }

        public Criteria andSendCityEqualTo(String value) {
            addCriterion("send_city =", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotEqualTo(String value) {
            addCriterion("send_city <>", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThan(String value) {
            addCriterion("send_city >", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThanOrEqualTo(String value) {
            addCriterion("send_city >=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThan(String value) {
            addCriterion("send_city <", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThanOrEqualTo(String value) {
            addCriterion("send_city <=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLike(String value) {
            addCriterion("send_city like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotLike(String value) {
            addCriterion("send_city not like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityIn(List<String> values) {
            addCriterion("send_city in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotIn(List<String> values) {
            addCriterion("send_city not in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityBetween(String value1, String value2) {
            addCriterion("send_city between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotBetween(String value1, String value2) {
            addCriterion("send_city not between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonIsNull() {
            addCriterion("no_freight_reason is null");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonIsNotNull() {
            addCriterion("no_freight_reason is not null");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonEqualTo(String value) {
            addCriterion("no_freight_reason =", value, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonNotEqualTo(String value) {
            addCriterion("no_freight_reason <>", value, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonGreaterThan(String value) {
            addCriterion("no_freight_reason >", value, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonGreaterThanOrEqualTo(String value) {
            addCriterion("no_freight_reason >=", value, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonLessThan(String value) {
            addCriterion("no_freight_reason <", value, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonLessThanOrEqualTo(String value) {
            addCriterion("no_freight_reason <=", value, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonLike(String value) {
            addCriterion("no_freight_reason like", value, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonNotLike(String value) {
            addCriterion("no_freight_reason not like", value, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonIn(List<String> values) {
            addCriterion("no_freight_reason in", values, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonNotIn(List<String> values) {
            addCriterion("no_freight_reason not in", values, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonBetween(String value1, String value2) {
            addCriterion("no_freight_reason between", value1, value2, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andNoFreightReasonNotBetween(String value1, String value2) {
            addCriterion("no_freight_reason not between", value1, value2, "noFreightReason");
            return (Criteria) this;
        }

        public Criteria andToningFeeIsNull() {
            addCriterion("toning_fee is null");
            return (Criteria) this;
        }

        public Criteria andToningFeeIsNotNull() {
            addCriterion("toning_fee is not null");
            return (Criteria) this;
        }

        public Criteria andToningFeeEqualTo(BigDecimal value) {
            addCriterion("toning_fee =", value, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeNotEqualTo(BigDecimal value) {
            addCriterion("toning_fee <>", value, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeGreaterThan(BigDecimal value) {
            addCriterion("toning_fee >", value, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("toning_fee >=", value, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeLessThan(BigDecimal value) {
            addCriterion("toning_fee <", value, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("toning_fee <=", value, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeIn(List<BigDecimal> values) {
            addCriterion("toning_fee in", values, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeNotIn(List<BigDecimal> values) {
            addCriterion("toning_fee not in", values, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("toning_fee between", value1, value2, "toningFee");
            return (Criteria) this;
        }

        public Criteria andToningFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("toning_fee not between", value1, value2, "toningFee");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceIsNull() {
            addCriterion("min_spread_price is null");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceIsNotNull() {
            addCriterion("min_spread_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceEqualTo(BigDecimal value) {
            addCriterion("min_spread_price =", value, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceNotEqualTo(BigDecimal value) {
            addCriterion("min_spread_price <>", value, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceGreaterThan(BigDecimal value) {
            addCriterion("min_spread_price >", value, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_spread_price >=", value, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceLessThan(BigDecimal value) {
            addCriterion("min_spread_price <", value, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_spread_price <=", value, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceIn(List<BigDecimal> values) {
            addCriterion("min_spread_price in", values, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceNotIn(List<BigDecimal> values) {
            addCriterion("min_spread_price not in", values, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_spread_price between", value1, value2, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andMinSpreadPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_spread_price not between", value1, value2, "minSpreadPrice");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeIsNull() {
            addCriterion("expect_quote_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeIsNotNull() {
            addCriterion("expect_quote_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeEqualTo(Date value) {
            addCriterion("expect_quote_time =", value, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeNotEqualTo(Date value) {
            addCriterion("expect_quote_time <>", value, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeGreaterThan(Date value) {
            addCriterion("expect_quote_time >", value, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_quote_time >=", value, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeLessThan(Date value) {
            addCriterion("expect_quote_time <", value, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeLessThanOrEqualTo(Date value) {
            addCriterion("expect_quote_time <=", value, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeIn(List<Date> values) {
            addCriterion("expect_quote_time in", values, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeNotIn(List<Date> values) {
            addCriterion("expect_quote_time not in", values, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeBetween(Date value1, Date value2) {
            addCriterion("expect_quote_time between", value1, value2, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andExpectQuoteTimeNotBetween(Date value1, Date value2) {
            addCriterion("expect_quote_time not between", value1, value2, "expectQuoteTime");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardIsNull() {
            addCriterion("drawing_standard is null");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardIsNotNull() {
            addCriterion("drawing_standard is not null");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardEqualTo(String value) {
            addCriterion("drawing_standard =", value, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardNotEqualTo(String value) {
            addCriterion("drawing_standard <>", value, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardGreaterThan(String value) {
            addCriterion("drawing_standard >", value, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardGreaterThanOrEqualTo(String value) {
            addCriterion("drawing_standard >=", value, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardLessThan(String value) {
            addCriterion("drawing_standard <", value, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardLessThanOrEqualTo(String value) {
            addCriterion("drawing_standard <=", value, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardLike(String value) {
            addCriterion("drawing_standard like", value, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardNotLike(String value) {
            addCriterion("drawing_standard not like", value, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardIn(List<String> values) {
            addCriterion("drawing_standard in", values, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardNotIn(List<String> values) {
            addCriterion("drawing_standard not in", values, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardBetween(String value1, String value2) {
            addCriterion("drawing_standard between", value1, value2, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDrawingStandardNotBetween(String value1, String value2) {
            addCriterion("drawing_standard not between", value1, value2, "drawingStandard");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(String value) {
            addCriterion("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(String value) {
            addCriterion("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(String value) {
            addCriterion("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(String value) {
            addCriterion("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(String value) {
            addCriterion("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLike(String value) {
            addCriterion("delivery_date like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotLike(String value) {
            addCriterion("delivery_date not like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<String> values) {
            addCriterion("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<String> values) {
            addCriterion("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(String value1, String value2) {
            addCriterion("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(String value1, String value2) {
            addCriterion("delivery_date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeIsNull() {
            addCriterion("wire_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeIsNotNull() {
            addCriterion("wire_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeEqualTo(BigDecimal value) {
            addCriterion("wire_service_fee =", value, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("wire_service_fee <>", value, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("wire_service_fee >", value, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wire_service_fee >=", value, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeLessThan(BigDecimal value) {
            addCriterion("wire_service_fee <", value, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wire_service_fee <=", value, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeIn(List<BigDecimal> values) {
            addCriterion("wire_service_fee in", values, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("wire_service_fee not in", values, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wire_service_fee between", value1, value2, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andWireServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wire_service_fee not between", value1, value2, "wireServiceFee");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdIsNull() {
            addCriterion("related_address_id is null");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdIsNotNull() {
            addCriterion("related_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdEqualTo(String value) {
            addCriterion("related_address_id =", value, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdNotEqualTo(String value) {
            addCriterion("related_address_id <>", value, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdGreaterThan(String value) {
            addCriterion("related_address_id >", value, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("related_address_id >=", value, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdLessThan(String value) {
            addCriterion("related_address_id <", value, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdLessThanOrEqualTo(String value) {
            addCriterion("related_address_id <=", value, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdLike(String value) {
            addCriterion("related_address_id like", value, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdNotLike(String value) {
            addCriterion("related_address_id not like", value, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdIn(List<String> values) {
            addCriterion("related_address_id in", values, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdNotIn(List<String> values) {
            addCriterion("related_address_id not in", values, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdBetween(String value1, String value2) {
            addCriterion("related_address_id between", value1, value2, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andRelatedAddressIdNotBetween(String value1, String value2) {
            addCriterion("related_address_id not between", value1, value2, "relatedAddressId");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeIsNull() {
            addCriterion("material_cert_fee is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeIsNotNull() {
            addCriterion("material_cert_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeEqualTo(BigDecimal value) {
            addCriterion("material_cert_fee =", value, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeNotEqualTo(BigDecimal value) {
            addCriterion("material_cert_fee <>", value, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeGreaterThan(BigDecimal value) {
            addCriterion("material_cert_fee >", value, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("material_cert_fee >=", value, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeLessThan(BigDecimal value) {
            addCriterion("material_cert_fee <", value, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("material_cert_fee <=", value, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeIn(List<BigDecimal> values) {
            addCriterion("material_cert_fee in", values, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeNotIn(List<BigDecimal> values) {
            addCriterion("material_cert_fee not in", values, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_cert_fee between", value1, value2, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andMaterialCertFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_cert_fee not between", value1, value2, "materialCertFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeIsNull() {
            addCriterion("dim_inspection_fee is null");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeIsNotNull() {
            addCriterion("dim_inspection_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeEqualTo(BigDecimal value) {
            addCriterion("dim_inspection_fee =", value, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeNotEqualTo(BigDecimal value) {
            addCriterion("dim_inspection_fee <>", value, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeGreaterThan(BigDecimal value) {
            addCriterion("dim_inspection_fee >", value, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dim_inspection_fee >=", value, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeLessThan(BigDecimal value) {
            addCriterion("dim_inspection_fee <", value, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dim_inspection_fee <=", value, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeIn(List<BigDecimal> values) {
            addCriterion("dim_inspection_fee in", values, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeNotIn(List<BigDecimal> values) {
            addCriterion("dim_inspection_fee not in", values, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dim_inspection_fee between", value1, value2, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andDimInspectionFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dim_inspection_fee not between", value1, value2, "dimInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeIsNull() {
            addCriterion("cmm_inspection_fee is null");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeIsNotNull() {
            addCriterion("cmm_inspection_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeEqualTo(BigDecimal value) {
            addCriterion("cmm_inspection_fee =", value, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeNotEqualTo(BigDecimal value) {
            addCriterion("cmm_inspection_fee <>", value, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeGreaterThan(BigDecimal value) {
            addCriterion("cmm_inspection_fee >", value, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cmm_inspection_fee >=", value, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeLessThan(BigDecimal value) {
            addCriterion("cmm_inspection_fee <", value, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cmm_inspection_fee <=", value, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeIn(List<BigDecimal> values) {
            addCriterion("cmm_inspection_fee in", values, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeNotIn(List<BigDecimal> values) {
            addCriterion("cmm_inspection_fee not in", values, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cmm_inspection_fee between", value1, value2, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andCmmInspectionFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cmm_inspection_fee not between", value1, value2, "cmmInspectionFee");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneIsNull() {
            addCriterion("inquirer_time_zone is null");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneIsNotNull() {
            addCriterion("inquirer_time_zone is not null");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneEqualTo(String value) {
            addCriterion("inquirer_time_zone =", value, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneNotEqualTo(String value) {
            addCriterion("inquirer_time_zone <>", value, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneGreaterThan(String value) {
            addCriterion("inquirer_time_zone >", value, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("inquirer_time_zone >=", value, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneLessThan(String value) {
            addCriterion("inquirer_time_zone <", value, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneLessThanOrEqualTo(String value) {
            addCriterion("inquirer_time_zone <=", value, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneLike(String value) {
            addCriterion("inquirer_time_zone like", value, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneNotLike(String value) {
            addCriterion("inquirer_time_zone not like", value, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneIn(List<String> values) {
            addCriterion("inquirer_time_zone in", values, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneNotIn(List<String> values) {
            addCriterion("inquirer_time_zone not in", values, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneBetween(String value1, String value2) {
            addCriterion("inquirer_time_zone between", value1, value2, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andInquirerTimeZoneNotBetween(String value1, String value2) {
            addCriterion("inquirer_time_zone not between", value1, value2, "inquirerTimeZone");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeIsNull() {
            addCriterion("shipping_term_type is null");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeIsNotNull() {
            addCriterion("shipping_term_type is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeEqualTo(String value) {
            addCriterion("shipping_term_type =", value, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeNotEqualTo(String value) {
            addCriterion("shipping_term_type <>", value, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeGreaterThan(String value) {
            addCriterion("shipping_term_type >", value, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_term_type >=", value, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeLessThan(String value) {
            addCriterion("shipping_term_type <", value, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeLessThanOrEqualTo(String value) {
            addCriterion("shipping_term_type <=", value, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeLike(String value) {
            addCriterion("shipping_term_type like", value, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeNotLike(String value) {
            addCriterion("shipping_term_type not like", value, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeIn(List<String> values) {
            addCriterion("shipping_term_type in", values, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeNotIn(List<String> values) {
            addCriterion("shipping_term_type not in", values, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeBetween(String value1, String value2) {
            addCriterion("shipping_term_type between", value1, value2, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andShippingTermTypeNotBetween(String value1, String value2) {
            addCriterion("shipping_term_type not between", value1, value2, "shippingTermType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeIsNull() {
            addCriterion("payment_condition_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeIsNotNull() {
            addCriterion("payment_condition_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeEqualTo(String value) {
            addCriterion("payment_condition_type =", value, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeNotEqualTo(String value) {
            addCriterion("payment_condition_type <>", value, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeGreaterThan(String value) {
            addCriterion("payment_condition_type >", value, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_condition_type >=", value, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeLessThan(String value) {
            addCriterion("payment_condition_type <", value, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_condition_type <=", value, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeLike(String value) {
            addCriterion("payment_condition_type like", value, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeNotLike(String value) {
            addCriterion("payment_condition_type not like", value, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeIn(List<String> values) {
            addCriterion("payment_condition_type in", values, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeNotIn(List<String> values) {
            addCriterion("payment_condition_type not in", values, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeBetween(String value1, String value2) {
            addCriterion("payment_condition_type between", value1, value2, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionTypeNotBetween(String value1, String value2) {
            addCriterion("payment_condition_type not between", value1, value2, "paymentConditionType");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("customer_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("customer_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(String value) {
            addCriterion("customer_status =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(String value) {
            addCriterion("customer_status <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(String value) {
            addCriterion("customer_status >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("customer_status >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(String value) {
            addCriterion("customer_status <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(String value) {
            addCriterion("customer_status <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLike(String value) {
            addCriterion("customer_status like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotLike(String value) {
            addCriterion("customer_status not like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<String> values) {
            addCriterion("customer_status in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<String> values) {
            addCriterion("customer_status not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(String value1, String value2) {
            addCriterion("customer_status between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(String value1, String value2) {
            addCriterion("customer_status not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardIsNull() {
            addCriterion("load_time_standard is null");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardIsNotNull() {
            addCriterion("load_time_standard is not null");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardEqualTo(String value) {
            addCriterion("load_time_standard =", value, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardNotEqualTo(String value) {
            addCriterion("load_time_standard <>", value, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardGreaterThan(String value) {
            addCriterion("load_time_standard >", value, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardGreaterThanOrEqualTo(String value) {
            addCriterion("load_time_standard >=", value, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardLessThan(String value) {
            addCriterion("load_time_standard <", value, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardLessThanOrEqualTo(String value) {
            addCriterion("load_time_standard <=", value, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardLike(String value) {
            addCriterion("load_time_standard like", value, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardNotLike(String value) {
            addCriterion("load_time_standard not like", value, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardIn(List<String> values) {
            addCriterion("load_time_standard in", values, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardNotIn(List<String> values) {
            addCriterion("load_time_standard not in", values, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardBetween(String value1, String value2) {
            addCriterion("load_time_standard between", value1, value2, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andLoadTimeStandardNotBetween(String value1, String value2) {
            addCriterion("load_time_standard not between", value1, value2, "loadTimeStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardIsNull() {
            addCriterion("shipping_standard is null");
            return (Criteria) this;
        }

        public Criteria andShippingStandardIsNotNull() {
            addCriterion("shipping_standard is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStandardEqualTo(String value) {
            addCriterion("shipping_standard =", value, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardNotEqualTo(String value) {
            addCriterion("shipping_standard <>", value, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardGreaterThan(String value) {
            addCriterion("shipping_standard >", value, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_standard >=", value, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardLessThan(String value) {
            addCriterion("shipping_standard <", value, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardLessThanOrEqualTo(String value) {
            addCriterion("shipping_standard <=", value, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardLike(String value) {
            addCriterion("shipping_standard like", value, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardNotLike(String value) {
            addCriterion("shipping_standard not like", value, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardIn(List<String> values) {
            addCriterion("shipping_standard in", values, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardNotIn(List<String> values) {
            addCriterion("shipping_standard not in", values, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardBetween(String value1, String value2) {
            addCriterion("shipping_standard between", value1, value2, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingStandardNotBetween(String value1, String value2) {
            addCriterion("shipping_standard not between", value1, value2, "shippingStandard");
            return (Criteria) this;
        }

        public Criteria andShippingCycleIsNull() {
            addCriterion("shipping_cycle is null");
            return (Criteria) this;
        }

        public Criteria andShippingCycleIsNotNull() {
            addCriterion("shipping_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCycleEqualTo(String value) {
            addCriterion("shipping_cycle =", value, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleNotEqualTo(String value) {
            addCriterion("shipping_cycle <>", value, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleGreaterThan(String value) {
            addCriterion("shipping_cycle >", value, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_cycle >=", value, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleLessThan(String value) {
            addCriterion("shipping_cycle <", value, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleLessThanOrEqualTo(String value) {
            addCriterion("shipping_cycle <=", value, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleLike(String value) {
            addCriterion("shipping_cycle like", value, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleNotLike(String value) {
            addCriterion("shipping_cycle not like", value, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleIn(List<String> values) {
            addCriterion("shipping_cycle in", values, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleNotIn(List<String> values) {
            addCriterion("shipping_cycle not in", values, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleBetween(String value1, String value2) {
            addCriterion("shipping_cycle between", value1, value2, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingCycleNotBetween(String value1, String value2) {
            addCriterion("shipping_cycle not between", value1, value2, "shippingCycle");
            return (Criteria) this;
        }

        public Criteria andShippingTermIsNull() {
            addCriterion("shipping_term is null");
            return (Criteria) this;
        }

        public Criteria andShippingTermIsNotNull() {
            addCriterion("shipping_term is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTermEqualTo(String value) {
            addCriterion("shipping_term =", value, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermNotEqualTo(String value) {
            addCriterion("shipping_term <>", value, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermGreaterThan(String value) {
            addCriterion("shipping_term >", value, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_term >=", value, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermLessThan(String value) {
            addCriterion("shipping_term <", value, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermLessThanOrEqualTo(String value) {
            addCriterion("shipping_term <=", value, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermLike(String value) {
            addCriterion("shipping_term like", value, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermNotLike(String value) {
            addCriterion("shipping_term not like", value, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermIn(List<String> values) {
            addCriterion("shipping_term in", values, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermNotIn(List<String> values) {
            addCriterion("shipping_term not in", values, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermBetween(String value1, String value2) {
            addCriterion("shipping_term between", value1, value2, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andShippingTermNotBetween(String value1, String value2) {
            addCriterion("shipping_term not between", value1, value2, "shippingTerm");
            return (Criteria) this;
        }

        public Criteria andCustomDutyIsNull() {
            addCriterion("custom_duty is null");
            return (Criteria) this;
        }

        public Criteria andCustomDutyIsNotNull() {
            addCriterion("custom_duty is not null");
            return (Criteria) this;
        }

        public Criteria andCustomDutyEqualTo(BigDecimal value) {
            addCriterion("custom_duty =", value, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyNotEqualTo(BigDecimal value) {
            addCriterion("custom_duty <>", value, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyGreaterThan(BigDecimal value) {
            addCriterion("custom_duty >", value, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("custom_duty >=", value, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyLessThan(BigDecimal value) {
            addCriterion("custom_duty <", value, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("custom_duty <=", value, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyIn(List<BigDecimal> values) {
            addCriterion("custom_duty in", values, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyNotIn(List<BigDecimal> values) {
            addCriterion("custom_duty not in", values, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom_duty between", value1, value2, "customDuty");
            return (Criteria) this;
        }

        public Criteria andCustomDutyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom_duty not between", value1, value2, "customDuty");
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

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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