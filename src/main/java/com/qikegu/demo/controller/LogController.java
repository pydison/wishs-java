package com.qikegu.demo.controller;

import com.qikegu.demo.model.Log;
import com.qikegu.demo.service.LogService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/log")
public class LogController {
    @Resource
    private LogService logService;

    @RequestMapping(value="{id}", method= RequestMethod.GET, produces="application/json")
    public Log getLog(@PathVariable int id){
        Log log = logService.getLogById(id);
        return log;
    }
}
