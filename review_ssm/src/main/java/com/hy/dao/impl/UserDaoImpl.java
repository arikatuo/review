package com.hy.dao.impl;

import com.hy.dao.UserDao;
import com.hy.entity.User;
import com.hy.mapper.UserMapper;

import javax.jws.soap.SOAPBinding;

/**
 * Created by dell on 2017/8/1.
 */
public class UserDaoImpl implements UserDao{
    private UserMapper userMapper;

    @Override
    public User queryById(int id) {
        User user=userMapper.queryById(id);
        return user;
    }
}
