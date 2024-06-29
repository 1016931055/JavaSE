package com.itheima.lam.demo6;

public class CalculatorDemo {
    public static void main(String[] args) {

        useCalculator( new Calculator() {
            @Override
            public int calc(int num1, int num2) {
                return num1*num2;
            }
        } );

        //Lambda表达式作用： 简化匿名内部类的书写
        useCalculator( (int num1, int num2) -> {return num1*num2;} );

    }

    public static void useCalculator(Calculator calculator) {
        int result = calculator.calc(10, 20);
        System.out.println(result);
    }
}
