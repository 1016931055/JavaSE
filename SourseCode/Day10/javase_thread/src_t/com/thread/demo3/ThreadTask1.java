package com.itheima.thread.demo3;

//只能继承一个父类
public class ThreadTask1 extends Thread{
    //重写Thread类中的线程任务功能
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
