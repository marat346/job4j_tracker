package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI  {

    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime datetime = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = datetime.format(formatter);
        System.out.println(currentDateTimeFormat);
    }
}