package com.xsp.amazon.backend.mapper;

import com.xsp.amazon.backend.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    User findUserById(Integer id);

    List<User> findUser(@Param("username") String username, @Param("age") Integer age);

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(Integer id);

    void deleteUserByIds(String ids);

    List<User> findUserByIds(@Param("ids") Integer[] ids);

    List<User> choseUser(User user);
}
