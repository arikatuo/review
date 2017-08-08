package com.hy.book.test;

import com.hy.book.dao.TradeDao;
import com.hy.book.dao.impl.TradeDaoImpl;
import com.hy.book.db.JDBCUtils;
import com.hy.book.domain.Trade;
import com.hy.book.web.ConnectionContext;
import org.junit.Test;

import java.sql.Connection;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017/8/8.
 */
public class TradeDaoImplTest {
    private TradeDao tradeDao = new TradeDaoImpl();

    @Test
    public void insert() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        Trade trade = new Trade();
        trade.setTradeTime(new Date());
        trade.setUserId(1);
        tradeDao.insert(trade);
    }

    @Test
    public void getTradeWithUserId() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        Set<Trade> tradeSet = tradeDao.getTradeWithUserId(1);
         Iterator<Trade> trades= tradeSet.iterator();
         while (trades.hasNext()){
             System.out.println(trades.next());
         }
//        for (Trade trade : tradeSet) {
//            System.out.println(trade);
//        }
    }

}