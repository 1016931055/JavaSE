package com.itheima.genericity.demo2;

public class Test1 {
    public static void main(String[] args) {
        //子类实现接口时，明确了接口上泛型的类型,故不用自己指定类型
        MyCollectionImpl myCollection = new MyCollectionImpl();

        //子类实现接口时,没指定泛型类型（子类使用了和接口一样的泛型）
        //创建子类对象时，明确泛型类型
        MyCollectionImpl2<String> myCollection2 = new MyCollectionImpl2<>();
    }
}
