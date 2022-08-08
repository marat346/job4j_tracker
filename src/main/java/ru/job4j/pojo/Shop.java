package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
       int tot = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                tot = i;
                break;
            }
        }
        return tot;
    }
}

