import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO流\\b.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
