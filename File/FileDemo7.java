import java.io.File;

public class FileDemo7 {
    public static void main(String[] args) {
        File f = new File("D:\\javaProject");

        long len = add(f);
        System.out.println(len);
    }

    public static long add(File src) {
        long len = 0;
        File[] Files = src.listFiles();
        for (File File : Files) {
            if (File.isFile()) {
                len = len + File.length();
            } else {
                len = len + add(File);
            }
        }
        return len;
    }
}
