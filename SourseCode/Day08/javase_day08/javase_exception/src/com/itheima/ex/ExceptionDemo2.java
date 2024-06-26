package com.itheima.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) throws ParseException {

        //自己处理
        method1(null);


        //method2方法中声明的异常，需要在main方法中处理掉
        method2();

    }


    //运行时异常：RuntimeException类（父类）
    //子类：NullPointerException
//    public static void method1(String name) throws NullPointerException , IndexOutOfBoundsException {
//
//        //可能会发生：空指针异常   NullPointerException
//        System.out.println(name.length());
//
//        //可能会发生：索引越界异常  IndexOutOfBoundsException
//        System.out.println(name.charAt(100));
//    }

    public static void method1(String name) throws RuntimeException {

        //可能会发生：空指针异常   NullPointerException
        System.out.println(name.length());

        //可能会发生：索引越界异常  IndexOutOfBoundsException
        System.out.println(name.charAt(100));
    }


    //编译时异常： Exception类（父类）
    //子类： ParseException
    public static void method2() throws ParseException {
        //日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //针对编译时异常，必须有异常处理代码（声明 、 捕获）
        Date date = sdf.parse("2022-11-07");//有异常
    }
}
