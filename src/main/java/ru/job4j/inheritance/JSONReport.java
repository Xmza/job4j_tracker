package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        System.out.println(report.generate("name", "body"));
    }
}
