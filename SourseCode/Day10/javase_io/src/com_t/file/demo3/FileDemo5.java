package com.itheima.file.demo3;

import java.io.File;

public class FileDemo5 {
    //演示：File类中的获取方法
    public static void main(String[] args) {
        //相对路径
        File file = new File("files/helloworld.txt");

        //获取绝对路径
        String path = file.getAbsolutePath();
        System.out.println("绝对路径："+path);

        //获取文件名
        String name = file.getName();
        System.out.println("文件名："+name);

        //getPath() : 在创建File对象时，构造方法中传递的参数是什么，就获取到这个路径
        System.out.println(file.getPath());

    }
}
