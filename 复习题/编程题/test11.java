package 编程题;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Student1> hs = new LinkedHashSet<>();
        Student1[] arr = new Student1[sc.nextInt()];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student1(sc.next(), sc.next(), sc.nextInt(), sc.next());
            boolean flag = hs.add(arr[i]);
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
        for (Student1 s : hs) {
            System.out.println(s);
        }
    }
}

class Student1 {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Student1() {
    }

    public Student1(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student1 student1 = (Student1) o;
        return age == student1.age && Objects.equals(id, student1.id) && Objects.equals(name, student1.name)
                && Objects.equals(gender, student1.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender);
    }
}