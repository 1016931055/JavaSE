package com.itheima.file.demo3;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        //当itcast目录下有内容，不能删除
        //File file =new File("files/itcast");

        File file =new File("files/itcast/heima");

        //删除目录
        boolean result = file.delete();//删除空目录

        System.out.println(result);
    }
}
