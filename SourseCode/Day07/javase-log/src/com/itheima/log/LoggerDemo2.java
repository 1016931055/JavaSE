package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LoggerDemo2 {
    //创建日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("LoggerDemo2");

    public static void main(String[] args) {
        //集合
        List<String> list = new ArrayList<>();

        //日志有5个级别： TRACE(留痕)、DEBUG(调试)、INFO(信息)、WARN（警告）、ERROR（错误）
        //日志最小级别：trace
        //日志最大级别：error
        //Logger对象基于不同的级别，提供不同的方法：
        // TRACE级别对应的方法： trace(String)
        // INFO级别对应的方法： info(String)
        // ERROR级别对应的方法： error(String)



        LOGGER.trace("开始初始化集合中的元素"); // 输出语句，是为了开发中做测试写的 （程序上线后运行不需要输出）
        //向集合中添加元素
        list.add("java");
        list.add("mysql");
        LOGGER.trace("集合元素初始化完成"); // 输出语句，是为了开发中做测试写的 （上线后运行不需要输出）


        LOGGER.info("集合中的元素：" + list);//程序运行时，要记录集合中初始化后的结果
    }
}
