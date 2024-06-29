package com.itheima.lam.demo3;

public class Test1 {
    public static void main(String[] args) {
        //调用方法，传递一个ShowHander类型的对象
//        useShowHandler(new ShowHandler() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类：重写show方法");
//            }
//        });
        useShowHandler( () -> {
            System.out.println("Lambda：重写show方法");
        } );
    }

    /**
     * @param handler ShowHander类型对象
     */
    public static void useShowHandler(ShowHandler handler) {
        //调用方法
        handler.show();
    }
}
