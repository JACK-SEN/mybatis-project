package com.bdqn.test;/**
 * @Auther: HelloWorld
 */

import com.bdqn.entity.User;
import com.bdqn.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: workspace-idea-boot
 * @description: 用户测试类
 * @author: lth
 * @create: 2019-04-26 08:31
 **/
public class UserTest {
    /**步骤详细说明*/
    @Test
    public void testInsertUser() throws Exception {
        // 加载核心配置文件
        InputStream stream = Resources.getResourceAsStream("config/mybatis.cfg.xml");
        // 创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        // 创建SqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取接口
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用方法
        try {
            User user = userMapper.findUserByPrimaryKey(151001);
            System.out.println(user.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
    /**分页查询用户*/
    @Test
    public void findUser()throws  Exception{
        InputStream inputStream = Resources.getResourceAsStream("config/mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try {
            Map<String ,Integer> map = new HashMap<String,Integer>();
            map.put("page",6);
            map.put("rows",3);
            List<User> userList = userMapper.findUser(map);
            for(User user : userList){
                System.out.println(user.toString());
            }
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
    /**插入用户*/
    @Test
    public void insertUser()throws  Exception{
        InputStream inputStream = Resources.getResourceAsStream("config/mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try {
            User user = new User(181004, "李思思", "就业专员", 15000, 10030);
            Integer i = userMapper.insertUser(user);
            int j = 1/0;
            if(1 == i){
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
    /**删除用户*/
    @Test
    public void deleteUserByPrimayKey()throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("config/mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        try {
            Integer i = usermapper.deleteUserByPrimaryKey(157001);
            if(1 == i){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
    /**修改用户*/
    @Test
    public void updateUser()throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("config/mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try {
            User user = new User();
            user.setEid(181003);
            user.setName("张珊珊");
            user.setJob("就业专员");
            user.setDepartId(10030);
            user.setCreatetime(new Date());
            user.setSalary(15100);
            Integer i = userMapper.updateUser(user);
            if(1 == i){
                System.out.println("更新成功");
            }else{
                System.out.println("更新失败");
            }
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
    /**新增用户+条件判断*/
    @Test
    public void insertUserExample()throws  Exception{
        InputStream inputStream = Resources.getResourceAsStream("config/mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try {
            User user = new User();
            user.setEid(181004);
            user.setName("张胜男");
            Integer i = userMapper.insertUserExample(user);
            if(1 == i){
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
    /**修改用户字段条件判断*/
    @Test
    public void updateUserExample()throws  Exception{
        InputStream inputStream = Resources.getResourceAsStream("config/mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try {
            User user = new User();
           user.setName("李思绶");
            user.setEid(151001);
            user.setSalary(15121);
            Integer i = userMapper.updateUserExample(user);
            if(1 == i){
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
}
