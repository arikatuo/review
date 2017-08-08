package com.hy.book.test;

import com.hy.book.dao.TradeItemDao;
import com.hy.book.dao.impl.TradeItemDaoImpl;
import com.hy.book.db.JDBCUtils;
import com.hy.book.domain.TradeItem;
import com.hy.book.web.ConnectionContext;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017/8/8.
 */
public class TradeItemDaoImplTest {
    private TradeItemDao tradeItemDao = new TradeItemDaoImpl();

    @Test
    public void batchSave() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        Collection<TradeItem> tradeItems = new ArrayList<>();

        TradeItem tradeItem = new TradeItem();
//        对象引用，指向地址，每次更新
//        tradeItem.setTradeId(12);
//        tradeItem.setQuantity(2);
//        tradeItem.setBookId(1);
//        tradeItems.add(tradeItem);
//
//        tradeItem.setTradeId(11);
//        tradeItem.setQuantity(4);
//        tradeItem.setBookId(2);
//        tradeItems.add(tradeItem);
//
//
//        tradeItem.setTradeId(13);
//        tradeItem.setQuantity(5);
//        tradeItem.setBookId(6);
//        tradeItems.add(tradeItem);
//        for (TradeItem tradeItem1 : tradeItems) {
//            System.out.println(tradeItem1);
//        }

        tradeItems.add(new TradeItem(2, 3, 10, 12));
        tradeItems.add(new TradeItem(2, 4, 10, 12));
        tradeItems.add(new TradeItem(2, 5, 10, 13));
        tradeItems.add(new TradeItem(2, 6, 10, 15));

        tradeItemDao.batchSave(tradeItems);
    }

    @Test
    public void getTradeItemsWithTradeId() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        Set<TradeItem> tradeItemSet = tradeItemDao.getTradeItemsWithTradeId(13);
        for (TradeItem tradeItem : tradeItemSet) {
            System.out.println(tradeItem);
        }
    }

}