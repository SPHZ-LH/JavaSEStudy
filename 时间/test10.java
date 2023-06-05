import java.util.Date;

public class test10 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        Date d = new Date(0L);
        System.out.println(d);
        long time = d.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d.setTime(time);
        System.out.println(d);
    }
}
