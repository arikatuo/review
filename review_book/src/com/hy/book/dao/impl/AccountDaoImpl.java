package com.hy.book.dao.impl;

import com.hy.book.dao.AccountDao;
import com.hy.book.dao.BaseDao;
import com.hy.book.domain.Account;

/**
 * Created by dell on 2017/8/7.
 */
public class AccountDaoImpl extends BaseDaoImpl<Account> implements AccountDao {
    @Override
    public Account getAccount(int accountid) {

        String sql = "select accountid,balance from account where accountid=?";

        return query(sql, accountid);

    }

    @Override
    public void updateAccount(int accoutnID, float amount) {

        String sql = "update account set balance = balance-? where accountid=?";

        update(sql, amount, accoutnID);
    }
}
