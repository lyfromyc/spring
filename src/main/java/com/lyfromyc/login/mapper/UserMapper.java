package com.lyfromyc.login.mapper;

import com.lyfromyc.login.model.User;

public interface UserMapper {
    int add(User user);
    User findOne(User user);
}
