import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TestDemo4 {
    public static void main(String[] args) throws ParseException {
        TreeSet<Student> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[sc.nextInt()];
        load(ts, sc, arr);
        for (Student stu : ts) {
            System.out.println(stu);
        }
    }

    private static void load(TreeSet<Student> ts, Scanner sc, Student[] arr) throws ParseException {
        for (int i = 0; i < arr.length; i++) {
            String id = sc.next();
            String name = sc.next();
            String time = extracted(sc);
            Double score = sc.nextDouble();
            arr[i] = new Student(id, name, time, score);
            count(ts, arr, i);
        }
    }

    private static void count(TreeSet<Student> ts, Student[] arr, int i) {
        if (ts.contains(arr[i])) {
            Iterator<Student> it = ts.iterator();
            while (it.hasNext()) {
                Student stu = it.next();
                if (stu.getId().equals(arr[i].getId())) {
                    it.remove();
                }
            }
            ts.add(arr[i]);
        } else {
            ts.add(arr[i]);
        }
    }

    private static String extracted(Scanner sc) throws ParseException {
        String birthday = sc.next();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf1.parse(birthday);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String time = sdf.format(d);
        return time;
    }
}

class Student implements Comparable<Student> {
    private String id;
    private String name;
    private String birthday;
    private double score;

    public Student() {
    }

    public Student(String id, String name, String birthday, double score) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.score = score;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        return true;
    }

    @Override
    public int compareTo(Student o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", score=" + score + "]";
    }

}
