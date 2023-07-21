package 继承.x004;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前脚死死的抱住东西" + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
