package com.itheima.lambda.demo1;


//接口
@FunctionalInterface
interface Swimming{
    //有且仅有一个抽象方法
    public abstract void swim();
}


public class LambdaDemo1 {

    public static void main(String[] args) {

//        method(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("开始游泳了~~~");
//            }
//        });

        method( () -> {
            System.out.println("开始游泳了!!!");
        } );
    }


    public static void show(Swimming swimming){
        swimming.swim();
    }

    public static void method(Swimming swimming){

        swimming.swim();
    }
}
