package com.itheima.nesting;

import java.util.ArrayList;
import java.util.List;
/*
    使用场景举例：一年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，保存一个年级所有的班级信息

    思路：
    可以使用List集合保存一个班级的学生
    可以使用List集合保存所有班级

    因此我们可以定义集合如下：
    班级：List<String>
        举例 :
            List<String> 一班 = {迪丽热巴 , 古力娜扎 ,马尔扎哈 ,欧阳娜娜}
            List<String> 二班 = {李小璐 , 白百何 , 马蓉}
            List<String> 三班 = {林丹 ,文章, 陈赫}

    年级：List<List<String>>
        举例 :
            List<List<String>> 年级 = {一班 , 二班 , 三班}
*/
public class ListNestingListDemo {
    public static void main(String[] args) {
        //班级1
        List<String> classes1 = new ArrayList<>();
        classes1.add("迪丽热巴");
        classes1.add("古力娜扎");
        classes1.add("马尔扎哈");
        classes1.add("欧阳娜娜");

        //班级2
        List<String> classes2 = new ArrayList<>();
        classes2.add("李小璐");
        classes2.add("白百何");
        classes2.add("马蓉");

        //班级3
        List<String> classes3 = new ArrayList<>();
        classes3.add("林丹");
        classes3.add("文章");
        classes3.add("陈赫");

        //年级 （存储多个班级）
        List<List<String>> grade = new ArrayList<>();
        grade.add(classes1);
        grade.add(classes2);
        grade.add(classes3);


        //遍历嵌套集合
        for (List<String> classes : grade) {

            //遍历：班级
            for (int i = 0; i < classes.size(); i++) {
                String name = classes.get(i);
                System.out.println(name);
            }

            System.out.println("----------------------------");
        }

    }
}