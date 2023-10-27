package a05Demo1;

public class MyThread extends Thread {

    public static int count = 1000;
    public static int result = 0;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (count == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    result++;
                    System.out.println(Thread.currentThread().getName() + "卖了第" + result + "张票");
                    count--;
                    System.out.println("一共还剩" + count + "张票");
                }
            }
        }
    }
}
