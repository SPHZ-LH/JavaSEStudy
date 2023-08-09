import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> m =new HashMap<>();
        m.put("寝室长", "刘浪雨");
        m.put("小颜同志", "颜淼晖");
        m.put("寝室长", "畜生");
        /* boolean Value = m.containsValue("刘浪雨");
        boolean containsKey = m.containsKey("寝室长");
        System.out.println(containsKey);
        System.out.println(Value); */
        m.put("畜生", "寝室长");
        String value = m.get("寝室长");
        System.out.println(value);
        System.out.println(m);
    }
}
