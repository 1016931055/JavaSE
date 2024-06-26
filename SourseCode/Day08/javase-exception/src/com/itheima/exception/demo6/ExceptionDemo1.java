package com.itheima.exception.demo6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionDemo1 {
    //日志对象
    private static final Logger LOGGER = LoggerFactory.getLogger("com.itheima.expcetion.demo5.ExceptionDemo1");

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //调用方法
        try{
            showArray(arr);

        }catch (NullPointerException e){
            //使用日志完成输出
            LOGGER.debug(e.getMessage());
            System.out.println("---------------------------------");
            //记录到日志文件
            LOGGER.warn(e.toString());

            System.out.println("=============================================");
            e.printStackTrace();//打印异常信息到控制台
        }

        System.out.println("程序执行执行.....");
    }

    //打印数组中的元素
    public static void showArray(int[] array) throws NullPointerException,ArrayIndexOutOfBoundsException {
        //验证传递的参数是否合法
        if(array == null || array.length==0){
            throw  new NullPointerException("传递的参数为空!");
        }

        for (int i : array) {
            System.out.print(i + "\t");
        }

        array[10]=10;//异常：数组索引越界
    }
}
