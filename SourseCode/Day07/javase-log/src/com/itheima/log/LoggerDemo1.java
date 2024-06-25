package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LoggerDemo1 {
    //创建日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("LoggerDemo1");

    public static void main(String[] args) {
        //集合
        List<String> list = new ArrayList<>();

//        System.out.println("开始初始化集合中的元素");
        LOGGER.info("开始初始化集合中的元素");
        //向集合中添加元素
        list.add("java");
        list.add("mysql");
//        System.out.println("集合元素初始化完成");
        LOGGER.info("集合元素初始化完成");
//        System.out.println("集合中的元素：" + list);
        LOGGER.info("集合中的元素：" + list);
    }
}
