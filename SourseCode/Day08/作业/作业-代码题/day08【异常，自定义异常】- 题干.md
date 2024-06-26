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

# 【异常】

## 题目1

请定义main()方法，在main()中按以下顺序要求编写代码：

1. 分别从控制台接收两个整数
1. 计算“第一个数 / 第二个数”的结果，并打印；
1. 为了防止第二个数为0导致异常，请在计算时使用异常处理。当出现异常时，向用户打印：第二个数不能为0！！

答案：

```java

```





## 题目2

 请定义main()方法，在main()中按以下顺序要求编写代码：

1. 定义一个String[]数组如下：

   `String[] arr = {”星期一”,”星期二”,”星期三”,”星期四”,”星期五”,”星期六”,”星期日”};`

1. 请用户输入一个整数1--7的值：
   根据用户输入，从数组中取出对应的星期名称，例如：
   用户输入：1
   程序提示：星期一

1. 为了防止用户输入小于1或者大于7的值，请使用异常处理从数组中取出对应的“星期名称”，在异常处理中打印：输入错误！！

答案：

```java
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1~7之间的整数值：")
        int num  = sc.nextInt(); 
        
        String week = "";
        
        try{
           week = getWeek(num); 
        }catch(Exception e){
            String msg = e.getMessage();
            System.out.println(msg);
        }
        
        System.out.println(week);    
    }
    
    //根据指定的数值，获取星期名字
    public static String getWeek(int num) throws RuntimeException {
        //校验参数是否合法
        if(num<1 || num>7){
            //手动引发异常并抛出
            throw new RuntimeException("输入错误！");
        }
        
       String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
       
       return arr[num-1]; 
    }
}
```



# 【自定义异常】

## 题目3

按以下步骤要求编写代码：

1. 定义一个“年龄异常类”：AgeException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
1. 定义一个“性别异常类”：SexException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
1. 定义一个Student类，属性：姓名、性别、年龄。
   在性别的set方法中判断是否是男/女，如果不是则抛出：性别异常
   在年龄的set方法中判断年龄是否是15--50之间，如果不是则抛出：年龄异常
1. 编写测试类，创建一个Student对象，并在try{}中调用setXxx()方法为对象属性赋值，在catch()中打印年龄错误。

答案：

AgeExeption

```java
public class AgeExeption extends RuntimeException{
    public AgeExeption(){}
    
    public AgeExeption(String message){
        super(message);
    }
}
```

SexException

```java
public class SexExeption extends RuntimeException{
    public SexExeption(){}
    
    public SexExeption(String message){
        super(message);
    }
}
```

Student

```java
public class Student{
    private int age;
    private String sex;
    
    public void setAge(int age){
        //校验数据合法性
        if( !(age>=15 && age<=50) ){
            throw new AgeException("非法年龄!");
        }
        this.age = age;
    }
    
    public void setSex(String sex){
        //校验数据合法性
        if( !(sex.equals("男") || sex.equals("女")) ){
            throw new SexException("非法性别!");
        }
    }
    .....
}
```

测试类

```java

```









## 题目4

请使用代码描述 

1. 写一个方法实现用户登陆，传入用户名和密码 

2. 如果用户名错误，就抛出自定义登陆异常(LoginException)，异常信息为用户名不存在。 

3. 如果密码错了就也抛出登陆异常,异常信息为密码错误 

4. 如果用户名和密码都对了,输出: 欢迎xxx 

说明：正确用户名和密码都是admin 



答案：



```java
//自定义异常类
public class LoginException extends RuntimeException{
    public LoginException(){}
    public LoginException(String message){
        super(message);
    }
}

public boolean login(String name,String password) throws LoginException{
    //校验数据的合法性
    if(name == null || "".equals(name) || password == null || "".equals(passworld)){
        throw new LoginException("用户名或密码不能为空");
    }
    
    //登录校验
    //if(name.equals("admin")) //假设：name为null 就会有NullPointerException异常
    //if("admin".equals(name)) //推荐   假设：name为null ，不会有NullPointerException异常
    if( ! "admin".equals(name) ){
        throw new LoginException("用户名不存在");
    }
    if(! "admin".equals(password)){
        throw new LoginException("密码错误 ");
    } 
    
    if("admin".equals(name) && "admin".equals(password)){
        欢迎xxx 
    }  
}
```





