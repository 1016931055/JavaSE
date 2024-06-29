package com.thread.security.Demo2_同步代码块;

public class Ticket implements Runnable{
    private int ticketCount = 100;

    final Object lock = new Object();

    @Override
    public void run() {

        // 使用同步代码块，解决线程安全问题
        // 括号中填任意类型对象!(Object及其子类)
        // 多个线程要使用同一个锁对象
        synchronized (lock) {
            if (ticketCount > 0) {
                try {
                    // 模拟出票时间
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(Thread.currentThread().getName()
                        + "卖出了一张票,还剩下" + (--ticketCount) + "张票");
                run();
            }
        }
    }
}
