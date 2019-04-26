package com.bdqn.test;/**
 * @Auther: HelloWorld
 */

import com.bdqn.entity.Emp;
import com.bdqn.entity.ParamExample;
import com.bdqn.mapper.EmpMapper;
import com.bdqn.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: java-mybatis
 * @description: 员工测试类，动态SQL测试
 * @author: lth
 * @create: 2019-04-26 14:23
 **/
public class EmpTest {

    /**测试if*/
    @Test
    public void findEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Map<String,String> map = new HashMap<String,String>(5);
        map.put("realName","%张%");
        List<Emp> empList = empMapper.findEmp(map);
        for(Emp emp : empList){
            System.out.println(emp.toString());
        }
    }
    /**测试choose when otherwise*/
    @Test
    public void findEmp2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Map<String,Object> map = new HashMap<String,Object>(3);
        map.put("id",10);
        List<Emp> empList = empMapper.findEmp2(map);
        for(Emp emp : empList){
            System.out.println(emp.toString());
        }
    }
    /**测试foreach*/
    @Test
    public void findEmpByIds(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        ParamExample paramExample = new ParamExample();
        List ids = new ArrayList<Integer>();
        ids.add(10);
        ids.add(11);
        ids.add(12);
        paramExample.setIds(ids);
        List<Emp> empList = empMapper.findEmpByIds(paramExample);
        for(Emp emp : empList){
            System.out.println(emp.toString());
        }
    }
    /**测试bind*/
    @Test
    public void findEmpByName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Map<String,String> map = new HashMap<String,String>(3);
        map.put("realName","王");
        List<Emp> empList = empMapper.findEmpByName(map);
        for(Emp emp : empList){
            System.out.println(emp.toString());
        }
    }
    /**测试selectKey*/
    @Test
    public void insertEmpBackId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        try {
            Emp emp = new Emp();
            emp.setUsername("wanglili");
            emp.setRealName("王丽丽");
            Integer id = empMapper.insertEmpBackId(emp);

            sqlSession.commit();
            System.out.println(emp.getId());
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
}
