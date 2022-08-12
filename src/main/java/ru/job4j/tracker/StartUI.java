package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI  {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public static void main(String[] args) {
        Item item = new Item();
        Item tot = new Item();
        LocalDateTime datetime = item.getCreated();
        String currentDateTimeFormat = datetime.format(FORMATTER);
        System.out.println(currentDateTimeFormat + "    изменился     " + tot);
    }
}