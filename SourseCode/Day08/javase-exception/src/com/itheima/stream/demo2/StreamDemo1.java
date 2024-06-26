package com.itheima.stream.demo2;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //单列集合
        List<String> list= new ArrayList<>();
        list.add("string");
        //双列集合
        Map<String,String> map = new HashMap<>();
        map.put("黑马","上海");
        //数组
        int[] arr = {1,2,3,4,5};

        //单列集合 => Stream流
        Stream<String> s1 = list.stream();

        //双列集合 => Stream流 （间接实现）
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> s2 = entries.stream();

        //数组 => Stream流
        IntStream s3 = Arrays.stream(arr);//使用Arrays工具类中的静态方法：stream( int[] )
        
        //使用Stream类中提供的静态方法（把多个相同类型的元素，转换为Stream流对象）
        Stream<Integer> s4 = Stream.of(11, 22, 33, 44, 55);
    }
}
