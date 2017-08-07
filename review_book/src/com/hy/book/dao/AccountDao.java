package com.hy.book.dao;

import com.hy.book.domain.Account;

/**
 * Created by dell on 2017/8/7.
 */
public interface AccountDao {
    Account getAccount(int accountId);

    void updateAccount(int accountID, float amount);
}
