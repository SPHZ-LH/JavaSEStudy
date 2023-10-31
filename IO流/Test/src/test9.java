import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("IO流\\b.txt"));
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        ois.close();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
