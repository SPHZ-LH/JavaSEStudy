package 作业;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu1 = new Student(sc.next(), sc.nextDouble());
        Student stu2 = new Student(sc.next(), sc.nextDouble());
        System.out.println("stu1" + stu1);
        System.out.println("stu2" + stu2);
    }
}

class Student {
    protected String name;
    private double score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return ": name=" + name + ", score=" + score + "";
    }

}