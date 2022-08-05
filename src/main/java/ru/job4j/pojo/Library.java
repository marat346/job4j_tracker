package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book drama = new Book("Пушкин", 201);
        Book detective = new Book("Достоевский", 205);
        Book fantasy = new Book("Гоголь", 305);
        Book classic = new Book("Clean code", 105);
        Book[] books = new Book[4];
        books[0] = drama;
        books[1] = detective;
        books[2] = fantasy;
        books[3] = classic;
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book tot = books[i];
            System.out.println(tot.getName() + "-" + tot.getPage());
        }
        System.out.println("Выбор книги :");
        for (int i = 0; i < books.length; i++) {
            Book neo = books[i];
            if ("Clean code".equals(neo.getName())) {
                System.out.println(neo.getName() + "-" + neo.getPage());
            }
        }
    }
}