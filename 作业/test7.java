package 作业;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pupil zhangsan = new Pupil();
        zhangsan.setSchool(sc.next());
        System.out.println("我的学校是" + zhangsan.getSchool());
        zhangsan.breathe();
        zhangsan.eat();
        zhangsan.sleep();
        zhangsan.think();
    }
}

interface Animal {
    public abstract void eat();

    public abstract void sleep();
}

interface Biology {
    public abstract void breathe();
}

class Person implements Biology, Animal {

    @Override
    public void eat() {
        System.out.println("我会按时吃饭");
    }

    @Override
    public void breathe() {
        System.out.println("我喜欢呼吸新鲜空气");
    }

    @Override
    public void sleep() {
        System.out.println("早睡早起身体好");
    }

    public void think() {
        System.out.println("我喜欢思考");
    }
}

class Pupil extends Person {
    private String school;

    public Pupil() {
    }

    public Pupil(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
