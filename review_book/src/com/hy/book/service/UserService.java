package com.hy.book.service;

import com.hy.book.dao.UserDao;
import com.hy.book.dao.impl.UserDaoImpl;
import com.hy.book.domain.User;

import java.lang.reflect.Field;

/**
 * Created by dell on 2017/8/7.
 */
public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public User getUser(String userName) {
        return userDao.getUser(userName);
    }

}

