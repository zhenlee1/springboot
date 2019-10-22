package com.demo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskTableExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public TaskTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
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

        public Criteria andTaskTableIdIsNull() {
            addCriterion("TASK_TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdIsNotNull() {
            addCriterion("TASK_TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdEqualTo(Integer value) {
            addCriterion("TASK_TABLE_ID =", value, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdNotEqualTo(Integer value) {
            addCriterion("TASK_TABLE_ID <>", value, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdGreaterThan(Integer value) {
            addCriterion("TASK_TABLE_ID >", value, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_TABLE_ID >=", value, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdLessThan(Integer value) {
            addCriterion("TASK_TABLE_ID <", value, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_TABLE_ID <=", value, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdIn(List<Integer> values) {
            addCriterion("TASK_TABLE_ID in", values, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdNotIn(List<Integer> values) {
            addCriterion("TASK_TABLE_ID not in", values, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TABLE_ID between", value1, value2, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTaskTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TABLE_ID not between", value1, value2, "taskTableId");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNull() {
            addCriterion("TABLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNotNull() {
            addCriterion("TABLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTableTypeEqualTo(Integer value) {
            addCriterion("TABLE_TYPE =", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotEqualTo(Integer value) {
            addCriterion("TABLE_TYPE <>", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThan(Integer value) {
            addCriterion("TABLE_TYPE >", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TABLE_TYPE >=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThan(Integer value) {
            addCriterion("TABLE_TYPE <", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TABLE_TYPE <=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeIn(List<Integer> values) {
            addCriterion("TABLE_TYPE in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotIn(List<Integer> values) {
            addCriterion("TABLE_TYPE not in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeBetween(Integer value1, Integer value2) {
            addCriterion("TABLE_TYPE between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TABLE_TYPE not between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameIsNull() {
            addCriterion("TASK_TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameIsNotNull() {
            addCriterion("TASK_TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameEqualTo(String value) {
            addCriterion("TASK_TABLE_NAME =", value, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameNotEqualTo(String value) {
            addCriterion("TASK_TABLE_NAME <>", value, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameGreaterThan(String value) {
            addCriterion("TASK_TABLE_NAME >", value, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_NAME >=", value, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameLessThan(String value) {
            addCriterion("TASK_TABLE_NAME <", value, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_NAME <=", value, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameLike(String value) {
            addCriterion("TASK_TABLE_NAME like", value, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameNotLike(String value) {
            addCriterion("TASK_TABLE_NAME not like", value, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameIn(List<String> values) {
            addCriterion("TASK_TABLE_NAME in", values, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameNotIn(List<String> values) {
            addCriterion("TASK_TABLE_NAME not in", values, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_NAME between", value1, value2, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableNameNotBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_NAME not between", value1, value2, "taskTableName");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameIsNull() {
            addCriterion("TASK_TABLE_BYNAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameIsNotNull() {
            addCriterion("TASK_TABLE_BYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameEqualTo(String value) {
            addCriterion("TASK_TABLE_BYNAME =", value, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameNotEqualTo(String value) {
            addCriterion("TASK_TABLE_BYNAME <>", value, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameGreaterThan(String value) {
            addCriterion("TASK_TABLE_BYNAME >", value, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_BYNAME >=", value, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameLessThan(String value) {
            addCriterion("TASK_TABLE_BYNAME <", value, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameLessThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_BYNAME <=", value, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameLike(String value) {
            addCriterion("TASK_TABLE_BYNAME like", value, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameNotLike(String value) {
            addCriterion("TASK_TABLE_BYNAME not like", value, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameIn(List<String> values) {
            addCriterion("TASK_TABLE_BYNAME in", values, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameNotIn(List<String> values) {
            addCriterion("TASK_TABLE_BYNAME not in", values, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_BYNAME between", value1, value2, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableBynameNotBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_BYNAME not between", value1, value2, "taskTableByname");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeIsNull() {
            addCriterion("TASK_TABLE_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeIsNotNull() {
            addCriterion("TASK_TABLE_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeEqualTo(String value) {
            addCriterion("TASK_TABLE_DESCRIBE =", value, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeNotEqualTo(String value) {
            addCriterion("TASK_TABLE_DESCRIBE <>", value, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeGreaterThan(String value) {
            addCriterion("TASK_TABLE_DESCRIBE >", value, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_DESCRIBE >=", value, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeLessThan(String value) {
            addCriterion("TASK_TABLE_DESCRIBE <", value, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TABLE_DESCRIBE <=", value, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeLike(String value) {
            addCriterion("TASK_TABLE_DESCRIBE like", value, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeNotLike(String value) {
            addCriterion("TASK_TABLE_DESCRIBE not like", value, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeIn(List<String> values) {
            addCriterion("TASK_TABLE_DESCRIBE in", values, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeNotIn(List<String> values) {
            addCriterion("TASK_TABLE_DESCRIBE not in", values, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_DESCRIBE between", value1, value2, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andTaskTableDescribeNotBetween(String value1, String value2) {
            addCriterion("TASK_TABLE_DESCRIBE not between", value1, value2, "taskTableDescribe");
            return (Criteria) this;
        }

        public Criteria andPkSerialIsNull() {
            addCriterion("PK_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andPkSerialIsNotNull() {
            addCriterion("PK_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andPkSerialEqualTo(String value) {
            addCriterion("PK_SERIAL =", value, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialNotEqualTo(String value) {
            addCriterion("PK_SERIAL <>", value, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialGreaterThan(String value) {
            addCriterion("PK_SERIAL >", value, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialGreaterThanOrEqualTo(String value) {
            addCriterion("PK_SERIAL >=", value, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialLessThan(String value) {
            addCriterion("PK_SERIAL <", value, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialLessThanOrEqualTo(String value) {
            addCriterion("PK_SERIAL <=", value, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialLike(String value) {
            addCriterion("PK_SERIAL like", value, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialNotLike(String value) {
            addCriterion("PK_SERIAL not like", value, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialIn(List<String> values) {
            addCriterion("PK_SERIAL in", values, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialNotIn(List<String> values) {
            addCriterion("PK_SERIAL not in", values, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialBetween(String value1, String value2) {
            addCriterion("PK_SERIAL between", value1, value2, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andPkSerialNotBetween(String value1, String value2) {
            addCriterion("PK_SERIAL not between", value1, value2, "pkSerial");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task_table
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 28 15:09:04 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task_table
     *
     * @mbggenerated Wed Mar 28 15:09:04 CST 2018
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