package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int m) {
        return m - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + multiply(s) + minus(s) + divide(s);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = sum(10);
        System.out.println(sum);
        int multiply = calculator.multiply(5);
        System.out.println(multiply);
        int minus = minus(20);
        System.out.println(minus);
        int divide = calculator.divide(30);
        System.out.println(divide);
        int sumAllOperation = calculator.sumAllOperation(7);
        System.out.println(sumAllOperation);

    }
}
