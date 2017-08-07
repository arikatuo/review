package com.hy.book.dao;

import com.hy.book.domain.TradeItem;

import java.util.Collection;
import java.util.Set;

/**
 * Created by dell on 2017/8/7.
 */
public interface TradeItemDao {

    void batchSave(Collection<TradeItem> tradeItems);

    Set<TradeItem> getTradeItemsWithTradeId(int tradeId);
}
