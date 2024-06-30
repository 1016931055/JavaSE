package com.thread.demo7_线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class StudentTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "在教学员游泳");
    }
}
public class Test1 {
    public static void main(String[] args) {
        // 创建线程池，制定初始化线程数量
        ExecutorService es = Executors.newFixedThreadPool(3);

        // 把任务提交给线程池执行
        es.submit(new StudentTask());
        es.submit(new StudentTask());
        es.submit(new StudentTask());
        es.submit(new StudentTask());
        es.submit(new StudentTask());
    }
}
