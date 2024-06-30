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



# 【简答题】

1. 请简述多线程中影响线程安全的原因是什么？

   ~~~
   当多个线程同时读写共享资源的时候，如果出现了数据的脏乱的现象，就表明出现了线程安全问题。
   出现线程安全问题的本质：多个线程对共享数据进行了写操作，造成多个线程数据不同步，造成数据错乱。
   ~~~



2. 请描述死锁的现象及产生的原因，需要如何避免？

   ~~~
   在多线程程序中,使用了多把锁(嵌套锁),造成线程之间相互等待.程序不往下走了。
   
   尽量量不使用嵌套的同步代码块
   在嵌套同步代码块中，避免使用不同的锁对象
   ~~~

   

3. 请简要描述线程的六种状态

   ~~~
   1. 新建状态    //创建Thread对象
   2. 可运行      //调用start()
   3. 终止状态    //run方法执行结束
   4. 锁阻塞     //未获取到锁
   5. 无限等待   //wait()
   6. 计时等待   //sleep(毫秒)、wait(毫秒)
   ~~~
   
   





# 【synchronized】

## 题目1

请编写程序，不使用任何同步技术，模拟三个窗口同时卖100张票的情况，运行并打印结果，观察到错误的数据，并解释出现错误的原因。

```java
public class Demo01 {
    public static void main(String[] args) {
        //卖票任务
        TicketTask ticketTask = new TicketTask();//定义一个任务，让三个线程完成

        Thread t1 = new Thread(ticketTask,"【窗口1】");
        Thread t2 = new Thread(ticketTask,"【窗口2】");
        Thread t3 = new Thread(ticketTask,"【窗口3】");

        //执行
        t1.start();
        t2.start();
        t3.start();

    }
}

class TicketTask implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {

        while (true) {
            if (tickets > 0) {

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();

                System.out.println(name + "：" + tickets);
                tickets--;//卖完一张减1

            } else {
                break;
            }
        }

    }
}
```



##  题目2

请使用“同步代码块”改写题目一的程序，保证运行结果的正确。

使用同步代码块解决代码：

```java
public class Demo01 {
    public static void main(String[] args) {
        //卖票任务
        TicketTask ticketTask = new TicketTask();//定义一个任务，让三个线程完成

        Thread t1 = new Thread(ticketTask, "【窗口1】");
        Thread t2 = new Thread(ticketTask, "【窗口2】");
        Thread t3 = new Thread(ticketTask, "【窗口3】");
        //执行
        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketTask implements Runnable {
    private int tickets = 100;

    Object lockObj = new Object();  

    @Override
    public void run() {
        
        while (true) {
            //synchronized (lockObj) {//保证锁对象要多个线程使用相同的对象
            synchronized ("lock") {//保证锁对象要多个线程使用相同的对象
                if (tickets > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();

                    System.out.println(name + "：" + tickets);
                    tickets--;//卖完一张减1

                } else {
                    break;
                }
            }
        }
    }
}
```



##  题目3

​	 请使用“同步方法”改写题目一的程序，保证运行结果的正确。

使用同步方法代码如下：

```java

class TicketTask implements Runnable {
    private static int tickets = 100;

    @Override
    public void run() {//this是调用run方法的对象,this 就是创建的任务对象ticketTask

        while (true) {
            //sellTicket();//非静态同步方法
            sellTicket2();//静态同步方法

            if (tickets <= 0) {
                break;
            }
        }
    }

    /**
     * 同步方法
     */
    private synchronized void sellTicket() { // 锁对象是：this
        if (tickets > 0) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();

            System.out.println(name + "：" + tickets);
            tickets--;//卖完一张减1

        }
    }


    /**
     * 同步方法
     */
    private static synchronized void sellTicket2() { //类名.class  字节码对象
        if (tickets > 0) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();

            System.out.println(name + "：" + tickets);
            tickets--;//卖完一张减1

        }
    }
}


public class Demo01 {
    public static void main(String[] args) {
        //卖票任务
        TicketTask ticketTask = new TicketTask();//定义一个任务，让三个线程完成

        Thread t1 = new Thread(ticketTask, "【窗口1】");
        Thread t2 = new Thread(ticketTask, "【窗口2】");
        Thread t3 = new Thread(ticketTask, "【窗口3】");
        //执行
        t1.start();// 当线程开启，JVM就会开启线程调用run方法
        t2.start();// 当线程开启，JVM就会开启线程调用run方法
        t3.start();// 当线程开启，JVM就会开启线程调用run方法
    }
}
```



## 题目4

​	请使用“Lock锁”改写题目一的程序，保证运行结果的正确

使用如下：

```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo01 {
    public static void main(String[] args) {
        //卖票任务
        TicketTask ticketTask = new TicketTask();//定义一个任务，让三个线程完成

        Thread t1 = new Thread(ticketTask, "【窗口1】");
        Thread t2 = new Thread(ticketTask, "【窗口2】");
        Thread t3 = new Thread(ticketTask, "【窗口3】");

        //执行
        t1.start();
        t2.start();
        t3.start();

    }
}

class TicketTask implements Runnable {
    private int tickets = 100;
    
    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
           
            lock.lock();
            try {
                if (tickets > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();

                    System.out.println(name + "：" + tickets);
                    tickets--;//卖完一张减1

                } else {
                    break;
                }
            }finally {
                lock.unlock(); //保证该代码必须一定执行
            }
        }
    }
}
```



## 题目5

