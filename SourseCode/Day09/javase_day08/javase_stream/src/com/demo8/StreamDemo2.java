package com.itheima.demo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list , 4,10,5,2,9);

        //获取流对象（创建流水线）
        Stream<Integer> stream = list.stream();

        //获取流中元素的个数
        long count=  stream.filter(num ->  num%2==0).count();
        System.out.println("偶数有："+count+"个");

        //count()  是Stream流中的终结方法（关闭流水线）

        //注意细节 ：在流对象使用了终结方法后， 就表示流关闭了（无法使用了）
        stream.forEach(num -> System.out.println(num));
    }
}
