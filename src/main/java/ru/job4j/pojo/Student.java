package ru.job4j.pojo;

public class Student {
    private String name;
    private String group;
    private String dateEntrance;

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup(String group) {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateEntrance(String dateEntrance) {
        return dateEntrance;
    }

    public void setDateEntrance(String dateEntrance) {
        this.dateEntrance = dateEntrance;
    }
}
