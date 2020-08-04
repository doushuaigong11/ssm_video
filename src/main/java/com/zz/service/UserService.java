package com.zz.service;

import com.zz.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    int deleteById(Integer id);

    void updateById(User user);

    int addUser(User user);

    int deleteByIds(Integer[] ids);

}
