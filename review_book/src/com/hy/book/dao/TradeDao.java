package com.hy.book.dao;

import com.hy.book.domain.Trade;

import java.util.Set;

/**
 * Created by dell on 2017/8/7.
 */
public interface TradeDao {

    void insert(Trade trade);

    Set<Trade> getTradeWithUserId(int userId);
}
