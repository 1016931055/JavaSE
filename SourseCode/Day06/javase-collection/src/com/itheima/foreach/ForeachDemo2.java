package com.itheima.foreach;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> collection = new ArrayList<String>();
        //向集合中添加元素
        collection.add("Java");
        collection.add("MySQL");
        collection.add("Mybatis");
        collection.add("Spring");

        //使用增强for遍历集合
        for (String str : collection) {

            if(str.length()>5){
                System.out.println(str);
            }
        }
    }
}
