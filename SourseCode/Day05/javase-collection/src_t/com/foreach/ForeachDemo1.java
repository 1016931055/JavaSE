package com.itheima.foreach;

public class ForeachDemo1 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {10,3,5,19,7,8};

        //使用增强for遍历数组
        for(int num : arr){

            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
