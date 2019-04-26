package com.bdqn.mapper;

import com.bdqn.entity.Emp;
import com.bdqn.entity.ParamExample;

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
     *   IF 动态SQL
     * @param: Map
     * @return: List<Emp>
     * @auther: lth
     * @date: 2019/4/26 14:18
     */
    List<Emp> findEmp(Map map);
    /**
     * 功能描述:
     * choose when otherwise
     * @param: Map
     * @return: List<Emp>
     * @auther: lth
     * @date: 2019/4/26 14:18
     */
    List<Emp> findEmp2(Map map);
    /**
     * 功能描述:
     *   foreach 遍历
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/4/26 15:43
     */
    List<Emp> findEmpByIds(ParamExample pe);
    /**
     * 功能描述:
     *  bind
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/4/26 15:53
     */
    List<Emp> findEmpByName(Map mpa);
    /**
     * 功能描述:
     *   selectKey
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/4/26 16:51
     */
    Integer insertEmpBackId(Emp emp);
}
