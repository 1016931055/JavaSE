package com.itheima.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> map = new HashMap<>();

        //向map集合中存储元素（key、value）
        map.put("javaee", "Java从入门到放弃");
        map.put("java", "Java从入门到放弃");//添加元素
        map.put("mysql", "数据库之删库跑路");
        map.put("java", "Java高薪就业攻略");//修改元素 当key元素相同时，会使用新的value元素覆盖之前的旧元素
        System.out.println(map);

        //删除map集合中的元素（根据key元素名字删除）
        if (map.containsKey("java")) { //判断map集合中的key元素是否有"java"
            map.remove("java");
        }
        System.out.println(map);

        //获取map集合中的value元素
        String mysql = map.get("mysql");
        System.out.println(mysql);
    }
}
