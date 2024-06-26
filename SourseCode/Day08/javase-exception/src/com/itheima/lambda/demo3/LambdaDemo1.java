package com.itheima.lambda.demo3;

public class LambdaDemo1 {
    public static void main(String[] args) {

        //匿名内部类书写方式
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("你好 ， " + msg);
            }
        }, "黑马");


        //Lambda表达式
        useStringHandler(  msg -> System.out.println("Hello " + msg)
         , "上海黑马");
    }


    public static void useStringHandler(StringHandler handler, String msg) {
        handler.printMessage(msg);
    }
}
