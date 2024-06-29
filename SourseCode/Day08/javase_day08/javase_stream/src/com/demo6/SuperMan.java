package com.itheima.demo6;

public class SuperMan {
    private String name;

    public SuperMan() {
    }

    public SuperMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuperMan{" +
                "name='" + name + '\'' +
                '}';
    }
}
