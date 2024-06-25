package com.itheima.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        //添加元素
        map.put("周瑜","小乔");
        map.put("孙策","大乔");
        map.put("刘备","孙尚香");
        map.put("诸葛亮","黄月英");
        map.put("周瑜","小乔2");

        //遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println( key +" ---- "+ value);
        }
    }
}
