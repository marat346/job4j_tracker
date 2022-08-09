package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;
    private String key = "совпадение";



    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[items.length];
        for (int index = 0; index < items.length - 1; index++) {
            Item tot = items[index];
            if (tot != null) {
                items[size] = tot;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] name = new Item[items.length];
        Item[] rsl = new Item[name.length];
        int size = 0;
        for (int index = 0; index < rsl.length; index++) {
            Item clue = rsl[index];
            if (key.equals(clue.getName())) {
                rsl[size] = clue;
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}