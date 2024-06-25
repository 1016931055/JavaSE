package com.itheima.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //创建Collection集合（多态代码的体现）
        Collection coll = new ArrayList();

        //集合常用方法： 添加、删除、  获取 、 修改 、  判断
        //添加元素
        coll.add("Java");
        coll.add("MySQL");
        System.out.println(coll);

        //判断：集合是否包含mysql元素
        if(coll.contains("MySQL")){
            //为真：集合有中mysql元素
            //删除元素
            coll.remove("MySQL");
        }
        System.out.println(coll);

        System.out.println("集合的大小："+coll.size());
        //清空集合中所有的元素
        coll.clear();
        System.out.println(coll);


        coll.add("HTML");
        coll.add("JavaScript");

        //把集合转换为数组
        Object[] objects = coll.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
