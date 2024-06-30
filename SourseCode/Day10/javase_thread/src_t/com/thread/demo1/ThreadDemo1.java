package com.itheima.thread.demo1;

public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("进入到main方法执行代码.......");

        //创建一个线程对象
        MyThread mt = new MyThread();
        //启动线程
        mt.start();  //底层代码会自动调用：run方法

        //main方法中的代码
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
