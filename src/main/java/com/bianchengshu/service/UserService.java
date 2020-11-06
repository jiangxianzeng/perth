package com.bianchengshu.service;

import org.springframework.stereotype.Service;

/**
 * Created by jiangxianzeng on 18/1/12.
 */

@Service
public interface UserService {

    public Integer getUserAgeByName(String userName);
}
