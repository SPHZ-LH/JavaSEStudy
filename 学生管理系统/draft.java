import java.util.ArrayList;

public class draft {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        System.out.println(list);
    }
}