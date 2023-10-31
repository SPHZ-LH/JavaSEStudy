import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\SPHZ\\Pictures\\Wallhaven\\enry.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\SPHZ\\Pictures\\Wallhaven\\enry1.jpg");
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len ^ 2);
        }
        fos.close();
        fis.close();
    }
}
