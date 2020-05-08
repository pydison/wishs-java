package com.qikegu.demo.model;

public class Wish {
    private Integer id;

    private Integer uid;

    private Integer big;

    private Integer small;

    public Wish(Integer id, Integer uid, Integer big, Integer small) {
        this.id = id;
        this.uid = uid;
        this.big = big;
        this.small = small;
    }

    public Wish() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBig() {
        return big;
    }

    public void setBig(Integer big) {
        this.big = big;
    }

    public Integer getSmall() {
        return small;
    }

    public void setSmall(Integer small) {
        this.small = small;
    }
}