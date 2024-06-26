package com.itheima.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //集合
        List<String> list = new ArrayList<>();
        //存储元素
        list.add("张三疯");
        list.add("张三");
        list.add("熊大");
        list.add("张小小");

        //使用Stream流
        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

        /* 集合的传统解决方案：
         *  1、遍历list集合
         *     for(String name : list){
         *     2、判断元素是否以"张"开头 ：  是 就把元素存储到另一个集合
         *     if(name.startWith("张")){
         *        新集合.add(元素)
         *     }
         *   }
         *  3、遍历 存储"张"开头的集合
         *  4、判断元素(字符串)的长度 == 3    是  就把元素存储到另一个集合
         *
         * */
    }
}
