package 继承.x002;

public class Test {
    public static void main(String[] args) {
        Husk h =new Husk();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        Shapidog sp =new Shapidog();
        sp.eat();
        sp.drink();
        sp.lookHome();

        ChineseDog cd =new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();
    }
}
