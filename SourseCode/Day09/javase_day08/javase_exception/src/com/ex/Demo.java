package com.itheima.ex;

public class Demo  extends Thread{
    //重写方法
    public void run(){

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
