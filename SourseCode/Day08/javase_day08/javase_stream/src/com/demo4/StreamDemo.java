package com.itheima.demo4;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        //集合
        List<String> list = new ArrayList<>();
        //存储元素
        list.add("张三疯");
        list.add("张三");
        list.add("熊大");
        list.add("张小小");

        //演示： 中间方法 limit
        list.stream()
                .skip(1) //指定跳过多少个数据
                .limit(2) //截取指定个数的数据
                .forEach(name-> System.out.println(name));

    }
}
