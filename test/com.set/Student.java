package com.set;

import java.util.Objects;
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    // 排序规则
    @Override
    public int compareTo(Student stu) {
        // 排序规则：先按照姓名排序，姓名相同的再按照年龄排序

        // String类自身实现了Comparable接口，并重写了compareTo方法(String类自带自然排序)
        int result = this.name.compareTo(stu.name);
        if(result == 0){
            // 按照年龄排序
            result = this.age - stu.age ;
        }
        return result;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
