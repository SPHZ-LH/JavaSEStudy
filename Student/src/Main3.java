import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu1 = new Student(sc.next(), sc.nextDouble());
        Student stu2 = new Student(sc.next(), sc.nextDouble());
        System.out.println("stu1:" + stu1);
        System.out.println("stu2:" + stu2);
    }
}

class Student {
    private String name;
    private double score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     *
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "name=" + name + ",score=" + score;
    }
}