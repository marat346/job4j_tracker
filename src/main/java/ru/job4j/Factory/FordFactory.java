package ru.job4j.Factory;

public class FordFactory implements CarsFactory{
    @Override
    public Sedan createSedan(){
        return null;
    }

    @Override
    public Coupe createCoupe(){
        return new FordCoupe();
    }
}
