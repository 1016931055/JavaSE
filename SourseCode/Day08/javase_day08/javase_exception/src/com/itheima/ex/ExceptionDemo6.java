package com.itheima.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionDemo6 {

    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);

        Date birthday = null;
        while (true) {
            System.out.println("请输入您的生日[年-月-日] ：");
            String strDate = sc.next();
            try {
                //可能会发生异常（自己处理）
                birthday = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
                break;//停止循环
            } catch (ParseException e) {
                System.out.println("您输入的生日格式错误，请重新输入");
            }
        }

        System.out.println(birthday);
        System.out.println("程序继续执行");
    }
}
