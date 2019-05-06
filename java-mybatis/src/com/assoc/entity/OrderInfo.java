package com.assoc.entity;/**
 * @Auther: HelloWorld
 */

import java.util.Date;

/**
 * @program: mybatis-project
 * @description: 订单实体类
 * @author: lth
 * @create: 2019-05-06 15:42
 **/
public class OrderInfo {

   /**订单自增ID*/
   private Integer orderId;
    /**订单编号*/
    private String orderNumber;
    /**订单总金额*/
    private Double totalMoney;
    /**商品*/
    private String productName;
    /**订单创建时间*/
    private Date createTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public OrderInfo() {
    }

    public OrderInfo(Integer orderId, String orderNumber, Double totalMoney, String productName, Date createTime) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.totalMoney = totalMoney;
        this.productName = productName;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", orderNumber='" + orderNumber + '\'' +
                ", totalMoney=" + totalMoney +
                ", productName='" + productName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
