package com.hy.controller;

import com.hy.dao.UserDao;
import com.hy.dao.impl.UserDaoImpl;
import com.hy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by sumimasah on 2017/8/1.
 */
@Controller
public class MyController {
    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/queryById/{id}")
    public String queryById(@PathVariable("id") int id, ModelMap modelMap) {
        User user=userDao.queryById(id);
        modelMap.addAttribute("user",user);
        return "queryById";
    }
}
