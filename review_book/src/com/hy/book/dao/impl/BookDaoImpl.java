package com.hy.book.dao.impl;

import com.hy.book.dao.BaseDao;
import com.hy.book.dao.BookDao;
import com.hy.book.domain.Book;
import com.hy.book.domain.ShoppingCartItem;
import com.hy.book.web.CriteriaBook;
import com.hy.book.web.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dell on 2017/8/7.
 */
public class BookDaoImpl extends BaseDaoImpl<Book> implements BookDao {

    @Override
    public Book getBook(int id) {
        String sql = "SELECT id, author, title, price, publishingDate, " +
                "salesAmount, storeNumber, remark FROM mybooks WHERE id = ?";
        return query(sql, id);
    }

    @Override
    public Page<Book> getPage(CriteriaBook cb) {
        Page<Book> bookPage = new Page<>(cb.getPageNo());
        bookPage.setTotalItemNumber(getTotalBookNumber(cb));

        //todo  默认是3？
        bookPage.setList(getPageList(cb, 3));

        return bookPage;
    }

    @Override
    public long getTotalBookNumber(CriteriaBook cb) {
        String sql = "SELECT count(id) FROM mybooks WHERE price >= ? AND price <= ?";
        return getSingleVal(sql, cb.getMinPrice(), cb.getMaxPrice());
    }

    @Override
    public List<Book> getPageList(CriteriaBook cb, int pageSize) {
        String sql = "SELECT id, author, title, price, publishingDate, " +
                "salesAmount, storeNumber, remark FROM mybooks " +
                "WHERE price >= ? AND price <= ? " +
                "LIMIT ?, ?";
        return queryForList(sql, cb.getMinPrice(), cb.getMaxPrice(),
                (cb.getPageNo() - 1) * pageSize, pageSize);
    }

    @Override
    public int getStoreNumber(int bookId) {
        String sql = "SELECT storeNumber FROM mybooks WHERE id =?";
        return getSingleVal(sql, bookId);
    }

    @Override
    public void batchUpdateStoreNumberAndSalesAmount(Collection<ShoppingCartItem> items) {
        String sql = "UPDATE mybooks SET salesAmount = salesAmount + ?, " +
                "storeNumber = storeNumber - ? " +
                "WHERE id = ?";
        Object[][] params = null;
        params = new Object[items.size()][3];
        List<ShoppingCartItem> scis = new ArrayList<>(items);
        for (int i = 0; i < items.size(); i++) {
            params[i][0] = scis.get(i).getQuantity();
            params[i][1] = scis.get(i).getQuantity();
            params[i][2] = scis.get(i).getBook().getId();
        }
        batch(sql, params);
    }
}

