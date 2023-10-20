package TreeSet;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });

        ts.add("dak");
        ts.add("c");
        ts.add("rtjkle");
        ts.add("asjdl");

        System.out.println(ts);
    }
}
