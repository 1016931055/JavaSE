package com.stream.demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamDemo {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("张三"));

        // 通过map方法,将User类强制转换成了SuperMan类
        // map方法将流中的元素类型进行转换
        list.stream()
                .map(new Function<User, SuperMan>() {
                    @Override
                    public SuperMan apply(User user){
                        return new SuperMan(user.getName());
                    }
        }).forEach(System.out::println); // SuperMan{name='张三'}


        // 简化写法：
        list.stream()
                .map((User user) -> new SuperMan(user.getName()))
                .forEach(System.out::println);
    }
}
