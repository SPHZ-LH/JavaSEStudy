import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollecTionDemo5 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("寝室长");
        coll.add("刘浪雨");
        coll.add("小颜同志");
        coll.forEach(t -> System.out.println(t));
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
