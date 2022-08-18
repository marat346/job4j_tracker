package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("поезд передвигается по рельсам");
    }

    @Override
    public void number(int value2) {
        System.out.println("Номер транспорта" + " " + value2);
    }

    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle car = new Car();
        Vehicle airplane = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{train, car, airplane};
        for (Vehicle a : vehicles) {
            a.move();
            a.number(1234);
        }
    }
}
