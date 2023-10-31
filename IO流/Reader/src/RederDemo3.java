import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class RederDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(("IO流\\b.txt"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();
    }
}
