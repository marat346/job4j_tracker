package ru.job4j.factory;

public class FordSedan implements Sedan {
    public FordSedan() {
        System.out.println("Create FordSedan");
    }

    @Override
    public void star() {
        System.out.println("cтарт");
    }
}
