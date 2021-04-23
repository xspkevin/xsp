package com.xsp.amazon.backend.service;

import com.xsp.amazon.backend.domain.User;

import java.util.List;

/**
 * @author: Xu Shengping
 * @date: 2021/4/23
 */
public interface UserService {
    List<User> findAll();
}
