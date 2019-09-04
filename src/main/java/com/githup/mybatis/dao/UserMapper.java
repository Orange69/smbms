package com.githup.mybatis.dao;

import com.githup.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /*
    * 查询所有用户
    * */
    List<User> findUser();
/*
* 根据用户姓名进行查询用户信息
* */
    User findUserByUserName(String name);
      /*
      * 根据角色id和用户名进行查询用户
      * */
    User findUserByUserNameAndUserRole(User user);
    /*
    * 根据map集合来查询用用户信息
    * */
    User findUserByMap(Map<String, Object> map);

   /*
   * 使用注解就可以将参数注入到UserMapper的文件里面
   * 根据姓名和id查询用户信息
   * */
    User findUserByUserNameAndUserRole1(@Param("userName")String name ,@Param("userRole")int role );
}
