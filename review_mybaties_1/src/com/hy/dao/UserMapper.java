package com.hy.dao;

import com.hy.model.User;
import com.hy.model.UserQueryVo;

import java.util.List;

/**
 * Created by dell on 2017/7/25.
 */
public interface UserMapper {
    //根据id查询用户信息
    public User findUserById(int id) throws Exception;

    //根据用户名模糊查询
    public List<User> findUserByName(String name) throws Exception;

    //添加用户信息
    public void insertUser(User user) throws Exception;

    //删除用户信息
    public void deleteUser(int id) throws Exception;

    //更新用户信息
    public void updateUser(User user) throws Exception;

    public List<User> findUserList(UserQueryVo userQueryVo) throws Exception;

    public User findUserByIdResultMap(int id) throws Exception;
}
