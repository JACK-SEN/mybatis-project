package com.bdqn.mapper;/**
 * @Auther: HelloWorld
 */

import com.bdqn.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @program: workspace-idea-boot
 * @description: 用户接口
 * @author: lth
 * @create: 2019-04-26 08:38
 **/
public interface UserMapper {

    /**
     * 功能描述:    通过ID查询用户
     * @param:  id
     * @return: User
     * @auther: lth
     * @date: 2019/4/26 8:43
     */
    User findUserByPrimaryKey(Integer id);

    /**
     * 功能描述:
     *  查询所有的用户
     * @param: map
     * @return: List<User>
     * @auther: lth
     * @date: 2019/4/26 9:21
     */
    List<User> findUser(Map map);
    /**
     * 功能描述:
     * 插入用户
     * @param: user
     * @return: integer
     * @auther: lth
     * @date: 2019/4/26 9:47
     */
    Integer insertUser(User user);
    /**
     * 功能描述:
     *  删除用户
     * @param: id
     * @return: integer
     * @auther: lth
     * @date: 2019/4/26 10:04
     */
    Integer deleteUserByPrimaryKey(Integer id);
    /**
     * 功能描述:
     * 修改用户
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/4/26 10:45
     */
    Integer updateUser(User user);
}
