package com.itheima.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //集合
        List<String> list = new ArrayList<>();
        //存储元素
        list.add("张三疯");
        list.add("张三");
        list.add("熊大");
        list.add("张小小");

        //获取集合中所有的姓张的元素，并打印
//        Stream<String> stream1 = list.stream();
//        Stream<String> stream2 = stream1.filter(name -> name.startsWith("张"));
//        stream2.forEach( name -> System.out.println(name) );
        list.stream()
                .filter(name -> name.startsWith("张"))
                .forEach(name -> System.out.println(name));
    }
}
