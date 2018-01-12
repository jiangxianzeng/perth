package com.bianchengshu.rest.mapper;

import com.bianchengshu.rest.model.UserModel;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jiangxianzeng on 18/1/12.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindByName(){
        UserModel userModel = userMapper.findByName("123");
        Assert.assertEquals(11, userModel.getAge());
    }

}
