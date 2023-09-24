package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Order order = new Order(1, "BMV M5", Status.IN_WORK);
        System.out.println("Заказ наряд № " + order.getNumber() + " на авто " + order.getCar()
                + " статус ремонта " + order.getStatus().getInfo() + " подробности "
                + order.getStatus().getMessage());
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println(s.name() + s.ordinal());
        }
    }
}
