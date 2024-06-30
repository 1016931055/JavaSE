package com.itheima.thread.demo6;

public class Test1 {
    public static void main(String[] args) {

        new Thread(new ConsumerTask() ,"消费者").start();

        new Thread(new ProducerTask(),"生产者").start();



    }
}
