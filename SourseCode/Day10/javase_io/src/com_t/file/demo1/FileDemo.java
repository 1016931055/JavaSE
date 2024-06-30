package com.itheima.file.demo1;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //创建File对象
        File file1 = new File("F:\\files\\hello.txt");
        File file2 = new File("F:/files/hello.txt");

        System.out.println(file1);
        System.out.println(file2);
    }
}
