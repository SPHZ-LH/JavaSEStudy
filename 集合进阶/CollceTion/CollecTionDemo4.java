package CollceTion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollecTionDemo4 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("寝室长");
        coll.add("刘浪雨");
        coll.add("小颜同志");
        coll.forEach(new Consumer<String>() {

            @Override
            public void accept(String t) {
                // TODO Auto-generated method stub
                System.out.println(t);
            }
            
        });
        for (String s : coll) {
            System.out.println(s);        
        }
    }
}
