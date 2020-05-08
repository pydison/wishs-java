package com.qikegu.demo.service;

import com.qikegu.demo.model.Log;
import com.qikegu.demo.repository.LogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("logService")
public class LogServiceImpl implements LogService{
    @Resource
    private LogMapper logMapper;

    public Log getLogById(int id){
        return logMapper.selectByPrimaryKey(id);
    }
}
