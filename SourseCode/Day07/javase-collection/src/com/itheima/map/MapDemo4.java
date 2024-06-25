package com.itheima.map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    //使用HashMap存储自定义对象（key）
    public static void main(String[] args) {
        //创建map集合对象
        HashMap<Student, String> studentMap = new HashMap<>();

        //添加元素（ key元素 ： 自定义对象 ）
        studentMap.put(new Student("zs", 23), "北京");
        studentMap.put(new Student("ls", 24), "上海");
        studentMap.put(new Student("zs", 23), "北京"); //学生对象中的内容是重复的

        //遍历集合
        Set<Student> keys = studentMap.keySet();
        for (Student key : keys) {
            System.out.println( key +" --- " + studentMap.get(key));
        }
    }
}
