package com.lambda.demo6;

public class CalculatorDemo {
    public static void main(String[] args) {
        // Lambda表达式重写方法
        useCalculator((int n1, int n2) -> n1 * n2);
    }

    public static void useCalculator(Calculator cal) {
        int result = cal.calculate(11,22);
        System.out.println(result);
    }
}
