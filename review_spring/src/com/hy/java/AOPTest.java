package com.hy.java;

import com.hy.model.BabyPerson;
import com.hy.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2017/8/1.
 */
public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person babyPerson=(Person)context.getBean("babyPerson");
        babyPerson.eatBreakfast();
        babyPerson.eatLunch();
        babyPerson.eatSupper();
    }
}
