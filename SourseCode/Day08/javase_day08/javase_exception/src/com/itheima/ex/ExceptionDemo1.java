package com.itheima.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        //在书写代码时，代码没有问题，但发生：错误提示（当前位置有可能会发生异常）
        try {
            Date date = sdf.parse("2022-11-07");//有异常
        } catch (ParseException e) {
            System.out.println("处理异常");
        }

        System.out.println("程序继续执行!");
    }
}
