package com.qikegu.demo.service;

import com.qikegu.demo.repository.WishMapper;
import com.qikegu.demo.model.Wish;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("wishService")
public class WishServiceImpl implements WishService {

    @Resource
    private WishMapper wishsMapper;

    @Override
    public Wish getWishById(long wishId){
        return wishsMapper.selectByPrimaryKey((int)wishId);
    }
}
