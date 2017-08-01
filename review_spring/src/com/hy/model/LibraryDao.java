package com.hy.model;

/**
 * Created by dell on 2017/8/1.
 */
public interface LibraryDao {
    /**
     * 取得书
     * @param name
     * @return book
     */
    public Book getBook(String name);
    /**
     * 增加书
     * @param book
     */
    public void addBook(Book book);
    /**
     * 删除书
     * @param book
     */
    public void deleteBook(String name);
}
