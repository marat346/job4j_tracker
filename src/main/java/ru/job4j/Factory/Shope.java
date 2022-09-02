package ru.job4j.Factory;

public class Shope {
    public static void main(String[] args) {
        CarsFactory factory;
        factory = new ToyotaFactory();
        factory.createSedan();
    }
}
