import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FuctionDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9");
        list.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String t) {
                // TODO Auto-generated method stub
                int i = Integer.parseInt(t);
                return i;
            }

        }).forEach(s -> System.out.println(s));
        System.out.println("-----------------");
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
    }
}
