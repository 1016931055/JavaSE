package com.itheima.lam.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list , 4,2,7,3,5);

        //排序：降序
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer n1, Integer n2) {
//                return n2-n1;
//            }
//        });
        //使用Lambda表达式
        Collections.sort(list, (Integer n1, Integer n2) -> {
            return n2-n1;
        });




        System.out.println(list);
    }
}
