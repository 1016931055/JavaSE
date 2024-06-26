package com.itheima.exception.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    //演示：捕获的使用
    public static void main(String[] args){
        String strDate = "2022-08-15 10:23:27";

        method(strDate);

        System.out.println("继续向下执行........");
    }


    public static Date method(String strDate){
        //日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date date = null;

        //自己处理：当try块中发生异常时，try块会把异常对象交给catch来处理
        try{

            date = sdf.parse(strDate);//当前行代码存在：编译时异常

        }catch (ParseException e){
            System.out.println("处理异常......");
        }
        return date;
    }
}
