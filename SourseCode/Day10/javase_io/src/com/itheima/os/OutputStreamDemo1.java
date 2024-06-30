package com.itheima.os;

import java.io.*;

public class OutputStreamDemo1 {
    //演示：字节输出流的入门
    public static void main(String[] args) throws IOException {
        //创建：字节输出流对象，并关联一个文件（如文件不存在，则创建新文件）
        OutputStream os = new FileOutputStream("files/hello.txt");

        //操作：写数据
        os.write('B');

        //关闭：释放资源
        os.close();
    }
}
