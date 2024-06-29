package com.itheima.algorithm;

import java.util.Arrays;

/*
    冒泡排序 : 将一组数据按照从小到大的顺序进行排序
    冒泡排序的原理 : 相邻元素两两作比较 , 大的元素往后放

    需求 : 将数组中的元素 {3,5,2,1,4} 进行升序排序
*/
public class BubbleSort {
    public static void main(String[] args) {
        //数组
        int[] arr = {3, 5, 2, 1, 4};

        //比较：n-1次轮
        for (int i = 0; i < arr.length - 1; i++) {
            //第一轮：3, 2, 1, 4           5
            //第二轮：2, 1, 3              4 5
            //第三轮：1, 2                 3 4 5
            //第四轮：1                    2 3 4 5
            for (int j = 0; j < arr.length-1-i; j++) {
                //相邻的两个元素，进行两两比较
                if(arr[j] >  arr[j+1]){
                    //交换元素
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
