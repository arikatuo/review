package com.hy.book.test;

import com.hy.book.dao.AccountDao;
import com.hy.book.dao.impl.AccountDaoImpl;
import org.junit.Test;

/**
 * Created by dell on 2017/8/7.
 */
public class AccountTest {

    private AccountDao accountDao = new AccountDaoImpl();
    @Test
    public void getAccount() {
        System.out.println(accountDao.getAccount(1));
    }
}
