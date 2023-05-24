import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> grilList = new ArrayList<>();
        Collections.addAll(boyList, "zhangsan", "lisi", "wangwu", "zhaoliu");
        Collections.addAll(grilList, "寝室长", "刘浪雨", "小颜同志", "牲口");
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        Collections.shuffle(list);
        int index = r.nextInt(list.size());
        Integer number = list.get(index);
        if (number == 0) {
            int grilIndex = r.nextInt(grilList.size());
            String name = grilList.get(grilIndex);
            System.out.println(name);
        } else {
            int boyIndex = r.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        }
    }
}
