package com.itheima.file.demo3;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //创建File对象（相对路径）
        File file = new File("files/helloworld.txt");

        file.createNewFile();//创建文件

        //创建File对象
        File dir = new File("files/itcast/heima");
        //创建目录
        dir.mkdirs();//父级目录 不存在，会自动创建父级目录后，在创建当前目录
        //dir.mkdir();//创建单一层次目录（要求：父级目录 必须存在）
    }
}
