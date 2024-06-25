package com.itheima.set;

import java.util.Comparator;
import java.util.TreeSet;

//创建子类，实现Comparator接口
class MyComparator implements Comparator<String>{
    @Override
    public int compare(String str1, String str2) {
        //str1 : 要存储的字符串数据
        //str2 : 已存在的字符串数据
        int result = str2.length() - str1.length();

        //当两个字符串长度相同时：按照字符串字典顺序排序
        if(result == 0) {
            result = str1.compareTo(str2);
        }
        return result;
    }
}

public class TreeSetDemo3 {
    public static void main(String[] args) {
        //在创建TreeSet集合时，指定了排序规则
        TreeSet<String> set = new TreeSet<>( new MyComparator() );

        //String本身具有自然排序规则
        set.add("java");
        set.add("oracle");
        set.add("javascript");

        System.out.println(set);
    }
}
