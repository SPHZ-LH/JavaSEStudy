import java.io.FileReader;
import java.io.IOException;

public class RederDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IO流\\a.txt");
        int read;
        while ((read = fr.read()) != -1) {
            System.out.print((char) read);
        }
        fr.close();

    }
}