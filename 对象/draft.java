public class draft {
    public static void main(String[] args) {
        Student stu =new Student(1, "zhangsan", 17);
        stu.setId(2);
        stu.setAge(18);
        System.out.println(stu.getId()+stu.getName()+stu.getAge());
    }
}
