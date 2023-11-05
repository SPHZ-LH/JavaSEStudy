package 填空题;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student stu) { // 重写compareTo方法
        // 两个Student对象相等，当且仅当二者的age相等
        return this.age - stu.age;
    }
}

public class test1 {
    public static void main(String args[]) {
        List<Student> list = new LinkedList<Student>();

        Scanner sc = new Scanner(System.in);

        System.out.println("输入三个学生的信息：");
        list.add(new Student(sc.next(), sc.nextInt()));
        list.add(new Student(sc.next(), sc.nextInt()));
        list.add(new Student(sc.next(), sc.nextInt()));

        Iterator<Student> it = list.iterator();
        System.out.println("排序前，链表中的数据：");
        while (it.hasNext()) { // 是否有下一个元素
            Student stu = it.next(); // 取出下一个元素
            System.out.println("姓名：" + stu.name + "，年龄：" + stu.age);
        }

        Collections.sort(list);
        // 排序

        System.out.println("排序后，链表中的数据：");
        it = list.iterator();
        while (it.hasNext()) { // 是否有下一个元素
            Student stu = it.next(); // 取出下一个元素
            System.out.println("姓名：" + stu.name + "，年龄：" + stu.age);
        }

        System.out.println("输入要查找的学生信息：");
        Student stu4 = new Student(sc.next(), sc.nextInt());

        int index = Collections.binarySearch(list, stu4); // 二分查找
        if (index >= 0)
            System.out.println(stu4.name + "与链表中的"
                    + list.get(index).name + "年龄相同");
        else
            System.out.println("链表中的对象，没有一个与"
                    + stu4.name + "年龄相同的");
    }
}
