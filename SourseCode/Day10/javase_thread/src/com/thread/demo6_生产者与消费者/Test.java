package com.thread.demo6_生产者与消费者;

public class Test {
    public static void main(String[] args) {
//        Consumer con = new Consumer();
//        Producer producer = new Producer();
//
//        Thread t1 = new Thread(con);
//        Thread t2 = new Thread(producer);
//
//        t1.start();
//        t2.start();

        new Thread(new Consumer()).start();

        new Thread(new Producer()).start();
    }
}
