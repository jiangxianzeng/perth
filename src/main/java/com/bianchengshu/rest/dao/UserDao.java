package com.bianchengshu.rest.dao;

import com.bianchengshu.rest.model.UserModel;
import com.bianchengshu.rest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by jiangxianzeng on 18/1/11.
 */

@Repository
public class UserDao extends BaseDao {

    @Autowired
    private UserMapper userMapper;

    public Integer getUserAgeByname(String userName) {

        UserModel userModel = userMapper.findByName(userName);

        return userModel.getAge();
    }

}
