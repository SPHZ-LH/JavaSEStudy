import java.util.ArrayList;
import java.util.StringJoiner;

public class test1{
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        StringJoiner sj =new StringJoiner(",", "[", "]");
        sj.add("123123");
        sj.add("dasd");
        sj.add("asdajk");
        String string = sj.toString();
        System.out.println(string.length());
        System.out.println(sj.length());
    }
}