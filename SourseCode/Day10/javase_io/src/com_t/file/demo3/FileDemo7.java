package com.itheima.file.demo3;

import java.io.File;

public class FileDemo7 {
    public static void main(String[] args) {

        try {

            method("f:/api");

        }catch (Exception e){
            //处理异常
        }

    }

    public static void method(String path) {
        //基于给定的路径字符串，创建File对象
        File file = new File(path);

        //判断目录是否存在
        if(!file.exists()){
            throw new RuntimeException("给定的路径不存在!");
        }

        //目录存在
        if(file.isDirectory()){

            //获取目录下所有的文件对象
            File[] files = file.listFiles();

            for (File f : files) {
                System.out.println(f);
            }

        }
    }
}
