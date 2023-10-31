import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test8 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO流\\b.txt"));
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangsan", 23, "江西");
        Student s2 = new Student("lisi", 24, "重庆");
        Student s3 = new Student("wangwu", 25, "湖北");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();
    }
}
