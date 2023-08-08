package OutPut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\javaProject\\IO\u6D41\\a.txt", true);
        String str1 = "qinshizhanghaochou";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);
        String s = "\r\n";
        byte[] bytes = s.getBytes();
        fos.write(bytes);
        String str2 = "666";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);
        fos.write(bytes);
        fos.close();
    }
}
