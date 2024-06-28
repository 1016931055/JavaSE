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



# 【TreeSet】

## 题目1

需求：

利用TreeSet实现以下需求：

1. 随机生成10个不同的0~50之间的整数，要求按照从小到大进行遍历。
2. 随机生成10个不同的50~100之间的整数，要求按照从大到小进行遍历。



思路分析：

TreeSet是具有排序特性的，默认按照自然排序。如果自然排序满足不了需求，可以使用自定义比较器。

需求1，可以使用自然排序实现；需求2可以使用自定义比较器实现



答案：

```java
public static void Test1(){
        Random r = new Random();

        TreeSet<Integer> tSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            tSet.add(r.nextInt(51));
        }

        for (Integer i :tSet) {
            System.out.print(i+ " ");
        }
        System.out.println();


        //使用内部类方法创建新排序规则的Set
        //默认的是o1 - o2，想要降序排列就 compare方法中返回 o1 - o2
        TreeSet<Integer> tSet2 = new TreeSet<> (new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }
        );

        //添加元素
        for (int i = 0; i < 10; i++) {
            tSet2.add(r.nextInt(51) + 50);
        }

        for (Integer i :tSet2) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
```

打印结果：

```
0 6 17 26 31 33 35 45 49 50 
99 86 84 80 77 76 72 56 
```



# 【Collections】

## 题目2

请定义一个可以存储“整数”的集合，并存储一些数据。

请按以下要求顺序编程实现：

1. 对集合中的数据打乱顺序；
1. 打印集合
1. 对集合中的数据进行升序排序
1. 打印集合
1. 对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
1. 打印集合



答案：

```java
    public static  void Test2(){
        List<Integer> list = new ArrayList<>();

        //0-100的随机整数
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(101));
        }
        System.out.print("初始数据为: ");

        // 打印数组数据
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 打乱数组顺序
        Collections.shuffle(list);
        // 打印数组数据
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 升序排序数组
        Collections.sort(list);
        // 打印数组数据
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 反转数组
        Collections.reverse(list);
        // 打印数组数据
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
```

打印结果：

```java
初始数据为: 86 89 26 5 48 68 58 86 96 83 
96 86 89 58 5 68 48 26 83 86 
5 26 48 58 68 83 86 86 89 96 
96 89 86 86 83 68 58 48 26 5 
```



# 【排序，查找】

## 题目3

编程题【冒泡排序】

请按以下要求顺序编写程序：

1. 定义测试类，定义main()方法；
1. 定义以下数组：`int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};`
1. 用Arrays类打印此数组的所有元素；
1. 用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。

思路：

参考课堂内容

答案：

```java
   private static void Test3() {
        int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
```





## 题目4

编程题【选择排序】

请按以下要求顺序编写程序：

1. 定义测试类，定义main()方法；
1. 定义以下数组：int[] arr = {7, 6, 5, 4, 3};
1. 用Arrays类打印此数组的所有元素；
1. 用“排序”对数组元素“升序”排序；打印排序后的数组。

答案：

```java
   private static void Test4() {
        int[] arr = {7, 6, 5, 4, 3};
        System.out.println(Arrays.toString(arr));

        // 选择排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
```





# 【Map集合】

## 题目5

请按以下要求顺序编码：

1. 定义一个：键Integer，值String类型的HashMap集合
1. 存储以下数据：”张三” , “李四” , “ 王五”。（put）
1. 打印集合大小；
1. 使用“键找值”的方式遍历集合，打印键和值；(keySet)
1. 使用“键值对”的方式遍历集合，打印键和值；(entrySet)
1. 获取键为1的值，并打印(get)
1. 获取键为10的值，并打印
1. 判断集合中是否有键：10（containsKey）
1. 删除键为1的键值对，删除完毕打印集合



答案：

```java
private static void Test5() {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(4,"张三");
        map.put(5,"李四");
        map.put(6,"王五");

        System.out.println("集合大小为：" + map.size());

        // 使用“键找值”的方式遍历集合，打印键和值；(keySet)
        // 获取键的set集合(无序，无索引，无重复)
        Set<Integer> keySet = map.keySet();
        for (Integer i : keySet){
            System.out.print(i +" " + map.get(i)+ "; ");
        }
        System.out.println();

        //使用“键值对”的方式遍历集合，打印键和值；(entrySet)
        // 由Map.Entry组成的Set集合
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.print(entry.getKey() +" " + entry.getValue()+ "; ");
        }
        System.out.println();

        // 判断集合中是否有键：10（containsKey）
        System.out.println(map.containsKey(10));

        // 删除键为4的键值对，删除完毕打印集合
        map.remove(4);
        for (Map.Entry entry: map.entrySet()){
            System.out.print(entry.getKey() +" " + entry.getValue()+ "; ");
        }
        System.out.println();
    }
```



打印结果：

