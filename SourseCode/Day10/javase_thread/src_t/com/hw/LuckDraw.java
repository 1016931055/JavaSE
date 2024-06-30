package com.itheima.hw;

public class LuckDraw implements Runnable {

    private int number = 100; //员工人数

    //对象锁
    private Object lock = new Object();


    @Override
    public void run() {
        //获取当前线程的名字
        String threadName = Thread.currentThread().getName();

        int count=0;//计数器

        while (true) {
            synchronized (lock) {
                if (number > 0) {
                    //获取双色球号码
                    // 使用工具类生成一个彩票号码给这个员工
                    String dc = DoubleColorBallUtil.create();

                    System.out.print("编号为:" + number + "的员工 从 " + threadName + " 入场!");
                    System.out.println("拿到的双色球彩票号码是:" + dc);

                    number--;
                    count++;
                } else {
                    System.out.println("从" + threadName + "入场的员工总共: " + count + " 位员工 ");
                    break;
                }
            }
        }

    }


}
