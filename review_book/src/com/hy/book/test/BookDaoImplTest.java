package com.hy.book.test;

import com.hy.book.dao.BookDao;
import com.hy.book.dao.impl.BookDaoImpl;
import com.hy.book.db.JDBCUtils;
import com.hy.book.domain.Book;
import com.hy.book.domain.ShoppingCart;
import com.hy.book.domain.ShoppingCartItem;
import com.hy.book.web.ConnectionContext;
import com.hy.book.web.CriteriaBook;
import com.hy.book.web.Page;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017/8/8.
 */
public class BookDaoImplTest {

    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void getBook() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        Book book = bookDao.getBook(1);
        System.out.println(book);
    }

    @Test
    public void getPage() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        CriteriaBook criteriaBook = new CriteriaBook();
        criteriaBook.setMaxPrice(200);
        criteriaBook.setMinPrice(60);
        criteriaBook.setPageNo(2);
        Page<Book> page = bookDao.getPage(criteriaBook);
        List<Book> bookList = page.getList();

        for (Book book : bookList) {
            System.out.println(book);
        }

    }

    @Test
    public void getTotalBookNumber() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        CriteriaBook criteriaBook = new CriteriaBook();
        criteriaBook.setMaxPrice(200);
        criteriaBook.setMinPrice(60);
        criteriaBook.setPageNo(2);
        long i = bookDao.getTotalBookNumber(criteriaBook);
        System.out.println(i);
    }

    @Test
    public void getPageList() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        CriteriaBook criteriaBook = new CriteriaBook();
        criteriaBook.setMaxPrice(200);
        criteriaBook.setMinPrice(60);
        criteriaBook.setPageNo(2);
        List<Book> bookList = bookDao.getPageList(criteriaBook, 10);

        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Test
    public void getStoreNumber() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        System.out.println(bookDao.getStoreNumber(6));
    }

    @Test
    public void batchUpdateStoreNumberAndSalesAmount() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        ConnectionContext.getInstance().bind(connection);
        Collection<ShoppingCartItem> sci = new ArrayList<>();

        Book book=bookDao.getBook(1);
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem(book);
        shoppingCartItem.setQuantity(10);
        sci.add(shoppingCartItem);

        book=bookDao.getBook(2);
        shoppingCartItem=new ShoppingCartItem(book);
        shoppingCartItem.setQuantity(9);
        sci.add(shoppingCartItem);

        book=bookDao.getBook(3);
        shoppingCartItem=new ShoppingCartItem(book);
        shoppingCartItem.setQuantity(8);
        sci.add(shoppingCartItem);

        bookDao.batchUpdateStoreNumberAndSalesAmount(sci);


    }

}