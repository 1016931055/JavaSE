package com.lambda.demo5;

import com.itheima.lambda.demo4.RandomNumHandler;

import java.util.Random;

public class RandomNumHandlerDemo {
    public static void main(String[] args) {
        System.out.println(useRandomNumHandler(()->{
            Random r = new Random();
            return r.nextInt(11);
        }));
    }

    public static int useRandomNumHandler(RandomNumHandler ranNumHand) {
        return ranNumHand.getNumber();
    }
}
