import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("IO流\\a.txt"));
        String str = br.readLine();
        System.out.println(str);
        String str1 = br.readLine();
        System.out.println(str1);
        br.close();
    }
}
