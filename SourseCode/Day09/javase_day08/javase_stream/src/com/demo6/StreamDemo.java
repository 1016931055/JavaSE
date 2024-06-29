package com.itheima.demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamDemo {
    public static void main(String[] args) {
        //集合
        List<User> list =new ArrayList<>();
        //集合中存储的元素是：User对象
        list.add(new User("张三"));

        list.stream()
                .map(user -> new SuperMan(user.getName()))//把User类型元素，转换为SuperMan类型元素
                .forEach(obj -> System.out.println(obj));


    }
}
