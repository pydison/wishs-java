package com.qikegu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import com.qikegu.demo.domain.Miao;


@RestController
public class MiaoController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value="/insert", method=RequestMethod.POST)
    public boolean insert(@RequestBody Miao miao) {
        String content = miao.getContent();
        String sql1 = "INSERT INTO logs (moment, content) VALUES (now(), ?);";
        int uid = miao.getUid();
        String wishtype = miao.getWishtype();
        int changenum = miao.getChangenum();
        String sql2 = String.format("UPDATE wishs set %s = %s + ? WHERE uid = ?;",wishtype,wishtype);

        return jdbcTemplate.update(sql1,content) > 0 & jdbcTemplate.update(sql2,changenum,uid) > 0;
    }
    @RequestMapping(value="/querylogs", method=RequestMethod.GET)
    public List<Map<String, Object>> querylogs() {
        String sql = "SELECT moment,content from logs order by moment desc limit 10";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);
        System.out.println(results);
        return results;
    }
    @RequestMapping(value="/querywishs", method=RequestMethod.GET)
    public List<Map<String, Object>> querywishs() {
        String sql = " select users.name,wishs.big,wishs.small from wishs left join users on wishs.uid = users.id;";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
}