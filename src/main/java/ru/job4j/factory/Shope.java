package ru.job4j.factory;

public class Shope {
    public static void main(String[] args) {
        CarsFactory factory = new FordFactory();
        factory.createSedan();
    }
}
