package 继承.x003;

public class Buyer extends Adminstaff {

    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void show() {
        System.out.println("采购专家正在工作");
    }
}