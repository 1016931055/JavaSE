package com.itheima.ex;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        String name = null;


        //处理method方法中抛出的异常
        method(name);

    }


    public static void method(String name) {
        //校验：参数不能为空
        if (name == null || "".equals(name)) {
            throw new RuntimeException("参数不能为空!");
            //在throw 代码后面不能书写任意代码
            //System.out.println("当前行代码无法执行");
        }

        System.out.println(name);
    }
}
