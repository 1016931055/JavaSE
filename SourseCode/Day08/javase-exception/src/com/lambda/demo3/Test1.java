package com.lambda.demo3;

public class Test1 {
    public static void main(String[] args) {
        useShowHandler(() ->
                System.out.println("展示"));
    }

    public static void useShowHandler(ShowHandler shd){
        shd.show();
    }
}
