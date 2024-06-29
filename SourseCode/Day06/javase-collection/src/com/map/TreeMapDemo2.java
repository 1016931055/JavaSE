package com.itheima.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //创建TreeMap集合， 指定比较器排序方式
        TreeMap<Integer ,String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2-n1;
            }
        });

        //向集合中添加元素
        treeMap.put(11,"java");
        treeMap.put(7,"mysql");
        treeMap.put(10,"html");
        treeMap.put(9,"css");

        System.out.println(treeMap);
    }
}
