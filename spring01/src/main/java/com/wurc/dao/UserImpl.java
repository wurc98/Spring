package com.wurc.dao;

public class UserImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("默认获取用户数据");
    }
}
