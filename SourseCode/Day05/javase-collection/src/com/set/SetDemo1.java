package com.itheima.set;
/*
    Set集合也是Collection集合的子类型，没有特有方法。Set比Collection定义更严谨

    特点 :
    元素是没有索引的(无索引)
    元素不能保证插入和取出顺序（无序）
    元素唯一(元素唯一)

    Set常用子类
    HashSet：底层由HashMap，底层结构哈希表结构。 去重，无索引，无序。 哈希表结构的集合，操作效率会非常高。
    LinkedHashSet: 底层结构链表加哈希表结构。 具有哈希表表结构的特点，也具有链表的特点。
    TreeSet：底层是由TreeMap，底层数据结构 红黑树。 去重，让存入的元素具有排序（升序排序）
 */
import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    //验证:set集合的特点
    public static void main(String[] args) {
        //创建set集合

        Set<String> set = new HashSet<>();

        set.add("html");
        set.add("mysql");
        set.add("java");
        set.add("Psql");

        System.out.println(set);//存取元素顺序不保证一致

        //因为Set集合没有索引，所以不能使用普通for循环遍历
        //Set集合遍历 ： 迭代器 -> 增强for
        for (String s : set) {
            System.out.println(s);
        }
    }
}
