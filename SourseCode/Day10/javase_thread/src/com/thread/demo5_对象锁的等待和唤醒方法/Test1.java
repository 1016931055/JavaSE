package com.thread.demo5_对象锁的等待和唤醒方法;

public class Test1 {
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized ("对象锁"){
                try {
                    System.out.println("将进行无限等待状态。。。");
                    "对象锁".wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("继续执行。。。");
            }
        }).start();
    }
}

