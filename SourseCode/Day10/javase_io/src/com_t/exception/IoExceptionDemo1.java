package com.itheima.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoExceptionDemo1 {
    public static void main(String[] args) {
        //定义字节输入流
        FileInputStream fis = null;
        //定义字节输出流
        FileOutputStream fos = null;

        try {
            //创建字节输入流，关联源文件（读）
            fis = new FileInputStream("F:\\files\\123.jpg");

            //创建字节输出流，关联目标文件（写）
            fos = new FileOutputStream("files/dog.jpg");

            //循环：读数据、写数据
            int data = 0;
            while ((data = fis.read()) != -1) {
                //把读取的数据写入到目标文件中
                fos.write(data);
            }

        } catch (IOException e) {
            //异常处理
            e.printStackTrace();
        } finally {
            //释放资源（不论是否有异常，都要释放资源）
            try {
                if(fis!=null){
                    fis.close();
                }
                if(fos != null){
                    fos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
