package a11Demo1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 =new MyThread();
        MyThread t2 =new MyThread();

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }
}
