package com.itheima.thread.demo5;

public class Test3 {
    public static void main(String[] args) {
        new Thread( ()->{

            synchronized ("对象锁"){
                System.out.println("即将进入到计时等待状态，休息3秒后，自动唤醒~~~");
                try {
                    "对象锁".wait(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("程序继续执行~~~~");
            }

        }).start();
    }
}
