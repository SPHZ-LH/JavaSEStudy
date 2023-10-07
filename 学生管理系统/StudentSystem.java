import java.util.ArrayList;
import java.util.Scanner;


public class StudentSystem {
    public static final String ADD_STUDENT = "1";
    public static final String DELETE_STUDENT = "2";
    public static final String REVISE_STUDENT = "3";
    public static final String INQUIRE_STUDENT = "4";
    public static final String EXIT = "5";

    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("-------------欢迎来到103-------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择");
            Scanner sc = new Scanner(System.in);
            String num = sc.next();
            switch (num) {
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case REVISE_STUDENT -> reviseStudent(list);
                case INQUIRE_STUDENT -> InquireStudent(list);
                case EXIT -> {
                    System.out.println("退出成功");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学号");
            id = sc.next();
            boolean falg = contains(list, id);
            if (falg) {
                System.out.println("该id已经存在，请重新输入id");
            } else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("请输入家庭住址");
        String address = sc.next();
        s.setAddress(address);
        list.add(s);
        System.out.println("学生信息添加成功");
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的id");
        String id = sc.next();
        if (index(list, id) >= 0) {
            list.remove(index(list, id));
            System.out.println("该学生id：" + id + "删除成功");
        } else {
            System.out.println("没有该学生id，请重新输入");
        }
    }

    public static void reviseStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生id");
        String id = sc.next();
        int index = index(list, id);
        if (index >= 0) {
            Student stu = list.get(index);
            System.out.println("请输入新的学生姓名");
            String newName = sc.next();
            stu.setName(newName);
            System.out.println("请输入新的学生年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);
            System.out.println("请输入新的学生家庭住址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);
            System.out.println("新的学生信息修改完毕");
        } else {
            System.out.println("输入的学生id不存在，请重新输入");
        }
    }

    public static void InquireStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }

        System.out.println("学号\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
        // for (int i = 0; i < list.size(); i++) {
        // Student stu = list.get(i);
        // if (stu.getId().equals(id)) {
        // return true;
        // }
        // }
        return index(list, id) >= 0;
    }

    // 该方法为通过id查询学生
    public static int index(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}