package 继承.x003;

public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    @Override
    public void show() {
        System.out.println("老师正在工作");
    }
}
