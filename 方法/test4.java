import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        double score1 = sc.nextDouble();
        String name2 = sc.next();
        double score2 = sc.nextDouble();
        Student1(name1, score1);
        Student2(name2, score2);
        /*
         * 定义一个学生类Student，有姓名（name）、成绩（score）两个私有属性，
         * 提供一个无参数的构造方法、一个带参数的构造方法，以及四个公有方法
         * getName()、setName()、getScore()、setScore ()分别用于获取和设置姓名、成绩属性。
         * 
         * 在测试类Main中，先使用学生类的无参数的构造方法创建一个学生类对象stu1，
         * 然后接收键盘上输入的数据，分别作为setName( )和setScore( )的参数，
         * 从而当作学生stu1的姓名和成绩；再使用学生类的带参数的构造方法创建一个学生类对象stu2，
         * 接收键盘上输入的数据作为构造方法的两个参数，从而当作学生stu2的姓名和成绩。
         * 
         * 
         * stu1: name=张三,score=85.5
         * stu2: name=李四,score=92.0
         */
    }

    public static void Student1(String name,double score) {
        System.out.println("stu1: name="+name+",score="+score);
    }
    public static void Student2(String name,double score) {
        System.out.println("stu2: name="+name+",score="+score);
    }
}
