import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test13 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(str);
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf1.format(d);
        System.out.println(result);
        System.out.println(d);
    }
}
