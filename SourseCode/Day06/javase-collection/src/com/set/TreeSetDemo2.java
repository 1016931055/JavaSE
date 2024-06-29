package com.itheima.set;

import java.util.TreeSet;

public class TreeSetDemo2 {
    //使用：TreeSet集合存储自定义对象
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> set = new TreeSet<>();

        //添加元素
        set.add(new Student("bbb",23));
        set.add(new Student("ccc",22));
        set.add(new Student("aaa",24));
        set.add(new Student("aaa",23));

        //遍历集合
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
