package com.boba.springbootmybatis.entity;

public class User {
    private int uid;
    private String uname;
    private  String pwd;

    public User() {
    }

    public User(int uid, String uname, String pwd) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }

    public int getId() {
        return uid;
    }

    public void setId(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
