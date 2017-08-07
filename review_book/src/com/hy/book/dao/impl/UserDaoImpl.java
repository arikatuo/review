package com.hy.book.dao.impl;

import com.hy.book.dao.UserDao;
import com.hy.book.domain.User;

/**
 * Created by dell on 2017/8/7.
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    @Override
    public User getUser(String username) {

        String sql = "select userid,username,accountid from userinfo where username=?";

        return query(sql, username);
    }
}
