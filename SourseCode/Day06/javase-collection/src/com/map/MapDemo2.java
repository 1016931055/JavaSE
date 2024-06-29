package com.itheima.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    //遍历：键找值
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("周瑜","小乔");
        map.put("孙策","大乔");
        map.put("刘备","孙尚香");
        map.put("诸葛亮","黄月英");

        //遍历：先获取到所有的key元素， 遍历所有的key元素， 通过key找到value
        //1、先获取到所有的key元素
        Set<String> keys = map.keySet();
        //2、遍历所有的key元素
        for (String key : keys) {
            //3、通过key找到value
            String value = map.get(key);

            System.out.println("key="+key +" , value="+value);
        }
    }
}
