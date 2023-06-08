package Test.Test1;

import java.util.Arrays;
import java.util.Comparator;

public class TestDeam1 {
    public static void main(String[] args) {
        Student stu1 = new Student("xiaoshishi", 18, 165);
        Student stu2 = new Student("xiaodandan", 19, 155);
        Student stu3 = new Student("xiaohuihui", 20, 158);
        Student[] arr = { stu1, stu2, stu3 };
        /* Arrays.sort(arr, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHight() - o2.getHight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }

        }); */
        Arrays.sort(arr, (Student o1, Student o2)->{
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHight() - o2.getHight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }
        });
        System.out.println(Arrays.toString(arr));
    }
}
