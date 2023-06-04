import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

import TreeSet.Student;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("寝室长", 19);
        Student s2 = new Student("刘浪雨", 20);
        Student s3 = new Student("小颜同志", 20);
        Student s4 = new Student("寝室长", 19);

        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s4));

        Iterator<Student> it = hs.iterator();
        hs.forEach(t -> System.out.println(t));
        System.out.println();
        while (it.hasNext()) {
            Student str = it.next();
            System.out.println(str);
        }

        System.out.println(hs);
    }
}
