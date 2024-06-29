package com.itheima.thread.security.demo4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//线程任务类
public class Ticket implements Runnable {
    //成员变量（电影票数）
    private int ticketCount = 100;//有100张电影票

    //Lock锁对象
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        //模拟卖票
        while (true) {
            //使用Lock锁解决线程安全问题
            //获取锁
            l.lock();
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
            //释放锁
            l.unlock();
        }
    }
}
