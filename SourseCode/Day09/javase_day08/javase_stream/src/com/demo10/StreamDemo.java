package com.itheima.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        //创建List集合
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

        //使用Stream流解决需求：保留年龄>=24岁的人，并将结果收集到Map集合（key：姓名 、 value：年龄）
        Map<String, String> map = list.stream()
                .filter(str -> Integer.parseInt(str.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0],
                        s -> s.split(",")[1]));

        System.out.println(map);
    }
}
