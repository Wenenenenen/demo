package com.example.demo.service;

import com.example.demo.bean.User;

public interface UserService {

    User login(String account, String password);
}
