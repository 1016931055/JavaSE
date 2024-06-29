package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo1 {
    //创建日志对象
    private static final Logger LOGGER = LoggerFactory.getLogger("LogDemo1");

    //方法
    public static void main(String[] args) {
        //使用日志记录
        LOGGER.debug("调试信息......");

    }
}
