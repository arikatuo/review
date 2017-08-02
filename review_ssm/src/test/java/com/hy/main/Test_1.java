package com.hy.main;

import com.hy.test2.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2017/8/2.
 */
public class Test_1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A) applicationContext.getBean("a");
        System.out.println("-----------------");
        System.out.println(a.getB().getB());
        System.out.println(a.getC().getC());
    }
}
