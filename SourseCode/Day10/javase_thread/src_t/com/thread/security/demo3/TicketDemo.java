package com.itheima.thread.security.demo3;

//测试类
public class TicketDemo {
    public static void main(String[] args) {
        //创建线程任务对象
        Ticket ticket = new Ticket();

        //创建三个卖票窗口（3个线程在执行同一个任务）
        Thread t1 = new Thread(ticket , "窗口1 - ");
        Thread t2 = new Thread(ticket , "窗口2 - ");
        Thread t3 = new Thread(ticket , "窗口3 - ");

        t1.start();
        t2.start();
        t3.start();
    }
}
