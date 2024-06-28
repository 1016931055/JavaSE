```java
作业规范【必读】

命名要求：
	1. 类名，接口名，枚举名，注解名使用大驼峰
	2. 变量名，方法名，包名均使用小驼峰
	3. 常量名全大写，多个单词下划线分割
	4. 名字要见名知意，如果不知道对应的英文，可以使用拼音代替。不可使用无意义字符
  
代码规范：
	格式要良好，使用IDEA格式化缩进（快捷键：Ctrl+Alt+L）
  
答题规范：
	1. 每道题完整代码请贴入对应题目中的代码区。
    2. 如果有运行结果的，请把代码运行结果放到文档中
```





# 【泛型】

## 题目1

**有以下类结构：**

```
人员类(Person)：
        |--学生类(Student)
               |--Java学生类(JavaStudent)
               |--UI学生类(UIStudent)
        |--教师类(Teacher)
               |--Java教师类(JavaTeacher)
               |--UI教师类(UITeacher)
```

 **要求：**

- 请按上述要求定义类，并实现继承关系即可(不需要定义类成员，定义空类表示关系即可)
- 请按以下格式和要求定义测试类和方法：

```java
public class Test1{

       public static void main(String[] args){
              ArrayList<String> list1 = new ArrayList<>();
              ArrayList<Person> list2 = new ArrayList<>();
              ArrayList<Student> list3 = new ArrayList<>();
              ArrayList<JavaStudent> list4 = new ArrayList<>();
              ArrayList<UIStudent> list5 = new ArrayList<>();
              ArrayList<Teacher> list6 = new ArrayList<>();
              ArrayList<JavaTeacher> list7 = new ArrayList<>();
              ArrayList<UITeacher> list8 = new ArrayList<>();         
              //请测试哪些集合可以调用print1()方法
              //请测试哪些集合可以调用print2()方法
              //请测试哪些集合可以调用print3()方法
              //请测试哪些集合可以调用print4()方法
       }

       //要求：参数可以接收任何泛型的ArrayList参数
       public static void print1(ArrayList<?> list){
              
       }
       //要求：参数可以接收任何Person及其子类泛型的ArrayList参数
       public static void print2(ArrayList<? extends Person> list){
       }
       //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
       public static void print3(ArrayList<? extends Student> list){
       }
       //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
       public static void print4(ArrayList<? super JavaStudent> list){
       }

}
```



-----

参考答案：

思路：使用泛型的上限和下限



```java

```









# 【数据结构】

## 题目2

请写出你所知道的数据结构，至少5种。

```java
栈,队列,数组,集合,链表,二叉树,哈希表
```

写出栈结构、队列结构的特点

```
栈:先进后出；队列：先进先出
```

请写出数组结构的特点；

```
查询快，增删慢
```

请写出链表结构的特点

```
查询慢，增删快
（Linked List）无索引，无序，由一连串节点(Node)组成,节点通过指针连接，有addFirst/addLast方法
```







# 【List集合】

## 题目3

需求：创建一个ArrayList集合，添加5个整数，然后使用不同的方式遍历这些数据。

1. 自增for循环遍历

2. 迭代器遍历

3. 增强for循环遍历


答案：

```java
public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("普通For循环遍历：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("增强For循环遍历：");
        for (Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("迭代器遍历:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer next =  it.next();
            System.out.print(next + " ");
        }
    }
```

结果：

```latex
普通For循环遍历：
1 2 3 4 5 
增强For循环遍历：
1 2 3 4 5 
迭代器遍历:
1 2 3 4 5 
```

## 题目4

需求：定义一个方法 `int listTest(ArrayList<Integer> list, Integer num)`，要求实现返回num在list里面第一次出现的索引，如果num没出现过返回-1。



答案：

```java
 public static int listTest(ArrayList<Integer> list, Integer num){
        for ( int i = 0; i < list.size(); i++) {
            if (num.equals(list.get(i)))
                return i;
        }
        return -1;
    }
```

思路：

- 在方法中遍历list集合，判断是否是num，如果是返回索引，遍历完成后没有发现数据直接返回-1

- 对象比较用equals

- 在测试类中进行测试

  

```java

```





## 题目5

需求：

1. 定义一个学生类Student，包含三个属性姓名、年龄、性别，私有成员变量,生成无参，有参构造方法，生成get/set方法。

2. 创建三个学生对象存入ArrayList集合中。

3. 找出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。

4. 遍历集合输出对象属性信息。（输出格式如：姓名：张三, 年龄：23, 性别：男）

   

答案：

```java
// 创建3个Student对象
        Student stu1 = new Student("SZL1",12,"Male");
        Student stu2 = new Student("SZL2",15,"Male");
        Student stu3 = new Student("SZL3",23,"Male");

        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);

        int maxAge = stu1.getAge();
        Student changedStudent = stu1;

        for (Student student : stuList){
            if (student.getAge() > maxAge) {
                maxAge = student.getAge();
                changedStudent = student;
            }
        }
        changedStudent.setName("SLW");
        System.out.println(changedStudent);
```



打印结果：

```

```



# 【Set集合】

## 题目6

请编写main()方法，按以下要求顺序：

1. 定义一个Set集合，并存储以下数据：刘备,关羽,张飞,刘备,张飞
1. 打印集合大小
1. 使用迭代器遍历集合，并打印每个元素
1. 使用增强for遍历集合，并打印每个元素



**答案：**

思路：Set集合具有去重效果

```java
Set<String> set = new HashSet<>();
        set.add("刘备");
        set.add("刘备");
        set.add("关羽");
        set.add("张飞");
        set.add("关羽");

        System.out.println("Set的大小为:"+set.size());

        //迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String next =  it.next();
            System.out.print(next + " ");
        }
        System.out.println();
```

打印结果

```java

```



## 题目7

请按以下要求顺序编码：

1. 定义学生类Student，属性：姓名、性别、年龄

2. 定义测试类，及main()方法

3. 创建三个Student对象，分别设置以下数据：

   ```java
   张三,男,20
   李四,女,21
   张三,男,20
   ```

4. 定义一个存储Student类型的HashSet集合，将上述三个对象存储到Set集合中，要求集合中不能存储姓名,性别,年龄相同的元素。

5. 使用增强for遍历集合，获取集合中每个Student对象，并打印属性值；



**答案：**

思路：自定义对象保存到HashSet集合中，需要重写equals和hashCode方法

```java
Student s1 = new Student("张三",20,"男");
        Student s2 = new Student("李四",21,"女");
        Student s3 = new Student("张三",20,"男");

        Set<Student> set2 = new HashSet<>();
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);

        for (Student s : set2) {
            System.out.println(s);
        }

Student类中：
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}
```



打印结果：

```

```



## 题目8

请按以下要求顺序编码：

1. 定义一个可以存储“整数”的LinkedHashSet对象
1. 存储以下整数: 20,30,50,10,30,20
1. 打印集合大小。为什么跟存入的数量不一致？
1. 使用增强for遍历集合，打印大于25的元素



**答案：**

代码：

```java
        // 创建LinkedHashSet集合
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        // 添加元素
        lSet.add(20);
        lSet.add(30);
        lSet.add(50);
        lSet.add(10);
        lSet.add(30);
        lSet.add(20);
        System.out.println(lSet.size()); // 4

        lSet.stream().filter(num -> num>25).sorted().forEach(System.out::println);
```



为什么打印集合数量跟存入的数量不一致？

```java
底层是哈希表结构+链表结构 , 哈希表保证元素唯一 , 链表保证元素顺序
```



