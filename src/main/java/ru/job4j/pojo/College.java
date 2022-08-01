package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Makar Ivanov");
        student.setGroup("2");
        student.setDateEntrance("14.05.2022");
        System.out.println(student.getName("Makar Ivanov") + "\t" + "learn in" + "\t" + student.getGroup("2") + "\t" + "enrolled" + "\t" + student.getDateEntrance("14.05.2022"));
    }
}