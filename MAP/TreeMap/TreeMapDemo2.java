package TreeMap;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm =new TreeMap<>();
        Student s1 =new Student("zhangsan", 23);
        Student s2 =new Student("lisi", 24);
        Student s3 =new Student("wangwu", 25);
        Student s4 =new Student("wangwu", 25);

        tm.put(s1, "江西");
        tm.put(s2, "浙江");
        tm.put(s3, "上海");

        System.out.println(tm);
    }
}
