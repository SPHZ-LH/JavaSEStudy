import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test6 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("IO流\\b.txt"));
        Student stu =new Student("zhangsan",23,"江西");
        oos.writeObject(stu);
        oos.close();
    }
}
