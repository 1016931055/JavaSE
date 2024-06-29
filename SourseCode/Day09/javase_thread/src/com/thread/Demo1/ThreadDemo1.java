package com.thread.Demo1;


public class ThreadDemo1{
    public static void main(String[] args) {
        // 创建一个线程对象
        MyThread mt = new MyThread();

        //启动线程,start()方法会自动调用线程类的run()方法
        mt.start();

        // 程序会交替执行！
        System.out.println("主线程开始工作: ");
        for (int i = 0; i < 100; i++) {
            System.out.println("主:"+i);
        }


    }

}
