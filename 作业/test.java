package 作业;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student object1 = new Student(sc.next(), sc.nextInt());
        Undergraduate object2 = new Undergraduate(sc.next(), sc.nextInt(), sc.next());
        System.out.println(object1);
        System.out.println(object2);
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

class Undergraduate extends Student {
    private String major;

    public Undergraduate() {
    }

    public Undergraduate(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Undergraduate [name=" + getName() + "，age=" + getAge() + "，major=" + getMajor() + "]";
    }

}
