package com.itheima.lam.demo4;

//函数式接口：当前接口中仅有一个抽象方法
@FunctionalInterface
public interface StringHandler {
    public abstract void printMessage(String msg);
}
