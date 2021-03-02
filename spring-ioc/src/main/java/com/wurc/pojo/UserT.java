package com.wurc.pojo;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT的无参构造");
    }

    public UserT(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
