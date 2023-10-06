package CharStream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("OutPut\\a.txt");
        int cha;
        while ((cha = fileReader.read()) != -1) {
            System.out.print((char) cha);
        }
        fileReader.close();
    }
}