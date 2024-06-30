package com.itheima.thread.demo8;

import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(10);

        //创建Callable类型的线程任务
        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {

                Thread.sleep(1000);//可以不用于使用try..catch处理异常了

                int sum =0;
                for (int i = 1; i < 10; i++) {
                    sum+=i;
                }
                return sum;
            }
        };

        //把线程任务提交给线程池执行
        Future<Integer> future = es.submit(task);

        System.out.println("计算结果："+future.get());
    }
}
