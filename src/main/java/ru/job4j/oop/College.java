package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman bob = new Freshman();
        Student one = bob;
        Object obj = bob;
        System.out.println(new Freshman());
        System.out.println(new Student());
        System.out.println(new Object());
    }
}
