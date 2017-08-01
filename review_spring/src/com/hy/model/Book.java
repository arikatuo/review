package com.hy.model;

/**
 * Created by dell on 2017/8/1.
 */
public class Book {
    private String bookName;
    private int bookId;

    public Book(String bookName, int bookId) {
        super();
        this.bookName = bookName;
        this.bookId = bookId;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", bookId=" + bookId + "]";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
