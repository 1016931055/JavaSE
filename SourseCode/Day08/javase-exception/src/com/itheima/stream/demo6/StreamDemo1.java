package com.itheima.stream.demo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {
    //演示：对流中的元素进行去重
    public static void main(String[] args) {
        //集合
        List<Integer> list = new ArrayList<>();
        //把多个元素，添加到list集合中
        Collections.addAll(list, 1, 2, 3, 2, 5, 3, 6, 4, 7);

        list.stream()
                .distinct() //对流中的元素进行去重
                .forEach(num -> System.out.println(num));
    }
}
