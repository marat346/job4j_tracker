package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[1] = products[2];
        products[2] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            products[products.length - 1] = null;
            }
        return products;
    }
}

