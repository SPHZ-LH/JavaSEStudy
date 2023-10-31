import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO流\\a.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();
    }
}
