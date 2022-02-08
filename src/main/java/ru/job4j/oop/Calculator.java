package ru.job4j.oop;

public class Calculator {
    private static int x = 5;
    private Calculator calculatorsumAllOperation;

    public static int sum(int y) {return x + y;}

    public int multiply(int a) {return x * a;}

    public int divide(int r){return r / x;}

    public int sumAllOperation(){
        return sum() + multiply() + divide() + minus() ;
    }

    public static int minus(int z){
        return x - z;
    }

    public static void main(String[] args) {
           Calculator calculator = new Calculator();
           Calculator calculatordivide = new Calculator();
           Calculator calculatorsumAllOperation = new Calculator();

        int result = sum(10);
             System.out.println(result);

           int rsl = calculator.multiply(5);
                  System.out.println(rsl);

                 int rslminus = minus(5);
                       System.out.println(rslminus);

                  int rsldivide = calculatordivide.divide(10);
                           System.out.println(rsldivide);

                     int rslsumma = calculatorsumAllOperation.sumAllOperation();
                                System.out.println(rslsumma);

    }
}

