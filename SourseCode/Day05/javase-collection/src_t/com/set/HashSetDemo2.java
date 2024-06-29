package com.itheima.set;

import java.util.HashSet;

public class HashSetDemo2 {
    //使用HashSet集合存储：Student对象 （要求：不能有重复对象）
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<Student> studentSet = new HashSet<>();

        //向集合中添加学生对象
        studentSet.add(new Student("熊大", 23));
        studentSet.add(new Student("光头强", 24));
        studentSet.add(new Student("熊二", 22));
        studentSet.add(new Student("熊大", 24));

        //遍历集合
        for (Student student : studentSet) {
            System.out.println(student);
        }
        /*注意：当使用HashSet存储自定义对象时，可能会出现存储了重复内容的对象
        解决方案： 在自定义类中重写hashCode()和equals方法
        * */


    }
}
