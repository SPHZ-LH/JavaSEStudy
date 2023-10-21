import java.util.ArrayList;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            student s =new student();
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            student s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
