package com.itheima.thread.demo5;

public class Test2 {

    public static void main(String[] args) {
        //创建线程任务对象
        Runnable task = new Runnable() {
            Object lock = new Object();//对象锁

            boolean flag = true;//开关

            @Override
            public void run() {
                //同步代码块
                synchronized (lock) {
                    if (flag) {
                        try {
                            flag = false;
                            System.out.println(Thread.currentThread().getName()+"即将进入到无限等待状态~");
                            lock.wait();//进入到无限等待状态 ，释放掉对象锁

                            System.out.println("程序继续执行。。。。。");

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("即将唤醒处于等待状态的线程....");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒处于和notify使用同一个对象锁上的，且处于"等待状态"的任意一个线程
                        lock.notify();
                    }
                }
            }
        };



        new Thread(task).start();
        new Thread(task).start();

    }
}
