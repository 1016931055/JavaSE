package com.lambda.demo4;

@FunctionalInterface
public interface StringHandler {
    // 带参数的抽象方法
    public abstract void printMessage(String msg);
}
