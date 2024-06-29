package com.itheima.lam.demo5;

//函数式接口： 当前接口中仅有一个抽象方法
@FunctionalInterface
public interface RandomNumHandler {
    public abstract int getNumber();
}