```

```



## 题目6

有以下字符串：

String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;

请编程统计每个字符出现的次数



答案：

```java
 private static void Test6() {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        TreeMap<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++){
            if (!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),1);
            else map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
        }

        for (Map.Entry entry : map.entrySet()){
            System.out.print(entry.getKey() +":" + entry.getValue()+ "; ");
        }
        System.out.println();
    }
```

打印结果：

```
2:1; A:2; D:1; E:2; F:5; Q:1; a:1; e:4; f:4; j:4; k:1; o:1; w:2; 他:2; 你:2; 我:2; 
```



## 题目7

需求：研发部门有5个人，信息如下：（姓名-工资）【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败 =3800】,将以上员工的相关信息存放在适合的集合中,给柳岩涨工资300,迭代出每个元素的内容输出到控制台。

思路：

- 使用HashMap存储数据
- 使用put方法进行对新增或者修改数据

答案：

```java
 private static void Test7() {
        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("柳岩",2100);
        employee.put("张亮",1700);
        employee.put("诸葛亮",1800);
        employee.put("灭绝师太",2600);
        employee.put("东方不败",3800);

        employee.put("柳岩", employee.get("柳岩") + 300);

        for(Map.Entry entry : employee.entrySet()){
            System.out.println(entry.getKey() + "工资为"+entry.getValue());
        }
    }
```



打印结果：

```
灭绝师太工资为2600
张亮工资为1700
诸葛亮工资为1800
柳岩工资为2400
东方不败工资为3800
```







## 题目8

需求：使用LinkedHashMap保存学生对象，及其对应的家庭住址；要求：

1. 学生具有学号、姓名和成绩三个属性；
2. 其中，学号不能重复；

思路：

- 要重写hashCode和equals方法，学号不能重复，只要选中学号即可。



步骤：

1. 定义学生类包含学号、姓名和成绩三个属性；
2. 重写hashCode和equals方法，选中学号即可
3. 定义LinkedHashMap对象，键是学生对象，值是地址
4. 创建学生对象存入数据
5. 遍历查看结果

答案：

```java
public class Student06 {
    private int num;
    private String name;

    private int score;

    public Student06(int num, String name, int score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student06{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student06 student06 = (Student06) o;
        return num == student06.num;
    }
}
  
private static void  Test8(){
        // Student06 - 学号、姓名和成绩
        LinkedHashMap<Student06, String> map = new LinkedHashMap<>();
        map.put(new Student06(12,"张三",80),"北京");
        map.put(new Student06(12,"李四",90),"上海");
        map.put(new Student06(17,"王五",100),"武汉");
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey());
        }
    }


```



打印结果：

张三和李四的学号一样，不能重复存储

```
Student06{num=12, name='张三', score=80}
Student06{num=17, name='王五', score=100}
```



## 题目9

需求：

1.利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量

2.如用户输入字符串:"helloworld java",程序输出结果：h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)

3.注：输出结果不要求顺序一致



答案：

```java
    private static void Test6(String str) {
        TreeMap<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++){
            if (!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),1);
            else map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
        }

        for (Map.Entry entry : map.entrySet()){
            System.out.print(entry.getKey() +":" + entry.getValue()+ "; ");
        }
        System.out.println();
    }
```



打印结果：

```

```



# 【集合嵌套】

## 题目10

需求：一个年级有若干个班级，每个班级有若干个学生；要求：

1. 学生具有学号、姓名和成绩，学号和学生信息是一一对应的；
2. 使用集合保存这个年级的所有学生的信息，然后遍历输出；



思路：

- 班级：Map<Integer,Student> 键：学号，值：学生对象
- 年级：List<Map<Integer,Student>> 使用List集合将每个班级保存



答案：

```java
private static void Test10() {
        // 创建年级
        List<List<Student06>> grade = new ArrayList<>();

        // 创建班级
        List<Student06> class1 = new ArrayList<>();
        List<Student06> class2 = new ArrayList<>();

        // 添加学生
        class1.add(new Student06(12,"张三",80));
        class1.add(new Student06(12,"李四",90));
        class1.add(new Student06(17,"王五",100));

        class2.add(new Student06(12,"赵六",80));
        class2.add(new Student06(12,"孙七",90));
        class2.add(new Student06(17,"周八",100));

        // 添加班级
        grade.add(class1);
        grade.add(class2);

        // 遍历年级类
        for (List<Student06> iclass : grade){
            // class_list
            for (Student06 stu : iclass){
                System.out.println(stu);
            }
            System.out.println();
        }
    }
```



打印结果：

```java
Student06{num=12, name='张三', score=80}
Student06{num=12, name='李四', score=90}
Student06{num=17, name='王五', score=100}

Student06{num=12, name='赵六', score=80}
Student06{num=12, name='孙七', score=90}
Student06{num=17, name='周八', score=100}
```

