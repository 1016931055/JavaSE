package com.itheima.thread.security.demo2;

//线程任务类
public class Ticket implements Runnable {
    //成员变量（电影票数）
    private int ticketCount = 100;//有100张电影票

    //锁对象（任意类型对象）
    Object lock = new Object();

    @Override
    public void run() {
            //模拟卖票
            while (true) {
                //使用同步代码块，解决线程安全问题
                synchronized (lock) {
                if (ticketCount <= 0) {
                    break;
                }

                if (ticketCount > 0) {
                    // 模拟出票的时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " 出售票号：" + ticketCount);
                    ticketCount--;
                }
            }
        }
    }
}
