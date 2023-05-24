import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan", "lisi", "wangwu", "zhaoliu");
        int index = r.nextInt(list.size());
        String str = list.get(index);
        System.out.println(str);
        System.out.println("------------------");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "寝室长", "刘浪雨", "小颜同志", "牲口", "畜生");
        Collections.shuffle(list2);
        System.out.println(list2);
    }
}
