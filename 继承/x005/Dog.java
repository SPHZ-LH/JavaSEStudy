package 继承.x005;

public class Dog extends Animal implements Swim {
    public Dog() {

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");

    }

    @Override
    public void swim() {
        System.out.println("蛙泳");

    }

}
