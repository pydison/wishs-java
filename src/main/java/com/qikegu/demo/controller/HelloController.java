package com.qikegu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import com.qikegu.demo.domain.Miao;


@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value="/query/{id}", method=RequestMethod.GET)
    public String query(@PathVariable String id) {
        String sql = "SELECT logname FROM loginfo WHERE id = ?";
        String logname = jdbcTemplate.queryForObject(sql, new Object[] {id}, String.class);
        return logname;
    }
    @RequestMapping(value="/queryall", method=RequestMethod.GET)
    public List<Map<String, Object>> queryall() {
        String sql = "SELECT id,logtitle,logname,logip from loginfo";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }

    @RequestMapping(value="/showuser/{id}", method=RequestMethod.GET)
    public Miao showuser(@PathVariable String id) {
        String sql = "SELECT id,logtitle,logname,logip FROM loginfo WHERE id = ?";
        RowMapper<Miao> rowMapper = new BeanPropertyRowMapper<>(Miao.class);
        Miao user = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return user;
    }

    @RequestMapping(value="/erweishuzu", method=RequestMethod.GET)
    public int[][] erweishuzu() {
        int a[][]={{2,1,3,6,9},{27,18,34}};
        return a;
    }
    @RequestMapping(value="/shuzu", method=RequestMethod.GET)
    public String[] shuzu() {
        String ss[] = {"a","b"};
        return ss;
    }
}