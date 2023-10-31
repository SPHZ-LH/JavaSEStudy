import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO流\\a.txt");
        int read = fis.read();
        fis.close();
        System.out.println((char) read);
    }
}
