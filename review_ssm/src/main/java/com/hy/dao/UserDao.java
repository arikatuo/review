package com.hy.dao;

import com.hy.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dell on 2017/8/1.
 */

import java.util.List;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User selectUserById(Integer userId);


    List<User> selectUserByUserName(@Param("userName") String userName);



}

