package com.itheima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    Collections类 : 单列集合的工具类
        sort方法是一个重载的方法，可以实现自然排序及比较器排序。
        要特别注意的是sort方法只能对List集合进行排序，方法如下：

        public static <T extends Comparable> void sort (List<T> list)
*/
public class SortDemo {
    // 练习：定义List集合，存储若干整数，进行排序
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();

        //向集合中添加元素
        Collections.addAll( list , 5, 1, 3, 6, 4, 2);

        //排序
//        Collections.sort(list);//要求：元素自己具备自然排序

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2 - n1;
            }
        });

        System.out.println(list);


    }
}
