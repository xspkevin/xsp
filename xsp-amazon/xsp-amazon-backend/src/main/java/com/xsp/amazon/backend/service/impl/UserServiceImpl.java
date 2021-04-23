package com.xsp.amazon.backend.service.impl;

import com.xsp.amazon.backend.mapper.UserMapper;
import com.xsp.amazon.backend.domain.User;
import com.xsp.amazon.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Xu Shengping
 * @date: 2021/4/23
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
