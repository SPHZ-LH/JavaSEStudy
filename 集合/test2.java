import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("你在干嘛");
        list.add("在敲代码");
        list.add("晚上吃啥");
        list.add("吃外卖");
        list.remove(3);
        System.out.println(list);
    }
}
