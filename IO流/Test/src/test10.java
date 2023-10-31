import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class test10 {
    public static void main(String[] args) throws IOException {
        File f1 =new File("IO流\\a.txt");
        File f2 =new File("IO流\\b.txt");
        FileUtils.copyFile(f1,f2);
    }
}
