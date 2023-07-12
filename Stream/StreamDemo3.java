import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "刘浪雨-男-20", "小颜同志-男-17", "畜生-男-18", "寝室长-男-19");
        List<String> newList1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(newList1);
        System.out.println("----------------");
        Set<String> newList2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newList2);
        System.out.println("----------------");
        Map<String, Integer> newMap = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(t -> t.split("-")[0], t -> Integer.parseInt(t.split("-")[2])));

        System.out.println(newMap);
    }
}
