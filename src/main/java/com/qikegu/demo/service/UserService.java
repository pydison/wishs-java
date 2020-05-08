package com.qikegu.demo.service;

import com.qikegu.demo.model.User;

import java.util.List;

public interface UserService {

    public User getUserById(long userId);

    List<User> listUser(int page, int pageSize);
}
