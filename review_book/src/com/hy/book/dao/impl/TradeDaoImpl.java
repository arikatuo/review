package com.hy.book.dao.impl;

import com.hy.book.dao.BaseDao;
import com.hy.book.dao.TradeDao;
import com.hy.book.domain.Trade;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dell on 2017/8/7.
 */
public class TradeDaoImpl extends BaseDaoImpl<Trade> implements TradeDao {
    @Override
    public void insert(Trade trade) {
        String sql = "insert into trade(userid,tradetime) values" + "(?,?)";

        long tradeid = insert(sql, trade.getUserId(), trade.getTradeTime());

        trade.setTradeId((int) tradeid);
    }

    @Override
    public Set<Trade> getTradeWithUserId(int userId) {
        String sql = "select tradeid,userid,tradetime from trade where userid=? order by tradetime desc ";
        return new HashSet<>(queryForList(sql, userId));
    }
}
