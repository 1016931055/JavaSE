package com.itheima.demo9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //保留集合中的偶数
        Integer[] array = list.stream()
                .filter(num -> num % 2 == 0)//过滤流对象中的元素
                .toArray(value -> new Integer[value]); //把流中的元素收集到数组中

        System.out.println(Arrays.toString(array));
    }
}
