package com.hhc.entity;

public class User {
    //power代表登陆方式：老师（0）或学生（1）
    private String username,password,power;

    public User() {
    }

    public User(String username, String password, String power) {
        this.username = username;
        this.password = password;
        this.power = power;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
