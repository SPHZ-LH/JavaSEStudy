package CollceTion;
import java.util.ArrayList;
import java.util.Collection;

import TreeSet.Student;

public class CollecTionDemo3 {
    public static void main(String[] args) {
        Collection<Student> coll =new ArrayList<>();
        Student s1 =new Student("寝室长", 19);
        Student s2 =new Student("小颜", 20);
        coll.add(s1);
        coll.add(s2);
        Student s3 =new Student("寝室长", 19);
        boolean flag = coll.contains(s3);
        System.out.println(flag);
        System.out.println(s1);
        System.out.println(coll);
    }
}
