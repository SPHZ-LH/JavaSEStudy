import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDeam1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Date d1 = sdf.parse(str1);
        Date d2 = sdf.parse(str2);
        long time = d1.getTime() - d2.getTime();
        long day = Math.abs(time) / (1000 * 60 * 60 * 24);
        long moth = day / 7;
        if (d1.getTime() > d2.getTime()) {
            System.out.println("第一个日期比第二个日期更晚");
        } else {
            System.out.println("第一个日期比第二个日期更早");
        }
        System.out.println("两个日期间隔" + day + "天");
        System.out.println("两个日期间隔" + moth + "周");
    }
}
