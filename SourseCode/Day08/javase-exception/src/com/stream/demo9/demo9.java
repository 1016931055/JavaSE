package com.stream.demo9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class demo9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);

        List<Integer> newList = list.stream().filter(num -> num%2 == 0)
                // Collectors提供了静态方法收集数据
                // Collectors.toArray(IntFunction<A[]> generator)
                // Collectors.toList()
                // Collectors.toSet()
                // Collectors.toMap(Function keyMapper,Function valueMapper)
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
