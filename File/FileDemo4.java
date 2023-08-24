import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File f = new File("D:\\javaProject\\File");
        File[] listFiles = f.listFiles();
        for (File file : listFiles) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                System.out.println(file);
            }
        }
    }
}
