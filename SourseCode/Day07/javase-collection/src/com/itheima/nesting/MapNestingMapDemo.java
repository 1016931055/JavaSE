package com.itheima.nesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map嵌套Map

    使用场景举例：一个年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，姓名有与之对应的学号，保存一年级所有的班级信息，班级有与之对应的班级名称。

    思路：
    可以使用Map集合保存一个班级的学生（键是学号，值是名字）

    可以使用Map集合保存所有班级（键是班级名称，值是班级集合信息）

    因此我们可以定义集合如下：
    班级： Map<String,String> 键：学号，值：姓名
        举例 :
            Map<String,String> 一班 = {it001 = 迪丽热巴 , it002 = 古力娜扎 ,it003 = 马尔扎哈 ,it004 = 欧阳娜娜}
            Map<String,String> 二班 = {it001 = 李小璐 , it002 = 白百何 , it003 = 马蓉}
            Map<String,String> 三班 = {it001 = 林丹 ,it002 = 文章, it003 = 陈赫}

    年级： Map<String , Map<String,String>> 键：班级名称，值：具体班级信息
        举例:
            Map<String, Map<String,String>> 年级 = {"一班" = 一班 , "二班" = 二班 , "三班" = 三班 }
 */
public class MapNestingMapDemo {
    public static void main(String[] args) {
        //班级1 ： 存储学号、姓名
        Map<String, String> classes1 = new HashMap<>();
        classes1.put("it001", "迪丽热巴");
        classes1.put("it002", "古力娜扎");
        classes1.put("it003", "马尔扎哈");
        classes1.put("it004", "欧阳娜娜");
        //班级2
        Map<String, String> classes2 = new HashMap<>();
        classes2.put("it001", "李小璐");
        classes2.put("it002", "白百何");
        classes2.put("it003", "马蓉");
        //班级3
        Map<String, String> classes3 = new HashMap<>();
        classes3.put("it001", "林丹");
        classes3.put("it002", "文章");
        classes3.put("it003", "陈赫");

        //Map集合中存储Map集合（把班级存储到年级下 ， 给每个班级定个名字）
        Map<String, Map<String, String>> grade = new HashMap<>();
        grade.put("一班", classes1);
        grade.put("二班", classes2);
        grade.put("三班", classes3);


        //遍历嵌套集合
        //遍历：年级
        Set<String> set = grade.keySet();
        for (String classesName : set) {
            System.out.println(classesName+"信息：");

            //通过key找到value
            Map<String, String> classesMap = grade.get(classesName);
            //遍历：班级
            for (Map.Entry<String, String> classes : classesMap.entrySet()) {
                //获取学号
                String code = classes.getKey();
                //获取姓名
                String name = classes.getValue();

                System.out.println(code +" = "+name);
            }

            System.out.println("-----------------------------------");
        }

    }
}
