package com.itheima.genericity.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list= new ArrayList<>();
        list.add("java");
        list.add("mysql");


        //在调用方法时，以传递的参数作为泛型的类型
        String[] strings = list.toArray( new String[2] );
        System.out.println(strings[1]);


        //Arrays.sort();
    }
}
