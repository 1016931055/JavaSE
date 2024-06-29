package com.thread.Demo2;

public class ThreadDemo {
    public static void main(String[] args) {
        // 创建线程任务对象
        MyTask task = new MyTask();

        // 创建线程类对象,并制定要执行的线程任务
        Thread t = new Thread(task);

        // 启动线程
        t.start();
    }


}
