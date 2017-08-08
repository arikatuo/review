package com.hy.book.test;

import com.hy.book.dao.BaseDao;
import com.hy.book.dao.BookDao;
import com.hy.book.dao.TradeDao;

import com.hy.book.dao.impl.BaseDaoImpl;
import com.hy.book.dao.impl.BookDaoImpl;
import com.hy.book.dao.impl.TradeDaoImpl;

import com.hy.book.db.JDBCUtils;
import com.hy.book.domain.Book;
import com.hy.book.domain.Trade;
import com.hy.book.web.ConnectionContext;
import org.junit.Test;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017/8/8.
 */
public class BaseDaoImplTest {
    private TradeDao tradeDao = new TradeDaoImpl();
    private Trade trade = new Trade();
    private BookDaoImpl bookDaoImpl = new BookDaoImpl();
    private BaseDao baseDao = new BookDaoImpl();
     {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
    }

    @Test
    public void insert() throws Exception {

        String sql = "insert into trade(userid,tradetime) values(?,?) ";
        long id = baseDao.insert(sql, 1, new Date());
        //       long id = bookDaoImpl.insert(sql, 1, new Date());
        System.out.println(id);
    }

    @Test
    public void update() throws Exception {
        String sql = "update trade set tradetime=? where userid=?";
       bookDaoImpl.insert(sql,new Date(),1);
    }

    @Test
    public void query() throws Exception {
         String sql="select * from mybooks where Salesamount=?";
         Book book=bookDaoImpl.query(sql,17);
        System.out.println(book);
    }

    @Test
    public void queryForList() throws Exception {
        String sql="select * from mybooks where Salesamount=?";
        List<Book> books=bookDaoImpl.queryForList(sql,0);
        for(Book b:books){
            System.out.println(b);
        }
    }

    @Test
    public void getSingleVal() throws Exception {
         String sql="select count(userid) from trade where userid=?";
         long i=bookDaoImpl.getSingleVal(sql,1);
        System.out.println(i);

    }

    @Test
    public void batch() throws Exception {

         String sql="update mybooks set Salesamount=?,storenumber=? where id=?";
         bookDaoImpl.batch(sql,new Object[]{1,1,1},new Object[]{2,2,2},new Object[]{3,3,3});

    }

}