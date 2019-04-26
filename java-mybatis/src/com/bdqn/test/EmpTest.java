package com.bdqn.test;/**
 * @Auther: HelloWorld
 */

import com.bdqn.entity.Emp;
import com.bdqn.mapper.EmpMapper;
import com.bdqn.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: java-mybatis
 * @description: 员工测试类
 * @author: lth
 * @create: 2019-04-26 14:23
 **/
public class EmpTest {

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
}
