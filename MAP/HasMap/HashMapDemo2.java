package HasMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        String[] arr = { "A", "B", "C", "D" };
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if (hm.containsKey(name)) {
                Integer value = hm.get(name);
                value++;
                hm.put(name, value);
            } else {
                hm.put(name, 1);
            }
        }
        System.out.println(hm);
        int max = 0;
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Integer num = hm.get(key);
            if (max < num) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
