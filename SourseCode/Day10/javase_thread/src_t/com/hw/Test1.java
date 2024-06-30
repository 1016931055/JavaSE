package com.itheima.hw;

public class Test1 {
    public static void main(String[] args){
        //创建线程任务
        LuckDraw task = new LuckDraw();

        //线程1：前门
        Thread t1 = new Thread( task , "前门");

        //线程2：后门
        Thread t2 = new Thread( task );
        t2.setName("后门");

        t1.start();
        t2.start();
    }
}
