package com.hy.book.service;

import com.hy.book.dao.*;
import com.hy.book.dao.impl.*;
import com.hy.book.domain.*;
import com.hy.book.web.CriteriaBook;
import com.hy.book.web.Page;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by dell on 2017/8/7.
 */
public class BookService {
    private BookDao bookDao = new BookDaoImpl();
    private AccountDao accountDao = new AccountDaoImpl();
    private TradeDao tradeDao = new TradeDaoImpl();
    private TradeItemDao tradeItemDao = new TradeItemDaoImpl();
    private UserDao userDao = new UserDaoImpl();

    public Book getBook(int id) {
        return bookDao.getBook(id);
    }

    public Page<Book> getBookPage(CriteriaBook cb) {
        return bookDao.getPage(cb);
    }

    public boolean addToChar(int bookId, ShoppingCart shoppingCart) {
        Book book = bookDao.getBook(bookId);
        if (book != null) {
            shoppingCart.addBook(book);
            return true;
        }
        return false;
    }

    public void removeItemFromShopppingChar(ShoppingCart shoppingCart, int id) {
        shoppingCart.removeItem(id);
    }

    public void clearCart(ShoppingCart shoppingCart) {
        shoppingCart.clear();
    }

    public void updateBookQuantity(ShoppingCart shoppingCart, int bookId, int quantity) {
        shoppingCart.updateBookItemQuantity(bookId, quantity);
    }

    public void cash(ShoppingCart shoppingCart, String userName, int accountId) {

        bookDao.batchUpdateStoreNumberAndSalesAmount(shoppingCart.getItems());

        accountDao.updateAccount(accountId, shoppingCart.getTotalMoney());

        Trade trade = new Trade();
        trade.setTradeTime(new Date());
        trade.setUserId(userDao.getUser(userName).getUserId());
        tradeDao.insert(trade);

        Collection<TradeItem> items = new HashSet<>();
        for (ShoppingCartItem shoppingCartItem : shoppingCart.getItems()) {
            TradeItem tradeItem = new TradeItem();
            tradeItem.setBookId(shoppingCartItem.getBook().getId());
            tradeItem.setQuantity(shoppingCartItem.getQuantity());
            tradeItem.setTradeId(trade.getTradeId());
            items.add(tradeItem);
        }
        tradeItemDao.batchSave(items);
        shoppingCart.clear();
    }


}
