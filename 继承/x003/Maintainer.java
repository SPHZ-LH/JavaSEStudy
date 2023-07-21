package 继承.x003;

public class Maintainer extends Adminstaff{

    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }
    @Override
    public void show() {
        System.out.println("维护员工正在工作");
    }
}
