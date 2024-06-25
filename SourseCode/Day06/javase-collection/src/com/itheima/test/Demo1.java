package com.itheima.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    /*
       迭代器： Iterator (接口)
       ArrayList集合： 可以使用普通for循环遍历（有索引）
       Collection集合： 没有索引，不能使用普通for循环遍历

       集合提供了一种专用的遍历方式：迭代器

       //迭代器使用的固定步骤：
       1、通过集合对象，获取到迭代器对象
       2、利用迭代器对象中的API方法，遍历集合
           boolean   hasNext()    判断集合中是否有下一个元素
           Object    next()       获取集合中的下一个元素

       增强for循环
          作用：简化迭代器的书写


       在使用迭代器或增强for循环时：
       不能在循环体内，使用集合对象增删元素

    * */

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.add(200);
        collection.add(300);
        collection.add(400);

        //1、获取到迭代器对象
//        Iterator<Integer> it = collection.iterator();
//        //2、使用迭代器遍历集合
//        while (it.hasNext()) {
//            //真： 集合中有下一个元素
//            //获取集合中下一个元素
//            Integer num = it.next();
//
//
//            //
//            System.out.println(num);
//        }


        for (Integer num : collection) {

            System.out.println(num);
        }
    }

}
