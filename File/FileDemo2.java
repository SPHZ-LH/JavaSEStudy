import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\SPHZ\\Desktop\\代码\\PTA-天梯赛");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
