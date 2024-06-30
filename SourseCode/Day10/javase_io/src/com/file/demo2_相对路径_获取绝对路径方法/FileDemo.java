package com.file.demo2_相对路径_获取绝对路径方法;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        // 相对路径(拿当前项目工程作为参照)
        File file = new File("SourseCode");

        System.out.println(file.getName());
        // 获取绝对路径
        System.out.println(file.getAbsolutePath());
    }
}
