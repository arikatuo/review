package com.hy.dao;

import com.hy.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dell on 2017/8/1.
 */
public interface UserDao {

    public User queryById(@Param("id") int id);

    public List<User> selectUserByUserName(@Param("userName") String userNname);
}
