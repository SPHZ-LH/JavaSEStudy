import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("IO流\\a.txt");
        fos.write(97);
        fos.close();
    }
}