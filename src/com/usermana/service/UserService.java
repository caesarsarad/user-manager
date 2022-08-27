package com.usermana.service;


import com.usermana.dao.UserDao;
import com.usermana.entity.User;

public class UserService {
    public void register(User user){
        UserDao userDao = new UserDao();
        userDao.save(user);
    }
}
