package com.itheima.lam.demo6;

public class CalculatorDemo {
    public static void main(String[] args) {
        useCalculator( (num1, num2) -> num1 * num2 );

    }

    public static void useCalculator(Calculator calculator) {
        int result = calculator.calc(10, 20);
        System.out.println(result);
    }
}
