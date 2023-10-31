import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IO流\\b.txt"));
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }
        isr.close();
    }
}
