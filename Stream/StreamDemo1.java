import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "寝室长", "寝室长", "刘浪雨", "小颜同志", "牲口");
        list.stream().limit(2).forEach(s -> System.out.println(s));
        System.out.println("--------------------");
        list.stream().skip(2).forEach(s -> System.out.println(s));
        System.out.println("--------------------");
        list.stream().distinct().forEach(s -> System.out.println(s));
    }
}
