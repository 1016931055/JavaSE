package com.itheima.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        //创建两个List集合
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        //向集合中添加元素
        Collections.addAll(list1 , "熊大大","熊二","光头强","吉吉国王","李老板");
        Collections.addAll(list2 , "张三疯","张三","张无忌","李四");

        //第一个队伍： 名字是3个字 、 只要前3位
        Stream<String> stream1 = list1.stream()
                .filter(name -> name.length() >= 3)
                .limit(3);

        //第二个队伍：只要姓名的 、 不要前2位
        Stream<String> stream2 = list2.stream()
                .filter(name -> name.startsWith("张"))
                .skip(2);

        //合并流
        Stream<String> newStream = Stream.concat(stream1, stream2);
        
        //转换类型
        List<Person> personList = newStream.map(name -> new Person(name))
                .collect(Collectors.toList());


        for (Person person : personList) {
            System.out.println(person);
        }


    }
}
