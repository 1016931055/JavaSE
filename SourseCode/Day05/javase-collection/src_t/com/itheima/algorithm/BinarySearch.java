package com.itheima.algorithm;

/*
    二分查找 :
        原理 : 每次去掉一般的查找范围
        前提 : 数组必须有序
        步骤 :
            1，定义两个变量，表示要查找的范围。默认min = 0 ， max = 最大索引
            2，循环查找，但是min <= max
            3，计算出mid的值
            4，判断mid位置的元素是否为要查找的元素，如果是直接返回对应索引
            5，如果要查找的值在mid的左半边，那么min值不变，max = mid -1.继续下次循环查找
            6，如果要查找的值在mid的右半边，那么max值不变，min = mid + 1.继续下次循环查找
            7，当 min > max 时，表示要查找的元素在数组中不存在，返回-1.
*/
public class BinarySearch {
    public static void main(String[] args) {
        //数组
        int[] arr = {4, 1, 5, 3, 2};
    }
}
