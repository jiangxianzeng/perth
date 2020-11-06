package com.bianchengshu.service.impl;

import com.bianchengshu.dao.UserDao;
import com.bianchengshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jiangxianzeng on 2018/3/26.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Integer getUserAgeByName(String userName) {

        return userDao.getUserAgeByname(userName);
    }

}
