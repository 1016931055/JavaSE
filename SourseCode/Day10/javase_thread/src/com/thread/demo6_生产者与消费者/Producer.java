package com.thread.demo6_生产者与消费者;

public class Producer implements Runnable {
    // 共享资源
    private Resource resource;

    @Override
    public void run() {
        while (true) {
            // 这里要和Consumer共用一把对象锁！
            synchronized (Resource.LOCK) {
                if (Resource.num == 0) { // 开始做饭
                    System.out.println("制作菜肴中...");
                        System.out.println("制作完成！");
                        Resource.num = 1;
                        // 等待进食
                        Resource.LOCK.notify();
                }else { //已有食物,等待
                    try {
                        System.out.println("通知食客已上餐...");
                        Resource.LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}
