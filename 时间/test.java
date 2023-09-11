import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        String str="2003-12-22";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-M-d");
        Date d = sdf.parse(str);
        System.out.println(d);
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy年M月d日");
        String format = sdf1.format(d);
        System.out.println(format);
    }
}
