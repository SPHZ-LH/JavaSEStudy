import java.util.ArrayList;
import java.util.Collections;

public class FuctionDemo3 {

    public FuctionDemo3() {
        method();
    }

    public boolean StringJudge(String t) {
        return t.startsWith("张") && t.length() == 3;
    }

    public void method() {
        ArrayList<String> list = new ArrayList<>();
        list.stream().filter(this::StringJudge).forEach(t -> System.out.println(t));
    }
}
