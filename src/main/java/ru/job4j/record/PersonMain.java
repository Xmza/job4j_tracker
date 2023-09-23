package ru.job4j.record;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Иван", 12);
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Иван", 12);
        System.out.println("Имя: " + record.name() + ", Возраси: " + record.age());
        System.out.println(record);
        PersonRecord record1 = new PersonRecord("Иван", 12);
        System.out.println(record.equals(record1));
    }
}
