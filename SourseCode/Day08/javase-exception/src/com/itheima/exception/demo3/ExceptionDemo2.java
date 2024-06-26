package com.itheima.exception.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    //演示：捕获的使用 （解决代码中的编译时异常）
    //main方法不允许在向上抛出异常了（异常处理最终必须在main方法中完成）
    public static void main(String[] args) {
        String strDate = "2022-08-15 10:23:27";

        Date date = null;
        //接收到method的告知：有ParseExpcetion编译时异常
        try {
            date = method(strDate);
        } catch (ParseException e) {
            System.out.println("异常处理....");
        }

        //判断：date是否为空
        if(date == null){
            //提示
        }else{
            //正常执行后续代码
        }

        System.out.println("继续向下执行........");
    }

    //throws : 声明 （当前方法中如果有ParseException，就抛出给调用者）
    public static Date method(String strDate) throws ParseException {
        //日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date date = sdf.parse(strDate);//当前行代码存在：编译时异常

        return date;
    }

}
