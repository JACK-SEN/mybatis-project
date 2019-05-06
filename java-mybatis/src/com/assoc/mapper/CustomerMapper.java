package com.assoc.mapper;

import com.assoc.entity.Customer;

/**
 * @Auther: HelloWorld
 */
public interface CustomerMapper {

    /**
     * 功能描述: 
     *  查询客户基本信息
     * @param: customer_id
     * @return: Customer
     * @auther: lth
     * @date: 2019/5/6 14:28
     */
    Customer findCustomerById(Integer customer_id);
    /**
     * 功能描述:
     *  查询客户详细信息
     * @param:  customer_id
     * @return: Customer
     * @auther: lth
     * @date: 2019/5/6 15:02
     */
    Customer findCsutomerAndInfo(Integer customer_id);
    /**
     * 功能描述:
     *  查询客户订单
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/6 15:57
     */
    Customer findCustomerOrders(Integer customer_id);
}
