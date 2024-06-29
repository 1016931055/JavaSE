package com.itheima.changeable_param;

public class ChangeableParameterDemo1 {
    //演示：可变参数的基本使用
    public static void main(String[] args) {
        //调用带有可变参数的方法
        int sum = getSum(10,20,30);

        System.out.println(sum);
    }

    /**
     *
     * @param args   可变参数 （本质：就是一个数组）  只能书写在参数列表的末尾
     * @return
     */
    public static int getSum( int... args ){
        int sum=0;

        //把可变参数当做数组使用
        for (int i = 0; i < args.length; i++) {
           sum += args[i];
        }

        return sum;
    }

//    public static int getSum(int[] arr){
//        return 0;
//    }


    //以下定义的两个getSum方法 ，可以使用：可变参数 简化方法定义
//    public static int getSum(int num1, int num2, int num3) {
//        return num1 + num2 + num3;
//    }
//
//    public static int getSum(int num1, int num2) {
//        return num1 + num2;
//    }
}
