package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;

    }

    public static void main(String[] args) {
        DummyDic song = new DummyDic();
        String say = "gav gav";
        String result = song.engToRus(say);
        System.out.println(result);
    }
}
