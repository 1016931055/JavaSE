package com.itheima.optional;

//A公司开发人员使用的工具类
public class A_Util {

    //方法名：checkValidData
    public static boolean checkValidData(Object obj){
        //对非空进行逻辑判断
        if(obj != null){
            return true;
        }
        return false;
    }
}
