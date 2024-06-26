package com.itheima.lam.demo4;

public class StringHandlerDemo {
    public static void main(String[] args) {
        //Lambda表达式
        useStringHandler( msg -> System.out.println("你好,"+msg) );
    }
    public static void useStringHandler(StringHandler handler){
        //调用方法
        handler.printMessage("黑马");
    }
}