1. 某公司组织年会，会议入场时有两个入口 ，在入场时每位员工都能获取一张双色球彩票，假设公司有100个员工， 利用多线程模拟年会入场过程，并分别统计每个入口入场的人数，以及每个员工拿到的彩票的号码。

   线程运行后打印 格式如下：

   ~~~java
   编号为: 2 的员工 从 后门 入场! 拿到的双色球彩票号码是:[17, 24, 29, 30, 31, 32, 07] 
   编号为: 1 的员工 从 前门 入场! 拿到的双色球彩票号码是:[06, 11, 14, 22, 29, 32, 15] 
   //..... 
   从后门入场的员工总共: 13 位员工 
   从前门入场的员工总共: 87 位员工
   ~~~

2. 题目中用到的产生双色球的工具类已经写好,可以直接使用：

   ~~~java
   import java.util.Arrays;
   import java.util.Random;
   //工具类
   public class DoubleColorBallUtil{
       // 产生双色球的代码
       public static String create() {
           String[] red ={"01","02","03","04","05","06","07","08","09","10", "11","12","13","14","15","16","17","18","19","20","21","22","23", "24","25","26","27","28","29","30","31","32","33"};
           //创建蓝球
           String[] blue = "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16".split(",");
           boolean[] used = new boolean[red.length];
           Random r = new Random();
           
           String[] all = new String[7];
           for(int i = 0;i<6;i++) {
               int idx;
               do {
                   idx = r.nextInt(red.length);//0‐32
               } while (used[idx]);//如果使用了继续找下一个
               used[idx] = true;//标记使用了
               all[i] = red[idx];//取出一个未使用的红球
           }
           all[all.length-1] = blue[r.nextInt(blue.length)];
           Arrays.sort(all);
           return Arrays.toString(all);
       }
   }
   
   ~~~

训练提示

1、自定义类实现Runnable接口，定义变量int number = 100;模拟100个人。

~~~java
//线程任务类
public class LuckDraw implements Runnable{
   
   private int number = 100; //员工人数
    
    

    
    //线程任务
    @Override
    public void run(){
        //记录进入场地的人数
        int count = 0; 
        
        //获取线程名字(前门 、 后门)
        String name = Thread.cureentThead.getName();
        
        while(true){     /**前门线程**/  
             
            //同步代码块
            synchronized (同步锁对象) { 
                if(number > 0){     
                   //获取双色球号码
                   // 使用工具类生成一个彩票号码给这个员工
                   String dc = DoubleColorBallUtil.create();
                    
                   System.out.print("编号为:"+number+"的员工 从 "+ name +" 入场!");
                   System.out.println("拿到的双色球彩票号码是:"+dc ); 
                
                   number--;//修改员人数
                    
                   count++;//记录人数
               }else{
                    System.out.println("从"+name+"入场的员工总共: "+count+" 位员工 ");
                    
                    break;
                }
            } 
            
        }
        
        
        
    }
}
~~~

2、定义测试类，启动两个线程分别模拟：前门、后门。

~~~java
public class Test{
    public static void main(String[] args){
        //创建线程任务
        LuckDraw 线程任务 = new LuckDraw();
        
        //线程1：前门
        Thread t1 = new Thread( 线程任务 , "前门");
        
        //线程2：后门
        Thread t2 = new Thread( 线程任务 );
        t2.setName("后门");
        
        t1.start();
        t2.start();
    }
}
~~~



答案：

```java
public class LuckDraw implements Runnable {
   // 员工人数
   private int number = 100;

   public void run() {
       //编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是:[17, 24, 29, 30, 31, 32, 07] 
       
       
      // 获得线程的名字
      String name = Thread.currentThread().getName();
       
      // 定义变量统计人数
      int count = 0;
      
      // 开始进场抽奖,
      while (true) {
              
         synchronized (this) {    
            // 首先判断number,大于0才能抽奖
            if (number > 0) {
               // 使用工具类生成一个彩票号码给这个员工
               String dc = DoubleColorBallUtil.create();
                
                
               // 输出抽中的彩票号
               System.out.println("编号为: " + number + " 的员工 从"+name+"入场! 拿到的双色球彩票号码是: " + dc);
               // 进入一个员工,少一个员工
               number--;
                
               // 计数加一
               count ++;
                
               // 休眠
               try {
                  Thread.sleep(10);
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
                
            } else {
               // 抽奖完毕,大于前后门入场的员工人数
               // 从后门入场的员工总共: 13 位员工
               // 从前门入场的员工总共: 87 位员工
               System.out.println("从" + name + "入场的员工总共: " + count + " 位员工");
               break;
            }
         }
      }
   }
}

public class Demo01 {
    public static void main(String[] args) {
        // 创建抽奖任务,实现了Runnable接口
        LuckDraw ld = new LuckDraw();
        
        // 在主线程中开启两个线程,表示前门和后门
        // 传入实现Runnable接口的实现类对象
        Thread t1 = new Thread( ld , "前门");
        Thread t2 = new Thread( ld , "后门");
        // 开启两个线程
        t1.start();
        t2.start();
    }
}
```









# 【线程池】

## 题目

请按以下步骤编写程序：

1. 定义一个类，实现Callable接口。此线程可以计算1--100的所有数字的累加和。

2. 定义测试类，和main()方法，使用线程池启动线程，并获取计算结果，并将结果打印到控制台。

答案：

   ```java
class Calculator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}


public class Demo06 {
   public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1、创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        //提交任务
        Future<Integer> f = threadPool.submit(new Calculator());
        //获取结果
        Integer sum = f.get();
        System.out.println("sum = " + sum);
    }
}
   ```

结果：

   ```

   ```




