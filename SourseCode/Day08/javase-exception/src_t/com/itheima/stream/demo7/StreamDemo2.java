package com.itheima.stream.demo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo2 {
    //演示： 流中元素的改变
    public static void main(String[] args) {
        //集合
        List<String> list = new ArrayList<>();
        //集合中添加元素
        Collections.addAll(list, "shanghai", "beijing");

        //需求: 把集合中所有的元素转换为大写
        list.stream()
                .map(city -> city.toUpperCase())
                .forEach(city -> System.out.println(city));

    }
}
