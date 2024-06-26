package com.itheima.stream.demo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class StreamDemo1 {
    //演示： 流中元素的改变
    public static void main(String[] args) {
        //集合
        List<String> list = new ArrayList<>();
        //集合中添加元素
        Collections.addAll(list, "张三", "李四");

        //把集合中的元素类型,从String类型,转换为Student类型
        list.stream() //Stream流中都是String类型元素
                .map( name -> new Student(name) ) //把String类型元素,转换为Student类型元素
                .forEach(student -> System.out.println(student));


//        list.stream()
//                .map(new Function<String, Student>() {
//                    //把String类型 => Student类型
//                    @Override
//                    public Student apply(String s) {
//                        return new Student();
//                    }
//                });
    }
}
