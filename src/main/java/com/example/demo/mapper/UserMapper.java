package com.example.demo.mapper;

import com.example.demo.bean.User;

public interface UserMapper {

    User login(String account, String password);
}
