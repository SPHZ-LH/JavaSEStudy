import java.util.ArrayList;
import java.util.Collection;

public class CollecTionDemo1{
    public static void main(String[] args) {
        Collection<String> coll =new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll.size());
        System.out.println(coll);
        coll.remove("aaa");
        boolean contains = coll.contains("bbb");
        System.out.println(contains);
        System.out.println(coll);
    }
}