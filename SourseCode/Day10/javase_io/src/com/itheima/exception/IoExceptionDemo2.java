package com.itheima.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoExceptionDemo2 {
    public static void main(String[] args){

        //创建字节输入流，关联源文件（读）     //创建字节输出流，关联目标文件（写）
        try(  FileInputStream fis = new FileInputStream("F:\\files\\123.jpg");
              FileOutputStream fos = new FileOutputStream("files/dog.jpg");
           ) {
            //循环：读数据、写数据
            int data = 0;
            while( (data = fis.read()) != -1){
                //把读取的数据写入到目标文件中
                fos.write(data);
            }

        }catch (IOException e){
            //异常处理
            e.printStackTrace();
        }
    }
}
