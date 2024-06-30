package com.itheima.file.demo4;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileDemo {
    //需求 ：统计一个文件夹中每种文件的个数并打印。
    //	打印格式如下：
    //		txt:3个
    //		doc:4个
    //		jpg:6个

    public static void main(String[] args) {

        method("f:/files");

    }

    public static void method(String path) {
        //基于给定的路径字符串，创建File对象
        File file = new File(path);
        //判断：路径存在
        if(!file.exists()){
            throw  new RuntimeException("给定的路径不存在!");
        }

        //集合对象：存储每种类型文件的数量
        Map<String,Integer> map = new HashMap<>();

        //获取路径下所有的文件
        File[] files = file.listFiles();
        //遍历
        for (File f : files) {
            //获取文件名
            String name = f.getName();//hello.txt

            //以最一个点为索引，截取到末尾
            int index = name.lastIndexOf(".");//获取文件名最后一个点的索引位置
            String lastName = name.substring(index+1);

            //判断：文件后缀名在map集合中是否已存在
            if(map.containsKey(lastName)){
                //存在
                Integer value = map.get(lastName);
                value++;
                map.put(lastName,value);//覆盖
            }else{
                //不存在
                map.put(lastName , 1);
            }
        }


        System.out.println(map);
    }

}
