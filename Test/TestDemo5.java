import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class TestDemo5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> hm = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String name = sc.next();
            if (name.equals("end")) {
                break;
            } else {
                list.add(name);
            }
        }

        for (String name : list) {
            if (hm.containsKey(name)) {
                Integer value = hm.get(name);
                value++;
                hm.put(name, value);
            } else {
                hm.put(name, 1);
            }
        }

        hm.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
