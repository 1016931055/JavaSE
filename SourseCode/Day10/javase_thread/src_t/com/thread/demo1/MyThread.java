package com.itheima.thread.demo1;

//创建子类 ， 继承Thread类 （当前类为线程类）
public class MyThread extends Thread {

    //需要当前线程帮助完成任务：线程任务
    @Override
    public void run() {
        System.out.println("新的线程开始执行：");
        for (int i = 100; i < 200; i++) {
            System.out.println("新线程：" + i);
        }
    }
}
