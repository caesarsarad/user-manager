package com.usermana.entity;

public class User {
    private int userId;
    private String userName;
    private String userPass;
    private int dept_id;
    private String profile;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.userPass = passWord;
    }

    public String getPassWord() {
        return userPass;
    }

    public void setPassWord(String passWord) {
        this.userPass = passWord;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
