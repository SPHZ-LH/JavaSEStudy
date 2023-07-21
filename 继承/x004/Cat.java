package 继承.x004;

public class Cat extends Animal {
    public Cat() {

    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧着头吃东西");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
