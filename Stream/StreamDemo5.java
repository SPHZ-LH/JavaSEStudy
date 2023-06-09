import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");
        Map<String, Integer> newMap = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(t -> t.split(",")[0], t -> Integer.parseInt(t.split(",")[1])));
        System.out.println(newMap);
    }
}
