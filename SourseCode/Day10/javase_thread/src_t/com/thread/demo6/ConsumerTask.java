package com.itheima.thread.demo6;

//消费者线程
public class ConsumerTask implements Runnable {

    //必须保证：消费者线程和生产者线程使用同一个对象锁
    @Override
    public void run() {
        while (true) {
            //同步代码块
            synchronized (Resource.LOCK) {
                if (Resource.num == 0) {
                    //没有：等待
                    try {
                        System.out.println(Thread.currentThread().getName() + "没有发现食物，等待中~~~");
                        Resource.LOCK.wait();//无限等待（会释放对象锁）
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //有：消费
                    System.out.println(Thread.currentThread().getName() + " 发现食物，开始消费"+Resource.num);
                    Resource.num--;
                    //唤醒：生产者可以继续生产食物了
                    Resource.LOCK.notify();
                }
            }
        }
    }
}
