package com.itheima.lam.demo6;

//函数式接口： 当前接口仅有一个抽象方法
@FunctionalInterface
public interface Calculator {
    //计算
    public abstract int calc(int num1 , int num2);
}
