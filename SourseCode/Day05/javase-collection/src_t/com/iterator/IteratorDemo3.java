package com.itheima.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> collection = new ArrayList<String>();

        //向集合中添加元素
        collection.add("Java");
        collection.add("MySQL");
        collection.add("Mybatis");


        //使用迭代器：遍历集合
        Iterator<String> it = collection.iterator();
        String str1 = it.next();//取出元素：Java
        System.out.println(str1);
        String str2 = it.next();//取出元素：MySQL
        System.out.println(str2);
        String str3 = it.next();//取出元素：Mybatis
        System.out.println(str3);
        String str4 = it.next();//集合中没有元素了，不能在获取了（如在获取会发生异常：NoSuchElementException）
        System.out.println(str4);

    }
}
