package com.wurc.pojo;

public class student {
    private int id;
    private String name;
    private String classNo;

    public student(int id, String name, String classNo) {
        this.id = id;
        this.name = name;
        this.classNo = classNo;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNo='" + classNo + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
