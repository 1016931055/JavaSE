package com.itheima.ex;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] array = null;

        try {
            method1(array);
        }catch (RuntimeException e){
            // getMessage()  从异常对象中获取消息（异常的原因）
            System.out.println(e.getMessage());
        }

        System.out.println("main方法程序继续执行");
    }


    public static void method1(int[] arr){
        if(arr == null){
            //手动引发异常并抛出
            throw new RuntimeException("传递的参数不能为空!");
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void method2(int[] arr){
        if (arr == null ){
            System.out.println("传递的参数不能为空");
            return;//结束当前方法运行
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
