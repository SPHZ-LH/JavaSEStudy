import java.time.ZoneId;
import java.util.Set;

public class test16 {
    public static void main(String[] args) {
        ZoneId z = ZoneId.systemDefault();
        Set<String> s = ZoneId.getAvailableZoneIds();
        System.out.println(z);
    }
}
