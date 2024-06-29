package com.itheima.hw;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HomeWork1 {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};

        //1. 定义一个BIgDecimal变量用来接收总和
        BigDecimal sum = new BigDecimal(0);
        //2. 遍历将数组元素都转换为BigDecimal，并累加到总和
        for (int i = 0; i < arr.length; i++) {
            sum = sum.add(new BigDecimal( arr[i] ));
        }

        //3. 打印总和
        System.out.println("总值 = " + sum);

        //4. 计算平均值，打印平均值
        BigDecimal len = new BigDecimal(arr.length);
        //两位小数，四舍五入
        BigDecimal average = sum.divide(len, 2, RoundingMode.HALF_UP);
        System.out.println("平均值 = " + average);
    }
}
