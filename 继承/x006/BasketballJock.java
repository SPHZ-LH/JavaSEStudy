package 继承.x006;

public class BasketballJock extends Jock{
    
    public BasketballJock() {
    }

    public BasketballJock(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }
    
}
