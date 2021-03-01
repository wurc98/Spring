package com.wurc.service;

import com.wurc.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Override
    public void getUser() {
        userDao.getUser();
    }
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
}
