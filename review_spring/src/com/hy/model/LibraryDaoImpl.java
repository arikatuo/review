package com.hy.model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
/**
 * Created by dell on 2017/8/1.
 */
public class LibraryDaoImpl implements LibraryDao{
    private JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Book getBook(String name) {
        String sql="SELECT * FROM book_table WHERE bookname=?";
        Book mBook = (Book)jdbcTemplate.queryForObject(sql,new Object[]{name},new RowMapper<Object>(){
            @Override
            public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
                Book book=new Book();
                book.setBookId(arg0.getInt("bookid"));
                book.setBookName(arg0.getString("bookname"));
                return book;
            }
        });
        return mBook;
    }

    @Override
    public void addBook(Book book) {
        String sql="INSERT INTO book_table VALUES(?,?)";
        jdbcTemplate.update(sql, book.getBookName(),book.getBookId());
        // jdbcTemplate.update(sql, book.getBookName(),book.getBookId());
    }

    @Override
    public void deleteBook(String name) {
        String sql="DELETE FROM book_table WHERE bookname=?";
        jdbcTemplate.update(sql,name);
    }
}
