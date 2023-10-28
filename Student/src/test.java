class Father {
    int a =100;
    public void print() {
        System.out.println(a);
    }
}
class Child1 extends Father {
    int a =200;
    public void print() {
        System.out.println(a);
    }
}
class Child2 extends Father {
    int a =300;
    public void print() {
        System.out.println(a);
    }
}
public class test {
    public static void main(String[] a) {
        Father obj1;
        obj1=new Child1();
        System.out.println(obj1.a);
        obj1.print();

        obj1=new Child2();
        System.out.println(obj1.a);
        obj1.print();
    }
}