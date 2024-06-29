package com.itheima.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> set = new TreeSet<>();

        //添加元素
        set.add(100);
        set.add(88);//所存储元素会按照规则进行排序
        set.add(99);
        set.add(55);

        System.out.println(set);
    }
}
