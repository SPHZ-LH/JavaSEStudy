import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDeam3 {
    public static void main(String[] args) throws ParseException {
        String s1 ="20002-02-22";
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf1.parse(s1);
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日");
        String time = sdf.format(d);
        System.out.println(time);
    }
}
