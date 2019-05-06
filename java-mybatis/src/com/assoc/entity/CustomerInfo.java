package com.assoc.entity;

import java.util.Date;

/**
 * @program: mybatis-project
 * @description: 客户详情实体
 * @author: lth
 * @create: 2019-05-06 13:55
 **/
public class CustomerInfo {

   /**详情实体ID*/
   private Integer customerInfoId;
    /**用户ID*/
    private Integer customerId;
    /**积分*/
    private Integer ustomerPoint;
    /**等级*/
    private Integer customerLevel;
    /**最后一次修改时间*/
    private Date modifyTime;
    /**邮编*/
    private Short zipCode;
    /**省*/
    private String province;
    /**市*/
    private String city;
    /**区*/
    private String district;
    /**街道，小区地址*/
    private String address;

    public Integer getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(Integer customerInfoId) {
        this.customerInfoId = customerInfoId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getUstomerPoint() {
        return ustomerPoint;
    }

    public void setUstomerPoint(Integer ustomerPoint) {
        this.ustomerPoint = ustomerPoint;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Short getZipCode() {
        return zipCode;
    }

    public void setZipCode(Short zipCode) {
        this.zipCode = zipCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerInfo() {
    }

    public CustomerInfo(Integer customerInfoId, Integer customerId, Integer ustomerPoint, Integer customerLevel, Date modifyTime, Short zipCode, String province, String city, String district, String address) {
        this.customerInfoId = customerInfoId;
        this.customerId = customerId;
        this.ustomerPoint = ustomerPoint;
        this.customerLevel = customerLevel;
        this.modifyTime = modifyTime;
        this.zipCode = zipCode;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "customerInfoId=" + customerInfoId +
                ", customerId=" + customerId +
                ", ustomerPoint=" + ustomerPoint +
                ", customerLevel=" + customerLevel +
                ", modifyTime=" + modifyTime +
                ", zipCode=" + zipCode +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
