package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("самолет летает по воздуху");
    }

    @Override
    public void number(int value, int value1, int value2) {
        System.out.println("Номер транспорта" + " " + value1);
    }
}
