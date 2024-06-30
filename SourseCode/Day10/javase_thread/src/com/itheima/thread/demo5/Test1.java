package com.itheima.thread.demo5;

public class Test1 {
    public static void main(String[] args) {
        new Thread(() -> {

            synchronized ("对象锁") {
                try {
                    System.out.println("将进入无限等待状态~");
                    "对象锁".wait(); //无限等
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("继续执行......");
            }
        }).start();
    }
}
