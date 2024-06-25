package com.itheima.genericity.demo2;

public class Test1 {
    public static void main(String[] args) {
        //子类实现接口时，明确了接口上泛型的类型
        MyCollectionImpl myCollection = new MyCollectionImpl();

        myCollection.add(100);
    }
}
