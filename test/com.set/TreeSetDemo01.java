package com.set;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        // TreeSet所存储元素会按照规则进行排序
        // 可通过重写compaTo()方法更改排序规则
        /*
            compareTo方法如何指定排序规则 :
        此方法如果返回的是小于0 , 代表的是当前元素较小 , 需要存放在左边
        此方法如果返回的是大于0 , 代表的是当前元素较大, 需要存放在右边
        此方法如果返回的是0 , 代表的是当前元素在集合中已经存在 , 不存储
         */
        TreeSet<Integer> set = new TreeSet<>();

        //添加元素
        set.add(100);
        set.add(88);
        set.add(99);
        set.add(55);

        System.out.println(set);
    }
}
