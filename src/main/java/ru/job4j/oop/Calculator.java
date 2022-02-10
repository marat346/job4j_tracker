package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int r) {
        return r / x;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int sumAllOperation(int x) {
        return sum(x) + multiply(x) + divide(x) + minus(x);
    }

    public static void main(String[] args) {
           Calculator calculator = new Calculator();

        int result = sum(10);
             System.out.println(result);

        int rsl = calculator.multiply(5);
              System.out.println(rsl);

        int rslminus = minus(5);
              System.out.println(rslminus);

        int rsldivide = calculator.divide(10);
               System.out.println(rsldivide);

        int rslsumma = calculator.sumAllOperation(x);
               System.out.println(rslsumma);

    }
}

