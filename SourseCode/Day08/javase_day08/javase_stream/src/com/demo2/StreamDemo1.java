package com.itheima.demo2;

import java.util.*;
import java.util.stream.Stream;

//演示： 获取Stream流对象
public class StreamDemo1 {
    //Stream流的特殊操作： 把同一种类型的多个元素，转Stream流
    public static void method4(){
        Stream<String> stream = Stream.of("java", "mysql", "html");
    }


    //数组 => Stream流
    public static void method3(){
        Integer[] array ={1,2,3,4,5};

        //获取数组的Stream流对象
        Stream stream = Arrays.stream(array);

        System.out.println(stream);
    }

    //双列集合 => Stream流
    public static void method2(){
        Map<String,String> map = new HashMap<>();
        map.put("java","java基础");
        map.put("mysql","mysql入门");

        //获取Map集合的Stream流（不能直接获取）
        Stream<Map.Entry<String, String>> stream = map.entrySet().stream();

    }


    //单列集合 => Stream流
    public static void method1() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "熊大", "能二", "光头强");

        //获取List集合的Stream流对象
        Stream<String> stream = list.stream();
        System.out.println(stream);
    }


    public static void main(String[] args) {
        method3();
    }
}
