package com.itheima.genericity;

/*
    泛型是什么？
    在java语言中，是一种类型参数，可以设置存储数据的类型

    泛型解决程序中什么问题？
    在创建集合对象时，明确了集合中所存储元素的类型（限定类型）

    泛型类： 当不能确类中成员变量具体使用类型时，可以用泛型表示
 */
class MyClass<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
public class GenericyDemo1 {
    public static void main(String[] args) {
        //创建对象：指定泛型类型为String
        MyClass<String> mc = new MyClass<>();

        mc.setObj("SZL");

        System.out.println(mc.getObj());
    }
}
