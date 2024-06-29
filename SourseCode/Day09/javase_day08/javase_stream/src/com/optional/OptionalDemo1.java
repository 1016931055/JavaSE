package com.itheima.optional;



import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        //获取学生对象
        Student student = getStudent();

        //没有使用Optional之前，进行非空验证
        //A公司
        if (A_Util.checkValidData(student)) {
            System.out.println("有效数据");
        }
        //B公司
        if (B_Util.isNotNull(student) == false) {
            System.out.println("有效数据");
        }

        //C程序员：开始使用的A公司的工具类，  后面技术总监要求更换为B公司的工具类 （意味着：C程序员要修改代码逻辑）


        //使用Optional进行非空验证        ofNullable可以避免：空指针异常的问题
        boolean result = Optional.ofNullable(student).isPresent();
        if (result) {
            System.out.println("Optional : 有效数据");
        }

        //获取Optional中的元素值
        Student stu = Optional.ofNullable(student).get();
        System.out.println(stu);


//        Optional<Student> optionalStudent = Optional.ofNullable(student);
//        if(optionalStudent.isPresent()){
//            //stuent对象不为空
              //........
//        }else{
//            //........
//        }
    }


    public static Student getStudent() {
        return  new Student("张三");
       // return null;
    }
}
