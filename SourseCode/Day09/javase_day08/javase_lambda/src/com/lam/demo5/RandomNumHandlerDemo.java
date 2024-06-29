package com.itheima.lam.demo5;

import java.util.Random;

public class RandomNumHandlerDemo {
    public static void main(String[] args) {
       useRandomNumHandler( () -> {
           Random r = new Random();
           return r.nextInt(100);
       } );
    }

    public static void useRandomNumHandler(RandomNumHandler handler){
        //调用方法，获取到数值
        int number = handler.getNumber();
        System.out.println(number);
    }
}
