package com.itheima.is;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
    //演示：字节输入流入门
    public static void main(String[] args) throws IOException {
        //创：创建字节输入流对象，并关联文件
        //InputStream is = new FileInputStream("files/test.txt");//当关联的文件不存在时：运行时异常
        InputStream is = new FileInputStream("files/hello.txt");//当关联的文件不存在时：运行时异常

        //读：读取数据
//        char ch =(char) is.read();//读取到A的编码值：65 ，强制转换为char类型： A
//        System.out.println(ch);
//
//        char ch2 =(char) is.read();//当读取到数据时，返回数据的编码值
//        System.out.println(ch2);
//
//        char ch3 =(char) is.read();//读取下一个数据
//        System.out.println(ch3);
//
//        int a = is.read(); //读取到文件末尾了（没有数据了）   当读取不到数据时，返回：-1
//        System.out.println(a);

        int data = 0;

        while( (data = is.read()) != -1 ){
            System.out.println( (char) data );
        }



        //关：释放资源
        is.close();
    }
}
