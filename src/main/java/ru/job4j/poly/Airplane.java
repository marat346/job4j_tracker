package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("самолет летает по воздуху");
    }

    @Override
    public void number(int value) {
        System.out.println("Номер транспорта" + " " + value);
    }
}
