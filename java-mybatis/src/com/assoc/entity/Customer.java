package com.assoc.entity;

import java.util.List;

/**
 * @program: mybatis-project
 * @description: 客户实体类
 * @author: lth
 * @create: 2019-05-06 13:33
 **/
public class Customer {

    /**客户ID*/
    private Integer customerId;
    /**账号*/
    private String customerName;
    /**密码*/
    private String pwd;
    /**真实姓名*/
    private String realName;
    /**手机号*/
    private String mobilePhone;
    /**性别*/
    private String gender;
    /**邮箱*/
    private String email;
    /**状态*/
    private Byte status;
    /**身份证号*/
    private String card;
    /**账户余额*/
    private Double money;

    /**一对一关系*/
    private CustomerInfo customerInfo;

    /**一对多关系*/
    private List orderList;

    public List getOrderList() {
        return orderList;
    }

    public void setOrderList(List orderList) {
        this.orderList = orderList;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, String pwd, String realName, String mobilePhone, String gender, String email, Byte status, String card, Double money) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.pwd = pwd;
        this.realName = realName;
        this.mobilePhone = mobilePhone;
        this.gender = gender;
        this.email = email;
        this.status = status;
        this.card = card;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", realName='" + realName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", card='" + card + '\'' +
                ", money=" + money +
                ", customerInfo=" + customerInfo +
                '}';
    }
}
