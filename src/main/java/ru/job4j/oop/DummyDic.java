package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic check = new DummyDic();
        String word = check.engToRus("Effervescence");
        System.out.println(word);
    }
}
