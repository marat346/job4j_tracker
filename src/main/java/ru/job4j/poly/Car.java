package ru.job4j.poly;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("машина двигается по скоростным трассам");
    }

    @Override
    public void number(int value) {
        System.out.println("Номер транспорта" + " " + value);
    }
}
