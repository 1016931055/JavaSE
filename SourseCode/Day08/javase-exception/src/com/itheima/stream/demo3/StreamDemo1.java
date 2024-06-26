package com.itheima.stream.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo1 {
    //演示：Stream流中间方法的使用
    //过滤集合中的元素
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //把多个元素，添加到list集合中
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);

        //Stream流，推荐：链式写法
        list.stream().filter( num -> num>5).forEach(num -> System.out.println(num));
        //以前学习的StringBuilder对象，也有链式写法：  new StringBilder("上海").append("-北京").append("-广州")
        System.out.println("--------------------------------------------------------");

        //1、把集合转换为Stream流对象
        Stream<Integer> s1 = list.stream();

        //2、对Stream流中的元素进行过滤。过滤条件：小于5
//        s1.filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return false;
//            }
//        });
        Stream<Integer> s2 = s1.filter(num -> num > 5);

        //3、使用Stream流的终结方法：打印stream流中的元素
//        s2.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//
//            }
//        });
        s2.forEach( num -> System.out.println(num) );
    }
}
