package com.thread.Demo1;

// 创建子类继承Thread（当前类为线程类）
public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("子线程开始工作");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
