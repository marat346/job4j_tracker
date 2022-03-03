package ru.job4j.oop;

public class ComputerOverload {

    private boolean multiMonitor;

    private int ssd;

    private String cpu;

    public ComputerOverload() {
    }

    public ComputerOverload(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public ComputerOverload(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public ComputerOverload(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        ComputerOverload first = new ComputerOverload();
        first.printInfo();
        ComputerOverload second = new ComputerOverload(true, 500, "Intel Core I7-10700K");
        second.printInfo();
        ComputerOverload third = new ComputerOverload(256, "AMD Ryzen 5 3600");
        third.printInfo();
        ComputerOverload forth = new ComputerOverload(true, 512.0, "AMD Ryzen 7 3700X");
        forth.printInfo();
    }
}