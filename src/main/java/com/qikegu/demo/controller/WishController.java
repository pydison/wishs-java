package com.qikegu.demo.controller;


import com.qikegu.demo.model.Wish;
import com.qikegu.demo.service.WishService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/wish")
public class WishController {
    @Resource
    private WishService wishService;

    @RequestMapping(value="{id}", method= RequestMethod.GET, produces="application/json")
    public Wish getWish(@PathVariable long id) throws  Exception{
        Wish wish = this.wishService.getWishById(id);
        return wish;
    };
}
