package com.file.demo1_创建File对象_绝对路径;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        // 创建File对象
        // 绝对路径：带有盘符的路径
        File file1 = new File("D:\\111");
        File file2 = new File("D:/111");

        System.out.println(file1);
        System.out.println(file2);
    }
}
