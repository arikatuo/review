package com.hy.java;
import com.hy.model.PersonService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2017/7/31.
 */
public class PersonServiceTest {
    public static void main(String[] args) {

        AbstractApplicationContext  context =new  ClassPathXmlApplicationContext("applicationContext.xml");

        PersonService person = (PersonService)context.getBean("personService");

        person.setMessage("hello  spring");

        PersonService  person_new = (PersonService)context.getBean("personService");

        System.out.println(person.getMessage());
        System.out.println(person_new.getMessage());


        context.registerShutdownHook();


    }
}
