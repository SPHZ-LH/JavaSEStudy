package CollceTion;
import java.util.ArrayList;

public class CollecTionDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();

        ListUtil.addAll(list, "寝室长", "刘浪雨");
        System.out.println(list);
    }
}
