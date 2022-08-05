package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product tot = products[i];
            if (tot == null) {
                System.out.println(i);
            }
        }
            return -1;
        }
    }
