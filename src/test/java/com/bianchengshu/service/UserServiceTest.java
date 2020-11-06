package com.bianchengshu.service;

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
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserAgeByname() {
        Integer userAge = userService.getUserAgeByName("123");

        AssertionErrors.assertEquals("", 10, userAge);
    }
}
