package com.laurapeng.springbootmall.service.impl;

import com.laurapeng.springbootmall.dao.UserDao;
import com.laurapeng.springbootmall.dto.UserRegisterRequest;
import com.laurapeng.springbootmall.model.User;
import com.laurapeng.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
