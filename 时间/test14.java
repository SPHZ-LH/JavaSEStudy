import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test14 {
    public static void main(String[] args) throws ParseException {
        String startDate = "2023年11月11日 00:00:00";
        String endDate = "2023年11月11日 00:10:00";
        String overDate = "2023年11月11日 00:01:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startTime = sdf.parse(startDate);
        Date endTime = sdf.parse(endDate);
        Date overTime = sdf.parse(overDate);
        long time = overTime.getTime();
        if (time > startTime.getTime() && time < endTime.getTime()) {
            System.out.println("参加秒杀活动成功");
        } else {
            System.out.println("参加秒杀活动失败");
        }
    }
}
