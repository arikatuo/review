package com.hy.book.test;

import com.hy.book.dao.UserDao;
import com.hy.book.dao.impl.UserDaoImpl;
import com.hy.book.db.JDBCUtils;
import com.hy.book.domain.User;
import com.hy.book.web.ConnectionContext;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017/8/8.
 */
public class UserDaoImplTest {
    private UserDao userDao = new UserDaoImpl();

    @Test
    public void getUser() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        User user=userDao.getUser("Tom");
        System.out.println(user);

    }

}