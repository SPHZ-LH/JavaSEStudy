import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 17, '男');
        Student stu2 = new Student("李四", 36, '男');
        Student stu3 = new Student("王五", 28, '男');
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int maxAge = StudentUtil.getMaxAge(list);

        System.out.println(maxAge);
    }
}
