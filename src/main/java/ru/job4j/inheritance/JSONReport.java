package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        return "{" + ln
                + "\t\"name\" : \"" + name + "\"," + ln
                + "\t\"body\" : \"" + body + "\"" + ln
                + "}";
    }

    public static void main(String[] args) {
        TextReport report = new TextReport();
        System.out.println(report.generate("name", "body"));
    }
}
