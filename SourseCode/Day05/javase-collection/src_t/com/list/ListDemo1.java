package com.itheima.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    //验证List集合的特性
    public static void main(String[] args) {
        //创建List集合（多态、泛型）
        List<Integer> list = new ArrayList<>();

        //添加元素
        list.add(100);
        list.add(0,300);
        list.add(200);
        list.add(300);//允许存储重复元素

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            //根据索引取出集合中的每一个元素
            Integer num = list.get(i);

            System.out.println(num);
        }
    }
}
