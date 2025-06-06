package com.laurapeng.springbootmall.dao;

import com.laurapeng.springbootmall.dto.UserRegisterRequest;
import com.laurapeng.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
