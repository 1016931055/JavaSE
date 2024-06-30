package com.itheima.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流，关联源文件（读）
        FileInputStream fis = new FileInputStream("F:\\files\\123.jpg");

        //创建字节输出流，关联目标文件（写）
        FileOutputStream fos = new FileOutputStream("files/dog.jpg");

        //循环：读数据、写数据
        int data = 0;
        while( (data = fis.read()) != -1){
            //把读取的数据写入到目标文件中
            fos.write(data);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
