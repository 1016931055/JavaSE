package com.itheima.file.demo3;

import java.io.File;

public class FileDemo6 {
    //演示：获取指定目录下所有的文件
    public static void main(String[] args) {
        //绝对路径
        File file = new File("F:\\API");

        //获取目录下的所有文件，文件封装为File对象，存储到数组中
        File[] files = file.listFiles();

        for (File f : files) {
            System.out.println(f);
        }
    }
}
