package com.stream.demo10;

import com.itheima.genericity.demo4.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list,"张三,23","李四,52","王五,31");

        list.stream()
                .filter(str ->
            // 将字符串变为Integer
            Integer.parseInt(str.split(",")[1]) >= 24)
        .collect(Collectors.toMap((str -> str.split(",")[0]),
                                   str -> str.split(",")[1]));

//        List<Person> list2 = list.stream().map(Person::new).collect(Collectors.toList());
//        System.out.println(list2);
    }
}
