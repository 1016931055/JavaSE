package com.itheima.exception.demo7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入生日：");
        String birthday = sc.next();

        long day = 0;

        try {
            day = getDay(birthday);
        } catch (ParseException e1) {
            System.out.println("您输入的生日"+e1.getMessage()+"格式不匹配");
            e1.printStackTrace();
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }

        if (day != 0) {
            System.out.println("活了" + day + "天");
        }
    }

    /**
     * 计算活了多少天
     *
     * @param birthday 生日（字符串）
     * @return 天
     */
    public static long getDay(String birthday) throws RuntimeException, ParseException {
        //校验数据的合法性
        if (birthday == null) {
            throw new RuntimeException("生日不能为空");
        }

        //日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = sdf.parse(birthday);//生日

        //计算活多少天
        //天：1000*60*60*24
        //(当前毫秒 - 生日毫秒) / 天
        Date date2 = new Date();

        long day = (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24);

        return day;
    }
}
