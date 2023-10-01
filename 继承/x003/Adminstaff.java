package 继承.x003;

public class Adminstaff extends Employee{

    public Adminstaff() {
    }

    public Adminstaff(String id, String name) {
        super(id, name);
    }
    @Override
    public void show() {
        System.out.println("行政员工正在工作");
    }
}
