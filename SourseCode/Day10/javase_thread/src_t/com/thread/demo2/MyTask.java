package com.itheima.thread.demo2;

//创建子类：线程任务类    实现Runnable接口
public class MyTask implements  Runnable{

    //线程任务功能
    @Override
    public void run() {
        System.out.println("新的线程开始执行：");
        for (int i = 100; i < 200; i++) {
            System.out.println("新线程：" + i);
        }
    }
}
