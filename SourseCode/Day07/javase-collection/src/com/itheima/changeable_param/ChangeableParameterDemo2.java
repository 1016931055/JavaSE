package com.itheima.changeable_param;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeableParameterDemo2 {
    //可变参数的应用：Collections工具类的addAll方法
    public static void main(String[] args) {
        //创建List集合对象
        List<String> list = new ArrayList<>();


        //使用Collections工具类，向list集合中存储数据
        Collections.addAll( list , "html","javascript");

        //向List集合中存储数据
        list.add("java");
        list.add("mysql");

        System.out.println(list);
    }
}
