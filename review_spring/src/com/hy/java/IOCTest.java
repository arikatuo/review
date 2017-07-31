package com.hy.java;

import com.hy.model.User;
import com.hy.model.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sumimasah on 2017/7/31.
 */
public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) applicationContext.getBean("userService");
        User user1 = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        user1.setName("小明");
        user1.setSex("男");
        user1.setAge(22);

        user2.setName("小红");
        user2.setSex("女");
        user2.setAge(18);

        service.add(user1);
        service.add(user2);
    }

}
