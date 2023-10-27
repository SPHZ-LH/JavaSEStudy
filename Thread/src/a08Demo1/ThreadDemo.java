package a08Demo1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.setName("小诗诗");
        t2.setName("小丹丹");
        t3.setName("小慧慧");
        t4.setName("小帆波");
        t5.setName("小甜甜");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
