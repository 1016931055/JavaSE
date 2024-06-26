package com.itheima.stream.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo2 {
    //演示：Stream流操作元素的方法 skip
    public static void main(String[] args) {
        //集合
        List<Integer> list = new ArrayList<>();
        //把多个元素，添加到list集合中
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);

        //截取Stream流中的元素
        list.stream()
                .skip(3)//跳过指定个数的元素数量，截取后续的元素
                .forEach(num -> System.out.println(num));

    }
}
