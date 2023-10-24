import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FuctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周紫若", "张强", "张三丰");
        list.stream().filter(new Predicate<String>() {

            @Override
            public boolean test(String t) {
                // TODO Auto-generated method stub
                return t.startsWith("张") && t.length() == 3;
            }

        }).forEach(s -> System.out.println(s));

        System.out.println("----------------");
        list.stream().forEach(new FuctionDemo3()::StringJudge);
        System.out.println("----------------");
        list.stream().filter(FuctionDemo2::test).forEach(t -> System.out.println(t));
    }

    public static boolean test(String t) {
        // TODO Auto-generated method stub
        return t.startsWith("张") && t.length() == 3;
    }
}
