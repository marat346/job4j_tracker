package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("Скоро приедет");
    }

    @Override
    public void passengers(int value) {
        System.out.println("Количество пассажиров" + " " + value);
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 45;
    }

    public static void main(String[] args) {
        Transport tot = new Bus();
        tot.ride();
        tot.passengers(10);
        System.out.println(tot.refuel(15));
    }
}
