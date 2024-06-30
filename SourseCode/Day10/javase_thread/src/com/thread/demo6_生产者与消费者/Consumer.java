package com.thread.demo6_生产者与消费者;

public class Consumer implements Runnable{
    // 共享资源
    private Resource resource;

    @Override
    public void run() {
        // 持续进行
        while (true){
            // 这里要和Procucer共用一把对象锁！
            synchronized (Resource.LOCK){
                if (Resource.num == 0){ //没有食物
                    try {
                        System.out.println("通知厨师制作食物...");
                        Resource.LOCK.wait();

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else{ //有食物
                    System.out.println("客户品尝美食中。。。");
                    System.out.println("进食完毕!");
                    Resource.num--;
                    // 唤醒生产者
                    Resource.LOCK.notify();
                }
            }
        }
    }
}
