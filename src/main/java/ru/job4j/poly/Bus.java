package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Автобус начинает ехать");

    }

    @Override
    public void passenger(int numPass) {
        System.out.println("В автобусе " + numPass + " пассажиров");

    }

    @Override
    public double refill(int fuel) {
        double fuelPrice = fuel * 56;
        System.out.println("Заправлено на " + fuel + " литров");
        System.out.println("К оплате " + fuelPrice);
        return fuelPrice;
    }
}
