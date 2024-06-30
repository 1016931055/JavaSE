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



# 【Lambda】

## 简答

1. 请简述Lambda的使用前提条件？

   ```
   
   ```

2. 什么叫做函数式接口

   ```
   
   ```

3. 请说出Lambda表达式的格式

   ```
   
   ```
   
4. 请说出Lambda表达式参数和函数体的简化规则

   ```
   
   ```



   



## 题目1

请使用Lambda表达式启动一个Thread线程，线程中打印：1--100所有数字。

答案：

```java

```

 

## 题目2

请使用Lambda表达式调用Collections的sort()方法，可以实现对一个List<String>集合进行：降序排序。

编写main()方法，在main()中按以下步骤编写代码：

 1. 定义一个List<String>集合，并存储以下数据：

    ```
    "cab","bac","acb","cba",“bca”,"abc"
    ```

    2. 使用Lambda表达式调用Collections的sort()方法对集合进行降序排序。

2. 排序后向控制台打印集合的所有元素。



答案：

```java

```





## 题目3

给定一个计算器 Calculator 接口，内含抽象方法 calc(减法)，其功能是可以将两个数字进行相减，并返回差值。

```java
public interface Calculator { 
	public abstract int calc(int a, int b); 
}
```

在下面的代码中，请分别使用Lambda的标准格式及省略格式调用 invokeCalc 方法，完成130和120的相减计算： 

```java
public class TestInvokeCalc {
    public static void main(String[] args) {
			//TODO 请分别使用Lambda【标准格式】及【省略格式】调用
 		 	//invokeCalc方法来计算130‐120的结果
    }
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
```

----------

答案：

```java

```













# 【File】

## 题目4

请完善代码模板中的逻辑，键盘输入文件路径字符串，调用show方法，传入路径字符串（如果这个路径表示的文件实际不存在，则创建文件），输出这个文件的文件名、绝对路径名、父目录、文件大小、后缀名。

代码模板如下：

```java
public class FileTest1{
  public static void main(String[] args){
        //TODO 1.完成键盘录入字符串
		//TODO 2.调用show方法传入字符串
  }
  
  public static void show(String filePath){
    //TODO 3.按题干需求完成功能
  }
  
}
```

答案：

~~~java

~~~













# 【IO流】

## 简答题

1. 请解释IO是什么意思？

   ```
   
   ```

2. 请说出IO流的顶级父类有哪些？

   ```
   
   ```



## 题目1

在你计算机的一个盘（比如D盘）根目录下创建一个文件，名字叫做 file01.txt。保存以下内容（要求是单字节字符，比如字母或者数字）

**file01.txt**

```java
abcdef123456
```

要求：

1. 使用字节输入流**一次读取一个字节**的方法将file01.txt的文件读取并打印
2. 使用字节输入流**一次读取多个字节**的方法将file01.txt的文件读取并打印

代码模板：

~~~java
public class InputStreamTest{
  public static void main(String[] args){
    	read1();
    	System.out.println("======");
      read2();
  }
  
  public static void read1(){
    //TODO 一次读取一个字节
  }
  public static void read2(){
    //TODO 一次读取多个字节
  }
}
~~~

---

答案：

~~~java

~~~









## 题目2

在D盘中创建两个文件夹，img1,img2。在img1中放置一个图片文件，将img1中的图片文件使用字节流复制到img2中。

答案：

```java

```





##  题目3

请使用FileOutputStream向文件输出：HelloWorld

要求：

1. 用 `try-catch-finally` 方式处理异常。
2. 用 `try-with-resource` 方式处理异常。

代码模板：

```java
public class Demo01 {
    public static void main(String[] args) {

    }

    public static void test1() {
        // 用 try-catch-finally 方式处理异常
    }


    public static void test2() {
        // 用 try-with-resource 方式处理异常
    }
}

```

答案：

```java

```













