package com.thread.Demo4;

public class Test1 {
    public static void main(String[] args) {
//        ThreadTask task = new ThreadTask();
//        Thread thread = new Thread(task);
//        thread.start();
        // 上面三步的简写: (调用thread的run()方法)
        // Thread(Runnable r, String name) - 构造器里设置线程名字
        new Thread(new ThreadTask(), "新线程").start();


//        try {
//            // 让当前线程(main线程)休息100ms
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("main线程开始工作");
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

    }
}
