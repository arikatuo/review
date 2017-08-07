package com.hy.book.dao;

import com.hy.book.domain.Book;
import com.hy.book.domain.ShoppingCartItem;
import com.hy.book.web.CriteriaBook;
import com.hy.book.web.Page;

import java.util.Collection;
import java.util.List;

/**
 * Created by dell on 2017/8/7.
 */
public interface BookDao {
    Book getBook(int id);

    Page<Book> getPage(CriteriaBook cb);

    long getTotalBookNumber(CriteriaBook cb);

    List<Book> getPageList(CriteriaBook cb, int pageSize);

    int getStoreNumber(int bookId);

    public abstract void batchUpdateStoreNumberAndSalesAmount(
            Collection<ShoppingCartItem> items);
}
