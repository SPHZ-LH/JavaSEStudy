package OutPut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\javaProject\\IO流\\a.txt");
        String str = "qingshizhangzhenshigechushen";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.close();

    }
}
