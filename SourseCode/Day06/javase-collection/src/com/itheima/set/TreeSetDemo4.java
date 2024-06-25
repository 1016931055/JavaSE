package com.itheima.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    //使用比较器实现排序规则
    public static void main(String[] args) {
        //创建TreeSet集合，并指定比较器排序规则
        TreeSet<Teacher> teacherSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher tea1, Teacher tea2) {
                //比较：年龄
                int result = tea2.getAge() - tea1.getAge();

                //当年龄相同时：比较姓名
                if (result == 0) {
                    result = tea2.getName().compareTo(tea1.getName());
                }
                //返回比较结果：0 、 正数 、 负数
                return result;
                //return tea2.getAge() - tea1.getAge() == 0 ? 0 : tea2.getName().compareTo(tea1.getName());
            }
        });

        teacherSet.add(new Teacher("zhangsan", 23));
        teacherSet.add(new Teacher("lisi", 24));
        teacherSet.add(new Teacher("wangwu", 23));
        teacherSet.add(new Teacher("zhangsan", 24));
        teacherSet.add(new Teacher("lisi", 24));

        for (Teacher teacher : teacherSet) {
            System.out.println(teacher);
        }


        //比较器排序的使用
        String[] strs = {"aaa", "bbb", "ccc"};
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        System.out.println(Arrays.toString(strs));

    }
}
