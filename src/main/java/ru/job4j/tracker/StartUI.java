package ru.job4j.tracker;

import java.time.LocalDateTime;

public class StartUI  {

    public static void main(String[] args) {
        Item item = new Item("dd-MMMM-EEEE-yyyy HH:mm:ss");
        LocalDateTime dateTime = item.getCreated();
        System.out.println(dateTime);
    }
}

