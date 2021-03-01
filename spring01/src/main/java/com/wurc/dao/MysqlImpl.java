package com.wurc.dao;

public class MysqlImpl implements UserDao{
    @Override
    public void getUser(){
        System.out.println("Mysql获取数据");
    }
}
