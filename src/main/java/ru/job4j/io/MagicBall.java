package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        Scanner input = new Scanner("Пойдешь на рыбалку");
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        if (answer == 1) {
            name = "да";
        } else if (answer == 2) {
            name = "нет";
        } else {
            name = "может быть";
        }
        System.out.println(name);
    }
}