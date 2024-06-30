package com.thread.demo8_Callable;

import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(3);

        // 创建Callable类型的线程任务
        // Callable可抛出异常, 有返回值且sleep/wait时不用写try-catch
        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        // 把线程任务提交给线程池执行
        Future<Integer> future = es.submit(task);

        System.out.println(future.get());
    }
}
