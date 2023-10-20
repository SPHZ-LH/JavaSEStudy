package TreeSet;
import java.util.TreeSet;

import CollceTion.Student2;

public class TreeSetDemo5 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("寝室长", 19, 80, 70, 30);
        Student2 s2 = new Student2("刘浪雨", 20, 60, 60, 60);
        Student2 s3 = new Student2("小颜同志", 23, 70, 70, 30);
        Student2 s4 = new Student2("颜桑", 24, 50, 80, 70);
        Student2 s5 = new Student2("狗逼寝室长", 19, 75, 90, 50);

        TreeSet<Student2> ts =new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student2 ts2 : ts) {
            System.out.println(ts2);
        }
    }
}
