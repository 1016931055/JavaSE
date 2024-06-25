package com.itheima.set;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<String> set = new HashSet<>();

        //添加元素
        set.add("html");
        set.add("javascript");
        set.add("java");
        set.add("mysql");

        //判断集合是否包含某个元素
        if(set.contains("html")){
            set.remove("html");
        }

        //遍历set
        for (String s : set) {
            System.out.println(s);
        }
    }
}
