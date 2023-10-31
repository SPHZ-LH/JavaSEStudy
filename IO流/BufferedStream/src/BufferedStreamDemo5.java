import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedStreamDemo5 {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("IO流\\a.txt")));
        String str;
        while ((str = fr.readLine()) != null) {
            System.out.println(str);
        }
        fr.close();

    }
}
