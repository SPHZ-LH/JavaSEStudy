package TreeSet;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts =new TreeSet<>();
        System.out.println(ts.add(1));
        System.out.println(ts.add(2));
        System.out.println(ts.add(5));
        System.out.println(ts.add(3));
        System.out.println(ts.add(4));

        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}