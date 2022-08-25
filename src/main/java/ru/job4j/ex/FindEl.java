package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new IllegalArgumentException("Key could not be less then null");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] value = {"apple", "cake", "bread"};
        try {
            FindEl.indexOf(value, "cak");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}