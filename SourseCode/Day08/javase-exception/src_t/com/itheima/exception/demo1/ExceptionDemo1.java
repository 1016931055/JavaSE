package com.itheima.exception.demo1;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        String str = "str";

        System.out.println(str.charAt(10));

        //调用方法
        method(str);

        System.out.println("程序希望继续向下执行~~~");
    }


    //方法
    public static void method(String str) {
        System.out.println("字符串：" + str);

        System.out.println("字符串长度：" + str.length());

        System.out.println("方法中的其他代码........");
    }
}
