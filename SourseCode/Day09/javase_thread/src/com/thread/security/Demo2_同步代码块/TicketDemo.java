package com.thread.security.Demo2_同步代码块;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread thread1 = new Thread(ticket,"窗口1");
        Thread thread2 = new Thread(ticket,"窗口2");
        Thread thread3 = new Thread(ticket,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
