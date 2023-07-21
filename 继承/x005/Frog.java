package 继承.x005;

public class Frog extends Animal implements Swim {
    public Frog() {

    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");

    }

    @Override
    public void swim() {
        System.out.println("狗刨");

    }

}
