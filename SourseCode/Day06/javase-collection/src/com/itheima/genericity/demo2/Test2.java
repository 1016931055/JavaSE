package com.itheima.genericity.demo2;

public class Test2 {
    public static void main(String[] args) {
        //子类实现接口时，没有指定泛型类型（子类使用了和接口一样的泛型）
        //创建子类对象时，明确泛型类型
        MyCollectionImpl2<String> myCollectionImpl2 = new MyCollectionImpl2<>();

        myCollectionImpl2.add("字符串");
    }
}
