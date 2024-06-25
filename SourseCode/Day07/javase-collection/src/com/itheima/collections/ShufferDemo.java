package com.itheima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Collections类 : 操作单列集合的工具类
        public static void shuffle(List<?> list) 对集合中的元素进行打乱顺序
        1 乱序只能对List集合进行乱序
        2 集合中元素类型可以任意类型
*/
public class ShufferDemo {
    //需求 : 定义一个List集合，里面存储若干整数。对集合进行乱序
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();

        //向集合中添加元素
        Collections.addAll( list , 1,2,3,4,5,6);

        //打乱集合中元素的顺序
        Collections.shuffle(list);

        System.out.println(list);
    }
}
