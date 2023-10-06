package IntPut;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("OutPut\\a.txt");
        byte[] bytes =new byte[3];
        int len = fis.read(bytes);
        String string = new String(bytes);
        System.out.println(string);
        fis.close();
    }
}
