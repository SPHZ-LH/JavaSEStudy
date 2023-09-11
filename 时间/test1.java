import java.text.SimpleDateFormat;
import java.util.Date;


public class test1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date d =new Date(time);
        String format = sdf.format(d);
        System.out.println(format);
    }
}
