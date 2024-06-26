package com.itheima.stream.demo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo2 {
    //演示：对流中的元素进行去重
    public static void main(String[] args) {
        //集合
        List<Student> studentList = new ArrayList<>();

        //添加学生
        studentList.add(new Student("张三",22));
        studentList.add(new Student("李四",24));
        studentList.add(new Student("张三",22));
        studentList.add(new Student("王五",25));
        studentList.add(new Student("李四",23));

        //去除集合中重复元素
        studentList.stream()
                .distinct()//针对自定义类型元素，去重时：要保障自定义类型元素有重写hashCode()、equals()
                .forEach(student -> System.out.println(student));
    }
}
