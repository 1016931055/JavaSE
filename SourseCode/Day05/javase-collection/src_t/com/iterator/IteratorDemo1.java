package com.itheima.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> collection = new ArrayList<String>();

        //向集合中添加元素
        collection.add("Java");
        collection.add("MySQL");
        collection.add("Mybatis");
        collection.add("Spring");

        //使用迭代器：遍历集合
        //1、通过集合对象，获取到迭代器对象
        Iterator<String> it = collection.iterator();

        //2、while循环，判断迭代器对象中是否有下一个元素
        while (it.hasNext()) {
            //3、使用迭代器对象，取出下一个元素
            String str = it.next();//泛型好处：不需要进行强制类型转换

            System.out.println(str);
        }
    }
}
