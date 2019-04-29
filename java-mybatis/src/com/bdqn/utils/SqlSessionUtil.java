package com.bdqn.utils;/**
 * @Auther: HelloWorld
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: java-mybatis
 * @description: 获取sqlsession工具类
 * @author: lth
 * @create: 2019-04-26 14:20
 **/
public class SqlSessionUtil {

    //私有化session公差工厂
    private static SqlSessionFactory sqlSessionFactory;
    //配置文件位置
    private static final String CONFIG = "config/mybatis-config.xml";

    static{
        try {
            InputStream inputStream = Resources.getResourceAsStream(CONFIG);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
