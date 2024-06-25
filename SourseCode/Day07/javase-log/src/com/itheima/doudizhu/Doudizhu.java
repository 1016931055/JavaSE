package com.itheima.doudizhu;

import java.util.*;

public class Doudizhu {
    public static void main(String[] args) {
        /* 准备牌 */
        //集合： 54张扑克牌 (key：扑克牌编号 ， value：牌面)
        LinkedHashMap<Integer, String> pokers = new LinkedHashMap<>();

        //集合：记录54张扑克牌的编号
        List<Integer> pokerNumbers = new ArrayList<>();
        //明确： List集合中存储的编号(扑克牌编号)和Map集合中存储的key(扑克牌编号)是一致的


        int index = 2;//记录扑克牌编号的
        //向集合中存储：54张扑克牌
        pokers.put(0, "大王");
        pokerNumbers.add(0);//把扑克牌编号，存储到集合中
        pokers.put(1, "小王");
        pokerNumbers.add(1);

        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        for (String number : numbers) {
            for (String color : colors) {
                //添加扑克牌
                pokers.put(index, color + number);
                pokerNumbers.add(index);//把扑克牌编号存储到集合中
                index++;
            }
        }


        /* 洗牌 */
        //随机打乱List集合中元素的存储顺序
        Collections.shuffle(pokerNumbers);//打乱的是扑克牌编号顺序
        //List = { 34, 50 ,0 , 3 ,9 , .....}
        //集合索引： 0   1   2  3   4  .....


        /* 发牌： 三个玩家[交替摸牌]、 保留3张底牌 */
        /*  发牌，就是把扑克牌的编号（0~53），发给不同的玩家
         *   玩家1：    0   3   6   9
         *   玩家2：    1   4   7   10
         *   玩家3：    2   5   8   11
         *
         *     for(从0开始 ->  53结束){
         *          if(值 == 53  || 值 == 52 || 值 == 51){
         *             不发。扣留
         *          }
         *           值%3 == 0     => 玩家1
         *           值%3 == 1     => 玩家2
         *           值%3 == 2     => 玩家3
         *     }
         * */
        //创建三个玩家 （玩家手中的牌要排序：TreeSet集合[元素自动排序]）
        TreeSet<Integer> player1 = new TreeSet<>();//玩家1
        TreeSet<Integer> player2 = new TreeSet<>();//玩家2
        TreeSet<Integer> player3 = new TreeSet<>();//玩家3
        Set<Integer> dp = new HashSet<>();//底牌
        // 条件上限 - 3 ：  保留3张底牌
        for (int i = 0; i < pokerNumbers.size() - 3; i++) {
            if (i % 3 == 0) {
                //发牌给玩家1（把扑克牌编号发给玩家）
                player1.add(pokerNumbers.get(i));
            } else if (i % 3 == 1) {
                //发牌给玩家2
                player2.add(pokerNumbers.get(i));
            } else if (i % 3 == 2) {
                //发牌给玩家3
                player3.add(pokerNumbers.get(i));
            }
        }
        dp.add(pokerNumbers.get(51));
        dp.add(pokerNumbers.get(52));
        dp.add(pokerNumbers.get(53));

        //看牌
        lookPoker("王跃游",player1,pokers);
        lookPoker("王露",player2,pokers);
        lookPoker("王尊严",player3,pokers);
        lookPoker("底牌",dp,pokers);
    }

    /**
     * 功能： 看牌
     * @param name     玩家名称
     * @param player   玩家手中牌编号
     * @param pokers   54张扑克牌
     */
    public static void lookPoker(String name, Set<Integer> player , LinkedHashMap<Integer, String> pokers){
        System.out.println(name+" 的扑克：");
        for (Integer num : player) {
            String poker = pokers.get(num);
            System.out.print(poker+"\t");
        }
        System.out.println("\n");
    }
}
