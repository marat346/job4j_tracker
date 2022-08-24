package ru.job4j.tracker;

public class ConsoleOutput implements Output {

    public String println(Object obj) {
        System.out.println(obj);
        return null;
    }
}

