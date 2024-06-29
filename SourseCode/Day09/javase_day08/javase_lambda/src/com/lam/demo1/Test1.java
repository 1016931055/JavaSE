package com.itheima.lam.demo1;

import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Swim swim = new Swim() {
            //匿名内部类
            @Override
            public void swimming() {
                System.out.println("游泳。。。。。。。");
            }
        };
        method(swim);

        //使用Lambda表达式，简化匿名内部类的书写
        method( ()->{
            System.out.println("Lambda： 游泳");
        } );
    }

    public static void method(Swim swim) {
        swim.swimming();
    }
}
