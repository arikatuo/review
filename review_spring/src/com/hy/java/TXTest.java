package com.hy.java;

import com.hy.model.Book;
import com.hy.model.LibraryDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2017/8/1.
 */
public class TXTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Book book1 = new Book("西游记", 1);
        Book book2 = new Book("红楼梦", 2);
        Book book3 = new Book("金瓶梅", 3);
        Book book4 = new Book("三国演义", 4);
        Book book5 = new Book("水浒传", 5);
        LibraryDao libraryDaoImpl = (LibraryDao) ctx.getBean("libraryFactory");
        libraryDaoImpl.addBook(book1);
        System.out.println(libraryDaoImpl.getBook("西游记"));

    }
}
