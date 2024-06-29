package com.thread.Demo4;

public class ThreadTask implements Runnable{
    @Override
    public void run() {


        // 让当前线程先执行，等待它死亡后别的线程才开始执行
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 100; i++) {
            // 获取当前运行线程
            Thread currentThread = Thread.currentThread();
            // 获取当前线程的名字
            String threadName = currentThread.getName();


            System.out.println(threadName + i);
        }
    }
}
