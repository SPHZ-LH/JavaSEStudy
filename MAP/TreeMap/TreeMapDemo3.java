package TreeMap;

import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> tm = new TreeMap<>();
        String str = "sdasdasddasdjkljlk";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (tm.containsKey(arr[i])) {
                Integer count = tm.get(arr[i]);
                count++;
                tm.put(arr[i], count);
            } else {
                tm.put(arr[i], 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        tm.forEach((k, v) -> {
            sb.append(k).append("(").append(v).append(")");
        });
        System.out.println(sb.toString());
    }

}
