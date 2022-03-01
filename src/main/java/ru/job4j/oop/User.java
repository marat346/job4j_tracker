package ru.job4j.oop;

public class User {

    private String name;// поле объекта //

    private int age;// поле объекта //

    public boolean canDrive() {
        boolean can = false; // локальная переменная//
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}

