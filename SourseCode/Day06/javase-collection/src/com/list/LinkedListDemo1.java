package com.itheima.list;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        //创建LinkedList集合
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(0, 200);
        list.add(300);
        list.add(200);//允许存储重复元素
        System.out.println(list);//存取有序

        //LinkedList集合中的特有方法
        list.addLast(1);//添加到链表的末尾
        list.addFirst(999);//添加到链表头部
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
