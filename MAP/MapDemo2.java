import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("唐三", "小舞");
        m.put("萧炎", "美杜莎");
        m.put("李星云", "姬如雪");

        Set<String> keySet = m.keySet();

        m.forEach((t, u) -> {
            System.out.println(t + " " + u);
        });
        System.out.println("-----------------------");

        for (String key : keySet) {
            String value = m.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println("-----------------------");

        keySet.forEach((t) -> {
            String value = m.get(t);
            System.out.println(t + " " + value);
        });
        System.out.println("-----------------------");

        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String str = it.next();
            String value = m.get(str);
            System.out.println(str + " " + value);
        }
    }
}
