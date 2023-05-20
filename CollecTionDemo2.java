import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollecTionDemo2 {
    public static void main(String[] args) {
        Collection<String> coll =new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            if(str.equals("bbb")){
                it.remove();
            }
        }
        System.out.println(coll);
    }
}
