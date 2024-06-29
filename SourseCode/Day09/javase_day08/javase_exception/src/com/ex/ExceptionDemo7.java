package com.itheima.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionDemo7 {
    //使用自定义异常处理
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("ExceptionDemo7类");

        try {

            printInfo("熊大", 0);


        }catch (NullPointerException e){
            System.out.println("处理空值异常");
        }catch (AgeOutOfBoundsException e){
            System.out.println("处理年龄超出范围异常");
            //记录到日志中
            logger.error(e.getMessage());
        }catch (RuntimeException e){
            System.out.println("处理其他运行时异常");
        }catch (Exception e){
            System.out.println("可以处理任何异常");
        }
    }

    //因为异常默认处理方式就是：当前没有异常处理，就抛出向外异常
    public static void printInfo(String name, int age)  {
        //校验：传递的数据不能为空
        if (name == null || "".equals(name)) {
            throw new NullPointerException("传递的姓名不能为空");
        }
        if (age < 18 || age > 50) {
            //使用自定义异常
            throw  new AgeOutOfBoundsException("传递的值为："+age+" , 传递的年龄必须是18~50之间");
        }


        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }
}
