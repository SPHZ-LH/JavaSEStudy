import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TestDeam2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LocalDate time1 = LocalDate.parse(sc.nextLine());
        LocalDate time2 = LocalDate.parse(sc.nextLine());
        long septalDay = ChronoUnit.DAYS.between(time1, time2);
        long septalWeek = ChronoUnit.WEEKS.between(time1, time2);
        boolean flag = time1.isBefore(time2);
        if(flag){
            System.out.println("第一个日期比第二个日期更早");
        }else{
            System.out.println("第一个日期比第二个日期更晚");
        }
        System.out.println("两个日期间隔"+septalDay+"天");
        System.out.println("两个日期间隔"+septalWeek+"周");
    }
}
