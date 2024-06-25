package com.itheima.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    //验证： 存取元素顺序
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(200);
        set.add(300);
        set.add(100);
        set.add(100);

        for (Integer integer : set) {
            System.out.println(integer);
        }

    }
}
