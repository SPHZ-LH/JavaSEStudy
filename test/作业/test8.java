package 作业;
import java.util.Scanner;
import java.util.TreeMap;

public class test8 {
    public static void main(String[] args) {
        TreeMap<Integer, Student> tm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student(sc.nextInt(), sc.next(), sc.nextInt());
            tm.put(arr[i].getNo(), arr[i]);
        }
        amend(tm, sc);
        tm.forEach((k, v) -> System.out.println(v));
    }

    private static void amend(TreeMap<Integer, Student> tm, Scanner sc) {
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            String str = sc.next();
            if (str.equals("add")) {
                Student stu = new Student(sc.nextInt(), sc.next(), sc.nextInt());
                tm.put(stu.getNo(), stu);
            } else if (str.equals("delete")) {
                tm.remove(sc.nextInt());
            } else if (str.equals("set")) {
                int count = sc.nextInt();
                int score = sc.nextInt();
                tm.get(count).setScore(score);
            }
        }
    }
}

class Student {
    private int no;
    private String name;
    private int score;

    public Student() {
    }

    public Student(int no, String name, int score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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
        final int prime = 31;
        int result = 1;
        result = prime * result + no;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (no != other.no)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "no:" + no + " name:" + name + " score:" + score;
    }

}
