import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\javaProject\\File");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.exists());
        System.out.println("=====================");
        File f2 = new File("C:\\Users\\SPHZ\\Desktop\\代码\\PTA-天梯赛\\test78.java");
        System.out.println(f2.length());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getName());
        System.out.println(f2.exists());
        long time = f2.lastModified();
        Date d = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(d);
        System.out.println(format);
        System.out.println("=====================");
        File f3 =new File("方法引用\\FuctionDemo1.java");
        System.out.println(f3.exists());
        System.out.println(f3.getAbsolutePath());
    }
}
