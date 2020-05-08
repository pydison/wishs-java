package com.qikegu.demo.service;

import javax.annotation.Resource;

import com.qikegu.demo.model.User;
import com.qikegu.demo.repository.UserMapper;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;


import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    // 注入mapper类
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(long userId) {
        return userMapper.selectByPrimaryKey((int) userId);
    }

    @Override
    public List<User> listUser(int page, int pageSize) {
        List<User> result = null;
        try {
            // 调用pagehelper分页，采用starPage方式。starPage应放在Mapper查询函数之前
            PageHelper.startPage(page, pageSize); //每页的大小为pageSize，查询第page页的结果
            PageHelper.orderBy("id ASC "); //进行分页结果的排序
            result = userMapper.selectUser();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
