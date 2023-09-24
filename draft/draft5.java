import java.util.ArrayList;
import java.util.Collections;

public class draft5 {
    public static void main(String[] args) {
        System.out.println("--------sort默认规则---------");
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 3, 6, 1, 2, 7, 8, 6, 3, 8, 1, 2);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1, (o1, o2) -> o2 - o1);
        System.out.println(list1);
        System.out.println("-----------------------------");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "sdja", "317", "asudo", "dja", "bsajd");
        Collections.sort(list2);
        System.out.println(list2);
        System.out.println("-----------------------------");
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 1, 8, 9, 2, 3, 7, 9, 5, 7, 4, 3, 9, 8);
        System.out.println(list3);
        System.out.println(Collections.binarySearch(list3, 7));
    }
}
