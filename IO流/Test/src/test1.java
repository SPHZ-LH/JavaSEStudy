import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\javaProject\\李昊-嗖嗖移动大厅项目");
        File dest = new File("D:\\javaProject\\dest");
        Copydest(src, dest);
    }

    private static void Copydest(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                Copydest(file, new File(dest, file.getName()));
            }
        }
    }
}