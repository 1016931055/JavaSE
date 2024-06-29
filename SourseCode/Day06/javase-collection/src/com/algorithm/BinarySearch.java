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
        //数组 （二分查找要求数组必须是有序的）
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int key = 13;//要查找的元素

        boolean flag = searchKey(arr, key);
        System.out.println(flag);

    }

    public static boolean searchKey(int[] arr, int key) {
        //定义两个变量，分别记录：最小索引、最大索引
        int min = 0;
        int max = arr.length - 1;

        int mid;//记录中间索引位置（通过min、max计算得出的）

        //变量：记录是否存在所查找的元素
        boolean flag = false;//初始值为fales，表示没有所查找的元素存在

        //循环
        while (min <= max) {
            //计算中间索引
            mid = (min + max) / 2;

            //获取中间索引下的元素
            int num = arr[mid];

            if (num == key) {
                //找到元素了
                flag = true;
                break;
            } else if (num > key) {
                //修改max变量值
                max = mid - 1;

            } else if (num < key) {
                //修改min变量值
                min = mid + 1;
            }
        }

        return flag;
    }


    public static int searchKey2(int[] arr, int key) {
        //定义两个变量，分别记录：最小索引、最大索引
        int min = 0;
        int max = arr.length - 1;

        int mid;//记录中间索引位置（通过min、max计算得出的）

        //循环
        while (min <= max) {
            //计算中间索引
            mid = (min + max) / 2;

            //获取中间索引下的元素
            int num = arr[mid];

            if (num == key) {
                //找到元素了
                return mid;
            } else if (num > key) {
                //修改max变量值
                max = mid - 1;

            } else if (num < key) {
                //修改min变量值
                min = mid + 1;
            }
        }
        return -1;
    }
}
