package com.itheima.lambda.demo2;

public class LambdaDemo1 {
    public static void main(String[] args) {

        //调用：useShowHandler方法
        //方式1： 创建子类对象作为参数
        useShowHandler( new ShowHandlerImple() ); //传递的是一个子类对象

        //方式2： 使用匿名内部类作为参数
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("Hello , Lambda");
            }
        });

        //方式3： 使用Lambda简化匿名内部类
        useShowHandler( () -> {
            //要做什么事情？  打印输出
            System.out.println("Hello  Lambda ！");
        });

    }

    //方法
    public static void useShowHandler(ShowHandler handler){
        handler.show();
    }
}

//实现类
class ShowHandlerImple implements ShowHandler{
    @Override
    public void show() {
        System.out.println("hello , Lambda");
    }
}
