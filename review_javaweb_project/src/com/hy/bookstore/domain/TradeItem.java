package com.hy.bookstore.domain;

/**
 * Created by sumimasah on 2017/8/5.
 */
public class TradeItem {
    private Integer tradeItemId;

    private Book book;
    private int quantity;

    //todo  bookid干嘛
    private Integer bookId;
    private Integer tradeid;

    public Integer getTradeItemId() {
        return tradeItemId;
    }

    public void setTradeItemId(Integer tradeItemId) {
        this.tradeItemId = tradeItemId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getTradeid() {
        return tradeid;
    }

    public void setTradeid(Integer tradeid) {
        this.tradeid = tradeid;
    }

    @Override
    public String toString() {
        return "TradeItem{" +
                "tradeItemId=" + tradeItemId +
                ", book=" + book +
                ", quantity=" + quantity +
                ", bookId=" + bookId +
                ", tradeid=" + tradeid +
                '}';
    }
}
