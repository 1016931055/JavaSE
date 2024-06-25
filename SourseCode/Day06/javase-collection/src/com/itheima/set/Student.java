package com.itheima.set;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

//    @Override
//    public int compareTo(Student stu) {
//        //排序规则：先按照姓名排序，姓名相同的再按照年龄排序
//
//        //this ： 当前对象
//        //stu :  传递过来的对象
//        //String类本身实现了Comparable接口，并重写了compareTo方法（结论：String类自带自然排序）
//        int result = this.name.compareTo(stu.name);
//        if(result == 0){
//            //按照年龄排序
//            result =  stu.age - this.age;
//        }
//
//        return result;
//    }


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    /**
     * 功能： 比较两个数据的大小
     * @return :  int类型     0:两个数据相同     负数or正数 : 两个数据不同
     */
    public int compareTo(Student stu) {

        //比较年龄
        int result = this.age - stu.age;
        //年龄相同：比较姓名
        if (result == 0) {
            result = this.name.compareTo(stu.name);
        }

        return result;
    }
}
