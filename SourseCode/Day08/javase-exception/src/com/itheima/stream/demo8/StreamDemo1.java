package com.itheima.stream.demo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {
    //演示：Stream流中的排序(升序)
    public static void main(String[] args) {
        //集合
        List<Integer> list = new ArrayList<>();
        //把多个元素，添加到list集合中
        Collections.addAll(list, 11, 2, 13, 42, 15, 6, 7);


        //需求: 针对集合中小于30的元素进行排序
        list.stream()
                .filter(num -> num < 30)
                .sorted()//默认：使用元素自身的自然排序规则 （升序）
                .forEach(num -> System.out.println(num));
    }
}
