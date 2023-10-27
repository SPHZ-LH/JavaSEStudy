package a06Demo1;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("同学1");
        t2.setName("同学2");

        t1.start();
        t2.start();
    }
}
