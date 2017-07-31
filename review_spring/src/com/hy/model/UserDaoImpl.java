package com.hy.model;

import org.springframework.stereotype.Controller;

/**
 * Created by sumimasah on 2017/7/31.
 */
@Controller("userDao")
public class UserDaoImpl  implements UserDao{

    @Override
    public void add(User user) {
        System.out.println(user.getAge());
        System.out.println(user.getName());
        System.out.println(user.getSex());
    }
}
