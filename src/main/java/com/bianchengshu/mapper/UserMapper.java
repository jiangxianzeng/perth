package com.bianchengshu.mapper;

import com.bianchengshu.model.UserModel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jiangxianzeng on 18/1/11.
 */

@Component
@Mapper
public interface UserMapper {

    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    @Select("SELECT * FROM t_user WHERE name = #{name}")
    UserModel findByName(@Param("name") String name);

    /*
    注解的方式访问数据库
    */

    /*
    @Select("SELECT * FROM t_user")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserModel> getAll();


    @Insert("INSERT INTO t_user(name,age,nick_name) VALUES(#{name}, #{age}, #{nickName})")
    void insert(UserModel user);

    @Update("UPDATE t_user SET name=#{name},nick_name=#{nickName} WHERE id =#{id}")
    void update(UserModel user);

    @Delete("DELETE FROM t_user WHERE id =#{id}")
    void delete(Long id);
    */

    /*XML的方式访问数据库*/
    List<UserModel> getAll();

    UserModel getOne(@Param("id") Long id);

    Integer insertUser(UserModel userModel);

    Integer updateUserById(UserModel userModel);

    Integer deleteUserById(@Param("id") Long id);
}
