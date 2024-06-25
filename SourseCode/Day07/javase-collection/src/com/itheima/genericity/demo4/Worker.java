package com.itheima.genericity.demo4;

//子类
public class Worker extends Person {

    private double  money;

    //工作
    public void work(){

    }

    public double getScore() {
        return money;
    }

    public void setScore(double money) {
        this.money = money;
    }
}
