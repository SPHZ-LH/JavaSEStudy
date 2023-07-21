package 继承.x002;

public class Shapidog extends Dog{
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
