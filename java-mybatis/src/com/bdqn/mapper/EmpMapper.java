package com.bdqn.mapper;

import com.bdqn.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * @program: workspace-idea-boot
 * @description: 员工mapper接口
 * @author: lth
 * @create: 2019-04-26 13:49
 **/
public interface EmpMapper {

    /**
     * 功能描述:
     *
     * @param: Map
     * @return: List<Emp>
     * @auther: lth
     * @date: 2019/4/26 14:18
     */
    List<Emp> findEmp(Map map);
}
