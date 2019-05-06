package com.assoc.test;

import com.assoc.entity.Customer;
import com.assoc.entity.OrderInfo;
import com.assoc.mapper.CustomerMapper;
import com.bdqn.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: mybatis-project
 * @description: 测试实体类
 * @author: lth
 * @create: 2019-05-06 14:26
 **/
public class CustomerTest {

    /**
     * 功能描述:
     *      测试查询客户基本信息
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/6 15:06
     */
    @Test
    public void testFindCustomerById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerById(1);
        List<OrderInfo> orderList = customer.getOrderList();
        System.out.println(customer.getCustomerId()+" "+customer.getRealName());
        for (OrderInfo order:orderList){
            System.out.println(order.toString());
        }
    }
    /**
     * 功能描述:
     *  测试查询客户详细信息
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/6 15:06
     */
    @Test
    public void findCsutomerAndInfo(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.findCsutomerAndInfo(1);
        System.out.println(customer.toString());

    }
    /**
     * 功能描述:
     *  查询客户订单
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/6 15:58
     */
    @Test
    public void testfindCustomerOrders(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerOrders(1);
        List<OrderInfo> orderList = customer.getOrderList();
        System.out.println(customer.getCustomerId()+" "+customer.getRealName());
        for (OrderInfo order:orderList){
            System.out.println(order.toString());
        }
    }
}
