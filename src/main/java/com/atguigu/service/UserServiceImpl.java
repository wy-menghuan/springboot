package com.atguigu.service;

import com.atguigu.domain.User;
import com.atguigu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User findOne(int id) {
        return userMapper.findOne(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);

    }

    @Override
    public void deleteUserById(User user) {
        userMapper.deleteUserById(user);
    }

}
