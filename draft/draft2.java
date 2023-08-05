public class draft2 {
    public static void main(String[] args) {
        Child child = new Child(10);
        child.print();
    }
}

class Father {
    int a;

    public Father(int a) {
        this.a = a;
    }

    public void print() {
        System.out.println(a);
    }
}

class Child extends Father {
    int a;

    public Child(int a) {
        super(a);
        this.a = super.a * 10;
    }

    public void print() {
        System.out.println(super.a);
        System.out.println(this.a);
    }
}
