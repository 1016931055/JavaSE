package com.itheima.map.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    //统计字符串中每个字符出现的次数
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        //使用Map集合，记录每个字符出现的次数
        Map<Character, Integer> map = new HashMap<>();

        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //取出每一个字符
            Character ch = str.charAt(i);

            //判断：字符在map集合中是否存在
            if (map.containsKey(ch)) {
                //存在： 通过key取出value值， 对value值+1运算， 把+1运算后的结果，再次存储到相同key的value下
                Integer value = map.get(ch);
                value++;
                map.put(ch, value);
            } else {
                //不存在：  直接把字符存储到map集合中，value值初始化为1
                map.put(ch, 1);
            }
        }

//        System.out.println(map);


        //获取map集合中所有的键值对对象
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        //遍历所有的键值对对象
        for (Map.Entry<Character, Integer> entry : entries) {
             Character key = entry.getKey();
             Integer value = entry.getValue();

            System.out.print(key+"("+value+")  ");
        }
        System.out.println();
    }
}
