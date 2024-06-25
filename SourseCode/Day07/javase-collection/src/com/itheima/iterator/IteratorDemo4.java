package com.itheima.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo4 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> collection = new ArrayList<String>();

        //向集合中添加元素
        collection.add("Java");
        collection.add("MySQL");
        collection.add("Mybatis");
        collection.add("Spring");

        //使用迭代器：遍历集合
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            String str = it.next();

            //操作元素
            if(str.equals("MySQL")){
                //不能使用集合对象：删除元素
                //collection.remove("MySQL");

                //在迭代器遍历过程中，要删除元素使用： 迭代器对象中的remove方法
                it.remove();
            }
        }

        System.out.println(collection);


    }
}
