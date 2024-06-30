package com.thread.demo5_对象锁的等待和唤醒方法;

public class Test3 {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("即将进入等待状态,等待3s后自动唤醒");
            synchronized("对象锁"){
                try {
                    "对象锁".wait(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("已唤醒");
            }
        }).start();
    }
}
