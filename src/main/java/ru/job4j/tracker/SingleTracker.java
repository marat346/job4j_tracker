package ru.job4j.tracker;

public class SingleTracker {

    private Tracker tracker = new Tracker();
    private static SingleTracker instance = null;

    public SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }
}


