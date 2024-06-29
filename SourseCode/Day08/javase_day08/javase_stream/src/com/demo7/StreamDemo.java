package com.itheima.demo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        //集合
        List<Integer> list = new ArrayList<>();
        //存储元素
        Collections.addAll(list, 8,3,9,2,6);

        //使用stream流对集合进行排序
        list.stream()
                .sorted() //默认排序方式：自然排序
                .forEach(num -> System.out.print(num+"\t"));

        System.out.println();

        list.stream()
                .sorted( (num1,num2) -> num2-num1 ) //指定了比较器排序
                .forEach(num -> System.out.print(num+"\t"));

    }
}
