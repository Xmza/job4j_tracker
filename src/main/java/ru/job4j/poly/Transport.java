package ru.job4j.poly;

public interface Transport {
    void go();

    void passenger(int numPass);

    double refill(int fuel);
}
