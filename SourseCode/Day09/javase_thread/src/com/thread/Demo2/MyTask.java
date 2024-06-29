package com.thread.Demo2;

// 创建子类：线程任务类   实现Runnable接口
public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println("新的线程就开始执行:");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
