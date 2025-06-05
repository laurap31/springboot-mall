package com.laurapeng.springbootmall.service;

import com.laurapeng.springbootmall.dto.UserRegisterRequest;
import com.laurapeng.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
