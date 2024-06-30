package com.itheima.file.demo3;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //创建File类对象
        File f = new File("files/hello.txt");

        //删除文件
        boolean result = f.delete();
        System.out.println(result);
    }
}
