package com.stream.demo2;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }



    public static void method1(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"abc","def","szl");

        // 获取list集合的Stream流对象
        Stream<String> stream = list.stream();

        // 遍历打印stream流的内容
        stream.forEach(s -> System.out.println(s));
    }

    private static void method2() {
        Map<String,String> map = new HashMap<>();
        map.put("java","基础");
        map.put("mysql","入门");

        // 获取map集合entrySet()的Stream流
        Stream<Map.Entry<String,String>> entryStream = map.entrySet().stream();
        entryStream.forEach(obj -> {
            System.out.println(obj.getKey() + obj.getValue());
        });
    }

    /**
     * 遍历int数组的stream方法(可用filter过滤)
     */

    private static void method3() {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr)
                .filter( num -> num > 3)
                .forEach( num -> System.out.println(num));
    }
}