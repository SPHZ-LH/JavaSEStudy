import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("唐三", "小舞");
        m.put("萧炎", "彩鳞");
        m.put("罗峰", "徐欣");

        Set<Entry<String, String>> entrySet = m.entrySet();
        for (Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println("--------------------");

        Iterator<Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println("--------------------");
        entrySet.forEach((t) -> {
            String key = t.getKey();
            String value = t.getValue();
            System.out.println(key + " " + value);
        });
    }
}
