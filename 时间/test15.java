import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class test15 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date();
        c.setTime(d);// 传递Date对象
        Date d1 = c.getTime();// 将日历传出，创造Date对象
        c.set(Calendar.YEAR,2000);//修改日历
        int year = c.get(1);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        System.out.println(year + " " + month + " " + day + " " + getWeek(week));
    }

    public static String getWeek(int week) {
        String[] arr = { "", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        return arr[week];
    }
}
