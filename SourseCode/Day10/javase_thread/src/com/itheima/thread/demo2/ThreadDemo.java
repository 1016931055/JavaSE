package com.itheima.thread.demo2;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("进入到main方法执行代码.......");

        //创建线程任务对象
        MyTask task = new MyTask();

        //创建线程类对象,并指定要执行的线程任务
        Thread t = new Thread( task );
        //启动线程
        t.start();

        //main方法中的代码
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
