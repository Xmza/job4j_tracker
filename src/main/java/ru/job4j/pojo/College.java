package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Зубенко Михаил Петрович");
        student.setGroup("ИС-920");
        student.setReceipts(new Date());
        System.out.println(student.getName() + " студент группы " + student.getGroup()
                + " поступил " + student.getReceipts());
    }
}
