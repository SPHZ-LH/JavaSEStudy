package a06Demo1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("学生1");
        MyThread t2 = new MyThread("学生2");

        t1.start();
        t2.start();
    }
}
