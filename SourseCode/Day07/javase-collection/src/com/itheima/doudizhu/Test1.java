package com.itheima.doudizhu;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        //Map集合：存储扑克牌的牌面值和编号
        Map<Integer, String> pokerMap = new HashMap<>();
        //List集合： 存放扑克牌的编号
        List<Integer> pokerNumber = new ArrayList<>();

        //功能1：准备牌
        int index = 0;//初始化扑克牌编号
        pokerMap.put(index, "大王");//添加扑克牌编号和牌面值
        pokerNumber.add(index);//添加扑克牌编号
        index++;
        pokerMap.put(index, "小王");
        pokerNumber.add(index);
        index++;
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                pokerMap.put(index, colors[j] + numbers[i]);//添加扑克牌编号和牌面值
                pokerNumber.add(index);//添加扑克牌编号
                index++;//修改扑克牌编号
            }
        }
        // System.out.println(pokerMap);


        //功能2：洗牌（就是要打乱 扑克牌编号 顺序）
        Collections.shuffle(pokerNumber);
        //       System.out.println(pokerNumber);


        //功能3：发牌（给玩家发的是扑克牌编号）
        /* 扑克牌编号（List集合） ： 21, 32, 44, 2, 28, 51, 1, 45, 29, 19, 16, 4,..........
                                  0   1   2   3  4   5   。。。。。。。。。。。。。
           玩家1：  21, 2        索引：0、3 、6          索引值%3==0
           玩家2：  32, 28       索引：1、4 、7          索引值%3==1
           玩家3：  44, 51       索引：2、5 、8          索引值%3==2

           底牌：   索引值>50
        */
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();//底牌

        //注意：使用普通for循环遍历pokerNumber集合
        for (int i = 0; i < pokerNumber.size(); i++) {
            //使用索引值对3进行取模运算
            if (i > 50) {
                //是底牌：扣留
                dp.add(pokerNumber.get(i));
            } else if(i % 3 == 0){
                player1.add(pokerNumber.get(i));
            }else if (i % 3 == 1) {
                player2.add(pokerNumber.get(i));
            } else if (i % 3 == 2) {
                player3.add(pokerNumber.get(i));
            }
        }
//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);
//        System.out.println(dp);


        //功能4：看牌
        lookPoker("小乔", player1, pokerMap);
        lookPoker("大乔", player2,pokerMap);
        lookPoker("黄月英", player3, pokerMap);
        lookPoker("底牌", dp,pokerMap);

    }

    /**
     * 看牌功能
     * @param name     玩家名字
     * @param treeSet  玩家手中的扑克牌编号
     * @param pokerMap  扑克牌集合（扑克牌编号、扑克牌面值）
     */
    public static void lookPoker(String name , TreeSet<Integer> treeSet , Map<Integer, String> pokerMap){
        System.out.println(name+"手中的扑克牌：");
        //遍历：Set集合（取出每一个扑克牌编号，通过编号，获取具体的扑克牌面值）
        for (Integer pokerNum : treeSet) {
            String poker = pokerMap.get(pokerNum);
            System.out.print( poker +"   ");
        }
        System.out.println("\n-----------------------------------------------------------------------------------");
    }
}
