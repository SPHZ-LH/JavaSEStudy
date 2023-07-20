import java.time.LocalDate;
import java.util.Calendar;

public class test22 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2004, 2, 1);
        LocalDate ld2 = ld1.minusDays(1);
        int day = ld1.getDayOfMonth();
        System.out.println(day);

        boolean flag = ld1.isLeapYear();
        System.out.println(flag);

        Calendar cl = Calendar.getInstance();
        System.out.println(cl);
        cl.set(2004, 2, 1);
        cl.add(Calendar.DAY_OF_MONTH, -1);
        int day1 = cl.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);
    }
}
