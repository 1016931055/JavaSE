package com.itheima.exception.demo8;

//自定义异常类： 生日是空
public class BirthdayIsNullException extends RuntimeException {
    public BirthdayIsNullException() {
    }

    public BirthdayIsNullException(String message) {
        super(message);
    }
}
