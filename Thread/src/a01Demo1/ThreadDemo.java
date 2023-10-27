package a01Demo1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("窗口1");
        MyThread t2 = new MyThread("窗口2");
        MyThread t3 = new MyThread("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
