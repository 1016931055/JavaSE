package com.itheima.file.demo3;

import java.io.File;

public class FileDemo4 {
    //演示：File类中的判断方法
    public static void main(String[] args) {
        File file = new File("files/itcast");

        //判断文件或目录是否存在
        boolean result = file.exists();
        System.out.println(result);

        //判断是文件
        boolean result2 = file.isFile();
        System.out.println(result2);

        //判断是目录
        boolean result3 = file.isDirectory();
        System.out.println(result3);

    }
}
