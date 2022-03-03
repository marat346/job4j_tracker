package ru.job4j.oop;

public class ToyCat extends CatLively {
    public boolean canBeWashByWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        CatLively cat = new CatLively();
        System.out.println(cat.canPurr());
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashByWashMachine());

    }
}
