package 继承.x003;

public class Lecturer extends Teacher {

    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void show() {
        System.out.println("讲师正在工作");
    }
}
