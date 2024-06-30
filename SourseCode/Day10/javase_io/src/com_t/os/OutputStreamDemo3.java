package com.itheima.os;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象，并关联文件，进行追加写入数据
        FileOutputStream fos = new FileOutputStream("files/helloworld.txt" , true);

        //向文件中写入数据
        fos.write("黑马".getBytes());
        fos.write("\r\n".getBytes());//向文件中写入一个换行符号（window操作系统）

        //释放资源
        fos.close();
    }
}
