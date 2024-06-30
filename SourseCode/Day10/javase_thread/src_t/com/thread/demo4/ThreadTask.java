package com.itheima.thread.demo4;

public class ThreadTask implements Runnable{
    @Override
    public void run() {

        try {
            //当前线程进入到阻塞状态（暂停了）
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            //获取当前运行的线程
            Thread currentThread = Thread.currentThread();
            //获取当前运行线程的名字
            String threadName = currentThread.getName();

            System.out.println(threadName+" : "+i);
        }

    }
}
