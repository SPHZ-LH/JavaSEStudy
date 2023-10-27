public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 =new MyThread("飞机");
        MyThread t2 =new MyThread("坦克");
        t1.start();
        t2.start();
    }
}
