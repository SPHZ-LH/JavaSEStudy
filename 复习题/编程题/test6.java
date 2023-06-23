package 编程题;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person zhangsan = new Person();
        System.out.println("我的学校是" + sc.next());
        zhangsan.breathe();
        zhangsan.eat();
        zhangsan.sleep();
        zhangsan.think();
    }
}

interface Biology {
    public abstract void breathe();
}

interface Animal {
    public abstract void eat();

    public abstract void sleep();
}

class Person implements Biology, Animal {

    @Override
    public void eat() {
        System.out.println("我会按时吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("\u65E9\u7761\u65E9\u8D77\u8EAB\u4F53\u597D");
    }

    @Override
    public void breathe() {
        System.out.println("\u6211\u559C\u6B22\u547C\u5438\u65B0\u9C9C\u7A7A\u6C14");
    }

    public void think() {
        System.out.println("我喜欢思考");
    }

}
