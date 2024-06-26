package com.itheima.stream.demo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamDemo2 {
    //演示：Stream流中的排序(降序)
    public static void main(String[] args) {
        //集合
        List<Integer> list = new ArrayList<>();
        //把多个元素，添加到list集合中
        Collections.addAll(list, 11, 2, 13, 42, 15, 6, 7);


        //需求: 针对集合中小于30的元素进行排序
//        sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        })
        list.stream()
                .filter(num -> num < 30)//过滤掉值大于30的元素
                .sorted( (num1, num2) -> num2-num1)//降序（元素自身默认的排序规则不适合，需要改变排序规则。 使用比较器）
                .forEach(num -> System.out.println(num));
    }
}
