package com.stream.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {
    //演示：Stream流操作元素的方法 limit
    public static void main(String[] args) {
        //集合
        List<Integer> list = new ArrayList<>();
        //把多个元素，添加到list集合中
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);

        //截取集合中的部分元素
        list.stream()
                .limit(3) //截取Stream流中的前3个元素
                .forEach(num -> System.out.println(num));

    }
}
