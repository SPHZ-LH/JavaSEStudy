package IntPut;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("OutPut\\a.txt");
        /*
         * int read = fis.read();
         * System.out.println((char) read);
         * fis.close();
         */
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
    }
}
