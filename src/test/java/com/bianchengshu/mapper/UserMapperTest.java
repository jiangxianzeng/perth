package com.bianchengshu.mapper;

import com.bianchengshu.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.AssertionErrors;

import java.util.List;

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
        AssertionErrors.assertEquals("", 10, userModel.getAge());
    }

    @Test
    public void testGetAll() {
        List<UserModel> userModels = userMapper.getAll();
        //AssertionErrors.assertEquals("", 2, userModels.size());
    }

    @Test
    public void testInsertUser() {
        UserModel userModel = new UserModel();
        userModel.setName("456");
        userModel.setNickName("Hi");
        userModel.setAge(10);
        userModel.setSalary(4000);
        Integer i = userMapper.insertUser(userModel);

        UserModel user = userMapper.getOne(2L);

        AssertionErrors.assertEquals("", 11, user.getAge());
    }

    @Test
    public void testUpdateUserById() {
        UserModel userModel = new UserModel();
        userModel.setId(2);
        userModel.setName("456");
        userModel.setNickName("Hi-1");
        userModel.setAge(11);
        userModel.setSalary(4001);

        userMapper.updateUserById(userModel);

    }

    @Test
    public void testDeleteUserById() {
        userMapper.deleteUserById(4L);
    }

}
