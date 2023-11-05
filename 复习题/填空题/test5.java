package 填空题;

public class test5 {
    public static void main(String[] args) {
        Doge doge = new Doge();
        doge.shout();
        doge.printName();
    }
}

class Animal {
    String name = "牧羊犬"; // 名字

    public void shout() {
        System.out.println("动物发出叫声");
    }
}

class Doge extends Animal {

    public void shout() {
        super.shout();
        System.out.println("汪汪汪……");
    }

    public void printName() { // 输出名字
        System.out.println("名字：" + super.name); // 访问父类Animal的name属性
    }
}