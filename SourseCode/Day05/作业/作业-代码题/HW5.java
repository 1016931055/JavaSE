import java.util.*;
import java.util.stream.Collectors;

public class HW5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //遍历集合
        traversal(list);
        //返回索引值
        System.out.println(listTest(list,5));
        System.out.println(listTest(list,6));

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


        //创建3个Student对象
        Student s1 = new Student("张三",20,"男");
        Student s2 = new Student("李四",21,"女");
        Student s3 = new Student("张三",20,"男");

        //创建HashSet集合保存前3个对象
        Set<Student> set2 = new HashSet<>();
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);

        for (Student s : set2) {
            System.out.println(s);
        }

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

    }

    /**
     * 使用3种方法遍历list
     *
     * @param list
     */
    public static void traversal(ArrayList<Integer> list) {
        System.out.println("普通For循环遍历：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("增强For循环遍历：");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("迭代器遍历:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.print(next + " ");
        }
        System.out.println();
    }

    /**
     * 实现返回num在list里面第一次出现的索引，如果num没出现过返回-1。
     * @param list
     * @param num
     * @return num第一次出现的索引值
     */
    public static int listTest(ArrayList<Integer> list, Integer num){
        for ( int i = 0; i < list.size(); i++) {
            if ( num.equals(list.get(i)) )
                return i;
        }
        return -1;
    }
}