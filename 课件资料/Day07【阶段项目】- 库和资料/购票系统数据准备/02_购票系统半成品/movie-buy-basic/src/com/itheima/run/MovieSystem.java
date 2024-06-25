package com.itheima.run;

import com.itheima.bean.Business;
import com.itheima.bean.Customer;
import com.itheima.bean.Movie;
import com.itheima.bean.User;

import java.util.*;

public class MovieSystem {
    // 存储所有的[商家] 和 [用户] 的集合
    public static final List<User> ALL_USERS = new ArrayList<>();
    // 存储每一个商家对应的排片信息
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    // 整个类中统一用一个键盘录入对象
    public static final Scanner SC = new Scanner(System.in);

    // 提前准备数据的测试数据
    static {
        // =====================客户数据========================
        Customer c = new Customer();
        c.setLoginName("ldh888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        // =====================商家数据========================
        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        // 后期在为此商家添加排片信息
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies3); // b2 = []
    }

    public static void main(String[] args) {
        shoMain();
    }

    // 首页展示
    private static void shoMain() {

        while (true) {
            System.out.println("===============黑马电影首页=================");
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("请输入操作命令：");

            String choice = SC.nextLine();

            switch (choice) {
                case "1":
                    login();
                    break;
                case "2":
                    System.out.println("待实现....");
                    break;
                case "3":
                    System.out.println("待实现....");
                    break;
                default:
                    System.out.println("命令有误，请确认！");
                    break;
            }
        }
    }

    // 用户登录 , 用户包含了 [商家] 和 [客户] , 需要作出判断进入对应的页面展示
    private static void login() {
        while (true) {
            System.out.println("请您输入登录名称：");
            String loginName = SC.nextLine();
            System.out.println("请您输入登录密码：");
            String passWord = SC.nextLine();

            // 1、根据登录名称查询用户对象。
            User u = getUserByLoginName(loginName);
            // 2、判断用户对象是否存在，存在说明登录名称正确了
            if (u != null) {
                // 3、用户存在 , 比对密码是否正确
                if (u.getPassWord().equals(passWord)) {
                    System.out.println(u.getUserName() + "登录了系统~~~");
                    // 判断是用户登录的，还是商家登录的。
                    if (u instanceof Customer) {
                        // 当前登录的是普通用户
                        showCustomerMain(u);
                    } else {
                        // 当前登录的肯定是商家用户
                        showBusinessMain(u);
                    }
                    // 代码走到此位置 , 说明用户名和密码都是正确的
                    return;
                } else {
                    System.out.println("密码有误,请重新输入...");
                }
            } else {
                System.out.println("登录名称错误，请重新输入...");
            }
        }

    }

    // 商家主页面展示
    private static void showBusinessMain(User loginUser) {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SC.nextLine();
            switch (command) {
                case "1":
                    //TODO 第一部分 : 展示全部排片信息 -- 带完成
                    break;
                case "2":
                    //TODO 第二部分 :  上架电影信息
                    break;
                case "3":
                    //TODO 第三部分 : 下架电影信息
                    break;
                case "4":
                    //TODO 第四部分 :  修改电影信息
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "请您下次再来啊~~~");
                    return;
                default:
                    System.out.println("录入指令有误,请重新选择...");
                    break;
            }
        }
    }

    // 客户主页面展示
    private static void showCustomerMain(User loginUser) {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SC.nextLine();
            switch (command) {
                case "1":
                    //TODO 第五步 : 展示全部排片信息
                    break;
                case "2":
                    // 根据电影名称查询电影信息(选做)
                    break;
                case "3":
                    // 评分功能(扩展功能,选做)
                    break;
                case "4":
                    //TOdo 第六步 :  购票功能
                    break;
                case "5":
                    return;
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 方法的功能为 : 接收一个用户名 , 在集合中查找此用户是否存在
     * 如果用户存在返回此用户的对象
     * 如果用户不存在返回null
     */
    public static User getUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
            // 判断这个用户的登录名称是否是我们想要的
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null;
    }
}
