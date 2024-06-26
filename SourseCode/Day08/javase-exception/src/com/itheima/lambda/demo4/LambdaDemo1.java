package com.itheima.lambda.demo4;

import java.util.Random;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //匿名内部类
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                Random r = new Random();
                return r.nextInt(10);
            }
        });

        //Lambda表达式简化匿名内部类代码
        useRandomNumHandler( () ->{
            //创建随机数对象
            Random  r = new Random();
            //获取50~100之间的随机数字
            int number = r.nextInt(51)+50;
            return  number;
        });


    }

    public static void useRandomNumHandler(RandomNumHandler handler) {
        int number = handler.getNumber();
        System.out.println("随机数字：" + number);
    }
}
