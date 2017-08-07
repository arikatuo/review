package com.hy.book.dao.impl;

import com.hy.book.dao.TradeItemDao;
import com.hy.book.domain.TradeItem;

import java.util.*;

/**
 * Created by dell on 2017/8/7.
 */
public class TradeItemDaoImpl  extends BaseDaoImpl<TradeItem> implements TradeItemDao {

    @Override
    public void batchSave(Collection<TradeItem> items) {
        String sql = "INSERT INTO tradeitem(bookid, quantity, tradeid) " +
                "VALUES(?,?,?)";
        Object [][] params = new Object[items.size()][3];

        List<TradeItem> tradeItems = new ArrayList<>(items);
        for(int i = 0; i < tradeItems.size(); i++){
            params[i][0] = tradeItems.get(i).getBookId();
            params[i][1] = tradeItems.get(i).getQuantity();
            params[i][2] = tradeItems.get(i).getTradeId();
        }

        batch(sql, params);
    }

    @Override
    public Set<TradeItem> getTradeItemsWithTradeId(int tradeId) {
        String sql = "SELECT itemId tradeItemId, bookId, " +
                "quantity, tradeId FROM tradeitem WHERE tradeid = ?";
        return new HashSet<>(queryForList(sql, tradeId));
    }
}
