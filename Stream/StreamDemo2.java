import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "寝室长", "小颜同志", "刘浪雨", "牲口");
        long count = list.stream().count();
        System.out.println(count);
        String[] arr = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));
    }
}
