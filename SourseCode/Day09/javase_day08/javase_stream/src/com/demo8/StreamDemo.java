package com.itheima.demo8;

import java.util.*;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list , 4,10,5,2,9);

        //求最大值
        Optional<Integer> max = list.stream().max((Integer n1, Integer n2) -> {
            return n1 - n2;
        });
        System.out.println(max);

        //求最小值
        Optional<Integer> min = list.stream().min((Integer n1, Integer n2) -> {
            return n1 - n2;
        });
        System.out.println(min);

        //获取流中元素的个数
        long count=  list.stream().filter(num ->  num%2==0).count();
        System.out.println("偶数有："+count+"个");

    }
}
