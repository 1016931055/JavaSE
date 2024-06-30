package com.itheima.os;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流
        FileOutputStream fos = new FileOutputStream("files/helloworld.txt");

        //操作：写数据
        fos.write("黑马程序员".getBytes() );//把字符串转换为字节数据并存储到数组中

        //byte[] buf = "黑马程序员".getBytes();
        //fos.write(buf,0,6);//将字节数组中部分数据，写入到文件中

        //释放资源
        fos.close();
    }
}
