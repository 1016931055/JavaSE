package com.thread.security.Demo1;

public class Ticket implements Runnable{
    private int ticketCount = 100;
    @Override
    public void run() {
        if (ticketCount > 0){
            try {
                // 模拟出票时间
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName()
                    + "卖出了一张票,还剩下"+(--ticketCount)+"张票");
            run();
        }
    }
}
