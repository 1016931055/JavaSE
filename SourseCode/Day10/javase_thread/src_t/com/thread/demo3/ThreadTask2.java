package com.itheima.thread.demo3;

//实现接口（还可以实现其他接口、还可以继承一个父类）
public class ThreadTask2 implements Runnable{
    //重写Runnable接口中的线程任务功能
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
