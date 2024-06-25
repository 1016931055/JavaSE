package com.itheima.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        //创建TreeMap集合， 指定比较器排序方式
        TreeMap<Student ,String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {

                //先比较年龄
                int result = stu2.getAge() - stu1.getAge();

//                //年龄相同
//                if(result == 0){
//                    //比较姓名
//                    result = stu2.getName().compareTo(stu1.getName());
//                }

                return result == 0 ? stu2.getName().compareTo(stu1.getName()) : result;
            }
        });
        //向集合中添加元素
        treeMap.put(new Student("ccc",12),"java");
        treeMap.put(new Student("bbb",14),"mysql");
        treeMap.put(new Student("aaa",11),"html");
        treeMap.put(new Student("ddd",12),"css");

        System.out.println(treeMap);
    }
}
