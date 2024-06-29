package com.itheima.exception.demo2;

public class ExceptionDemo2 {
    //演示：声明的使用（解决运行时异常）
    public static void main(String[] args) throws NullPointerException,ArrayIndexOutOfBoundsException {

        String str="strring";

        //接收到method方法抛出的异常后，main方法也具有运行时异常了
       int len =  method(str);


        System.out.println("程序继续向下运行!!!!!");

    }

    //使用throws声明 ，解决运行时异常
    public static int method(String str) throws NullPointerException,ArrayIndexOutOfBoundsException{
        str = null;

        int len = str.length(); //运行时会发生：NullPointerException异常（运行时异常）

        return len;
    }
}
