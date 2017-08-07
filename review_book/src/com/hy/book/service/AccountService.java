package com.hy.book.service;

import com.hy.book.dao.AccountDao;
import com.hy.book.dao.impl.AccountDaoImpl;
import com.hy.book.domain.Account;

/**
 * Created by dell on 2017/8/7.
 */
public class AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

    public Account getAccount(int accountid) {
        return accountDao.getAccount(accountid);
    }
}
