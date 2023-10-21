import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        student s1 = new student("zhansan", 17);
        student s2 = new student("wangwu", 18);
        student s3 = new student("lisi", 19);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+" "+list.get(i).getAge());
        }
    }
}
