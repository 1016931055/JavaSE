package com.itheima.lambda.demo5;

public class LambdaDemo1 {

    public static void main(String[] args) {
        //匿名内部类写法
        useCalculator(new Calculator() {
            @Override
            public int calc(int num1, int num2) {
                return num1 + num2;
            }
        }, 10, 20);


        //Lambda表达式写法
        useCalculator( (num1,num2) -> num1 + num2
        , 11 , 22);
    }


    public static void useCalculator(Calculator calculator, int num1, int num2) {
        int result = calculator.calc(num1, num2);
        System.out.println(result);
    }
}
