package com.itheima.map;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //创建TreeMap集合
        TreeMap<Integer ,String> treeMap = new TreeMap<>();

        //向集合中添加元素
        treeMap.put(11,"java");
        treeMap.put(7,"mysql");
        treeMap.put(10,"html");
        treeMap.put(9,"css");

        System.out.println(treeMap);
    }
}
