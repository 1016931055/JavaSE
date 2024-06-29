package com.itheima.thread.dead;

public class DeadLockDemo {
    public static void main(String[] args) {
        String 筷子A = "筷子A";//第1个锁对象
        String 筷子B = "筷子B";//第2个锁对象


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    //以下代码中使用了：嵌套锁 （先拿A锁，再拿B锁）
                    synchronized (筷子A) {
                        System.out.println("小白拿到了筷子A ,等待筷子B....");
                        synchronized (筷子B) {
                            System.out.println("小白拿到了筷子A和筷子B , 开吃!!!!!");
                        }
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "小白").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (筷子B) {
                        System.out.println("小黑拿到了筷子B ,等待筷子A....");
                        synchronized (筷子A) {
                            System.out.println("小黑拿到了筷子B和筷子A , 开吃!!!!!");
                        }
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "小黑").start();
    }
}
