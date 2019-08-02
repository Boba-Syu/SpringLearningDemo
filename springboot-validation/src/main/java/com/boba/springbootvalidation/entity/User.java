package com.boba.springbootvalidation.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class User {
    @NotEmpty(message = "用户名不能为空") //非空
    private String uname;
    @NotEmpty(message = "用户密码不能为空")
    @Length(max = 16, min = 6, message = "密码朝那个度应在{min}和{max}之间")
    private String pwd;

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
                "uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
