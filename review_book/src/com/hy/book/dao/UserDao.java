package com.hy.book.dao;

import com.hy.book.domain.User;

/**
 * Created by dell on 2017/8/7.
 */
public interface UserDao {
    User getUser(String username);
}
