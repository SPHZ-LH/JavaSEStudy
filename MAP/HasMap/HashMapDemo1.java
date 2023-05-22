package HasMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        hm.put(s1, "江西");
        hm.put(s2, "浙江");
        hm.put(s3, "湖北");

        Set<Student> keySet = hm.keySet();

        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println("------------------");

        Iterator<Student> it = keySet.iterator();
        while (it.hasNext()) {
            Student key = it.next();
            String value = hm.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("-----------------------");

        keySet.forEach(key -> {
            String value = hm.get(key);
            System.out.println(key + " " + value);
        });

        System.out.println("-----------------------");
        hm.forEach((t, u) -> System.out.println(t + " " + u));
    }
}
