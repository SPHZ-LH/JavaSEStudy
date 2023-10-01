package 继承.x003;

public class Tuto extends Teacher {

    public Tuto() {
    }

    public Tuto(String id, String name) {
        super(id, name);
    }

    @Override
    public void show() {
        System.out.println("助教正在工作");
    }
}
