package com.itheima.thread.demo4;

public class Test1 {
    public static void main(String[] args) {
        //创建并启动线程，并指定要执行的线程任务
        //Thread(Runnable r , String  name)
        new Thread(new ThreadTask() , "黑马程序员").start();


//        try {
//            //让当前线程休息：500毫秒
////            Thread.sleep(500);
//
//            Thread.currentThread().join();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        for (int i = 100; i < 2000; i++) {
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }
    }
}
