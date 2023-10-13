import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class test20 {
    public static void main(String[] args) throws ParseException {
        String str = "2003年09月02日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date start = sdf.parse(str);
        long time = start.getTime();
        long now = System.currentTimeMillis();
        System.out.println((now - time) / 1000 / 60 / 60 / 24 );

        LocalDate ld1 =LocalDate.now();
        LocalDate ld2 =LocalDate.of(2003, 9, 2);
        System.out.println(ld1);
        long between = ChronoUnit.DAYS.between(ld2, ld1);
        System.out.println(between);
    }
}
