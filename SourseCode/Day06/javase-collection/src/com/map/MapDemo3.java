package com.itheima.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    //遍历：键值对
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("周瑜","小乔");
        map.put("孙策","大乔");
        map.put("刘备","孙尚香");
        map.put("诸葛亮","黄月英");

        //遍历：先获取到所有的键值对对象(Map.Entry)， 遍历所有的键值对对象， 通过键值对对象(Map.Entry)分别获取 key、value
        //1、先获取到所有的键值对对象(Map.Entry)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //2、遍历所有的键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //3、通过键值对对象(Map.Entry)分别获取 key、value
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("key="+key+" , value="+value);
        }
    }
}
