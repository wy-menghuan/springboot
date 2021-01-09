package com.atguigu.service;

import com.atguigu.domain.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    void add(User user);

    User findOne(int id);

    void update(User user);

    void deleteUserById(User user);
}
