package com.itheima.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    //验证：Set集合的特点
    public static void main(String[] args) {
        //创建Set集合
        Set<String> set= new HashSet<>();

        set.add("html");
        set.add("mysql");
        set.add("java");
        set.add("mysql");//不允许存储重复元素

        System.out.println(set);//存取元素顺序不保证一致

        //因为Set集合没有索引，所以不能使用普通for循环遍历
        //Set集合遍历 ： 迭代器 -> 增强for
        for (String s : set) {
            System.out.println(s);
        }
    }
}
