package com.qikegu.demo.domain;

public class Wish {

    private int uid;
    private String wishtype;
    private String content;
    private int changenum;
    private String sql;


    public int getUid(){
        return uid;
    }
    public String getWishtype(){
        return wishtype;
    }
    public String getContent(){
        return content;
    }
    public int getChangenum(){return changenum;}
    public String getSql(){return sql;}



    public void setUid(int uid){
        this.uid = uid;
    }
    public void setWishtype(String wishtype){
        this.wishtype = wishtype;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setChangenum(int changenum){
        this.changenum = changenum;
    }
    public void setSql(String sql){
        this.sql=sql;
    }
}
