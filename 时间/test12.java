import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test12 {
    public static void main(String[] args) throws ParseException {
        tomeed();
        
    }

    private static void metood() throws ParseException {
        String s ="2023-05-05 16:00";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date d = sdf.parse(s);
        Date d1 =new Date(0L);
        d1.setTime(1000L);
        System.out.println(d1.getTime());
    }

    private static void tomeed() {
        SimpleDateFormat sdf =new SimpleDateFormat();
        Date d =new Date();
        String time = sdf.format(d);
        System.out.println(time);

        /* SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒  EEE");
        Date d =new Date();
        String time = sdf.format(d);
        System.out.println(d); */
    }
}
