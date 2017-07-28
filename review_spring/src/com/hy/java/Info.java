package com.hy.java;

/**
 * Created by dell on 2017/7/27.
 */
import com.hy.model.School;
import com.hy.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Info {

//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = (Student) applicationContext.getBean("stu1");
//        student.printInfo();
//    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("stu1");
        student.printInfo();
        Student moniter = (Student) applicationContext.getBean("moniter");
        moniter.printInfo();
        School school=(School) applicationContext.getBean("school");
        school.printSchool();
    }

}
