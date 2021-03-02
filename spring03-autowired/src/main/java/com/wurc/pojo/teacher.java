package com.wurc.pojo;

public class teacher {
    private int id;
    private String name;
    private String project;


    public teacher() {
    }

    public teacher(int id, String name, String project) {
        this.id = id;
        this.name = name;
        this.project = project;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", project='" + project + '\'' +
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

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
