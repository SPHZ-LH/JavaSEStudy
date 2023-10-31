import java.io.FileReader;
import java.io.IOException;

public class RederDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IO流\\a.txt");
        char[] chars = new char[2];
        int read;
        while ((read = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, read));
        }
    }
}