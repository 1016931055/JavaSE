package com.itheima.file.demo2;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //相对路径（拿当前项目工程）
        File f = new File("files/hello.txt");

        System.out.println(f);
        System.out.println(f.getAbsolutePath());//获取绝对路径
    }
}
