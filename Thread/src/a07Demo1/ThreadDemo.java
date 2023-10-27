package a07Demo1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 =new MyThread();
        MyThread t2 =new MyThread();

        t1.setName("进程1");
        t2.setName("进程2");

        t1.start();
        t2.start();
    }
}
