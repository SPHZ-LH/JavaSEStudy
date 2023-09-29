package TreeMap;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>((Integer o1, Integer o2) -> {
            return -(o1 - o2);
        });
        tm.put(1, "巧克力");
        tm.put(5, "鸡腿");
        tm.put(3, "冰淇淋");
        tm.put(2, "果冻");
        tm.put(4, "薯片");

        System.out.println(tm);
    }
}
