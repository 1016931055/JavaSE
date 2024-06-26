package com.itheima.exception.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    //演示：声明的使用 （解决代码中的编译时异常）

    //throws就是异常声明的关键字
    //现在为了演示，所以在main方法上添加了throws， 在企业开发中，main方法不允许使用throws
    public static void main(String[] args) throws ParseException {
        String strDate = "2022-08-15 10:23:27";

        //接收到method的告知：有ParseExpcetion编译时异常
        method(strDate);


        System.out.println("继续向下执行........");
    }

    //throws : 声明 （当前方法中如果有ParseException，就抛出给调用者）
    public static Date method(String strDate) throws ParseException{
        //日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date date = sdf.parse(strDate);//当前行代码存在：编译时异常

        return date;
    }

}
