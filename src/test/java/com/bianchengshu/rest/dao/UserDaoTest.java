package com.bianchengshu.rest.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.AssertionErrors;

/**
 * Created by jiangxianzeng on 18/1/12.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetUserAgeByName() {
        Integer userAge = userDao.getUserAgeByname("123");
        AssertionErrors.assertEquals("test user age = 10", 11, userAge);
    }
}
