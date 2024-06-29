package com.itheima.demo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //集合
        List<String> list1 = new ArrayList<>();
        //存储元素
        list1.add("张三疯");
        list1.add("张三");
        list1.add("张小小");

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "光头强", "张小小", "张老板");

        //第1个流对象
        Stream<String> stream1 = list1.stream();
        //第2个流对象
        Stream<String> stream2 = list2.stream();

        //合并流
        Stream<String> newStream = Stream.concat(stream2, stream1);


        newStream
                .distinct() //去除流中的重复元素（注意细节：流中存储的是自定义对象时，在自定义对象中要重写：hashCode、equals）
                .forEach(name -> System.out.println(name));
    }
}
