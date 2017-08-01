package com.hy.model;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sumimasah on 2017/7/31.
 */
@Service
public class UserService {

    @Resource(name = "userDao",type = UserDao.class)
    private UserDao userDao;


//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void add(User user){
        userDao.add(user);
    }

}
