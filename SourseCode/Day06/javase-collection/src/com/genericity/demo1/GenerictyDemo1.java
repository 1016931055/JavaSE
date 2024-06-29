package com.itheima.genericity.demo1;

//泛型类： 当不能确类中成员变量具体使用类型时，可以用泛型表示
class MyClass<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}



public class GenerictyDemo1 {
    public static void main(String[] args) {
        //创建对象：指定泛型类型为String
        MyClass<String> mc = new MyClass<>();

        mc.setObj("黑马");
        System.out.println(mc.getObj());
    }
}
