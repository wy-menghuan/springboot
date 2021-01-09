package com.atguigu.mapper;

import com.atguigu.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {

    public List<User> findAll();

    void add(User user);

    User findOne(int id);

    void update(User user);

    void deleteUserById(User user);

}
