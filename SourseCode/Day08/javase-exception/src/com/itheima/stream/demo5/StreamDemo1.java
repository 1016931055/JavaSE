package com.itheima.stream.demo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
    //演示：流的合并
    public static void main(String[] args) {
        //集合
        List<Integer> list = new ArrayList<>();
        //把多个元素，添加到list集合中
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);

        //数组
        Integer[] arr = {8,9,10};

        //把集合和数组中的元素合并在一起
        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = Arrays.stream(arr);

        //使用Stream类中的静态方法：concat  合并两个stream流
        Stream<Integer> newStream = Stream.concat(s1, s2);

        newStream.forEach(num -> System.out.println(num));
    }
}
