package com.lambda.demo1;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 正常匿名内部类方式写
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正常的游泳");
            }
        });

        // 使用lambda表达式简化书写
        // 1.不用写new Swim()新建类的操作
        // 2.不用写方法名,因为接口中只有一个抽象方法，故()代指的那个方法
        // 3.() -> {代码} ---括号中代表重写的方法内容
        method(() ->{
                    System.out.println("Lambda的游泳");
                    System.out.println("测试多重操作");
                }
            );
    }

    public static void method( Swim swim){
        swim.swimming();
    }
}
