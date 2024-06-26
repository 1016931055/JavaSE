package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/*
    使用java语言开发完成的程序，要给其他人使用，怎么办呢？

    把程序打包： xxxx.jar （jar文件是java文件压缩包）
    要使用第三方开发好的程序，怎么办？

    在自己的项目工程下，导入xxx.jar包
    使用Logback的步骤：

    导入Logback所需的相关jar文件，并添加到项目资源库中
    在项目工程下新建lib文件夹，把logback需要的jar文件存放到该文件夹下
    lib目录下的存储的jar文件，添加到当前项目资源库中
    把logback核心配置文件，拷贝到当前项目的src目录下
    在类中获取到Logger日志对象，使用日志对象中的API方法记录需要的操作信息
    Logback日志框架的核心：logback.xml

    xml文件
    Logback日志级别（从大到小）：

    error //错误
    warn //警告
    info //信息
    debug //调试
    trace //追踪（例：追踪用户行为轨迹）
 */
public class LoggerDemo1 {

    // 获取到一个Logger对象(使用日志对象记录相关操作)
    private static Logger logger = LoggerFactory.getLogger("LogbackDemo1类");


    public static void main(String[] args) {
        //System.out.println("进入到main方法执行程序...");
        // 直接创建日志到C盘 - code中
        logger.info("进入到main方法执行程序...");

        // 创建集合
        List<Integer> list = new ArrayList<>();

        logger.debug("Debug");

        logger.trace("追踪");

    }
}
