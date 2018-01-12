package com.bianchengshu.rest.mapper;

import com.bianchengshu.rest.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by jiangxianzeng on 18/1/11.
 */

@Component
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM t_user WHERE name = #{name}")
    UserModel findByName(@Param("name") String name);
}
