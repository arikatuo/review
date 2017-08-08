package com.hy.book.test;

import com.hy.book.dao.AccountDao;
import com.hy.book.dao.impl.AccountDaoImpl;
import com.hy.book.db.JDBCUtils;
import com.hy.book.domain.Account;
import com.hy.book.web.ConnectionContext;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017/8/8.
 */
public class AccountDaoImplTest {
    private AccountDao accountDao = new AccountDaoImpl();

    @Test
    public void getAccount() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        Account account = accountDao.getAccount(1);
        System.out.println(account);
    }

    @Test
    public void updateAccount() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        accountDao.updateAccount(1,50);
        Account account = accountDao.getAccount(1);
        System.out.println(account);

    }

}