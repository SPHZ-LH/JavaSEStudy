import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("IO流\\a.txt");
        String str = "qinshizhangnizhenex\r\n";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        String str1 = "666\r\n";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        fos.close();
    }
}
