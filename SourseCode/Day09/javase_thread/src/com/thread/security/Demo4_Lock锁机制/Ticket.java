package com.thread.security.Demo4_Lock锁机制;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    private int ticketCount = 100;

    // 获取锁
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            // 使用Lock锁解决线程安全问题
            // 上锁
            l.lock();
            if (ticketCount > 0){
                    try {
                        // 模拟出票时间
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "卖出了一张票,还剩下"+(--ticketCount)+"张票");
                    // 开锁
                    l.unlock();
            }
            else break;
                }

        }
    }
