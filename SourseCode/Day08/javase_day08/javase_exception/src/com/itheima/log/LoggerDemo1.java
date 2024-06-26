package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo1 {
    //当前类中需要记录日志信息
    private static final Logger LOGGER = LoggerFactory.getLogger("LoggerDemo1类");


    public static void main(String[] args) {
        LOGGER.trace("main方法开始运行了...");

        LOGGER.trace("main方法中调用了method方法~");
        new LoggerDemo1().method(null);
        LOGGER.trace("method方法执行结束");
    }


    public void method(String name) {
        LOGGER.trace("method方法执行了...");

        if (name == null || "".equals(name)) {
            LOGGER.warn("调用method方法时，传递的name参数为空");
            return;
        }




    }
}
