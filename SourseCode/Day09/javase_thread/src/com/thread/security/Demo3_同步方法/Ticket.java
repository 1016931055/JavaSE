package com.thread.security.Demo3_同步方法;

public class Ticket implements Runnable{
    private int ticketCount = 100;
    @Override
    public void run() {
        while (true){
            if (ticketCount <= 0){
                break;
            }
            else method();
        }


    }

    // 同步方法：
    //   修饰符号 synchronized 返回值类型  方法名(参数列表){}
    public synchronized void method(){
        if (ticketCount > 0){
            try {
                // 模拟出票时间
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()
                    + "卖出了一张票,还剩下"+(--ticketCount)+"张票");
        }

    }
}
