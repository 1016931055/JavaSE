package com.lambda.demo4;

public class StringHandlerDemo {
    public static void main(String[] args) {
        useStringHandler((String str) -> {
            System.out.println(str);
        });
    }

    public static void useStringHandler(StringHandler strhd){
        strhd.printMessage("SZL");
    }
}
