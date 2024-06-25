package com.itheima.nesting;

import java.util.*;

/*
    List嵌套Map :

    使用场景举例：一年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，姓名有与之对应的学号，保存一年级所有的班级信息。

    思路：
        1 可以使用Map集合保存一个班级的学生（键是学号，值是名字）
        2 可以使用List集合保存所有班级

    因此我们可以定义集合如下：

    班级：Map<String,String> 键是学号，值是姓名
        举例 :
            Map<String,String> 一班 = {it001 = 迪丽热巴 , it002 = 古力娜扎 ,it003 = 马尔扎哈 ,it004 = 欧阳娜娜}
            Map<String,String> 二班 = {it001 = 李小璐 , it002 = 白百何 , it003 = 马蓉}
            Map<String,String> 三班 = {it001 = 林丹 ,it002 = 文章, it003 = 陈赫}

    年级：List<Map<String,String>>保存每个班级的信息
        举例 :
              List<Map<String,String>> 年级 = {一班 , 二班 , 三班}
 */
public class ListNestingMapDemo {
    public static void main(String[] args) {
        //班级1
        Map<String, String> clases1 = new HashMap<>();
        clases1.put("it001", "迪丽热巴");
        clases1.put("it002", "古力娜扎");
        clases1.put("it003", "马尔扎哈");
        clases1.put("it004", "欧阳娜娜");
        //班级2
        Map<String, String> clases2 = new HashMap<>();
        clases2.put("it001", "李小璐");
        clases2.put("it002", "白百何");
        clases2.put("it003", "马蓉");
        //班级1
        Map<String, String> clases3 = new HashMap<>();
        clases3.put("it001", "林丹");
        clases3.put("it002", "文章");
        clases3.put("it003", "陈赫");

        //在List集合中存储Map集合
        List<Map<String, String>> grade = new ArrayList<>();
        grade.add(clases1);
        grade.add(clases2);
        grade.add(clases3);


        //遍历嵌套集合
        for (Map<String, String> classes : grade) {
            //遍历：班级
            for (String key : classes.keySet()) {
               String value = classes.get(key);

                System.out.println(key +" -- "+ value);
            }

            System.out.println("============================");
        }

    }
}
