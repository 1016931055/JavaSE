package com.itheima.algorithm;

/*
    冒泡排序 : 将一组数据按照从小到大的顺序进行排序
    冒泡排序的原理 : 相邻元素两两作比较 , 大的元素往后放

    需求 : 将数组中的元素 {3,5,2,1,4} 进行升序排序
*/
public class BubbleSort {
    public static void main(String[] args) {
        //数组
        int[] arr = {3, 5, 2, 1, 4};
        // 运行次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 运行次数每次-i,因为每次最后一位都是最大数,因此不用对它进行操作
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
