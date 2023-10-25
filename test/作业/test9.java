package 作业;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        addStudeant(lhs, sc);
        System.out.println(lhs.size());
        for (Student stu : lhs) {
            System.out.println(stu);
        }
    }

    private static void addStudeant(LinkedHashSet<Student> lhs, Scanner sc) {
        int frequency = sc.nextInt();
        Student[] arr = new Student[frequency];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next().charAt(0));
            lhs.add(arr[i]);
        }
    }
}

class Student {
    private String id;
    private String name;
    private int age;
    private Character gender;

    public Student() {
    }

    public Student(String id, String name, int age, Character gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + gender;
    }

}
