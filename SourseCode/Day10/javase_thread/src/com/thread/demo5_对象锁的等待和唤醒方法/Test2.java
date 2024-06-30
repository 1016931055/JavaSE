package com.thread.demo5_对象锁的等待和唤醒方法;

public class Test2 {
    public static void main(String[] args) {
        // 创建线程任务对象
        Runnable task = new Runnable() {
            Object lock = new Object(); // 对象锁
            boolean flag = true; //开关
            @Override
            public void run() {
                synchronized (lock) {
                    if (flag) {
                        try {
                            flag = false;
                            System.out.println(Thread.currentThread().getName()+"进程进入等待状态。。。");

                            lock.wait();

                            System.out.println(Thread.currentThread().getName()+"进程被唤醒。。。");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println(Thread.currentThread().getName()+"即将唤醒等待状态的进程...");
                        lock.notify();
                    }
                }
            }
        };

        Thread t1 = new Thread(task,"线程1");
        Thread t2 = new Thread(task,"线程2");

        t1.start();
        t2.start();
    }

}
