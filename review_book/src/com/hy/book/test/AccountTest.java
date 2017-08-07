package com.hy.book.test;

import com.hy.book.dao.AccountDao;
import com.hy.book.dao.impl.AccountDaoImpl;
import com.hy.book.db.JDBCUtils;
import com.hy.book.domain.Account;
import com.hy.book.web.ConnectionContext;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by dell on 2017/8/7.
 */
public class AccountTest {

    private AccountDao accountDao = new AccountDaoImpl();

    @Test
    public void getAccount() {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        Account account = accountDao.getAccount(1);
        System.out.println(account);
    }
}
