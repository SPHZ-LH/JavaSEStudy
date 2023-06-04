import java.util.LinkedHashSet;

import TreeSet.Student;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("寝室长", 19);
        Student s2 = new Student("刘浪雨", 20);
        Student s3 = new Student("小颜同志", 20);
        Student s4 = new Student("寝室长", 19);

        LinkedHashSet<Student> lhs =new LinkedHashSet<>();
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s4));

        for (Student s : lhs) {
            System.out.println(s);
        }
    }
}
