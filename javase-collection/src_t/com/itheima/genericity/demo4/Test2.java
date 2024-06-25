package com.itheima.genericity.demo4;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<Object> list1 = new ArrayList<>();
        show1(list1);



        ArrayList<Integer> list2 = new ArrayList<>();
        show2(list2);
    }

    //接收的参数类型是：Number或其父类型
    public static void show1(ArrayList<? super Number> list){

    }

    //接收的参数类型是： Number或其子类型
    public static void show2(ArrayList<? extends Number> list){

    }
}
