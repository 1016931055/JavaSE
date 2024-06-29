package com.itheima.genericity.demo4;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //创建集合对象时，指定元素类型
        //在java中有多态的概念，但是泛型中没有多态
        //ArrayList<Person> list = new ArrayList<Worker>();

        //在语法定义层面，可以使用： 泛型的通配符 ? (任意类型)
        //ArrayList<?> list = new ArrayList<Student>();

        ArrayList<Student> students = new ArrayList<Student>();
        method(students);

        ArrayList<Worker> workers  = new ArrayList<Worker>();
        method(workers);

        ArrayList<String> list = new ArrayList<>();
        //method(list);
    }


    public static void method( ArrayList<? extends Person> list ){

    }

}
