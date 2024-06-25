package com.itheima.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 添加元素
        // List.add(索引 / 元素值) 向List集合中指定索引位置上，添加元素
        list.add(0, 10);
        list.add(1,50);
        // 如指定索引位置上已有索引，会自动后向移动

        //修改元素
        //List.set(索引 ， 元素值) //修改List集合中指定索引位置上的元素值
        list.set(0,20);

        //删除元素
        //List.remove(索引) //删除List集合中指定索引位置上的元素值
        list.remove(0);

        //获取元素
        //List.get(索引);
        System.out.println(list.get(0));
    }
}
