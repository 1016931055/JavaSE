package com.itheima.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    private static final Logger LOGGER = LoggerFactory.getLogger("ExceptionDemo5类");


    public static void main(String[] args) {
        String strDate = "2000年10月10日";

        try {//监视可能会发生异常的代码

            //调用的方法可能会发生异常（自己处理）
            Date birthday = method(strDate);

            System.out.println("生日："+ birthday);

        } catch (ParseException e) { //处理异常 ： 拿异常对象类型和当前定义的异常类型进行匹配（类型相同 或 是父类型）
            System.out.println("处理异常");

            //toString()  把异常对象转换为字符串
//            System.out.println(e.toString());

            //在开发中，出现异常后，为了方便程序员调试代码，需要把异常信息打印出来（是哪个类、哪个位置）
            e.printStackTrace();

            //在日志中记录下异常
            LOGGER.error(e.getMessage());
        }

        System.out.println("程序继续执行");

    }


    private static Date method(String strDate) throws ParseException {
        //格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.parse(strDate);//有发生异常
    }
}
