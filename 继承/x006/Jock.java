package 继承.x006;

public abstract class Jock extends Person {

    public Jock() {

    }

    public Jock(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
