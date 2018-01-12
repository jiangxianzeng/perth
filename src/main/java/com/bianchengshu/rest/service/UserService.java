package com.bianchengshu.rest.service;

import com.bianchengshu.rest.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jiangxianzeng on 18/1/12.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Integer getUserAgeByName(String userName) {

        return userDao.getUserAgeByname(userName);
    }
}
