package com.qikegu.demo.model;

import java.util.Date;

public class Log {
    private Integer id;

    private Date moment;

    private String content;

    public Log(Integer id, Date moment, String content) {
        this.id = id;
        this.moment = moment;
        this.content = content;
    }

    public Log() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}