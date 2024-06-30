package com.itheima.thread.demo3;

public class Test2 {
    public static void main(String[] args) {
        //创建线程对象，并指定一个线程任务
        Thread t = new Thread( () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });
        //启动线程
        t.start();

        for (int i = 100; i < 2000; i++) {
            System.out.println("main方法："+i);
        }
    }
}
