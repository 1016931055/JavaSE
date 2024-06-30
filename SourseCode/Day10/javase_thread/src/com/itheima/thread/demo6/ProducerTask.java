package com.itheima.thread.demo6;

//生产者线程
public class ProducerTask implements Runnable {

    //必须保证：消费者线程和生产者线程使用同一个对象锁
    @Override
    public void run() {
        while(true) {
            synchronized (Resource.LOCK) {
                if (Resource.num == 0) {
                    //没有：生产食物
                    System.out.println(Thread.currentThread().getName() + " 发现没有食物，开始生产~~");
                    Resource.num = 1;
                    //唤醒：消费者
                    Resource.LOCK.notify();
                } else {
                    //有：等待
                    System.out.println(Thread.currentThread().getName() + " 发现有食物，等待中....");
                    try {
                        Resource.LOCK.wait();//释放掉对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
